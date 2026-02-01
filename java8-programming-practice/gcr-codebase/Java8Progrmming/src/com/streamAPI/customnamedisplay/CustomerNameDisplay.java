package com.streamAPI.customnamedisplay;
import java.util.*;
import java.util.stream.Collectors;

public class CustomerNameDisplay {

    public static void main(String[] args) {

        List<String> customers = Arrays.asList(
                "surbhi",
                "Subh",
                "Deep",
                "Yuvi",
                "Saurabh"
        );

        List<String> result = customers.stream()
                .map(String::toUpperCase)   // transform to uppercase
                .sorted()                   // alphabetical order
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}
