package com.functionalinterfaces.functionalinterface.stringlengthchecker;

import java.util.function.Function;

public class StringLengthChecker {

    public static void main(String[] args) {

        int limit = 20;

        // Function to calculate string length
        Function<String, Integer> lengthFunction = str -> str.length();

        String message = "Hello Java Functional Programming";

        int length = lengthFunction.apply(message);

        if (length > limit) {
            System.out.println("Message exceeds character limit!");
        } else {
            System.out.println("Message is within limit.");
        }

        System.out.println("Length: " + length);
    }
}
