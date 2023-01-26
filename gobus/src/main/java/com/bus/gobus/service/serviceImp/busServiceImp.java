package com.bus.gobus.service.serviceImp;

import com.bus.gobus.model.busData;
import com.bus.gobus.model.busbooking;
import com.bus.gobus.repository.bookingrepository;
import com.bus.gobus.repository.busdatarepository;
import com.bus.gobus.service.busService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
//        long diff =bus.getAvailableseats()-data.getTicket();
        List<Integer> ticket =data.getTicket();
        bus.setReservedseats(ticket);
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
    @Override
    public List<Integer> ReservedSeats(long busno)
    {
        busData bus = busrepo.findBybusno(busno);
        return  bus.getReservedseats();
    }


}
