package my_first_program;
import java.util.*;
public class TreeSet_ {

	  public static void main(String[] args) 
	    { 
	        // Create a TreeSet 
	        TreeSet<Character> tset = new TreeSet<Character>(); 
	  
	        // add elements to HashSet 
	        tset.add('d'); 
	        tset.add('a'); 
	        tset.add('c'); 
	        tset.add('b'); 
	  
	        // Duplicate removed 
	        tset.add('0'); 
	  
	        // Displaying TreeSet elements 
	        System.out.println("TreeSet contains: "); 
	        for (Character temp : tset) { 
	            System.out.println(temp); 
	        } 
	    } 

}
