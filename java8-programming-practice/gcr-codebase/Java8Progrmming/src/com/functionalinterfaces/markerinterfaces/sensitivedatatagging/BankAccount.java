package com.functionalinterfaces.markerinterfaces.sensitivedatatagging;
class BankAccount implements SensitiveData {

    String accountNumber;

    BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "BankAccount: " + accountNumber;
    }
}
