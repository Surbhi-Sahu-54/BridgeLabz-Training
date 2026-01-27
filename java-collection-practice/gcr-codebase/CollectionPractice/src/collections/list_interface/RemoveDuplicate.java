package collections.list_interface;
import java.util.ArrayList;

public class RemoveDuplicate {
	 static void duplicateRemove(ArrayList<Integer> input){
	        int n = input.size();

	        for(int i=0 ; i<n; i++){
	            for(int j=i+1; j<n/2 ; j++){
	                if(input.get(i).equals(input.get(j))) {
	                    input.remove(j);
	                    j--;
	                }
	            }
	        }

	        System.out.println("Unique Elements:" + input);
	    }
	    public static void main(String[] args) {
	        ArrayList<Integer> input = new ArrayList<>();
	        input.add(10);
	        input.add(20);
	        input.add(10);
	        input.add(10);
	        input.add(30);
	        input.add(40);
	        input.add(50);

	        //Calling method to remove duplicate elements
	        duplicateRemove(input);
	    }
}
