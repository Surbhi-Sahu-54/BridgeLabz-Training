package hospitalpatientmanagementsystem;

class Bill implements Payable {
    private double baseAmount;

    Bill(double baseAmount) {
        this.baseAmount = baseAmount;
    }

    // Helper Method 1
    private boolean validateUserInput() {
        return baseAmount > 0;
    }

    // Helper Method 2
    private double calculateDiscount() {
        if (baseAmount > 5000)
            return baseAmount * 0.10;
        return 0;
    }

    // Helper Method 3
    private double calculateTax(double amount) {
        return amount * 0.05;
    }

    @Override
    public double calculatePayment() {
        if (!validateUserInput()) {
            System.out.println("Invalid bill amount!");
            return 0;
        }

        double discount = calculateDiscount();
        double tax = calculateTax(baseAmount - discount);

        return baseAmount - discount + tax;
    }
}
