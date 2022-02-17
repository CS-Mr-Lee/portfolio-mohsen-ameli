/**
Name:
Date:
Description:
*/

import java.awt.Color;


public class TurtleMain {
  public static void main(String[] a)
  {
    Turtle bob = new Turtle();
    //Look at https://docs.oracle.com/javase/7/docs/api/java/awt/Color.html for different colours
    Turtle.bgcolor("lightblue");
    bob.penColor(new Color(255,0,0));
    bob.width(10);

    
  }
}