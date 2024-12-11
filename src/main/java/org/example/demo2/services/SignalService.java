package org.example.demo2.services;

import org.example.demo2.dataHandler.SignalsDataHandler;
import org.example.demo2.documents.Signal;
import org.example.demo2.dtos.TimePeriod;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class SignalService {

    final SignalsDataHandler signalsDataHandler;

    final KafkaProducerService kafkaProducerService;

    public SignalService(SignalsDataHandler signalsDataHandler, KafkaProducerService kafkaProducerService) {
        this.signalsDataHandler = signalsDataHandler;
        this.kafkaProducerService = kafkaProducerService;
    }

    public void getAllSignals() {
        Flux<Signal> signals = signalsDataHandler.getAllSignals();
        kafkaProducerService.serializeThenProduceKafka(signals);
    }

    public void sendSignalByImei(String imei){
        Flux<Signal> signals = signalsDataHandler.sendSignalByImei(imei);
        kafkaProducerService.serializeThenProduceKafka(signals);
    }

    public void sendSignalWithinPeriodOfTimeAndImei(TimePeriod timePeriod){
        Flux<Signal>signals = signalsDataHandler.sendSignalWithinPeriodOfTimeAndImei(timePeriod);
        kafkaProducerService.serializeThenProduceKafka(signals);
    }

}
