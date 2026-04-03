package com.thinksworks.employee.internal;

import com.thinksworks.employee.external.Employee;

public class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name+"is managing team");
    }
    public void conductMeeting(){
        System.out.println(name+"is conduct meeting");
    }
}


