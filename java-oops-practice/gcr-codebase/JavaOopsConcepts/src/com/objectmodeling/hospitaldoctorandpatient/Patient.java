package com.objectmodeling.hospitaldoctorandpatient;

public class Patient {

    private String patientName;

    // ✅ REQUIRED constructor
    public Patient(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientName() {
        return patientName;
    }
}
