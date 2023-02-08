package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
	
   public static void main(String[] args) {
	   
	   /* 
	    * ======================================================================
	    * 
	    * Adequação (naquelas) para NÃO NECESSITAR uso do XML (Beans.xml)
	    * 
	    * ======================================================================
	    * */
	   
	   @SuppressWarnings("resource")
	   ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
	   
	   @SuppressWarnings("resource")
	   ConfigurableApplicationContext contextStart = new AnnotationConfigApplicationContext(CStartEventHandler.class);
	   
	   @SuppressWarnings("resource")
	   ConfigurableApplicationContext contextStop = new AnnotationConfigApplicationContext(CStopEventHandler.class);
	   
	   contextStart.start();	   
	   
	   HelloWorld helloWorld = ctx.getBean(HelloWorld.class);	   
	   helloWorld.setMessage("Hello World!");
	   helloWorld.getMessage();
	   
	   contextStop.stop();
	   
	   
      /*
      @SuppressWarnings("resource")
      ConfigurableApplicationContext context = 
         new ClassPathXmlApplicationContext("Beans.xml");

      // Let us raise a start event.
      context.start();
	  
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.getMessage();

      // Let us raise a stop event.
      context.stop();
      */
   }
}