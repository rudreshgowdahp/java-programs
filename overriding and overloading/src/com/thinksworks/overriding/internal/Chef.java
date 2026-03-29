package com.thinksworks.overriding.internal;

import com.thinksworks.overriding.external.Person;

public class Chef extends Person {
    @Override
    public void role() {
        System.out.println("Chef cooking");
    }
}
