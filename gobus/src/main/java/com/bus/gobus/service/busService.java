package com.bus.gobus.service;

import com.bus.gobus.model.busData;
import com.bus.gobus.model.busbooking;
import org.springframework.stereotype.Service;


public interface busService {
    String Addbus(busData busData);

    String bookingticket(busbooking data);
}
