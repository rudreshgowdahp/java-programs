package com.thinksworks.overriding.runner;

import com.thinksworks.overriding.external.Person;
import com.thinksworks.overriding.external.PersonDetails;
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
        PersonDetails personDetails = new PersonDetails("Ravi",12,"Laggere",5.10d,53);



    }
}
