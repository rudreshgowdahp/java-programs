package com.thinksworks.Hospital.external;

public class Doctor {

    private void doctorInfo(){
        System.out.println("Doctor information");
    }
    void doctorSchedule(){
        System.out.println("Doctor's schedule");
    }
    public void doctorVehicle(){
        System.out.println("Doctor vehicle is car");
        doctorInfo();
        doctorSchedule();
    }
}
