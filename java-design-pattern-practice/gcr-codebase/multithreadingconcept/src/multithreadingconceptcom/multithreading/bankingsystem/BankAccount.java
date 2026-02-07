package multithreadingconceptcom.multithreading.bankingsystem;
import java.time.LocalTime;

public class BankAccount {

    private int balance = 10000;

    // synchronized method to avoid race condition
    public synchronized boolean withdraw(String customerName, int amount) {

        System.out.println("[" + customerName + "] Attempting to withdraw " + amount);

        if (amount <= balance) {
            balance = balance - amount;

            System.out.println("Transaction successful: " +
                    customerName +
                    ", Amount: " + amount +
                    ", Balance: " + balance +
                    ", Time: " + LocalTime.now());

            return true;
        } else {
            System.out.println("Transaction failed: " +
                    customerName +
                    ", Amount: " + amount +
                    ", Balance: " + balance +
                    ", Time: " + LocalTime.now());

            return false;
        }
    }
}
