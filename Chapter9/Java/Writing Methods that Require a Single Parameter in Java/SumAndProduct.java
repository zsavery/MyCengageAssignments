// SumAndProduct.java - This program computes sums and products. 
// Input:  Interactive.
// Output:  Computed sum and product. 

import java.util.Scanner;

class SumAndProduct {

    static int sums(int x) {
        int ans = 0;
        for (int i = 1; i <= x; i++) {
            ans += i;
        }
        return ans;
    }

    static int products(int x) {
        int ans = 1;
        for (int i = 1; i <= x; i++) {
            ans *= i;
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int number;
        String numberString;
        System.out.println("Enter a positive integer or 0 to quit: ");
        numberString = s.nextLine();
        number = Integer.parseInt(numberString);
        while (number != 0) {
            // call sums() method here
            int sum = sums(number);
            int prod = products(number);
            System.out.println("Sum = " + sum + " , Prod = " + prod);
            // call products() method here
            System.out.println("Enter a positive integer or 0 to quit: ");
            numberString = s.nextLine();
            number = Integer.parseInt(numberString);
        }
        // System.exit(0);
    }
    // End of main() method.
    // Write sums() method here.
    // Write products() method here.
    // }
    //
}
