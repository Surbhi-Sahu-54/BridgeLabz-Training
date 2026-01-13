package texteditorundoredofunctionality;

public class TextEditor {
	    private StringBuilder content = new StringBuilder();

	    public void insert(String text, int position) {
	        if (position < 0 || position > content.length()) {
	            System.out.println(" Invalid position!");
	            return;
	        }
	        content.insert(position, text);
	        System.out.println(" Inserted!");
	    }

	    public String delete(int position, int length) {
	        if (position < 0 || position + length > content.length()) {
	            System.out.println(" Invalid delete range!");
	            return null;
	        }

	        String deletedText = content.substring(position, position + length);
	        content.delete(position, position + length);
	        System.out.println(" Deleted!");
	        return deletedText;
	    }

	    public void showText() {
	        System.out.println("\n Current Text: " + content);
	    }

	    public int length() {
	        return content.length();
	    }

	    // For Undo/Redo operations
	    public void insertForUndoRedo(String text, int position) {
	        content.insert(position, text);
	    }

	    public void deleteForUndoRedo(int position, int length) {
	        content.delete(position, position + length);
	    }
}
