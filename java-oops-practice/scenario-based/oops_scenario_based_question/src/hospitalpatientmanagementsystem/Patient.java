package hospitalpatientmanagementsystem;

public class Patient {
	    private int patientId;
	    private String name;
	    private String medicalHistory;

	    // Normal admission
	    Patient(int patientId, String name) {
	        this.patientId = patientId;
	        this.name = name;
	        this.medicalHistory = "Not Provided";
	    }

	    // Emergency admission (Constructor Overloading)
	    Patient(int patientId, String name, String medicalHistory) {
	        this.patientId = patientId;
	        this.name = name;
	        this.medicalHistory = medicalHistory;
	    }

	    public String getSummary() {
	        return "Patient ID: " + patientId + ", Name: " + name;
	    }

	    public void displayInfo() {
	        System.out.println(getSummary());
	    }
}
