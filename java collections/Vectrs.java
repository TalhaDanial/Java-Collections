package my_first_program;

import java.util.*;

public class Vectrs {

   public static void main(String args[]) {
      // Vector of initial capacity size of 2 
      Vector<String> vector1 = new Vector<String>(2);

      // Adding elements to a vector
      vector1.addElement("talha");
      vector1.addElement("mubeen");
      vector1.addElement("khawala");
      vector1.addElement("jhon");

     
      System.out.println("Size is: "+vector1.size());
      System.out.println("Default capacity increment is: "+vector1.capacity());

      vector1.addElement("aaa");
      vector1.addElement("bbb");
      vector1.addElement("ccc");

     
      System.out.println("Size after addition: "+vector1.size());
      System.out.println("Capacity after increment is: "+vector1.capacity());
      System.out.print("after removing 3rd element from vector ");
      System.out.println("elements are: "+vector1);
      vector1.remove(3);
      //after removing elements from desired index here i removed 3rd index element
      System.out.println("Size after deletion: "+vector1.size());

      System.out.println("elements are: "+vector1);
     
   }
}