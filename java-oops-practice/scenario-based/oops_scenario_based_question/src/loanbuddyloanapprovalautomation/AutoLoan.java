package loanbuddyloanapprovalautomation;
	class AutoLoan extends Loan {

	    public AutoLoan(double principal, int tenureMonths) {
	        super(principal, 10.5, tenureMonths);
	    }

	    @Override
	    public boolean approveLoan(Applicant applicant) {
	        if (applicant.getCreditScore() >= 650) {
	            setApproved(true);
	            return true;
	        }
	        setApproved(false);
	        return false;
	    }

	    @Override
	    public double calculateEMI() {
	        return baseEMI() * 1.02; // processing fee included
	    }
}
