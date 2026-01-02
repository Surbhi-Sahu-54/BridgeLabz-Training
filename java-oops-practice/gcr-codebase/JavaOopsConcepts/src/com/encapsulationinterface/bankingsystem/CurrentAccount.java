package com.encapsulationinterface.bankingsystem;

public class CurrentAccount extends BankAccount {

    private static final double INTEREST_RATE = 0.02; // 2%

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }

    @Override
    public void applyForLoan() {
        System.out.println("Loan applied for Current Account");
    }

    @Override
    public double calculateLoanEligibility() {
        return balance * 10;
    }
}
