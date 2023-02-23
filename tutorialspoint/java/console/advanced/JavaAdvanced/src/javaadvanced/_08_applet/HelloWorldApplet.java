package javaadvanced._08_applet;

import java.applet.*;
import java.awt.*;

@SuppressWarnings("serial")
public class HelloWorldApplet extends Applet {

   public void paint (Graphics g) {

      g.drawString ("Hello World, bitches!", 25, 50);
      
   }

}
