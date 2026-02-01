package com.streamAPI.insuranceclaimanalysis;
import java.util.*;
import java.util.stream.Collectors;

class Claim {
    String type;
    double amount;

    Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }
}

public class InsuranceAnalyticsApp {

    public static void main(String[] args) {

        List<Claim> claims = Arrays.asList(
                new Claim("Health", 5000),
                new Claim("Health", 7000),
                new Claim("Vehicle", 12000),
                new Claim("Vehicle", 8000),
                new Claim("Travel", 3000),
                new Claim("Travel", 4500)
        );

        Map<String, Double> avgByType = claims.stream()

                .collect(Collectors.groupingBy(
                        Claim::getType,
                        Collectors.averagingDouble(Claim::getAmount)
                ));

        avgByType.forEach((type, avg) ->
                System.out.println(type + " average: ₹" + avg));
    }
}
