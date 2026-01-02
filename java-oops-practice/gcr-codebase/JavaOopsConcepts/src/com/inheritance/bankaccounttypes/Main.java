package com.inheritance.bankaccounttypes;

public class Main {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount("SA101", 50000, 4.5);
        CheckingAccount ca = new CheckingAccount("CA201", 30000, 20000);
        FixedDepositAccount fd = new FixedDepositAccount("FD301", 100000, 5);

        sa.displayDetails();
        sa.displayAccountType();
        System.out.println("------------------");

        ca.displayDetails();
        ca.displayAccountType();
        System.out.println("------------------");

        fd.displayDetails();
        fd.displayAccountType();
    }
}
