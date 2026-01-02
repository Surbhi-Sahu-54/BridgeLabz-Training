package com.inheritance.bankaccounttypes;

class FixedDepositAccount extends BankAccount {
    private int tenureYears;

    FixedDepositAccount(String accountNumber, double balance, int tenureYears) {
        super(accountNumber, balance);
        this.tenureYears = tenureYears;
    }

    void displayAccountType() {
        System.out.println("Account Type : Fixed Deposit Account");
        System.out.println("Tenure       : " + tenureYears + " years");
    }
}
