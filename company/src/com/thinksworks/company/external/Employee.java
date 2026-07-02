package com.thinksworks.company.external;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor

public class Employee {
    private String name;
    private String adress;
    private String email;
    private String dob;
    private String id;

}
