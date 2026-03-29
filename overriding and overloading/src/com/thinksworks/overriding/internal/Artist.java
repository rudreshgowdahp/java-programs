package com.thinksworks.overriding.internal;

import com.thinksworks.overriding.external.Person;

public class Artist extends Person {
    @Override
    public void role() {
        System.out.println("Artist drawing");
    }
}
