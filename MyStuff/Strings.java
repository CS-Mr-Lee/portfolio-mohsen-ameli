package MyStuff;

/**
* Name: Mohsen Ameli
* Date: Feb 3, 2022
* Description: Demonstrating Strings
*/

import java.util.Scanner;
public class Strings
{
    public static void main(String[] args)
    {
        // setting some vars
        String sentence;
        Scanner in = new Scanner(System.in);

        // getting input from user
        System.out.print("Please enter a sentence : ");
        sentence = in.nextLine();
        in.close();

        // checking if the sentece is a question or a statement
        System.out.println("Your sentence has " + sentence.length() + " characters.");
        if (sentence.endsWith(".")) {
            System.out.println("Your sentence is a statement");
        } else if (sentence.endsWith("?")) {
            System.out.println("Your sentence is a question");
        } else {
            System.out.println("Your sentence is just a sentence");
        }

        // System.out.printf("name : %s, last : %s, full : %s \n", name, last_name, full_name);

        // // length() method
        // System.out.println(name + " has " + name.length() + " characters.");

        // // contains() method
        // System.out.printf("Does %s contain %s ? %s \n", full_name, last_name, full_name.contains(last_name));

        // // replace() method
        // System.out.println("replace John with Mike : " + full_name.replace("John" , "Mike"));

        // // charAt() method
        // System.out.println("the character in the third index is : " + full_name.charAt(2));

        // // indexOf() method
        // System.out.println("Khan is positioned at the index number : " + full_name.indexOf("Khan"));

        // // compareTo() method
        // System.out.println("is name + <space> + last_name equal to full_name ? (0 = yes) : " + full_name.compareTo(name + " " + last_name));
    }
}