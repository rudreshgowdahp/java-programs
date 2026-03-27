package com.thinksworks.inheritanceconcept.internal;

import com.thinksworks.inheritanceconcept.external.Device;

public class SmartWatch  extends Device {

    public SmartWatch(String brand, int cost, String id, int ram, int storage) {
        super(brand, cost, id, ram, storage);
    }
}
