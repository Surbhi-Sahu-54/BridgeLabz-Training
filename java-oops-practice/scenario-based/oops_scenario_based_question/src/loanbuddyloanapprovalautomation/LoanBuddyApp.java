package loanbuddyloanapprovalautomation;

public class LoanBuddyApp {
	    public static void main(String[] args) {

	        Applicant applicant = new Applicant(
	                "Surbhi",
	                720,
	                55000,
	                500000
	        );

	        Loan homeLoan = new HomeLoan(applicant.getLoanAmount(), 240);
	        Loan autoLoan = new AutoLoan(applicant.getLoanAmount(), 60);

	        processLoan(homeLoan, applicant);
	        processLoan(autoLoan, applicant);
	    }

	    private static void processLoan(Loan loan, Applicant applicant) {
	        System.out.println("\nProcessing Loan...");

	        if (loan.approveLoan(applicant)) {
	            System.out.println("Loan Approved ✅");
	            System.out.println("Monthly EMI: ₹" + Math.round(loan.calculateEMI()));
	        } else {
	            System.out.println("Loan Rejected ❌");
	        }
	    }
}
