package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class MainApp {
	
   public static void main(String[] args) {
	   
      @SuppressWarnings("resource")
      ApplicationContext ctx = 
         new AnnotationConfigApplicationContext(HelloWorldConfig.class);
   
      HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
      helloWorld.setMessage("Hello World!");
      helloWorld.getMessage();
      
   }
   
}