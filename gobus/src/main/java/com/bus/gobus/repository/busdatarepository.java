package com.bus.gobus.repository;

import com.bus.gobus.model.busData;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface busdatarepository extends MongoRepository<busData,Long> {

    @Query(value = " {busno: ?0}")
    public busData findBybusno(long busno);



}
