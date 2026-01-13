package texteditorundoredofunctionality;
import java.util.Stack;

public class UndoRedoManager {
	    private Stack<Action> undoStack = new Stack<>();
	    private Stack<Action> redoStack = new Stack<>();

	    public void saveAction(Action action) {
	        undoStack.push(action);
	        redoStack.clear(); // New action => redo history cleared
	    }

	    public void undo(TextEditor editor) {
	        if (undoStack.isEmpty()) {
	            System.out.println("Nothing to undo!");
	            return;
	        }

	        Action lastAction = undoStack.pop();

	        if (lastAction.getType().equals("insert")) {
	            // undo insert => delete inserted part
	            editor.deleteForUndoRedo(lastAction.getPosition(), lastAction.getText().length());
	        } 
	        else if (lastAction.getType().equals("delete")) {
	            // undo delete => insert deleted part back
	            editor.insertForUndoRedo(lastAction.getText(), lastAction.getPosition());
	        }

	        redoStack.push(lastAction);
	        System.out.println(" Undo done!");
	    }

	    public void redo(TextEditor editor) {
	        if (redoStack.isEmpty()) {
	            System.out.println("Nothing to redo!");
	            return;
	        }

	        Action action = redoStack.pop();

	        if (action.getType().equals("insert")) {
	            editor.insertForUndoRedo(action.getText(), action.getPosition());
	        } 
	        else if (action.getType().equals("delete")) {
	            editor.deleteForUndoRedo(action.getPosition(), action.getText().length());
	        }

	        undoStack.push(action);
	        System.out.println(" Redo done!");
	    }
}
