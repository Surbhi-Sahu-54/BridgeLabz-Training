package com.encapsulationinterface.hospitalpatientmanagement;

public class InPatient extends Patient {

    private int daysAdmitted;
    private static final double DAILY_CHARGE = 3000;

    public InPatient(String patientId, String name, int age, int daysAdmitted) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * DAILY_CHARGE;
    }
}
