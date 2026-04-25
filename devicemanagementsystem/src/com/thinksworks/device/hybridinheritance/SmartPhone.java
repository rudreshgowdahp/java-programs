package com.thinksworks.device.hybridinheritance;

import com.thinksworks.device.devicefeature.Battery;
import com.thinksworks.device.functional.Camera;
import com.thinksworks.device.functional.Wifi;

public class SmartPhone extends Device implements Camera, Wifi, Battery {
    @Override
    public void clickPhoto() {
        System.out.println("Phone Camera");
    }
    @Override
    public void connectWifi() {
        System.out.println("Phone Wifi");
    }

    @Override
    public void batteryStatus() {
        System.out.println("Phone Battery");
    }
}
