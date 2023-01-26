package com.bus.gobus.service.serviceImp;

import com.bus.gobus.model.customer;
import com.bus.gobus.repository.customerrepository;
import com.bus.gobus.service.customerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class customerserviceImp implements customerservice {

    @Autowired
    customerrepository customerrepo;

    @Override
    public String addCustomer(customer cust)
    {
        long id = customerrepo.findAll().size()+1;
        cust.setCustomerid(id);
        customerrepo.save(cust);
        return "successfully added customer data";
    }

}
