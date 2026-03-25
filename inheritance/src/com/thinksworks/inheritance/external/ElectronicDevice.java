package com.thinksworks.inheritance.external;

public class ElectronicDevice {
    private  String Name;
    private int number;
    private boolean isThere;
    private String id;

     public ElectronicDevice(){
        System.out.println("no arguments constructor in Electronic device ");
    }

    public String getName() {
        return Name;
    }

    public int getNumber() {
        return number;
    }

    public boolean isThere() {
        return isThere;
    }

    public String getId() {
        return id;
    }
}
