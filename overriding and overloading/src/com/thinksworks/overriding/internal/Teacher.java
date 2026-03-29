package com.thinksworks.overriding.internal;

import com.thinksworks.overriding.external.Person;

public class Teacher extends Person {
    @Override
    public void role() {
        System.out.println("Teacher teaches");
    }
}
