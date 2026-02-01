package com.functionalinterfaces.markerinterfaces.dataserializationforbackup;

public class BackupApp {

    public static void main(String[] args) {

        UserData user = new UserData("Surbhi");
        TempCache cache = new TempCache("Session123");

        BackupProcessor.processBackup(user);
        BackupProcessor.processBackup(cache);
    }
}
