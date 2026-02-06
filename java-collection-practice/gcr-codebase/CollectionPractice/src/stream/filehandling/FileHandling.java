package stream.filehandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {

    public static void main(String[] args) {

        File sourceFile = new File("source.txt");
        File destFile = new File("destination.txt");

        // Check if source file exists
        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }

        try (
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destFile)
        ) {
            int data;

            // Read from source and write to destination
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("Error while reading or writing file.");
        }
    }
}
