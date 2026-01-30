package com.functionalinterfaces.functionalinterface.backgroundjobexecution;

public class BackgroundJobExecution {

    public static void main(String[] args) {

        // Runnable background task
        Runnable job = () -> {
            System.out.println("Background job started...");
            try {
                Thread.sleep(2000); // simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Background job finished!");
        };

        // Run asynchronously
        Thread thread = new Thread(job);
        thread.start();

        System.out.println("Main program continues running...");
    }
}
