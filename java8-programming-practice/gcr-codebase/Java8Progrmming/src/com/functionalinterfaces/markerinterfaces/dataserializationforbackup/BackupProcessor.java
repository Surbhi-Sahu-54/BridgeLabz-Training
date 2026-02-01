package com.functionalinterfaces.markerinterfaces.dataserializationforbackup;

public class BackupProcessor {

    public static void processBackup(Object obj) {

        if (obj instanceof BackupSerializable) {
            System.out.println("Backing up: " + obj);
        } else {
            System.out.println("Skipping (not serializable): " + obj);
        }
    }
}
