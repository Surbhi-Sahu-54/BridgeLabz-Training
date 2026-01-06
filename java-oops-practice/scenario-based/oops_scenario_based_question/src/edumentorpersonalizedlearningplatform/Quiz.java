package edumentorpersonalizedlearningplatform;

public class Quiz {
	    // Internal question bank must remain private
	    private String[] questions;
	    private final String[] answers;   // immutable once set
	    private int score;

	    // Constructor with variable difficulty
	    public Quiz(String[] questions, String[] answers) {
	        this.questions = questions;
	        this.answers = answers; // cannot be modified later
	        this.score = 0;
	    }

	    // Evaluate quiz
	    public void evaluate(String[] userAnswers) {
	        score = 0;
	        for (int i = 0; i < answers.length; i++) {
	            if (answers[i].equalsIgnoreCase(userAnswers[i])) {
	                score++; // operator usage
	            }
	        }
	    }

	    public double getPercentage() {
	        return (score * 100.0) / answers.length; // percentage calculation
	    }

	    public void showResult() {
	        System.out.println(
	            "Score: " + score + "/" + answers.length +
	            " | Percentage: " + getPercentage() + "%"
	        );
	    }
}
