package texteditorundoredofunctionality;
import java.util.Scanner;

public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        TextEditor editor = new TextEditor();
	        UndoRedoManager manager = new UndoRedoManager();

	        while (true) {
	            System.out.println("\n===== TEXT EDITOR MENU =====");
	            System.out.println("1. Insert Text");
	            System.out.println("2. Delete Text");
	            System.out.println("3. Undo");
	            System.out.println("4. Redo");
	            System.out.println("5. Show Text");
	            System.out.println("6. Exit");
	            System.out.print("Enter choice: ");

	            int choice = sc.nextInt();
	            sc.nextLine(); // consume newline

	            switch (choice) {
	                case 1: {
	                    System.out.print("Enter text to insert: ");
	                    String text = sc.nextLine();

	                    System.out.print("Enter position (0 to " + editor.length() + "): ");
	                    int pos = sc.nextInt();

	                    editor.insert(text, pos);
	                    manager.saveAction(new Action("insert", text, pos));
	                    break;
	                }

	                case 2: {
	                    System.out.print("Enter delete position: ");
	                    int pos = sc.nextInt();

	                    System.out.print("Enter number of characters to delete: ");
	                    int len = sc.nextInt();

	                    String deletedText = editor.delete(pos, len);

	                    if (deletedText != null) {
	                        manager.saveAction(new Action("delete", deletedText, pos));
	                    }
	                    break;
	                }

	                case 3:
	                    manager.undo(editor);
	                    break;

	                case 4:
	                    manager.redo(editor);
	                    break;

	                case 5:
	                    editor.showText();
	                    break;

	                case 6:
	                    System.out.println(" Exit done!");
	                    sc.close();
	                    return;

	                default:
	                    System.out.println(" Invalid Choice!");
	            }
	        }
	}

}
