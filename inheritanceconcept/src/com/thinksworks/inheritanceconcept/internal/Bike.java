package com.thinksworks.inheritanceconcept.internal;

import com.thinksworks.inheritanceconcept.external.Vehicle;

public class Bike extends Vehicle {
    public Bike(String name, int number, String RCExpirydate, String RCNumber, boolean RCIsActive) {
        super(name, number, RCExpirydate, RCNumber, RCIsActive);
    }
}
