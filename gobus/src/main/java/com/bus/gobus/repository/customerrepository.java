package com.bus.gobus.repository;

import com.bus.gobus.model.customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface customerrepository extends MongoRepository<customer,Long> {
}
