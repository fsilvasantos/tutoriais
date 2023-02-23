package javatutorial._22_innerclasses;

interface Message {
    String greet();
 }
 
 public class TesteMessage {

    // method which accepts the object of interface Message
    public void displayMessage(Message m) {
       System.out.println(m.greet() +
          ", This is an example of anonymous inner class as an argument");  
    }
 
    public static void main(String args[]) {

       // Instantiating the class
       TesteMessage obj = new TesteMessage();
 
       // Passing an anonymous inner class as an argument
       obj.displayMessage(new Message() {
          public String greet() {
           return "Hello";
          }
        });      
    }
 }