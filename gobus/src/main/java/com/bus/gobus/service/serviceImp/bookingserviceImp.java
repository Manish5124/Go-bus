package com.bus.gobus.service.serviceImp;

import com.bus.gobus.model.busbooking;
import com.bus.gobus.repository.bookingrepository;
import com.bus.gobus.service.bookingservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class bookingserviceImp implements bookingservice {

    @Autowired
    bookingrepository bookingrepo;




}

