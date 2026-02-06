package stream.pipedstreams;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class MainClass {

    public static void main(String[] args) {

        try {
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos); // connect streams

            WriterThread writer = new WriterThread(pos);
            ReaderThread reader = new ReaderThread(pis);

            reader.start();
            writer.start();

        } catch (IOException e) {
            System.out.println("Error connecting streams");
        }
    }
}
