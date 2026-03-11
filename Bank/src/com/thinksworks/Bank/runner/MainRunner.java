package com.thinksworks.Bank.runner;

import com.thinksworks.Bank.external.Account;
import com.thinksworks.Bank.external.Loan;
import com.thinksworks.Bank.internal.Branch;
import com.thinksworks.Bank.internal.Customer;

public class MainRunner {

    public static void main(String[]args){
        Account account = new Account();
        account.displayAccount();
        Loan loan = new Loan();
        loan.displayLoan();
        Customer customer = new Customer();
        customer.displayCustomer();
        Branch branch = new Branch();
        branch.displayBranch();
    }
}
