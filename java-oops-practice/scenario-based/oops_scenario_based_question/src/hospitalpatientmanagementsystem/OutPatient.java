package hospitalpatientmanagementsystem;

class OutPatient extends Patient {

    OutPatient(int id, String name) {
        super(id, name);
    }

    public void displayInfo() {
        System.out.println(getSummary() + ", Type: OutPatient");
    }
}

