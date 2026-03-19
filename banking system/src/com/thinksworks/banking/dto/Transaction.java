package com.thinksworks.banking.dto;

import com.thinksworks.banking.enums.AccountType;

public class Transaction {

    private int accountId;
    private  int transactionId;
    private AccountType accountType;
     private double amount;

    public Transaction(int accountId, int transactionId, AccountType accountType, double amount) {
        this.accountId = accountId;
        this.transactionId = transactionId;
        this.accountType = accountType;
        this.amount = amount;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
