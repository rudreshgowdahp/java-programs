package com.thinksworks.person;

public class Bank {

    private String bankName;
    private int  bankId;
    private String bankCode;
    private String branchName;
    private String managerName;
    private String location;
    private String ifcsCode;
    private double balance ;
    private long contactNumber;

    public String getBankName(){
        return bankName;
    }
    public  void setBankName(String bankName){
        this.bankName = bankName;
    }
    public int getBankId(){
        return bankId;
    }
    public  void setBankId(int bankId){
        this.bankId = bankId;
    }
    public String getBankCode(){
        return bankCode;
    }
    public  void setBankCode(String bankCode){
        this.bankCode = bankCode;
    }
    public String getBranchName(){
        return branchName;
    }
    public void setBranchName( String branchName){
        this.branchName = branchName;
    }
    public String getManagerName(){
        return managerName;
    }
    public void setManagerName(String managerName){
        this.managerName = managerName;
    }
    public String getLocation(){
        return location;
    }
    public  void setLocation(String location){
        this.location = location;
    }
    public String getIfcsCode(){
        return ifcsCode;
    }
    public void setIfcsCode(String ifcsCode){
        this.ifcsCode = ifcsCode;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public long getContactNumber(){
        return contactNumber;
    }
    public void setContactNumber(long contactNumber){
        this.contactNumber = contactNumber;
    }
}
