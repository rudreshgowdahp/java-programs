package com.thinksworks.inheritanceconcept.internal;

import com.thinksworks.inheritanceconcept.external.Employee;

public class Manager extends Employee {
    public Manager(String employeeName, int employeeId, long employeePhoneNumber, String employeeLocation, boolean isComing) {
        super(employeeName, employeeId, employeePhoneNumber, employeeLocation, isComing);
    }
}
