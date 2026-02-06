package stream.serialization;
import java.io.Serializable;

public class Employee implements Serializable {

    int id;
    String name;
    String department;
    double salary;

    // Constructor
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Display method
    public void display() {
        System.out.println(id + " | " + name + " | " + department + " | " + salary);
    }
}
