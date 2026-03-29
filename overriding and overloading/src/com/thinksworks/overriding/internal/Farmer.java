package com.thinksworks.overriding.internal;

import com.thinksworks.overriding.external.Person;

public class Farmer extends Person {
    @Override
    public void role() {
        System.out.println("Farmer growing");
    }
}
