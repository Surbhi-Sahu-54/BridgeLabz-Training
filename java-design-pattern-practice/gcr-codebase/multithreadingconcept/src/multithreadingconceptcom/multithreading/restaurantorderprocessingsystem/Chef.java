package multithreadingconceptcom.multithreading.restaurantorderprocessingsystem;

public class Chef extends Thread {

    private String dish;
    private int totalTime; // in milliseconds

    public Chef(String name, String dish, int totalTime) {
        super(name); // set thread name
        this.dish = dish;
        this.totalTime = totalTime;
    }

    @Override
    public void run() {

        System.out.println(getName() + " started preparing " + dish);

        int stepTime = totalTime / 4; // for 25%, 50%, 75%, 100%

        try {
            for (int i = 25; i <= 100; i += 25) {
                Thread.sleep(stepTime);
                System.out.println(getName() + " preparing " + dish + ": " + i + "% complete");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
