import java.util.Scanner;

public class Ameli_SASTriangleSolver {
    public static void main(String[] args) {

        // vars for three sides and three angles
        double side_a;
        double cos_a;
        double side_b;
        double side_c;
        double angle_A;
        double angle_B;
        double angle_C;
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

        // Math time
        cos_a = Math.cos(angle_A);
        side_a = Math.sqrt(Math.pow(side_b, 2) + Math.pow(side_c, 2) - (2 * side_b * side_c * cos_a));
        angle_B = Math.toDegrees(Math.asin((Math.sin(angle_A) * side_b) / side_a ));
        angle_C = 180 - angle_A - angle_B;

        // printing results
        if (angle_B < angle_C) {
            System.out.printf("The smallest possible a angle is : %.2f° \n", angle_B);
        } else if (angle_B > angle_C) {
            System.out.printf("The smallest possible b angle is : %.2f° \n", angle_C);
        }

    }
}
