package com.encapsulationinterface.hospitalpatientmanagement;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();

        Patient p1 = new InPatient("P101", "Rahul", 35, 4);
        Patient p2 = new OutPatient("P202", "Anita", 28);

        p1.addRecord("Admitted for surgery");
        p2.addRecord("Routine check-up");

        patients.add(p1);
        patients.add(p2);

        System.out.println("----- Hospital Patient Management -----");

        for (Patient p : patients) {
            p.getPatientDetails();
            p.viewRecords();
            System.out.println("Total Bill: ₹" + p.calculateBill());
            System.out.println("--------------------------------------");
        }
    }
}

