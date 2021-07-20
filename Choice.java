package payItForward;

import java.util.*;

//This class also extends inputValid to manage unexpected user input
public class Choice extends inputValid {
		
		//Method for if user wants to purchase normal adult tickets
		public void adult(){
			
			int adultCost;
			String adultConfirm;
			Scanner numAdultsInput = new Scanner(System.in);
			
			//While true loop to keep this part of the program running until user enters a valid response
			while (true) {
				System.out.println("Please enter how many regular adult tickets you would like to buy: \n");
				
				//Check for valid user input
				int numAdults = intCheck("numAdults");
				
				if (numAdults < 1) {
					System.out.println("Invalid entry. 0 tickets selected.\n");
					continue;
				}
				
				//Calculate the total cost of the tickets
				adultCost = numAdults*3;
				Scanner confirmInput = new Scanner(System.in);
				
				//Ask for user to confirm their purchase
				System.out.println("You have ordered " + numAdults + " adult tickets for a total cost of "
				+ adultCost + "c. PLease confirm (Y/N):\n");
				adultConfirm = confirmInput.nextLine();
				
				//If user does not confirm by entering 'y', program immediately returns to main menu
				if(adultConfirm.equalsIgnoreCase("y")) {
					System.out.println("Thank you for your purchase. Enjoy the picture!\n"
							+ "Tickets: " + numAdults + "\n" +
							"Total Cost: " + adultCost + "c\n\n");
					break;
				}
				else {
					System.out.println("Returning to main menu...\n");
					break;
				}
			}
		}
		
		//Method for if user wants to buy student tickets
		public void student() {
			
			int studentCost;
			String studentConfirm;
			Scanner numStudentsInput = new Scanner(System.in);
			
			//While true loop to keep this part of the program running until user enters a valid response 
			while (true) {
				System.out.println("Please enter how many student tickets you would like to buy: \n");
				
				//Check for valid user input
				int numStudents = intCheck("numAdults");
				
				if (numStudents < 1) {
					System.out.println("Invalid entry. 0 tickets selected.\n");
					continue;
				}
				
				//Calculate total cost of tickets
				studentCost = numStudents*2;
				Scanner confirmInput = new Scanner(System.in);
				
				//Request confirmation for purchase
				System.out.println("You have ordered " + numStudents + " student tickets for a total cost of "
				+ studentCost + "c. PLease confirm (Y/N):\n");
				studentConfirm = confirmInput.nextLine();
				
				//If purchase is not confirmed, return to main menu
				if(studentConfirm.equalsIgnoreCase("y")) {
					System.out.println("Thank you for your purchase. Enjoy the picture!\n"
							+ "Tickets: " + numStudents + "\n" +
							"Total Cost: " + studentCost + "c\n\n");
					break;
				}
				else {
					System.out.println("Returning to main menu...\n");
					break;
				}
			}
		}
		
		//Method for family tickets
		public void family() {
			int familyCost;
			String familyConfirm;
			Scanner extraKids = new Scanner(System.in);
			
			//While true loop to keep this part of the program running until user enters a valid response
			while (true) {
				System.out.println("Please enter how many family (two adults + two children) tickets "
						+ "you would like to buy: \n");
				
				//Check for valid user input
				int numFamilies = intCheck("numFamilies");
				
				if (numFamilies < 1) {
					System.out.println("Invalid entry. 0 tickets selected.\n");
					continue;
				}
				
				//Ask if the user wants to buy some extra kids tickets
				System.out.println("Please enter how many extra children's tickets you would like to buy (1c each):\n");
				
				//Validate user input
				int numKids = intCheck("numKids");
				
				//Calculate total cost of tickets
				familyCost = (numFamilies * 7) + (numKids * 1);
				Scanner confirmInput = new Scanner(System.in);
				
				//Request confirmation
				System.out.println("You have ordered " + numFamilies + " family tickets and " + numKids + 
						" extra children's tickets, for a total cost of " + familyCost + 
						"c\nPlease confirm (Y/N):\n");
				
                familyConfirm = confirmInput.nextLine();
                int totalTickets = numFamilies+numKids;		//Calculate total amount of tickets bought
				
                //If user purchase is not confirmed, return to main menu
				if(familyConfirm.equalsIgnoreCase("y")) {
					System.out.println("Thank you for your purchase. Enjoy the picture!\n"
							+ "Tickets: " + totalTickets + "\n" +
							"Total Cost: " + familyCost + "c\n\n");
					break;
				}
				else {
					System.out.println("Returning to main menu...\n");
					break;
				}

			}
		}
}
