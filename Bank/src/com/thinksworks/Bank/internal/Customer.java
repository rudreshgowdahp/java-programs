package com.thinksworks.Bank.internal;

public class Customer {
    private void addCustomer(){
        System.out.println("Adding new customer");
    }
    void removeCustomer(){
        System.out.println("Removing old customer");
    }
    public void  displayCustomer(){
        System.out.println("Displaying the customer");
        addCustomer();
        removeCustomer();

    }
}
