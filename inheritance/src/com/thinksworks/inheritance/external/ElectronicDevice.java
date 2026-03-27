package com.thinksworks.inheritance.external;

public class ElectronicDevice {
    private  String Name;
    private int number;
    private boolean isThere;
    private String id;

    public ElectronicDevice(String name, int number, boolean isThere, String id) {
        Name = name;
        this.number = number;
        this.isThere = isThere;
        this.id = id;
    }
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
