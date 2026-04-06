package com.thinksworks.employee.external;

public class Employee {
     public String name;

    public Employee(String name) {
        this.name = name;
    }
    public  void work(){
        System.out.println(name+" is working");
    }
}
