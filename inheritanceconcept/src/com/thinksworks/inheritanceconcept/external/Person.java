package com.thinksworks.inheritanceconcept.external;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String address;
    private long phone;

    public Person(String name, int age, String address, String gender, long phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.phone = phone;
    }
    public  void display(){
        System.out.println("Name is:"+name);
        System.out.println("Age is:"+age);
        System.out.println("Gender is:"+address);
        System.out.println("Address is:"+gender);
        System.out.println("Phone is:"+phone);
    }

}
