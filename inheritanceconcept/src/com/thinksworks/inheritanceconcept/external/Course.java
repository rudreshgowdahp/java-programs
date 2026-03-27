package com.thinksworks.inheritanceconcept.external;

public class Course {
    private String name;
    private int cost;
    private String duration;
    private int strength;
    private boolean isPlacement;

    public Course(String name, int cost, String duration, int strength, boolean isPlacement) {
        this.name = name;
        this.cost = cost;
        this.duration = duration;
        this.strength = strength;
        this.isPlacement = isPlacement;
    }
    public void display(){
        System.out.println();
        System.out.println("COURSE DETAILS");
        System.out.println("Name is:"+name);
        System.out.println("Cost is:"+cost);
        System.out.println("Duration is:"+duration);
        System.out.println("Strength is:"+strength);
        System.out.println("Placement:"+isPlacement);
    }
}
