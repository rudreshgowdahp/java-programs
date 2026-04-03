package com.thinksworks.employee.internal;

import com.thinksworks.employee.external.Employee;

public class Developer extends Employee {
    public Developer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name+" is writing code");
    }
     public void writeCode(){
         System.out.println(name+"is developing software");
     }
}

