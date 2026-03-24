package com.thinksworks.banking.service;

import com.thinksworks.banking.dto.Account;
import com.thinksworks.banking.dto.Transaction;

public class BankService {
    public  void printAccountdetails(Account account){
        System.out.println("Account id:"+account.getAccountid());
        System.out.println("Account Holder name :"+account.getAccountHolderName());
        System.out.println("Account Balance:"+account.getAccountBalance());
        System.out.println("Account type is:"+account.getAccountType());
    }
    public void printTransactionDetails(Transaction transaction){
        System.out.println("Account id:"+transaction.getAccountId());
        System.out.println("Transaction id:"+transaction.getTransactionId());
        System.out.println("Account type is:"+transaction.getTransactionType());
        System.out.println("amount:"+transaction.getAmount());
    }
    public void printTotalBalance(Account[] accounts){
        double total = 0;
        for (Account account:accounts){
            total = total+account.getAccountBalance();
        }
        System.out.println("total balance:"+total);
    }



}
