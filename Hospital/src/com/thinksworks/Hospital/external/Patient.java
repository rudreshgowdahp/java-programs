package com.thinksworks.Hospital.external;

public class Patient {
    private void patientName(){
        System.out.println("Patient name is xyz");
    }
    void patientAge(){
        System.out.println("Patient age is 12");
    }
    public void patientInfoDispaly(){
        System.out.println("Displaying the patient information");
        patientName();
        patientAge();
    }
}
