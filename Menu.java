package payItForward;

//Import everything from util
import java.util.*;

//Extend inputValid class to properly manage unexpected user input
public class Menu extends inputValid {
	
	//Run menu through main method
	public static void main(String args[]) {
		
		//Scanner object to take in user choice
		Scanner input = new Scanner(System.in);
		
		//While true loop to keep menu running eternally
		//Print statement to display menu options to user
		while (true) {
			System.out.println("Welcome to the Olden Days Cineplex. Please choose from the menu: "
					+ "\n(1) Adult Tickets (3c pp) "
					+ "\n(2) Student Tickets (2c pp) "
					+ "\n(3) Family Tickets (7c for 2 adults and 2 children)");
			
			//Run user input through intCheck method from inputValid class to check for errors
			int menuChoice = intCheck("MenuChoice");
			
			//Call different methods based on user choice
			if (menuChoice == 1) {
				Choice object = new Choice();
				object.adult();
			}
			else if(menuChoice == 2) {
				Choice object = new Choice();
				object.student();
			}
			else if (menuChoice == 3) {
				Choice object = new Choice();
				object.family();
			}
			else {
				System.out.println("Invalid entry\n");
				continue;
			}
		}
	}
}
