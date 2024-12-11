package org.example.demo2.dataHandler;

import org.example.demo2.documents.Signal;
import org.example.demo2.dtos.TimePeriod;
import org.example.demo2.repositories.SignalsRepository;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
public class SignalsDataHandler {

    final SignalsRepository signalsRepository;

    public SignalsDataHandler(SignalsRepository signalsRepository) {
        this.signalsRepository = signalsRepository;
    }

    public Flux<Signal> sendSignalWithinPeriodOfTimeAndImei(TimePeriod timePeriod) {
        return signalsRepository.findByDateTimeTrackerBetweenAndImei(
                timePeriod.getStartTime(), timePeriod.getEndTime(), timePeriod.getImei());
    }

    public Flux<Signal> getAllSignals() {
        return signalsRepository.findAll();
    }

    public Flux<Signal> sendSignalByImei(String imei) {
        return signalsRepository.findByImei(imei);
    }

}