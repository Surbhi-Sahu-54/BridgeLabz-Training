package hospitalpatientmanagementsystem;

public class Main{
    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Subh", 5);
        Patient p2 = new OutPatient(102, "Deep");

        Doctor d1 = new Doctor("Dr. Sharma", "Cardiology");

        Bill bill = new Bill(7000);

        p1.displayInfo();
        p2.displayInfo();
        d1.displayInfo();

        System.out.println("Total Bill Amount: ₹" + bill.calculatePayment());
    }
}
