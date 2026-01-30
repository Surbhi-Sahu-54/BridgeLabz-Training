package com.functionalinterfaces.defaultmethodsininterface.dataexportfeature;

public interface DataExporter {

    void export(String data);

    // New feature added later
    default void exportToJSON(String data) {
        System.out.println("Exporting data in JSON format (default): " + data);
    }
}
