package com.thinksworks.overriding.internal;

import com.thinksworks.overriding.external.Person;

public class Doctor extends Person {
    @Override
    public void role() {
        System.out.println("Doctor treat");
    }
}
