package my_first_program;


import java.util.ArrayList;
import java.util.List;

public class ArrayList_ {

    public static void main(String[] args) {
        // Creating an ArrayList of integers
        List<Integer> arrList= new ArrayList<>();
        // Creating an ArrayList of characters
        List<Character> arrList2= new ArrayList<>();
        
        // Adding new elements to the ArrayList
        arrList.add(10);
        arrList.add(11);
        arrList.add(12);
        arrList.add(13);
      
        
        arrList2.add('a');
        arrList2.add('b');
        arrList2.add('c');
        arrList2.add('d');
        System.out.println("integer arraylist :  "+ arrList);
        System.out.println("character array list : "+arrList2);
   
        //now removing elements from desired position
    
        System.out.println("after removing [2] index element from character arraylist");
        arrList2.remove(2);
        System.out.println(arrList2);
       
       
        // Adding an element at a particular index in an ArrayList
      System.out.println(" after adding new intiger at desired possion");
        arrList.add(3,45);
        System.out.println(arrList);
        System.out.println("size of integer array list is "+arrList.size());
        System.out.println("size of characterarray list is "+arrList2.size());
    }
}