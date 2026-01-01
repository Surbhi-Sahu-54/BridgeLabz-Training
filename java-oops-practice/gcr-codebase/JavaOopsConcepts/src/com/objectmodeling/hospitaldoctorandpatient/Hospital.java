package com.objectmodeling.hospitaldoctorandpatient;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private String hospitalName;
    private List<Doctor> doctors;
    private List<Patient> patients;

    // ✅ REQUIRED constructor
    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showHospitalDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors count: " + doctors.size());
        System.out.println("Patients count: " + patients.size());
    }
}
