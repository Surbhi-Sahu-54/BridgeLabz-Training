package texteditorundoredofunctionality;

public class Action {
	    private String type;     // "insert" or "delete"
	    private String text;     // inserted/deleted text
	    private int position;    // position of operation

	    public Action(String type, String text, int position) {
	        this.type = type;
	        this.text = text;
	        this.position = position;
	    }

	    public String getType() {
	        return type;
	    }

	    public String getText() {
	        return text;
	    }

	    public int getPosition() {
	        return position;
	    }
}
