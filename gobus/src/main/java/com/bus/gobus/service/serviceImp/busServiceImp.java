package com.bus.gobus.service.serviceImp;

import com.bus.gobus.model.busData;
import com.bus.gobus.model.busbooking;
import com.bus.gobus.repository.bookingrepository;
import com.bus.gobus.repository.busdatarepository;
import com.bus.gobus.service.busService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class busServiceImp implements busService {

    @Autowired
    busdatarepository busrepo;

    @Autowired
    bookingrepository bookingrepo;

    @Override
    public String Addbus(busData busData)
    {
        long id = busrepo.findAll().size()+1;

        busData.setBusid(id);
        busrepo.save(busData);
        return "busData successfully added!";
    }

    @Override
    public String bookingticket(busbooking data)
    {
        busData bus = busrepo.findBybusno(data.getBusno());
        long diff =bus.getAvailableseats()-data.getTicket();
        bus.setAvailableseats(diff);
        busrepo.save(bus);
        long id = bookingrepo.findAll().size()+1;
        data.setBusbookingid(id);
        bookingrepo.save(data);
       return "successfully seat book";
    }

//    public String deletebus(long busid)
//    {
//        busrepo.deleteById(busid);
//        return "deleted successfully";
//    }




}
