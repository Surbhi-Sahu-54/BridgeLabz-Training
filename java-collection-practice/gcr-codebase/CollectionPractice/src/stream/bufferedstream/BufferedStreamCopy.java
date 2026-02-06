package stream.bufferedstream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamCopy {

    public static void main(String[] args) {

        byte[] buffer = new byte[4096]; // 4 KB buffer
        int bytesRead;

        long startTime = System.nanoTime();

        try (
            BufferedInputStream bis =
                new BufferedInputStream(new FileInputStream("bigfile.txt"));
            BufferedOutputStream bos =
                new BufferedOutputStream(new FileOutputStream("buffered_copy.txt"))
        ) {
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println("Error while copying file using buffered streams");
        }

        long endTime = System.nanoTime();

        System.out.println(
            "Buffered Stream Time: " + (endTime - startTime) / 1_000_000 + " ms"
        );
    }
}
