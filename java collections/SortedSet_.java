package my_first_program;
import java.util.*;
public class SortedSet_ {

	   public static void main(String[] args) {
		      // Create the sorted set
		      SortedSet<String> set = new TreeSet<String>(); 

		      // Add elements to the set
		      set.add("talha");
		      set.add("khawala");
		      set.add("mubeen");

		      // Iterating over the elements in the set
		      Iterator<String> it = set.iterator();

		      while (it.hasNext()) {
		          
		        Object element = it.next();
		         System.out.println(element.toString());
			        

		      }
		   }
}
