package com.bus.gobus.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "busData")
public class busData {

    private long busid;
    private long busno;
    private String busname;
    private String bustype;
    private String departure;
    private String arrival;
    private String departuretime;
    private String arrivaltime;
    private long availableseats;
    private long fare;
//    private List<customer> personData;
}
