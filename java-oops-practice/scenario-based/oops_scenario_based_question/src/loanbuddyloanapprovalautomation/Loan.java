package loanbuddyloanapprovalautomation;

	abstract class Loan implements IApprovable {

	    protected double principal;
	    protected double interestRate;
	    protected int tenureMonths;

	    private boolean approved;   // Loan status protected internally

	    public Loan(double principal, double interestRate, int tenureMonths) {
	        this.principal = principal;
	        this.interestRate = interestRate;
	        this.tenureMonths = tenureMonths;
	    }

	    protected void setApproved(boolean status) {
	        this.approved = status;
	    }

	    public boolean isApproved() {
	        return approved;
	    }

	    // Common EMI formula
	    protected double baseEMI() {
	        double r = interestRate / (12 * 100);
	        int n = tenureMonths;
	        return (principal * r * Math.pow(1 + r, n)) /
	               (Math.pow(1 + r, n) - 1);
	    }
}
