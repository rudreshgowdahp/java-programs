package com.thinksworks.inheritanceconcept.internal;

import com.thinksworks.inheritanceconcept.external.Device;

public class Laptop extends Device {
    public Laptop(String brand, int cost, String id, int ram, int storage) {
        super(brand, cost, id, ram, storage);
    }
}

