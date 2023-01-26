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
@Document(collection = "busbooking")
public class busbooking {

    private long busbookingid;
    private List<Integer> ticket;
    private long busno;
    private String customername;

}
