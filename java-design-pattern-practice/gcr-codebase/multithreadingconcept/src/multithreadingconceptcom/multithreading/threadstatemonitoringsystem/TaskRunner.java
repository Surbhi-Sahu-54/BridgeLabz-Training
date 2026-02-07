package multithreadingconceptcom.multithreading.threadstatemonitoringsystem;
public class TaskRunner extends Thread {

    public TaskRunner(String name) {
        super(name);
    }

    @Override
    public void run() {

        try {
            // RUNNABLE (simple computation)
            for (int i = 0; i < 1000000; i++) {
                int x = i * i;
            }

            // TIMED_WAITING
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // After run() ends → TERMINATED
    }
}
