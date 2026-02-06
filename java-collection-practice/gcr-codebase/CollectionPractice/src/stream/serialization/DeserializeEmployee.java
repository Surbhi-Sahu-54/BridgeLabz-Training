package stream.serialization;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeserializeEmployee {

    public static void main(String[] args) {

        try (
            ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("employees.dat"))
        ) {
            ArrayList<Employee> empList =
                    (ArrayList<Employee>) ois.readObject();

            System.out.println("Employee Details:");
            for (Employee e : empList) {
                e.display();
            }

        } catch (IOException e) {
            System.out.println("IO Error while reading employee data.");
        } catch (ClassNotFoundException e) {
            System.out.println("Employee class not found.");
        }
    }
}
