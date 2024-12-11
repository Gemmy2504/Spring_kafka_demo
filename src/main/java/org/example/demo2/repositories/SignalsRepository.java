package org.example.demo2.repositories;

import org.example.demo2.documents.Signal;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;


@Repository
public interface SignalsRepository extends ReactiveMongoRepository<Signal, String> {

    @Query(sort = "{ 'dtt': 1 }")
    Flux<Signal> findByImei(String imei);

    @Query(sort = "{ 'dtt': 1 }")
    Flux<Signal> findByDateTimeTrackerBetweenAndImei(Long dateTimeTrackerAfter, Long dateTimeTrackerBefore, String imei);


}
