package ewalletapplication;

class BusinessWallet extends Wallet {

    private static final double TAX_RATE = 0.02; // 2%

    BusinessWallet(double initialBalance) {
        super(initialBalance);
    }

    // Helper Method
    private double calculateTax(double amount) {
        return amount * TAX_RATE;
    }

    @Override
    public void transferTo(User receiver, double amount) {
        double tax = calculateTax(amount);
        double totalDebit = amount + tax;

        if (!hasSufficientBalance(totalDebit)) {
            System.out.println("Insufficient balance after tax!");
            return;
        }

        debit(totalDebit);
        receiver.getWallet().credit(amount);

        Transaction.record("Business transfer of ₹" + amount + " (Tax ₹" + tax + ")");
    }
}
