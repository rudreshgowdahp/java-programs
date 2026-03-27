package com.thinksworks.inheritanceconcept.internal;

import com.thinksworks.inheritanceconcept.external.Vehicle;

public class Car extends Vehicle {

    public Car(String name, int number, String RCExpirydate, String RCNumber, boolean RCIsActive) {
        super(name, number, RCExpirydate, RCNumber, RCIsActive);
    }
}
