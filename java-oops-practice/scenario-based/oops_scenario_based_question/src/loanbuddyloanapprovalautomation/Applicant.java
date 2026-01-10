package loanbuddyloanapprovalautomation;

public class Applicant {
	    private String name;
	    private int creditScore;     // Encapsulated
	    private double income;
	    private double loanAmount;

	    public Applicant(String name, int creditScore, double income, double loanAmount) {
	        this.name = name;
	        this.creditScore = creditScore;
	        this.income = income;
	        this.loanAmount = loanAmount;
	    }

	    public String getName() {
	        return name;
	    }

	    int getCreditScore() {   // package-private (used internally only)
	        return creditScore;
	    }

	    public double getIncome() {
	        return income;
	    }

	    public double getLoanAmount() {
	        return loanAmount;
	    }
}

