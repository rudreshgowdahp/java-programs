package com.thinksworks.employee.dto;


import com.thinksworks.employee.DepartmetType;

public class Department {

    private int deptId;
    private String deptName;
    private DepartmetType deptType;
    private Employee[] employees;

    public Department(int deptId, String deptName, DepartmetType deptType, Employee[] employees) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.deptType = deptType;
        this.employees = employees;
    }

    public int getDeptId() {
        return deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public DepartmetType getDeptType() {
        return deptType;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public double  calculateDepartmentSalary(){
         double annualSalary = 0;
        for(Employee employee :employees){
            annualSalary = employee.calculateAnnualSalary();
        }
        return  annualSalary;
    }
}
