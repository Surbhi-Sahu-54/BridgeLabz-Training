package hospitalpatientmanagementsystem;

public class InPatient extends Patient {
	    private int daysAdmitted;

	    InPatient(int id, String name, int daysAdmitted) {
	        super(id, name);
	        this.daysAdmitted = daysAdmitted;
	    }

	    public void displayInfo() {
	        System.out.println(getSummary() + ", Days Admitted: " + daysAdmitted);
	    }

}
