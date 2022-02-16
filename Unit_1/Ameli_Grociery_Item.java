/**
* Name: Mohsen Ameli
* Date: Feb 3, 2022
* Description: A program that asks for two grocery items and their price.
*              and prints out the results
*/

import java.util.*;

public class Ameli_Grociery_Item
{
    /*** 
     * number of items in the grociery bag.
     */
    final static int NUMITEMS = 2;
    public static void main(String[] args)
    {
        // vars
        double[] price = new double[NUMITEMS];
        String[] name = new String[NUMITEMS];
        boolean correctData = true;

        // getting user's input
        do {
            for (int i=0; i <= NUMITEMS - 1; i++){
                try {
                    Scanner in = new Scanner(System.in);
                    // asking for the price of the grociery
                    System.out.print("Enter a price for the grociery : ");
                    price[i] = in.nextDouble();
                    in.nextLine();

                    // asking for the name of the grociery
                    System.out.print("Enter a name for the grociery : ");
                    name[i] = in.nextLine();

                    correctData = true;
                } catch (InputMismatchException e) {
                    System.out.println("Bad Input !");
                    System.out.println("Try again ...");
                    i--;
                }
            }
        } while (!correctData);

        // printing the results
        System.out.println("------------------------------------------");
        for (int i=0; i <= 1; i++){
            System.out.printf("Grociery #%s : %-10s      $%.2f\n", i+1, name[i], price[i]);
        }
        System.out.println("------------------------------------------");

    }
}