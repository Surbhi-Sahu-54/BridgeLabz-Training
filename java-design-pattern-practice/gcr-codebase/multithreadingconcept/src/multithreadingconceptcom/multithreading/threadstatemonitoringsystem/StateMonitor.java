package multithreadingconceptcom.multithreading.threadstatemonitoringsystem;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class StateMonitor extends Thread {

    private Thread[] threads;
    private Map<String, Integer> stateCount = new HashMap<>();

    public StateMonitor(Thread[] threads) {
        this.threads = threads;
    }

    @Override
    public void run() {

        boolean allTerminated = false;

        while (!allTerminated) {
            allTerminated = true;

            for (Thread t : threads) {
                Thread.State state = t.getState();
                System.out.println("[Monitor] " + t.getName() +
                        " is in " + state +
                        " state at " + LocalTime.now());

                stateCount.put(
                        t.getName(),
                        stateCount.getOrDefault(t.getName(), 0) + 1
                );

                if (state != Thread.State.TERMINATED) {
                    allTerminated = false;
                }
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Summary
        System.out.println("\n--- Summary ---");
        for (String name : stateCount.keySet()) {
            System.out.println("Summary: " + name +
                    " went through " + stateCount.get(name) + " state checks");
        }
    }
}
