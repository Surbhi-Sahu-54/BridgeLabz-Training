package stream.readlargefile;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLargeFile {

    public static void main(String[] args) {

        try (
            BufferedReader br = new BufferedReader(
                    new FileReader("largefile.txt")
            )
        ) {
            String line;

            while ((line = br.readLine()) != null) {
                // case-insensitive check
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error while reading the file.");
        }
    }
}
