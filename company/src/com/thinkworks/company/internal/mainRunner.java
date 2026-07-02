package com.thinkworks.company.internal;

import com.thinksworks.company.external.Employee;

public class mainRunner {
    public static void main(String[] args) {
        Employee  employee = new Employee("Rudra","Laggere","123@gmail.com","25/10/2003","12");
        System.out.println(employee.getAdress());
    }
}
