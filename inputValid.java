package payItForward;

import java.util.*;

//Create class + method that checks user input 
public class inputValid {
	public static int intCheck(String type) {  
		
		//While loop to repeat prompt until user enters a valid integer
		while(true) {  
			Scanner numInput = new Scanner(System.in);  
			String number = numInput.nextLine();
			
			//Try catch statement that checks to see if input is an integer\
			//If user input is not integer, an error message is displayed and the loop continues
			try {
				int output = Integer.parseInt(number); 
				return output;
				
			} catch (NumberFormatException ex) {
				System.out.println("Invalid Entry\n");  
				
			}
		}
	}
}
