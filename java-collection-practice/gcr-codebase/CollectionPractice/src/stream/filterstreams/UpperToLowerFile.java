package stream.filterstreams;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class UpperToLowerFile {

    public static void main(String[] args) {

        try (
            // Handle character encoding (UTF-8)
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("input.txt"),
                            StandardCharsets.UTF_8
                    )
            );

            BufferedWriter bw = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("output.txt"),
                            StandardCharsets.UTF_8
                    )
            )
        ) {
            String line;

            while ((line = br.readLine()) != null) {
                // Convert to lowercase
                bw.write(line.toLowerCase());
                bw.newLine();
            }

            System.out.println("File converted to lowercase successfully.");

        } catch (IOException e) {
            System.out.println("Error while reading or writing file.");
        }
    }
}
