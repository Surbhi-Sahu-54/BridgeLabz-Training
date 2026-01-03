package ewalletapplication;

class PersonalWallet extends Wallet {

    private static final double TRANSFER_LIMIT = 5000;

    PersonalWallet(double initialBalance, boolean referralUsed) {
        super(referralUsed ? initialBalance + 100 : initialBalance);
    }

    public void transferTo(User receiver, double amount) {
        if (amount > TRANSFER_LIMIT) {
            System.out.println("Transfer limit exceeded!");
            return;
        }

        if (!hasSufficientBalance(amount)) {
            System.out.println("Insufficient balance!");
            return;
        }

        debit(amount);
        receiver.getWallet().credit(amount);

        Transaction.record("Personal transfer of ₹" + amount);
    }
}
