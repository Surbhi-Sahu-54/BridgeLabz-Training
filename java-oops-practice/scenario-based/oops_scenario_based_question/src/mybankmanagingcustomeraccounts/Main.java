package mybankmanagingcustomeraccounts;

public class Main {
    public static void main(String[] args) {

        Account savings = new SavingsAccount("SB101", 10000);
        Account current = new CurrentAccount("CA201");

        savings.deposit(2000);
        savings.withdraw(1500);
        savings.checkBalance();
        savings.calculateInterest();

        System.out.println("---------------------");

        current.deposit(5000);
        current.withdraw(1000);
        current.checkBalance();
        current.calculateInterest();
    }
}
