package com.lambdaexpression.nameuppercasing;
import java.util.*;
import java.util.stream.Collectors;

public class NameUppercasing {
    public static void main(String[] args) {

        List<String> employees = Arrays.asList(
            "Deep",
            "Surbhi",
            "Subh",
            "Shweta"
        );

        List<String> upperNames =
                employees.stream()
                         .map(String::toUpperCase)
                         .collect(Collectors.toList());

        System.out.println("Names in uppercase:");
        upperNames.forEach(System.out::println);
    }
}
