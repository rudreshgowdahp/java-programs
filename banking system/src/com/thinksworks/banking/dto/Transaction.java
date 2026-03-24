package com.thinksworks.banking.dto;

import com.thinksworks.banking.enums.AccountType;
import com.thinksworks.banking.enums.TransactionType;

public class Transaction {

    private int accountId;
    private  int transactionId;
    private TransactionType transactionType;
     private double amount;

    public Transaction(int accountId, int transactionId, TransactionType transactionType, double amount) {
        this.accountId = accountId;
        this.transactionId = transactionId;
        this.transactionType = transactionType;
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

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setAccountType(AccountType accountType) {
        this.transactionType = transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
