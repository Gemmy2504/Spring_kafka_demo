package org.example.demo2.services;

import com.google.gson.Gson;
import org.example.demo2.documents.Signal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;


@Service
public class KafkaProducerService {
    private static final Logger log = LoggerFactory.getLogger(KafkaProducerService.class);
    private final KafkaTemplate<String, String> kafkaTemplate;
    private static final  String TOPIC = "signals";
    final Gson gson;


    public KafkaProducerService(KafkaTemplate<String, String> kafkaTemplate, Gson gson) {
        this.kafkaTemplate = kafkaTemplate;
        this.gson = gson;
    }


    public void serializeThenProduceKafka(Flux<Signal> signalFlux) {
        signalFlux.subscribe(signal -> {
            try{
                Thread.sleep(2000);
                String json = gson.toJson(signal);
                kafkaTemplate.send(TOPIC,json);
            }catch (Exception e){
                log.error(e.getMessage());
                Thread.currentThread().interrupt();
            }

        });
    }
}
