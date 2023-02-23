package javaadvanced._01_data_structures.properties;

import java.util.*;

public class PropDemo {

   public static void main(String args[]) {

      Properties capitals = new Properties();
      
      @SuppressWarnings("rawtypes")
      Set states;
      String str;
      
      capitals.put("Illinois", "Springfield");
      capitals.put("Missouri", "Jefferson City");
      capitals.put("Washington", "Olympia");
      capitals.put("California", "Sacramento");
      capitals.put("Indiana", "Indianapolis");

      // Show all states and capitals in hashtable.
      states = capitals.keySet();   // get set-view of keys
      
      @SuppressWarnings("rawtypes")
      Iterator itr = states.iterator();
      
      while(itr.hasNext()) {
         str = (String) itr.next();
         System.out.println("The capital of " + str + " is " + 
            capitals.getProperty(str) + ".");
      }     

      System.out.println();

      // look for state not in list -- specify default
      str = capitals.getProperty("Florida", "Not Found");

      System.out.println("The capital of Florida is " + str + ".");

      str = capitals.getProperty("Indiana");

      System.out.println("The capital of Indiana is " + str + ".");

   }
}
