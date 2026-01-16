package sorting.hospitalqueue;
import java.util.Scanner;

class Patient {
int patientNo; 
  int criticality;     // 1 to 10

  // Constructor
  Patient(int patientNo, int criticality) {
  this.patientNo = patientNo;
  this.criticality = criticality;
}

	    // Display method
 void display() {
	System.out.println("Patient " + patientNo +" \t" + criticality);
 }
}
public class HospitalQueue {

// Bubble Sort (Descending Order by Criticality)
public static void bubbleSortByCriticality(Patient[] patients) {
 int n = patients.length;
for (int i = 0; i < n - 1; i++) {
 boolean swapped = false;
   for (int j = 0; j < n - 1 - i; j++) {
	   // Descending sort: higher criticality should come first
 if (patients[j].criticality < patients[j + 1].criticality) {
 Patient temp = patients[j];
patients[j] = patients[j + 1];
patients[j + 1] = temp;
 swapped = true;
 }
 }
// Optimization: if no swap happened, list already sorted
   if (!swapped) {
break;
}
}
}

// Display all patients
public static void displayPatients(Patient[] patients) {
  System.out.println("\nCriticality");
	  System.out.println("----------------------------------------------");
	     for (Patient p : patients) {
	       p.display();
	   }
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      System.out.print("Enter number of patients: ");
	    int n = sc.nextInt();
          Patient[] patients = new Patient[n];
	        for (int i = 0; i < n; i++) {
	        System.out.println("\nPatient " + (i + 1) + ":");
              sc.nextLine(); // Consume newline
                System.out.print("Enter Criticality Level (1-10): ");
	            int criticality = sc.nextInt();
	            patients[i] = new Patient(i+1 , criticality);
	        }
// Bubble Sort call
bubbleSortByCriticality(patients);

System.out.println("\n Patients list AFTER sorting (By Criticality - High to Low):");
displayPatients(patients);

sc.close();
	}

}
