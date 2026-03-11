package com.thinksworks.Bank.external;

public class Loan {
    private void applyLoan(){
        System.out.println("Applying the loan");
    }
    void approveLoan (){
        System.out.println("Apporing the loan");
    }
    public void  displayLoan(){
        System.out.println("displaying the loan");
        applyLoan();
        approveLoan();

    }
}
