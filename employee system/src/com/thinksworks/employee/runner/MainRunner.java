package com.thinksworks.employee.runner;

import com.thinksworks.employee.external.Employee;
import com.thinksworks.employee.internal.Developer;
import com.thinksworks.employee.internal.Manager;
import com.thinksworks.employee.internal.Tester;

public class MainRunner {
    public static void main(String[] args) {
        Employee employee = new Developer("Likith");
        if (employee instanceof Developer){
            Developer developer = (Developer) employee;
            developer.writeCode();
        }
        else {
            System.out.println("Invalid cast");
        }
        Employee employee1 = new Manager("Rudresh");
        Employee employee2 = new Tester("Sathish");
        employee.work();
        employee1.work();
        employee2.work();
        // Java always calls the method of  object that is actually created not the reference type.
        Developer developer = (Developer) employee;// downcasting
        developer.writeCode();
        // class cast exception
        // reason :Object is actually Employee, not Developer. JVM prevents invalid cast.
    }

}
