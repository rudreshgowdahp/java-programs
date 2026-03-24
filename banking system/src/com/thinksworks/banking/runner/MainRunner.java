package com.thinksworks.banking.runner;

import com.thinksworks.banking.dto.Account;
import com.thinksworks.banking.dto.Transaction;
import com.thinksworks.banking.enums.AccountType;
import com.thinksworks.banking.enums.TransactionType;
import com.thinksworks.banking.service.BankService;

public class MainRunner {
    public static void main(String[] args) {
        Account account = new Account(1,"Rudresh",12.5d, AccountType.SAVINGS);
        Account account1 = new Account(2,"Sathish",10.5d,AccountType.CURRENT);
        Account[] account2 = {account,account1};
        Transaction transaction = new Transaction(1,32, TransactionType.CREDIT,2000);
        Transaction transaction1 = new Transaction(2,23,TransactionType.DEBIT,8000);
        Transaction[] transactions = {transaction,transaction1};
        BankService bankService = new BankService();
        for (Account account3 :account2) {
            bankService.printAccountdetails(account3);
        }
        for (Transaction transaction2 :transactions){
            bankService.printTransactionDetails(transaction2);
        }
        bankService.printTotalBalance(account2);

    }
}
