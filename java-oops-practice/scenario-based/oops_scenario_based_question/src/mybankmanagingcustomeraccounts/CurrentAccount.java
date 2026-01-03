package mybankmanagingcustomeraccounts;

public class CurrentAccount extends Account {

    private final double interestRate = 2.0;

    public CurrentAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * interestRate / 100;
        System.out.println("Current Account Interest: ₹" + interest);
    }
}
