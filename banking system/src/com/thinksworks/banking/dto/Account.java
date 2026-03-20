package com.thinksworks.banking.dto;

import com.thinksworks.banking.enums.AccountType;

public class Account {
    private int accountid;
    private String accountHolderName;
     private double accountBalance;
    private AccountType accountType;


    public Account(int accountid, String accountHolderName, double accountBalance ,AccountType accountType) {
        this.accountid = accountid;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.accountType = accountType;
    }

    public int getAccountid() {
        return accountid;
    }

    public void setAccountid(int accountid) {
        this.accountid = accountid;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
}
