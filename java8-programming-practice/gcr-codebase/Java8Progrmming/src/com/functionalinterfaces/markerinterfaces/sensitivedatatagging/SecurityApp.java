package com.functionalinterfaces.markerinterfaces.sensitivedatatagging;

public class SecurityApp {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("1234-5678-9999");
        PublicProfile profile = new PublicProfile("Surbhi");

        EncryptionService.process(account);
        EncryptionService.process(profile);
    }
}
