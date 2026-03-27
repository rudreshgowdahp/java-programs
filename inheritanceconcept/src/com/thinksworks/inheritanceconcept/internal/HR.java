package com.thinksworks.inheritanceconcept.internal;

import com.thinksworks.inheritanceconcept.external.Employee;

public class HR extends Employee {

    public HR(String employeeName, int employeeId, long employeePhoneNumber, String employeeLocation, boolean isComing) {
        super(employeeName, employeeId, employeePhoneNumber, employeeLocation, isComing);
    }
}
