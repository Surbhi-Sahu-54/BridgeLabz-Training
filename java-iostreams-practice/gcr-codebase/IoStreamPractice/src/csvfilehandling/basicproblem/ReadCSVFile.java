package csvfilehandling.basicproblem;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVFile {
    public static void main(String[] args) {
        String filePath = "D:\\Java Programming Workspace\\java-iostreams-practice\\gcr-codebase\\IoStreamPractice\\src\\csvfilehandling\\basicproblem\\ReadCSVFile" ;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line ;

            br.readLine(); //to skip ID: ID, Name: Name, Age: Age, Marks: Marks

            while ((line = br.readLine()) != null){
                String[] columns = line.split(",");
                System.out.println("ID: " + columns[0] + ", Name: " + columns[1] +
                        ", Age: " + columns[2] + ", Marks: " + columns[3]);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}