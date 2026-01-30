package com.functionalinterfaces.defaultmethodsininterface.dataexportfeature;
class CSVExporter implements DataExporter {

    @Override
    public void export(String data) {
        System.out.println("Exporting data as CSV: " + data);
    }
}
