package com.bus.gobus.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "busbooking")
public class busbooking {

    private long busbookingid;
    private long ticket;
    private long busno;
    private String customername;

}
