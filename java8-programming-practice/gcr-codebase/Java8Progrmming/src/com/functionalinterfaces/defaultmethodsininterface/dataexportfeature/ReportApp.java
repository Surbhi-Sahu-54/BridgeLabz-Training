package com.functionalinterfaces.defaultmethodsininterface.dataexportfeature;

public class ReportApp {
	 public static void main(String[] args) {

	        DataExporter csv = new CSVExporter();
	        DataExporter pdf = new PDFExporter();
	        DataExporter advanced = new AdvancedExporter();

	        csv.export("Sales Report");
	        csv.exportToJSON("Sales Report");

	        pdf.export("Finance Report");
	        pdf.exportToJSON("Finance Report");

	        advanced.export("Analytics Report");
	        advanced.exportToJSON("Analytics Report");
	    }
	}
