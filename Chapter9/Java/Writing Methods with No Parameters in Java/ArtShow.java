// ArtShow.java - This program determines if an art show attendee gets a 5% discount
// for preregistering. 
// Input:  Interactive.
// Output:  A statement telling the user if they get a discount or no discount. 

import java.util.Scanner;

public class ArtShow
{
    public static void discount()
    {
        System.out.println("You are preregistered and qualify for a 5 percent discount.");
    }

    public static void noDiscount()
    {
        System.out.println("Sorry, you did not preregister and do not qualify for a 5 percent discount.");
    }

	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
			
						
		System.out.print("Did you preregister? Enter Y or N: ");	
						
		String registerString  = s.nextLine();


		// Test input here. If Y, call discount(), else call noDiscount(). 
		if(registerString.equals("N"))
        {
            noDiscount();
        }
        else
        {
            discount();
        }
        s.close();
	
		System.exit(0);

	} // End of main() method.
	
	
	// Write discount method here.
    


	// Write noDiscount method here. 
	

} // End of ArtShow class.

