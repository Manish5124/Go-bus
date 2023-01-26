package com.bus.gobus.controller;

import com.bus.gobus.model.busData;
import com.bus.gobus.model.busbooking;
import com.bus.gobus.model.customer;
import com.bus.gobus.service.busService;
import com.bus.gobus.service.customerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class busController {


    @Autowired
    private busService busservice;

    @Autowired
    private customerservice custservice;

    @PostMapping(value = "/addbus")
    public String addbusData(@RequestBody busData busdata)
    {
        return busservice.Addbus(busdata);
    }

    @PostMapping(value = "/addcustomer")
    public String addCustomerData(@RequestBody customer custdata)
    {
        return custservice.addCustomer(custdata);
    }

    @PostMapping(value = "/booking")
    public String bookTicket(@RequestBody busbooking data)
    {
        return busservice.bookingticket(data);
    }

    @GetMapping(value = "/reservedseats/{busno}")
    public List<Integer> getAllReservedSeats(@PathVariable long busno)
    {
        return  busservice.ReservedSeats(busno);
    }

}
