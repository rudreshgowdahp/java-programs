package com.thinksworks.object.runner;

import com.thinksworks.object.external.Employee;

public class MainRunner {
    public static void main(String[] args) {
        Employee  employee = new Employee("Rudresh",14,3,"25/10/2003",1,"Laggere",true);
        Employee employee1 = new Employee("Rudresh",1,3,"25/10/2003",1,"Laggere",true);
        if (employee.equals(employee1)){
            System.out.println("same");
        }
        else{
            System.out.println("nope");
        }
    }

}
