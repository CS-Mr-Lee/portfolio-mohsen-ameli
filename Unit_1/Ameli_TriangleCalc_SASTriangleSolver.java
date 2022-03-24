/**
* Name: Mohsen Ameli
* Date: Feb 16, 2022
* Description: A program that asks for two sides and one angle
* of a triangle and return the smallest possible angle.
*/

import java.util.Scanner;

public class Ameli_TriangleCalc_SASTriangleSolver {
    public static void main(String[] args) {

        // vars for three sides and three angles
        double side_a, side_c, angle_B;
        Scanner in = new Scanner(System.in);

        // getting vars from the user
        System.out.print("Please enter a value for the first side (m) : ");
        side_a = in.nextDouble();
        System.out.print("Please enter a value for the second side (m) : ");
        side_c = in.nextDouble();
        System.out.print("Please enter a value for the angle between the sides (rad) : ");
        angle_B = in.nextDouble();
        
        // closing scanner
        in.close();

        // getting the smallest angle
        System.out.printf("The smallest possible a angle is : %.2f° \n", smallestAngle(side_a, side_c, angle_B));
    }

    /**
     * takes in two sides and an angle and returns the smallest angle possible
     * @param side_a side a in the triangle
     * @param side_c side c in the triangle
     * @param angle_B angle B in the triangle
     * @return the smallest possible angle in the triangle 
     */
    public static double smallestAngle(double side_a, double side_c, double angle_B) {
        // neccessary vars
        double side_b, angle_A, angle_C;
        double arcos; // variable to store the number that will be inverse cosined ;)
        double smallest = 0.0;
        
        // Math time
        // calculating the missing side using law of cosines
        side_b  = Math.sqrt(Math.pow(side_a, 2) + Math.pow(side_c, 2) - (2 * side_a * side_c * Math.cos(angle_B)));
        
        // calculating one other angle using law of cosines
        arcos = ((Math.pow(side_b, 2) + Math.pow(side_c, 2) - Math.pow(side_a, 2)) / (2 * side_b * side_c) );
        angle_A =  Math.toDegrees(Math.acos(arcos));
        
        // converting angle_B to degrees
        angle_B = Math.toDegrees(angle_B);
        // getting the third angle
        angle_C = 180 - angle_A - angle_B;

        // storing the smallest angle possible into a var
        if (angle_A < angle_B && angle_A < angle_C) {
            smallest = angle_A;
        } else if (angle_B < angle_C && angle_B < angle_A) {
            smallest = angle_B;
        } else if (angle_C < angle_B && angle_C < angle_A) {
            smallest = angle_C;
        }

        // returning
        return smallest;
    }
}
