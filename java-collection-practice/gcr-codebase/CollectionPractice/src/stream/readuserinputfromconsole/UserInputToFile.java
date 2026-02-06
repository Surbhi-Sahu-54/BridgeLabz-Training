package stream.readuserinputfromconsole;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputToFile {

    public static void main(String[] args) {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        try {
            // Read input from user
            System.out.print("Enter your name: ");
            String name = br.readLine();

            System.out.print("Enter your age: ");
            String age = br.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = br.readLine();

            // Write data to file
            FileWriter fw = new FileWriter("user_data.txt");

            fw.write("Name: " + name + "\n");
            fw.write("Age: " + age + "\n");
            fw.write("Favorite Language: " + language + "\n");

            fw.close();

            System.out.println("Data saved successfully in file.");

        } catch (IOException e) {
            System.out.println("Error occurred while reading or writing data.");
        }
    }
}
