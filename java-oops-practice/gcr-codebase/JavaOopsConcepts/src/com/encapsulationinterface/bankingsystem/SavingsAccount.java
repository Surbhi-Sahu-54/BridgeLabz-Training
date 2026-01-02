package com.encapsulationinterface.bankingsystem;

public class SavingsAccount extends BankAccount {

    private static final double INTEREST_RATE = 0.04; // 4%

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }

    @Override
    public void applyForLoan() {
        System.out.println("Loan applied for Savings Account");
    }

    @Override
    public double calculateLoanEligibility() {
        return balance * 5;
    }
}
