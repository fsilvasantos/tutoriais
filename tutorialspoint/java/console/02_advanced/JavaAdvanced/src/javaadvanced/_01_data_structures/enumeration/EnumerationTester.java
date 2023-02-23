package javaadvanced._01_data_structures.enumeration ;

import java.util.Vector;
import java.util.Enumeration;

public class EnumerationTester {

   public static void main(String args[]) {

      Enumeration<String> days;
      Vector<String> dayNames = new Vector<String>();

      /* 
      ======================================================================
      << Warning >> 
      Enumeration is a raw type. 
      References to generic type Enumeration<E> should be parameterized
      ====================================================================== 
      */
      //Enumeration days;
      //Vector dayNames = new Vector();
      
      dayNames.add("Sunday");
      dayNames.add("Monday");
      dayNames.add("Tuesday");
      dayNames.add("Wednesday");
      dayNames.add("Thursday");
      dayNames.add("Friday");
      dayNames.add("Saturday");

      days = dayNames.elements();
      
      while (days.hasMoreElements()) {
         System.out.println(days.nextElement()); 
      }
   }
}