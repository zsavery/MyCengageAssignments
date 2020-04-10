
// Computation.java - This program calculates sum, difference, and product of two values. 
// Input:  Interactive.
// Output:  Sum, difference, and product of two values. 

import java.util.Scanner;

public class Computation {
    public static void main(String args[]) {
        double value1;
        String value1String;
        double value2;
        String value2String;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first numeric value: ");
        value1String = input.nextLine();
        value1 = Double.parseDouble(value1String);
        System.out.println("Enter second numeric value: ");
        value2String = input.nextLine();
        value2 = Double.parseDouble(value2String);

        // Call calculateSum() here
        calculateSum(value1, value2);
        // Call calculateDifference() here
        calculateDifference(value1, value2);
        // Call calculateProduct() here
        calculateProduct(value1, value2);
        System.exit(0);

    } // End of main() method.

    // Write calculateSum() method here.
    public static void calculateSum(double value1, double value2) {
        System.out.println("The sum is : " + (value1 + value2));
    }

    // Write calculateDifference() method here.
    static void calculateDifference(double value1, double value2) {
        System.out.println("The difference is : " + (value1 - value2));
    }

    // Write calculateProduct() method here.
    static void calculateProduct(double value1, double value2) {
        System.out.println("The product is : " + (value1 * value2));
    }

} // End of Computation class.
