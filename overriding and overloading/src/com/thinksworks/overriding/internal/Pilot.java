package com.thinksworks.overriding.internal;

import com.thinksworks.overriding.external.Person;

public class Pilot extends Person {
    @Override
    public void role() {
        System.out.println("Pilot aeroplane");
    }
}
