package com.thinksworks.banking.external;

import java.time.LocalDateTime;

public class User  extends  Base {
    String userName;
    int password;
    int age;
    String dob;
    String location;

    public User(String userName, int password, int age, String dob, String location) {
        this.userName = userName;
        this.password = password;
        this.age = age;
        this.dob = dob;
        this.location = location;
    }

    @Override
    public void createdAt() {
        System.out.println(LocalDateTime.now());

    }

    @Override
    public void createdBy() {
        System.out.println(userName);
    }
    public void printDetails(){
        createdAt();
        createdBy();
        System.out.println(userName);
        System.out.println(password);
        System.out.println(dob);
        System.out.println(age);
        System.out.println(location);
    }
}
