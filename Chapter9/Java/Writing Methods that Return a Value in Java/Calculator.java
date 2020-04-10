// Calculator.java - This program performs arithmetic, ( +. -, *. /, % ) on two numbers
// Input:  Interactive.
// Output:  Result of arithmetic operation

import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        double numberOne, numberTwo;
        String numberOneString, numberTwoString;
        String operation;
        double result = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        numberOneString = input.nextLine();
        numberOne = Double.parseDouble(numberOneString);

        System.out.println("Enter the second number: ");
        numberTwoString = input.nextLine();
        numberTwo = Double.parseDouble(numberTwoString);

        System.out.println("Enter an operator (+.-.*,/,%): ");
        operation = input.nextLine();

        // Call performOperation method here
        result = performOperation(numberOne, numberTwo, operation);

        System.out.format("%.2f", numberOne);
        System.out.print(" " + operation + " ");
        System.out.format("%.2f", numberTwo);
        System.out.print(" = ");
        System.out.format("%.2f", result);

        System.exit(0);

    } // End of main() method.

    // Write performOperation method here.
    public static double performOperation(double num1, double num2, String opp) {

        if (opp.equals("*")) {
            return (num1 * num2);
        }
        if (opp.equals("/")) {
            return (num1 / num2);
        }
        if (opp.equals("+")) {
            return (num1 + num2);
        }
        if (opp.equals("-")) {
            return (num1 - num2);
        }
        return 0;
    }

} // End of Calculator class.
