package com.thinksworks.device.runner;

import com.thinksworks.device.hybridinheritance.*;
import com.thinksworks.device.multipleinheritance.ECommerceApp;
import com.thinksworks.device.multipleinheritance.OnlinePaymentSystem;
import com.thinksworks.device.multipleinheritance.PrinterMachine;
import com.thinksworks.device.multipleinheritance.SmartPhones;

public class MainRunner {
    public static void main(String[] args) {
        AtmSystem atmSystem = new AtmSystem();
        atmSystem.deviceInfo();
        atmSystem.navigate();
        atmSystem.playSound();
        atmSystem.sendNotification();
        Laptop laptop = new Laptop();
        laptop.deviceInfo();
        laptop.charger();
        laptop.secure();
        laptop.checkStorage();
        SelfServiceKiosk selfServiceKiosk = new SelfServiceKiosk();
        selfServiceKiosk.deviceInfo();
        selfServiceKiosk.printDocument();
        selfServiceKiosk.scanDocument();
        selfServiceKiosk.secure();
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.deviceInfo();
        smartPhone.batteryStatus();
        smartPhone.clickPhoto();
        smartPhone.connectWifi();
        Tablet tablet = new Tablet();
        tablet.deviceInfo();
        tablet.connectBluetooth();
        tablet.checkStorage();
        tablet.showDisplay();

        ECommerceApp eCommerceApp = new ECommerceApp();
        eCommerceApp.deliver();
        eCommerceApp.placeOrder();
        eCommerceApp.track();
        OnlinePaymentSystem onlinePaymentSystem = new OnlinePaymentSystem();
        onlinePaymentSystem.makePayment();
        onlinePaymentSystem.processRefund();
        onlinePaymentSystem.generateBill();
        PrinterMachine printerMachine = new PrinterMachine();
        printerMachine.connectWifi();
        printerMachine.printDocument();
        printerMachine.scanDocument();
        SmartPhones smartPhones = new SmartPhones();
        smartPhones.navigate();
        smartPhones.clickPhoto();
        smartPhones.playMusic();




















    }
}
