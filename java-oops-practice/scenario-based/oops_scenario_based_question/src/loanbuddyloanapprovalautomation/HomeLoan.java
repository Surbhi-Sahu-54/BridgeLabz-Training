package loanbuddyloanapprovalautomation;

	class HomeLoan extends Loan {

	    public HomeLoan(double principal, int tenureMonths) {
	        super(principal, 8.5, tenureMonths);
	    }

	    @Override
	    public boolean approveLoan(Applicant applicant) {
	        if (applicant.getCreditScore() >= 700 && applicant.getIncome() >= 40000) {
	            setApproved(true);
	            return true;
	        }
	        setApproved(false);
	        return false;
	    }

	    @Override
	    public double calculateEMI() {
	        return baseEMI();  // standard EMI
	    }
}
