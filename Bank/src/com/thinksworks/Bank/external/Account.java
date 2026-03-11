package com.thinksworks.Bank.external;

public class Account {
    private void addAccount(){
        System.out.println("Adding new account");
    }
    void removeAccount(){
        System.out.println("Removing old account");
    }
    public void  displayAccount(){
        System.out.println("Displaying the account");
        addAccount();
        removeAccount();

    }
}
