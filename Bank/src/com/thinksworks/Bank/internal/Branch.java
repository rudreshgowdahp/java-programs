package com.thinksworks.Bank.internal;

public class Branch {
    private void addBranch(){
        System.out.println("Adding new branch");
    }
    void removeBranch(){
        System.out.println("Removing old branch");
    }
    public void  displayBranch(){
        System.out.println("Displaying the branch");
        addBranch();
        removeBranch();

    }
}
