package com.thinksworks.device.hybridinheritance;

import com.thinksworks.device.devicefeature.Security;
import com.thinksworks.device.functional.Printer;
import com.thinksworks.device.functional.Scanner;

public class SelfServiceKiosk extends Device implements Scanner, Printer, Security {
    @Override
    public void scanDocument() {
        System.out.println("Self Scaner");
    }

    @Override
    public void printDocument() {
        System.out.println("Self Printer");
    }

    @Override
    public void secure() {
        System.out.println("Self Secure");
    }
}
