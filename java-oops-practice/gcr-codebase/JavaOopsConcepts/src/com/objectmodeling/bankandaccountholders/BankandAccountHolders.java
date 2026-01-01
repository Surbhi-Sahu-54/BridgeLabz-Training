package com.objectmodeling.bankandaccountholders;

public class BankandAccountHolders {

    public static void main(String[] args) {

        Bank sbi = new Bank("State Bank of India");
        Bank hdfc = new Bank("HDFC Bank");

        Customer c1 = new Customer("Deep");
        Customer c2 = new Customer("Surbhi");

        sbi.openAccount(c1, 5000);
        hdfc.openAccount(c1, 12000);
        sbi.openAccount(c2, 8000);

        c1.viewBalance();
        c2.viewBalance();
    }
}
