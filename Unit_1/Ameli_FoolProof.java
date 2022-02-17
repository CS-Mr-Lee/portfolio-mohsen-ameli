/**
* Name: Mohsen Ameli
* Date: Feb 16, 2022
* Description: A program that asks for a numerator and a denominator
* and prints out the quotient.
*/

import java.util.*;
public class Ameli_FoolProof {
    public static void main(String[] args) {
        // getting vars
        String top_str = null;
        Double top = null;
        Double bottom = null;
        Boolean quit = false;
        Scanner in = new Scanner(System.in);

        do {
            try {
                // numerator
                System.out.print("Enter a numerator : ");
                top_str = in.nextLine();
                top = Double.parseDouble(top_str);   

                // denomenator
                System.out.print("Enter a denomenator : ");
                bottom = in.nextDouble();

                // divide by 0 or results
                if (bottom == 0) {
                    System.out.println("Come on, you can't divide by 0 ! \n");
                } else {
                    // printing results
                    System.out.printf("%.3f ÷ %.3f = %.3f \n", top, bottom, top / bottom);
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
