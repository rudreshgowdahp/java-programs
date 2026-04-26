package com.thinksworks.device.hybridinheritance;

import com.thinksworks.device.devicefeature.Charging;
import com.thinksworks.device.devicefeature.Security;
import com.thinksworks.device.devicefeature.Storage;

public class Laptop extends Device implements Storage, Charging, Security {
    @Override
    public void checkStorage() {
        System.out.println("Laptop Storage");
    }

    @Override
    public void charger() {
        System.out.println("Laptop Charger");
    }

    @Override
    public void secure() {
        System.out.println("Laptop Secure");
    }
}
