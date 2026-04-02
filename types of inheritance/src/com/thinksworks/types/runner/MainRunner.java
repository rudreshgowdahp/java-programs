package com.thinksworks.types.runner;

import com.thinksworks.types.external.FourWheeler;
import com.thinksworks.types.external.Parent;
import com.thinksworks.types.internal.*;

import javax.rmi.CORBA.Stub;

public class MainRunner {
    public static void main(String[] args) {
        FourWheeler car = new FourWheeler(); // Multilevel inheritance
        Mobile mobile = new Mobile();// single interitance
        Chef chef = new Chef();
        Student student = new Student();
        Teacher teacher = new Teacher(); // hierarchical inheritance

        Parent parent = new Child(); //  upcasting
        parent.name = "Rudresh";
        System.out.println("Name is :"+parent.name);
        parent.method();
        Child child = (Child)parent; // downcasting
        child.id = 13;
        System.out.println("Id is :"+child.id);
        child.method();
        parent.instanceMethod();

    }
}
