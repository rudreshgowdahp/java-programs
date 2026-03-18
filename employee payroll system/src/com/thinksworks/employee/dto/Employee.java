package com.thinksworks.employee.dto;

import com.thinksworks.employee.Designation;

public class Employee {

    private int empId;
    private String name;
    private Designation designation;
    private double salary;
    private double bonus;

    static {
        System.out.println("Pay roll system ready");
    }
    {
        System.out.println("Employee object created");
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Employee(int empId, String name, Designation designation, double salary, double bonus) {
        this.empId = empId;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.bonus = bonus;

    }
    public double calculateAnnualSalary(){
        return (salary+bonus)*12;
    }
}
