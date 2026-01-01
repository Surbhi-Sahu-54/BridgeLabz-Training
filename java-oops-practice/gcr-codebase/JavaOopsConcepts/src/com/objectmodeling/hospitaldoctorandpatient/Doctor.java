package com.objectmodeling.hospitaldoctorandpatient;

public class Doctor {
	  private String doctorName;
	    private String specialization;

	    public Doctor(String doctorName, String specialization) {
	        this.doctorName = doctorName;
	        this.specialization = specialization;
	    }

	    public String getDoctorName() {
	        return doctorName;
	    }

	    // Communication between Doctor and Patient
	    public void consult(Patient patient) {
	        System.out.println("Doctor " + doctorName +
	                " (" + specialization + ")" +
	                " is consulting Patient " +
	                patient.getPatientName());
	    }
}
