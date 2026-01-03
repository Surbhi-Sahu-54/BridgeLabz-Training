package ewalletapplication;

abstract class Wallet implements Transferrable {

    private double balance;

    Wallet(double initialBalance) {
        this.balance = initialBalance;
    }

    // Encapsulation
    public double getBalance() {
        return balance;
    }

    // Helper Method
    protected boolean hasSufficientBalance(double amount) {
        return balance >= amount;
    }

    protected void credit(double amount) {
        balance += amount;
    }

    protected void debit(double amount) {
        balance -= amount;
    }

    public void loadMoney(double amount) {
        credit(amount);
    }
}
