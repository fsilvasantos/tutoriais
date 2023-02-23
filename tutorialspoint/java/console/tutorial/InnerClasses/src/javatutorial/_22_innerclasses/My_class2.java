package javatutorial._22_innerclasses;

class Outer_Demo_2 {
    // private variable of the outer class
    private int num = 175;  
    
    // inner class
    public class Inner_Demo_2 {
       public int getNum() {
          System.out.println("This is the getnum method of the inner class");
          return num;
       }
    }
 }
 
 public class My_class2 {
 
    public static void main(String args[]) {
       // Instantiating the outer class
       Outer_Demo_2 outer = new Outer_Demo_2();
       
       // Instantiating the inner class
       Outer_Demo_2.Inner_Demo_2 inner = outer.new Inner_Demo_2();
       System.out.println(inner.getNum());
    }
 }