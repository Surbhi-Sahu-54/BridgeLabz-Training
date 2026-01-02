package com.encapsulationinterface.hospitalpatientmanagement;

import java.util.*;

public abstract class Patient implements MedicalRecord {

    private String patientId;
    private String name;
    private int age;

    // Encapsulated sensitive data
    private String diagnosis;
    private List<String> medicalHistory = new ArrayList<>();

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Abstract method
    public abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Encapsulation: controlled access
    protected void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    protected String getDiagnosis() {
        return diagnosis;
    }

    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    public void viewRecords() {
        System.out.println("Medical History: " + medicalHistory);
    }
}
