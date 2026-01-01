package com.objectmodeling.bankandaccountholders;
import java.util.ArrayList;
public class Bank {

    private String bankName;
    private ArrayList<Account> accounts;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.accounts = new ArrayList<>();
    }

    // Association: Bank opens account for customer
    public Account openAccount(Customer customer, double initialBalance) {
        Account account = new Account(customer, this, initialBalance);
        accounts.add(account);
        System.out.println("Account opened for " + customer.getName()
                + " in " + bankName);
        return account;
    }

    public String getBankName() {
        return bankName;
    }
}
