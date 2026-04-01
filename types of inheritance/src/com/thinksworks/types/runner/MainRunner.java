package com.thinksworks.types.runner;

import com.thinksworks.types.external.FourWheeler;
import com.thinksworks.types.internal.Chef;
import com.thinksworks.types.internal.Mobile;
import com.thinksworks.types.internal.Student;
import com.thinksworks.types.internal.Teacher;

import javax.rmi.CORBA.Stub;

public class MainRunner {
    public static void main(String[] args) {
        FourWheeler car = new FourWheeler(); // Multilevel inheritance
        Mobile mobile = new Mobile();// single interitance
        Chef chef = new Chef();
        Student student = new Student();
        Teacher teacher = new Teacher(); // hierarchical inheritance
    }
}
