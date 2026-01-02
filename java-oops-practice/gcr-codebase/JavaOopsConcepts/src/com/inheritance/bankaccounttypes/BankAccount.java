package com.inheritance.bankaccounttypes;

public class BankAccount {
	    protected String accountNumber;
	    protected double balance;

	    BankAccount(String accountNumber, double balance) {
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }

	    void displayDetails() {
	        System.out.println("Account Number : " + accountNumber);
	        System.out.println("Balance        : ₹" + balance);
	    }

}
