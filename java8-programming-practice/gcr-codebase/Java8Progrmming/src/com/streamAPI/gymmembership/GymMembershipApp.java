package com.streamAPI.gymmembership;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class Member {
    String name;
    LocalDate expiryDate;

    Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return name + " expires on " + expiryDate;
    }
}

public class GymMembershipApp {

    public static void main(String[] args) {

        List<Member> members = Arrays.asList(
                new Member("Deep", LocalDate.now().plusDays(10)),
                new Member("Surbhi", LocalDate.now().plusDays(40)),
                new Member("Subh", LocalDate.now().plusDays(25)),
                new Member("Subii", LocalDate.now().plusDays(5))
        );

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        List<Member> expiringSoon = members.stream()
                .filter(m -> m.expiryDate.isAfter(today.minusDays(1))
                          && m.expiryDate.isBefore(next30Days.plusDays(1)))
                .collect(Collectors.toList());

        expiringSoon.forEach(System.out::println);
    }
}
