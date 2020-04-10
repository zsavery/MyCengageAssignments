import java.util.Scanner;

public class Cornwall {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int days;
        String dayString;
        String mealPlan;
        String question;
        double rate = 0.00;

        System.out.println("How many days do you plan to stay? ");

        dayString = s.nextLine();
        days = Integer.parseInt(dayString);
        System.out.println(" Do you want a meal plan? Y or N: ");
        question = s.nextLine();
        // Figure out which arguments to pass to the computeRate() method and
        // then call the computeRate() method
        if (question.equals("Y")) {
            System.out.println("Enter mealplan (A or C) ");
            mealPlan = s.nextLine();
            rate = computeRate(days, mealPlan);
        } else {
            rate = computeRate(days);
        }

        System.out.println("The rate for your stay is: " + rate);
        System.exit(0);

    } // End of main() method.

    public static double computeRate(int days) {
        return (days * 99.99);
    }

    public static double computeRate(int days, String couponCode) {
        if (couponCode.equals("A")) {
            return (days * 169);
        } else {
            return (days * 112);
        }
    }

    // Write computeRate methods here.

} // End of Cornwall class.
