package onlineexamreviewsystem;

public class StackLinkedList {
      private StackNode topNode;
   // Insert (Push)
	    public void push(String questionId) {
	        StackNode freshNode = new StackNode(questionId);
	        freshNode.next = topNode;
	        topNode = freshNode;
	    }
	    // Remove (Pop)
	    public String pop() {
	        if (topNode == null) {
	            System.out.println("Stack is Empty! Nothing to go back.");
	            return "-1";
	        }

	        String removedQuestion = topNode.question;
	        topNode = topNode.next;
	        return removedQuestion;
	    }

	    // View Top Element (Peek)
	    public String peek() {
	        if (topNode == null) {
	            return "-1";
	        }
	        return topNode.question;
	    }

	    // Extra (Optional): Check empty
	    public boolean isEmpty() {
	        return topNode == null;
	    }
}
