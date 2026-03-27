package com.thinksworks.inheritanceconcept.external;

public class Device {
    private String brand;
    private int cost;
    private String id;
    private int ram;
    private int storage;

    public Device(String brand, int cost, String id, int ram, int storage) {
        this.brand = brand;
        this.cost = cost;
        this.id = id;
        this.ram = ram;
        this.storage = storage;
    }

    public void display(){
        System.out.println("DEVICE DETAILS");
        System.out.println("Brand name:"+brand);
        System.out.println("Cost:"+cost);
        System.out.println("Id is:"+id);
        System.out.println("Ram is:"+ram);
        System.out.println("Storage is:"+storage);
    }
}
