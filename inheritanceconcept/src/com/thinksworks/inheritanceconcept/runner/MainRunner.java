package com.thinksworks.inheritanceconcept.runner;

import com.thinksworks.inheritanceconcept.external.Employee;
import com.thinksworks.inheritanceconcept.external.Person;
import com.thinksworks.inheritanceconcept.internal.*;

import javax.print.Doc;

public class MainRunner {
    public static void main(String[] args) {

        Student student = new Student();
        Doctor doctor = new Doctor();
        Teacher teacher= new Teacher();
        student.display();
        doctor.display();
        teacher.display();
        Mobile mobile = new Mobile();
        mobile.display();
        Laptop laptop = new Laptop("HP",50000,"432",16,514);
        laptop.display();
        SmartWatch smartWatch = new SmartWatch("Boult",2500,"32",8,64);
        smartWatch.display();
        HR hr = new HR("Rudresh",123,90875,"laggere",false);
        hr.display();
        Manager manager = new Manager("Harsha",432,678999,"Rajajinagar",true);
        manager.display();
       Employee employee = new TeamLeader("Manoj",1,98765,"Kamakshi Palya",false);
        employee.display();
        Car car = new Car("Range rover",2314,"12/3/2028","32134",true);
        Bike bike = new Bike("KTM",1234,"31/12/2029","5432",false);
        Truck truck = new Truck("Bharat benz",7654,"4/5/2029","5432",true);
        car.display();
        bike.display();
        truck.display();
    }
}
