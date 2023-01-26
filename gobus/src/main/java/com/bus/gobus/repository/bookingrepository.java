package com.bus.gobus.repository;


import com.bus.gobus.model.busbooking;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface bookingrepository extends MongoRepository<busbooking,Long> {
}
