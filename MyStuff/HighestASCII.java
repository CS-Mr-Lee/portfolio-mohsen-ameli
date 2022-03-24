package MyStuff;

/**
* Name: Mr. Lee
* Date: Feb 9
* Description: String, ASCII, Casting
*/

import java.io.Console;
import java.util.Scanner;

public class HighestASCII {
   public static void main (String [] args) {
      
        /*
            Given all the words on the line, 
            print out the word with the 
            highest ascii value
        */
        
        /*
            How to approach the problem
            - start with one word
            - deal with ASCII values, store it
            - do the same with multiple words
            - compare
            
        */
        Scanner in = new Scanner(System.in);
        String sentence;
        
        System.out.println("Input words split up by a space");
        sentence = in.nextLine();
        
        in.close();
        
        //starting with one word, get the individual 
        //ascii values and store it 
        char chara;
        int sum = 0;

        chara = sentence.charAt(0);
        System.out.println(chara);
        sum += chara;
        System.out.println(sum);
        
        
        
        //compare the different values/words
        
   }
}