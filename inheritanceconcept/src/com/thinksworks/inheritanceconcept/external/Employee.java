package com.thinksworks.inheritanceconcept.external;

public class Employee {
    private String employeeName;
    private int employeeId;
    private long employeePhoneNumber;
    private String employeeLocation;
    private boolean isComing;

    public Employee(String employeeName, int employeeId, long employeePhoneNumber, String employeeLocation, boolean isComing) {
        employeeName = employeeName;
        employeeId = employeeId;
        employeePhoneNumber = employeePhoneNumber;
        employeeLocation = employeeLocation;
        this.isComing = isComing;
    }
    public void  display(){
        System.out.println("EMPLOYEE DETAILS");
        System.out.println("Employee name:"+employeeName);
        System.out.println("Employee id:"+employeeId);
        System.out.println("Employee phone number:"+employeePhoneNumber);
        System.out.println("Employee Location :"+employeeLocation);
        System.out.println("Employee is coming:"+isComing);
    }
}
