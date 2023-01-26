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
@Document(collection = "customer")
public class customer {

    private long customerid;
    private String name;
    private String email;
    private String mobile;
    private long age;
    private String gender;
    private String address;

}
