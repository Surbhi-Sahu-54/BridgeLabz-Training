package com.lambdaexpression.hospitalpatientid;
import java.util.*;

public class HospitalPatientID {

    public static void main(String[] args) {

        List<String> patientIds = Arrays.asList(
            "PAT101",
            "PAT102",
            "PAT103",
            "PAT104"
        );

        System.out.println("Patient IDs:");

        // Method reference instead of lambda
        patientIds.forEach(System.out::println);
    }
}

