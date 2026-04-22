package com.thinksworks.banking.runner;

import com.thinksworks.banking.external.User;

public class  MainRunner {
    public static void main(String[] args) {
        User user = new User("Sathish",1234,17,"12/09/2003","Laggere");
        user.printDetails();
    }
}
