package onlineexamreviewsystem;
import java.util.HashMap;

public class ExamProctorMain {
	    public static int getFinalMarks(HashMap<String, String> studentMap,
	                                    HashMap<String, String> correctMap) {
             int marks = 0;

	        for (String qNo : correctMap.keySet()) {
	            if (studentMap.containsKey(qNo)) {
	                String studentAns = studentMap.get(qNo);
	                String correctAns = correctMap.get(qNo);

	                if (studentAns.equalsIgnoreCase(correctAns)) {
	                    marks++;
	                }
	            }
	        }
	        return marks;
	    }

	    public static void main(String[] args) {
	        StackLinkedList questionTrack = new StackLinkedList();

	        HashMap<String, String> studentResponse = new HashMap<>();
	        HashMap<String, String> correctKey = new HashMap<>();
	        correctKey.put("Q1", "Java");
	        correctKey.put("Q2", "10");
	        correctKey.put("Q3", "Compiler");
	       
	        questionTrack.push("Q2");
	        studentResponse.put("Q2", "12");

	      
	        questionTrack.push("Q3");
	        studentResponse.put("Q3", "Compiler");

	        // Student presses BACK
	        System.out.println("Student moved back from: " + questionTrack.pop());
	        System.out.println("Now on question: " + questionTrack.peek());

	        // Final result
	        int score = getFinalMarks(studentResponse, correctKey);

	        System.out.println("\n========== FINAL RESULT ==========");
	        System.out.println("Score: " + score + " / " + correctKey.size());
	        System.out.println("==================================");
	    }
}
