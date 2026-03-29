package com.thinksworks.overriding.internal;

import com.thinksworks.overriding.external.Person;

public class Driver extends Person {
    @Override
    public void role() {
        System.out.println("Driver drives");
    }
}
