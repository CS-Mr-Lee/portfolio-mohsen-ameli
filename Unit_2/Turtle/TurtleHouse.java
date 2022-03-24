
/**
Name:
Date:
Description:
*/

import java.awt.Color;

/*
    What are the attributes for:
      - the position of the turtle  : x = int, y = int
      - the direction of the turtle : Int
      - the colour of the pen       : String
      - if you can see it or not    : Boolean
      - it the pen is down or not   : Boolean
    What are the instructions to:
      - move forward                : bob.forward()
      - turn right/left             : bob.right() / bob.left()
      - place a dot                 : bob.dot()
      - place a stamp of the turtle : bob.stamp()
      - change the colour of the turtle : bob.fillColor(Color or String)
      - change the colour of the turtle's pen   : bob.penColor(Color or (int, int, int))
      - lift the pen off the canvas     : bob.up()
      - put the pen onto the canvas     : bob.down()
    
    Can you:
      - draw a house, using colours (first draw the outline, then figure out if you can fill it)
*/
public class TurtleHouse {
    public static void main(String[] a) {
        Turtle bob = new Turtle();

        Turtle.bgcolor("lightblue");
        bob.penColor(new Color(255,0,0));

        // bob.fillColor(Color.RED);
        // bob.bgcolor(Color.BLACK);

        bob.width(7);
        bob.up();
        bob.backward(100);
        bob.down();
        Sqaure(bob, 200, Color.BLACK);

        // drawing the roof
        bob.left(180);
        bob.forward(20);

        // triangle
        bob.right(135);
        bob.forward(170);
        bob.right(90);
        bob.forward(170);
        bob.right(135);
        bob.forward(20);

        // drawing the chimney
        bob.up();
        bob.forward(170);
        bob.right(90);
        bob.forward(50);
        bob.down();
        Rect(bob, 70, Color.BLACK);

        // coloring ...
        // bob.penColor(new Color(235, 134, 52));
        // bob.up();
        // bob.right(90);
        // bob.forward(7);
        // bob.left(90);
        // bob.forward(7);
        // bob.down();
        // bob.forward(57); // up
        // bob.right(90);
        // bob.forward(23); // right
        // bob.right(90);
        // bob.forward(57); // up
        // bob.right(90);
        // bob.forward(16); // right
        // bob.right(90);
        // bob.forward(50); // up
        // bob.right(90);
        // bob.forward(9); // right
        // bob.right(90);
        // bob.forward(50); // up

        // going to 
        // bob.penColor("black");
        // bob.forward(7);

        


        // drawing the door
        bob.up();
        bob.right(180);
        bob.forward(50);
        bob.left(90);
        bob.forward(140);
        bob.right(90);
        bob.forward(50);
        bob.down();
        Rect(bob, 150, Color.BLACK);

        // going to where the window is gonna be
        bob.up();
        bob.right(90);
        bob.forward(100);
        bob.left(90);
        bob.forward(10);
        bob.down();
        Sqaure(bob, 50, Color.BLACK);

        // drawing the lines through the window
        bob.forward(25);
        bob.right(90);
        bob.forward(50);
        bob.right(90);
        bob.forward(25);
        bob.right(90);
        bob.forward(25);
        bob.right(90);
        bob.forward(50);
    }

    /**
    * Description : Draw a square with a certain pen color and area
    */
    public static void Sqaure(Turtle bob, int forward, Color colour) {
        bob.penColor(colour);
        // square
        for (int i=0;i<4;i++) {
            bob.forward(forward);
            bob.right(90);
        }
    }

    /**
    * Description : Draw a square with a certain pen color and area
    */
    public static void Rect(Turtle bob, int forward, Color colour) {
        bob.penColor(colour);
        
        for (int i = 0; i < 2; i++) {
            bob.forward(forward);
            bob.right(90);
            bob.forward(forward / 2);
            bob.right(90);
        }
    }
}