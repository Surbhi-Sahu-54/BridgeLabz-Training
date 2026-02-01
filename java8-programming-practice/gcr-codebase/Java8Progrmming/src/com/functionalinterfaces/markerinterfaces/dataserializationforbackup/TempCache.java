package com.functionalinterfaces.markerinterfaces.dataserializationforbackup;

class TempCache {

    String cache;

    TempCache(String cache) {
        this.cache = cache;
    }

    @Override
    public String toString() {
        return "TempCache: " + cache;
    }
}
