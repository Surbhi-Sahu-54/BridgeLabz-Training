package exception.checkedexception;
import java.io.*;

public class CheckedException {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("D:\\Java Programming Workspace\\java-collection-practice\\gcr-codebase\\CollectionPractice\\src\\exception\\checkedexception\\Data.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}