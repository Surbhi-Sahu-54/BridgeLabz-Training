package com.encapsulationinterface.hospitalpatientmanagement;

public class OutPatient extends Patient {

    private static final double CONSULTATION_FEE = 500;

    public OutPatient(String patientId, String name, int age) {
        super(patientId, name, age);
    }

    public double calculateBill() {
        return CONSULTATION_FEE;
    }
}

