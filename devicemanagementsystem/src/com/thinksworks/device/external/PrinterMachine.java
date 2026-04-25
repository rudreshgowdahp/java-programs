package com.thinksworks.device.external;

import com.thinksworks.device.functional.Printer;
import com.thinksworks.device.functional.Scanner;
import com.thinksworks.device.functional.Wifi;

public class PrinterMachine implements Printer, Scanner, Wifi {
    @Override
    public void printDocument() {
        System.out.println("Printing");
    }

    @Override
    public void scanDocument() {
        System.out.println("Scanning");
    }

    @Override
    public void connectWifi() {
        System.out.println("Wifi connected");
    }
}
