package stream.datastreams;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadStudentData {

    public static void main(String[] args) {

        try (
            DataInputStream dis =
                    new DataInputStream(new FileInputStream("student.dat"))
        ) {
            // Reading primitive data (same order)
            int rollNo = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            System.out.println("Student Details:");
            System.out.println("Roll Number: " + rollNo);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);

        } catch (IOException e) {
            System.out.println("Error while reading student data.");
        }
    }
}
