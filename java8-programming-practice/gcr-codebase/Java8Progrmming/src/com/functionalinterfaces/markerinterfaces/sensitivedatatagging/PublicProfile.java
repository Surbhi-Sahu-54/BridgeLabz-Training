package com.functionalinterfaces.markerinterfaces.sensitivedatatagging;
class PublicProfile {

    String name;

    PublicProfile(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PublicProfile: " + name;
    }
}
