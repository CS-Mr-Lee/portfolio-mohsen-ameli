/**
* Name: Mohsen Ameli
* Date: Feb 16, 2022
* Description: A program that asks for a phrase and
* encrypts it with sha-69
*/

import java.util.*;
public class Ameli_Encryption {
    public static void main(String[] args) {
        // getting vars
        String input;
        String encrypted = "";
        Scanner in = new Scanner(System.in);

        // getting user input
        System.out.print("Enter a phrase : ");
        input = in.nextLine();

        in.close(); // closing the scanner

        // spliting the phrase into words
        String[] word = input.split(" ");
        String[] final_word = new String[word.length];

        // looping through each word
        for (int i=0; i < word.length ; i++){
            // replacing the first and last characters
            final_word[i] = swapChars(word[i]);
            
            // looping through the rest of the word 
            for (int j=1; j < word[i].length() - 1; j++) {
                // variable to store each character
                char[] wordCh = word[i].toCharArray();

                // converting to ascii and and back
                int ascii = (int) wordCh[j] + 2;
                char new_word = (char) ascii;

                // replacing our word with the new characters
                final_word[i] = final_word[i].replaceFirst(String.valueOf(wordCh[j]), String.valueOf(new_word));
            }

            // saving the final word
            if (i == 0) {
                encrypted = final_word[i];
            } else {
                encrypted = encrypted + " " + final_word[i] ;
            }
        }

        System.out.printf("The encrypted phrase is : %s \n", encrypted);
    }

    /**
     * description : the swapped first and last character
     * @param word
     * @return String
     */
    public static String swapChars(String word) {
        // Converting the string into a character array
        char[] charWord = word.toCharArray();
            
        char temp = charWord[0];

        charWord[0] = charWord[charWord.length-1];
        charWord[charWord.length-1] = temp;

        return String.valueOf(charWord);
    }
}
