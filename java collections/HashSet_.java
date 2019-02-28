package my_first_program;

import java.util.*; 

public class HashSet_ 
{ 
    public static void main(String[]args) 
    { 
        HashSet<Integer> hSet = new HashSet<Integer>(); 
  
     
        hSet.add(1); 
        hSet.add(2); 
        hSet.add(4); 
        hSet.add(1);// adding duplicate elements 
  
        // Displaying the HashSet 
        System.out.println(hSet); 
        System.out.println("List contains 3 or not:" + hSet.contains(3)); 
  
        // Removing items from HashSet using remove() 
        hSet.remove(2); 
        System.out.println("List after removing 2 from list:"+hSet); 
  
        System.out.println("Iterating over hashset:"); 
        Iterator<Integer> i = hSet.iterator(); 
        while (i.hasNext()) 
            System.out.println(i.next()); 
    } 
} 
