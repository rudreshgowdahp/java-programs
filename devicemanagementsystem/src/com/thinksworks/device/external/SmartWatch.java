package com.thinksworks.device.external;

import com.thinksworks.device.devicefeature.Battery;
import com.thinksworks.device.functional.Bluetooth;
import com.thinksworks.device.functional.Notification;

public class SmartWatch implements Bluetooth, Notification, Battery {
    @Override
    public void connectBluetooth() {
        System.out.println("Watch bluetooth");
    }

    @Override
    public void sendNotification() {
        System.out.println("Watch Notification");
    }

    @Override
    public void batteryStatus() {
        System.out.println("Watch Battery");
    }
}
