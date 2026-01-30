package com.functionalinterfaces.defaultmethodsininterface.dataexportfeature;

class AdvancedExporter implements DataExporter {

    @Override
    public void export(String data) {
        System.out.println("Exporting with advanced engine: " + data);
    }

    @Override
    public void exportToJSON(String data) {
        System.out.println("Custom JSON export: { \"data\": \"" + data + "\" }");
    }
}
