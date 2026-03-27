package com.thinksworks.inheritanceconcept.external;

public class Vehicle {
    private String name;
    private int number;
    private String RCExpirydate;
    private String RCNumber;
    private boolean RCIsActive;

    public Vehicle(String name, int number, String RCExpirydate, String RCNumber, boolean RCIsActive) {
        this.name = name;
        this.number = number;
        this.RCExpirydate = RCExpirydate;
        this.RCNumber = RCNumber;
        this.RCIsActive = RCIsActive;
    }

    public void display(){
        System.out.println();
        System.out.println("VEHICLE DETAILS ");
        System.out.println("Vehicle name is:"+name);
        System.out.println("Vehicle number is:"+number);
        System.out.println("RC Expirtdate:"+RCExpirydate);
        System.out.println("RC Number:"+RCNumber);
        System.out.println("RC is active:"+RCIsActive);
    }
}
