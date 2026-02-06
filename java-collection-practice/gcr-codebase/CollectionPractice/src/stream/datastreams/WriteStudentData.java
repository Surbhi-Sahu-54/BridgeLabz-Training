package stream.datastreams;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteStudentData {

    public static void main(String[] args) {

        try (
            DataOutputStream dos =
                    new DataOutputStream(new FileOutputStream("student.dat"))
        ) {
            // Writing primitive data
            dos.writeInt(101);          // roll number
            dos.writeUTF("Surbhi");     // name
            dos.writeDouble(8.7);       // GPA

            System.out.println("Student data written successfully.");

        } catch (IOException e) {
            System.out.println("Error while writing student data.");
        }
    }
}
