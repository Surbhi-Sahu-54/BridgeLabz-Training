package multithreadingconceptcom.multithreading.threadstatemonitoringsystem;
public class ThreadStateApp {

    public static void main(String[] args) {

        TaskRunner t1 = new TaskRunner("Task-1");
        TaskRunner t2 = new TaskRunner("Task-2");

        Thread[] tasks = {t1, t2};

        StateMonitor monitor = new StateMonitor(tasks);

        // NEW state (before start)
        System.out.println("[Monitor] Task-1 is in " + t1.getState());
        System.out.println("[Monitor] Task-2 is in " + t2.getState());

        t1.start();
        t2.start();

        monitor.start();
    }
}
