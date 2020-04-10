// Reverse.java - This program reverses numbers stored in an array.
// Input:  Interactive.
// Output:  Original contents of array and the reversed contents of the array. 

import java.util.Scanner;

public class Reverse {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int numbers[] = { 9, 8, 7, 6, 5 };
        int x;

        // Print contents of array
        System.out.print("Original contents of array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Call reverseArray method here
        numbers = reverseArray(numbers);

        // Print contents of reversed array
        System.out.print("Reversed contents of array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.exit(0);

    } // End of main() method.

    // Write reverseArray method here.
    public static int[] reverseArray(int numArr[]) {
        int[] R = new int[numArr.length];
        for (int i = 0; i < (numArr.length); i++) {
            R[i] = numArr[(numArr.length - 1) - i];
            // System.out.println(R[i]);
        }
        numArr = R;
        return numArr;
    }

} // End of Reverse class.
