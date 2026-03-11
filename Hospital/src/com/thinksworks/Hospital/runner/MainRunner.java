package com.thinksworks.Hospital.runner;

import com.thinksworks.Hospital.external.Doctor;
import com.thinksworks.Hospital.external.Patient;
import com.thinksworks.Hospital.internal.Employees;
import com.thinksworks.Hospital.internal.Treatment;

public class MainRunner {

    public static void main(String[]args){
        Doctor doctor = new Doctor();
        doctor.doctorVehicle();
        Patient patient = new Patient();
        patient.patientInfoDispaly();
        Treatment treatment = new Treatment();
        treatment.treatmentDisplay();
        Employees employees = new Employees();
        employees.employeeDisplay();


    }
}
