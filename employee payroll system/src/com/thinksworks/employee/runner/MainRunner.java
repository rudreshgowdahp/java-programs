package com.thinksworks.employee.runner;

import com.thinksworks.employee.DepartmetType;
import com.thinksworks.employee.Designation;
import com.thinksworks.employee.dto.Department;
import com.thinksworks.employee.dto.Employee;
import com.thinksworks.employee.service.PayRollService;

public class MainRunner {
    public static void main(String[] args) {
        Employee employee = new Employee(1,"rudresh", Designation.DIRECTOR,40000d,10000d);
        Employee employee1 = new Employee(2,"Harsha",Designation.SENIOR_DEVELOPER,100000d,40000d);
        Employee employee2 = new Employee(3,"gagan",Designation.INTERN,30000d,12000d);
        Employee employee3 = new Employee(4,"Pavan",Designation.MANAGER,30000d,10000d);
        Employee employee4 = new Employee(5,"Manoj",Designation.JUNIOR_DEVELOPER,50000d,14000d);

        Employee[] employe ={employee,employee1,employee2,employee3,employee4};

        Department department = new Department(101,"HR",DepartmetType.HR,employe);
        Department department1 = new Department(102,"Harsha",DepartmetType.DEVELOPMENT,employe);
        Department[] Dept = {department,department1};

        PayRollService payRollService = new PayRollService();

        for( Employee employees :employe) {
            payRollService.printEmployeeDetails(employees);
        }
        for (Department departments :Dept){
            payRollService.printDepartmentDetails(departments);
        }
        double total = payRollService.calculateTotalCompanysalary(Dept);
        System.out.println("Total Company Salary:"+total);
        payRollService.findHighSalaryEmployees(employe);




    }
}
