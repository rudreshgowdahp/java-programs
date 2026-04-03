package com.thinksworks.employee.internal;

import com.thinksworks.employee.external.Employee;

public class Intern extends Employee {
    public Intern(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name+"  is learning ");
    }
    public void learn(){
        System.out.println(name+" is learning new skills");
    }
}
