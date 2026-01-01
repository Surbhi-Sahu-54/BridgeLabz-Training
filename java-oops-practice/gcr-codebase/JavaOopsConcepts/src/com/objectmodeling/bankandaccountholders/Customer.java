package com.objectmodeling.bankandaccountholders;
import java.util.ArrayList;
public class Customer {
	  private String name;
	    private ArrayList<Account> accounts;

	    public Customer(String name) {
	        this.name = name;
	        this.accounts = new ArrayList<>();
	    }

	    public void addAccount(Account account) {
	        accounts.add(account);
	    }

	    // Communication method
	    public void viewBalance() {
	        System.out.println("Customer: " + name);
	        for (Account account : accounts) {
	            System.out.println("Bank: " + account.getBank().getBankName()
	                    + ", Balance: ₹" + account.getBalance());
	        }
	        System.out.println("--------------------");
	    }

	    public String getName() {
	        return name;
	    }
}
