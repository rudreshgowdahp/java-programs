package com.thinksworks.banking.runner;

public class MainRunner {
    private int transactionId;
    private int accountid;
    private double amount;
    private String accountType;

    public MainRunner(int transactionId, int accountid, double amount, String accountType) {
        this.transactionId = transactionId;
        this.accountid = accountid;
        this.amount = amount;
        this.accountType = accountType;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getAccountid() {
        return accountid;
    }

    public void setAccountid(int accountid) {
        this.accountid = accountid;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
