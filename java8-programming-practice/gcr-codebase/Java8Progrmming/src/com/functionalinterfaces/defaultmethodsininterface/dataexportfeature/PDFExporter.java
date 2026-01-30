package com.functionalinterfaces.defaultmethodsininterface.dataexportfeature;

class PDFExporter implements DataExporter {

    @Override
    public void export(String data) {
        System.out.println("Exporting data as PDF: " + data);
    }
}
