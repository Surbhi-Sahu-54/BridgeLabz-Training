package com.functionalinterfaces.markerinterfaces.dataserializationforbackup;

public class UserData implements BackupSerializable {

    String name;

    UserData(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserData: " + name;
    }
}
