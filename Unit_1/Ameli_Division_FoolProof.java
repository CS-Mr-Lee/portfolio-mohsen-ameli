/**
* Name: Mohsen Ameli
* Date: Feb 16, 2022
* Description: A program that asks for a numerator and a denominator
* and prints out the quotient.
*/

import java.util.*;
public class Ameli_Division_FoolProof {
    public static void main(String[] args) {
        // getting vars
        String top_str = "";
        int top;
        int bottom;
        boolean quit = false;
        Scanner in = new Scanner(System.in);

        do {
            try {
                // numerator
                System.out.print("Enter a numerator : ");
                top_str = in.nextLine();
                top = Integer.parseInt(top_str);   

                // denomenator
                System.out.print("Enter a denomenator : ");
                bottom = in.nextInt();

                // divide by 0 or results
                if (bottom == 0) {
                    System.out.println("Come on, you can't divide by 0 ! \n");
                } else {
                    // checking if the division resulted in a whole number
                    if (top % bottom == 0) {
                        // printing results
                        System.out.printf("%d ÷ %d = %d \n", top, bottom, top / bottom);
                    } else {
                        // printing results
                        System.out.printf("%d ÷ %d = %.2f \n", top, bottom, (float) top / bottom);
                    }
                }

                in.nextLine();

            // catching any bad input
            } catch (InputMismatchException e) {
                System.out.print("Bad Input ...");
                System.out.println("Please try again \n");
                in.nextLine();
            }

            // catching the error if user entered a letter in the numerator
            catch (NumberFormatException e) {
                char q = top_str.toLowerCase().charAt(0);
                if (q == 'q') {
                    quit = true;
                } else {
                    System.out.print("Bad Input ...");
                    System.out.println("Please try again \n");
                }
            }
        } while (!quit);

        // final touches ...
        in.close();
        System.out.println("Have a wonderful life :)");
    }
}
