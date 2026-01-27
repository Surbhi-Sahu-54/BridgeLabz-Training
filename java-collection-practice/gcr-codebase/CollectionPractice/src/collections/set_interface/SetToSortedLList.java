package collections.set_interface;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetToSortedLList {
	 static Set<Integer> convertToSortedSet(Set<Integer> set) {
	        return new TreeSet<>(set);
	    }

	    public static void main(String[] args) {
	        Set<Integer> set = new HashSet<>();
	        set.add(10);
	        set.add(20);
	        set.add(30);
	        set.add(40);
	        set.add(90);
	        set.add(45);

	        Set<Integer> sortedSet = convertToSortedSet(set);
	        System.out.println("Sorted Set: " + sortedSet);
	    }
}
