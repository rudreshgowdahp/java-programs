package com.thinksworks.inheritanceconcept.internal;

import com.thinksworks.inheritanceconcept.external.Employee;

public class TeamLeader extends Employee {
    public TeamLeader(String employeeName, int employeeId, long employeePhoneNumber, String employeeLocation, boolean isComing) {
        super(employeeName, employeeId, employeePhoneNumber, employeeLocation, isComing);
    }
}
