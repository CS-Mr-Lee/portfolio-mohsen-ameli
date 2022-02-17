/**
* Name: Mohsen Ameli
* Date: Feb 16, 2022
* Description: A program that asks for two sides and one angle
* of a triangle and return the smallest possible angle.
*/

import java.util.Scanner;

public class Ameli_SASTriangleSolver {
    public static void main(String[] args) {

        // vars for three sides and three angles
        double side_b, side_c, angle_A;
        Scanner in = new Scanner(System.in);

        // getting vars from the user
        System.out.print("Please enter a value for the first side : ");
        side_b = in.nextDouble();
        System.out.print("Please enter a value for the second side : ");
        side_c = in.nextDouble();
        System.out.print("Please enter a value for the angle between the sides : ");
        angle_A = in.nextDouble();
        
        // closing scanner
        in.close();

        // getting the smallest angle
        System.out.printf("The smallest possible a angle is : %.2f° \n", SmallestAngle(side_b, side_c, angle_A));
    }

    /**
     * description : takes in two sides and an angle and returns the smallest angle possible
     * @param side_b
     * @param side_c
     * @param angle_A
     * @return double
     */
    public static double SmallestAngle(double side_b, double side_c, double angle_A) {
        // neccessary vars
        double cos_a, side_a, angle_B, angle_C;
        double smallest = 0.0;
        
        // Math time
        cos_a = Math.cos(angle_A);
        side_a = Math.sqrt(Math.pow(side_b, 2) + Math.pow(side_c, 2) - (2 * side_b * side_c * cos_a));
        angle_B = Math.toDegrees(Math.asin((Math.sin(angle_A) * side_b) / side_a ));
        angle_C = 180 - angle_A - angle_B;

        // storing the smallest angle possible
        if (angle_B < angle_C) {
            smallest = angle_B;
        } else if (angle_B > angle_C) {
            smallest = angle_C;
        }

        // returning
        return smallest;
    }
}
