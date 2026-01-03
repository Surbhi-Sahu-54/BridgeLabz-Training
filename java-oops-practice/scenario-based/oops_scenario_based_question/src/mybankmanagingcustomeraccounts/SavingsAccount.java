package mybankmanagingcustomeraccounts;

public class SavingsAccount extends Account {

    private final double interestRate = 4.0;

    public SavingsAccount(String accountNumber, double openingBalance) {
        super(accountNumber, openingBalance);
    }
    public void calculateInterest() {
        double interest = getBalance() * interestRate / 100;
        System.out.println("Savings Account Interest: ₹" + interest);
    }
}
