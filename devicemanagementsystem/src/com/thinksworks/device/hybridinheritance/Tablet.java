package com.thinksworks.device.hybridinheritance;

import com.thinksworks.device.devicefeature.Display;
import com.thinksworks.device.devicefeature.Storage;
import com.thinksworks.device.functional.Bluetooth;

public class Tablet extends Device implements Display, Bluetooth, Storage {
    @Override
    public void showDisplay() {
        System.out.println("Tablet Display");
    }

    @Override
    public void connectBluetooth() {
        System.out.println("Tablet Bluetooth");
    }

    @Override
    public void checkStorage() {
        System.out.println("Tabblet Storage");
    }
}
