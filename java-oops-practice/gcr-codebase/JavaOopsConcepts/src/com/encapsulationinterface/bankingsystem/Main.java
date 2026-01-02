package com.encapsulationinterface.bankingsystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("SAV101", "Amit", 50000));
        accounts.add(new CurrentAccount("CUR202", "Riya", 100000));

        System.out.println("----- Banking System -----");

        for (BankAccount acc : accounts) {
            acc.displayAccount();
            System.out.println("Interest: ₹" + acc.calculateInterest());
            acc.applyForLoan();
            System.out.println("Loan Eligibility: ₹" + acc.calculateLoanEligibility());
            System.out.println("--------------------------");
        }
    }
}
