package stream.serialization;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializeEmployee {

    public static void main(String[] args) {

        ArrayList<Employee> empList = new ArrayList<>();

        empList.add(new Employee(1, "Surbhi", "IT", 50000));
        empList.add(new Employee(2, "Amit", "HR", 45000));
        empList.add(new Employee(3, "Neha", "Finance", 60000));

        try (
            ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("employees.dat"))
        ) {
            oos.writeObject(empList);
            System.out.println("Employee data saved successfully.");

        } catch (IOException e) {
            System.out.println("Error while saving employee data.");
        }
    }
}
