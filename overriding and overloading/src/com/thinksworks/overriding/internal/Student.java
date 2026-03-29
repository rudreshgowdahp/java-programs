package com.thinksworks.overriding.internal;

import com.thinksworks.overriding.external.Person;

public class Student extends Person {

    @Override
    public void role() {
        System.out.println("Student learning");
    }
}
