package com.objectmodeling.bankandaccountholders;

public class Account {

    private Customer customer;
    private Bank bank;
    private double balance;

    public Account(Customer customer, Bank bank, double balance) {
        this.customer = customer;
        this.bank = bank;
        this.balance = balance;
        customer.addAccount(this); // association link
    }

    public double getBalance() {
        return balance;
    }

    public Bank getBank() {
        return bank;
    }
}
