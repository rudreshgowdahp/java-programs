package com.thinksworks.overriding.runner;

import com.thinksworks.overriding.external.Person;
import com.thinksworks.overriding.external.Phone;
import com.thinksworks.overriding.internal.*;

public class MainRunner {
    public static void main(String[] args) {
        Person person = new Person();
        Artist artist = new Artist();
        Chef chef = new Chef();
        Doctor doctor = new Doctor();
        Driver driver = new Driver();
        Engineer engineer = new Engineer();
        Farmer farmer = new Farmer();
        Pilot pilot = new Pilot();
        Police police = new Police();
        Student student = new Student();
        Teacher teacher = new Teacher();
        person.role();
        artist.role();
        chef.role();
        doctor.role();
        driver.role();
        engineer.role();
        farmer.role();
        pilot.role();
        police.role();
        student.role();
        teacher.role();
        Phone phone = new Phone();
        phone.phoneDetails("vivo",20000,"laggere",12,256);



    }
}
