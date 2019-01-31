package virtualPetShelter;
import java.util.Scanner;


public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		Virtualpet pet1 = new Virtualpet("Ella", "The most playful, lovable Dachshund you will meet.", 50, 50, 100, 100, 100);
		Virtualpet pet2 = new Virtualpet("Cuddles", "Super soft, has the appearance of a white pillow.", 50, 50, 100, 100, 100);
		Virtualpet pet3 = new Virtualpet("Roscoe", "A well mannered Dalmation who does well outside.", 50, 50, 100, 100, 100);
		Virtualpet pet4 = new Virtualpet("Princess", "It takes her a while to get adjusted to new faces.", 50, 50, 100, 100, 100);
		
		System.out.println("Welcome to the Pet Sanctuary!");
		
		System.out.println ("\nWhat would you like to do with the pets today?");
		System.out.println ("1: Feed them.");
		System.out.println ("2: Give them water.");
		System.out.println ("3: Play with them.");
		System.out.println ("4: Adopt one.");
		System.out.println ("5: Admit one.");
		System.out.println ("6: End Visit.");
		
		String visitorAction;
		switch (visitorAction) {
			case "1": 
				System.out.println ("\nYou fed all the pets.");
				break;
			case "2": 
				System.out.println ("\nYou gave water to all the pets.");
				break;
			case "3": 
				System.out.println ("\nYou played with the pets.");
				break;
			case "4": 
				System.out.println ("\nYou have chosen to adopt a pet! Who do you plan to take home?");
				String adoptPet = input.next();
				System.out.println ("\nHave fun with" + "!");
				break;
			case "5": 
				System.out.println ("\nYou are admitting a pet!");
				break;
			default: 
				System.out.println ("Thank you for visiting the Pet Sanctuary. Please come again!");
			}

	}
}
