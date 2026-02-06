package exception;
import java.io.*;

public class TryWithResources {
    public static void main(String[] args) {
        String fileNAme = "D:\\Java Programming Workspace\\java-collection-practice\\gcr-codebase\\CollectionPractice\\src\\exception\\checkedexception\\Data.txt";
        String file2 = "D:\\Java Programming Workspace\\java-collection-practice\\gcr-codebase\\CollectionPractice\\src\\exception\\checkedexception\\Data.txt \\No such file exists.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileNAme))) {
            System.out.println(reader.readLine());
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
        //Reading file that does not exist
        try (BufferedReader reader = new BufferedReader(new FileReader(file2))) {
            System.out.println(reader.readLine());
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}