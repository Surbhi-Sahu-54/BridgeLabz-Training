package stream.bytearraystream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageByteArray{

    public static void main(String[] args) {

        try {
            // Step 1: Read image and convert to byte array
            FileInputStream fis = new FileInputStream("original.jpg");
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            byte[] imageBytes = baos.toByteArray();

            fis.close();
            baos.close();

            // Step 2: Write byte array back to new image file
            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            FileOutputStream fos = new FileOutputStream("copy.jpg");

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            bais.close();
            fos.close();

            System.out.println("Image converted to byte array and copied successfully.");

        } catch (IOException e) {
            System.out.println("Error while processing image file.");
        }
    }
}
