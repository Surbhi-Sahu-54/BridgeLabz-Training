package collections.queue_interface;
import java.util.PriorityQueue;

class Patient {
    String name;
    int severity;

    // Constructor
    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}
public class HospitalTriageSystem {



public static void main(String[] args) {
    PriorityQueue<Patient> p1 = new PriorityQueue<>((a, b) -> Integer.compare(b.severity, a.severity));

    //Adding patients to the priority queue
    p1.add(new Patient("Subh", 5));
    p1.add(new Patient("Deep", 1));
    p1.add(new Patient("Saurabh", 2));
    p1.add(new Patient("Yuvi", 3));

    System.out.println("Treatment Order:");
    while (!p1.isEmpty()) {
        Patient patient = p1.poll();
        System.out.println(patient);
    }
}
}