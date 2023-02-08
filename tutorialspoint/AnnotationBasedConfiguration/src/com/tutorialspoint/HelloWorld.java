package com.tutorialspoint;

import javax.annotation.*;

public class HelloWorld {
	
   private String message;

   public void setMessage(String message){
      this.message  = message;
   }
   public String getMessage(){
      System.out.println("Your Message : " + message);
      return message;
   }
   
   @PostConstruct
   public void comeca() {
	   System.out.println("Comeca...");
   }   
   
   @PreDestroy
   public void termina() {
	   System.out.println("... Termina!");
   }
   
   public void init(){
      System.out.println("Bean is going through init.");
   }   
   
   public void destroy(){
      System.out.println("Bean will destroy now.");
   }
}