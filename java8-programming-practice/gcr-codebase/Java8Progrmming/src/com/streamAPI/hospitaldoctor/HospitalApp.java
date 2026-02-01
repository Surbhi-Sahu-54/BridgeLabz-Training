package com.streamAPI.hospitaldoctor;
import java.util.*;
import java.util.stream.Collectors;

class Doctor {
    String name;
    String specialty;
    boolean weekendAvailable;

    Doctor(String name, String specialty, boolean weekendAvailable) {
        this.name = name;
        this.specialty = specialty;
        this.weekendAvailable = weekendAvailable;
    }

    @Override
    public String toString() {
        return name + " | " + specialty + " | Weekend: " + weekendAvailable;
    }
}

public class HospitalApp {

    public static void main(String[] args) {

        List<Doctor> doctors = Arrays.asList(
                new Doctor("Dr. A", "Cardiology", true),
                new Doctor("Dr. B", "Neurology", false),
                new Doctor("Dr. C", "Orthopedic", true),
                new Doctor("Dr. D", "Dermatology", true),
                new Doctor("Dr. E", "Pediatrics", false),
                new Doctor("Dr. F", "Cardiology", true)
        );

        List<Doctor> availableDoctors = doctors.stream()

                // filter weekend doctors
                .filter(d -> d.weekendAvailable)

                // sort by specialty
                .sorted(Comparator.comparing(d -> d.specialty))

                .collect(Collectors.toList());

        availableDoctors.forEach(System.out::println);
    }
}
