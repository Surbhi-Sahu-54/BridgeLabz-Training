package com.objectmodeling.hospitaldoctorandpatient;

public class Hospitalmain {
    public static void main(String[] args) {

        Hospital hospital = new Hospital("City Care Hospital");

        Doctor d1 = new Doctor("Dr. Sharma", "Cardiologist");
        Doctor d2 = new Doctor("Dr. Mehta", "Orthopedic");

        Patient p1 = new Patient("Subh");
        Patient p2 = new Patient("Deep");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);

        hospital.addPatient(p1);
        hospital.addPatient(p2);

        hospital.showHospitalDetails();

        System.out.println("\n--- Consultations ---");
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);
    }
}
