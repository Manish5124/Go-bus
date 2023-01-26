package com.bus.gobus.service;

import com.bus.gobus.model.busData;
import com.bus.gobus.model.busbooking;
import org.springframework.stereotype.Service;

import java.util.List;


public interface busService {
    String Addbus(busData busData);

    String bookingticket(busbooking data);

    //    public String deletebus(long busid)
    //    {
    //        busrepo.deleteById(busid);
    //        return "deleted successfully";
    //    }
    List<Integer> ReservedSeats(long busno);
}
