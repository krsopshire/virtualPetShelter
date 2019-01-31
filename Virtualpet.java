package virtualPetShelter;
import java.util.Scanner;

public class Virtualpet {
	public String petName;
	public String petGroup;
	public int petHunger;
	public int petThirst;
	public int petBoredom;
	public int petWaste;
	public int petCleanliness;
	
	
	public Virtualpet(String name, String group, int hunger, int boredom, int thirst, int waste, int cleanliness) {
		petName = name;
		petGroup = group;
		petHunger = hunger;
		petThirst = boredom; 
		petBoredom = thirst;
		petWaste = waste;
		petCleanliness = cleanliness; 
	}


	public Virtualpet(String name, String description) {
		this.petName = name;
		this.petGroup = description;
		this.petHunger = 50;
		this.petThirst = 50;
		this.petBoredom = 100;
		this.petWaste = 100;
		this.petCleanliness = 100;
	
	}
		
	
	public String getPetName() {
		return petName;
	}
	
	public String getPetGroup() {
		return petGroup;
	}
	
	public int getPetHunger() {
		return petHunger;
	}
	
	public int getPetThirst() {
		return petThirst;
	}
	
	public int getPetBoredom() {
		return petBoredom;
	}
	
	public int getPetWaste() {
		return petWaste;
	}	
	
	public int petCleanliness() {
		return petCleanliness;
	}

	
	public void Poop() {
		this.petCleanliness = this.petCleanliness -10;
		this.petHunger = this.petHunger +10; 
		this.petThirst = this.petThirst +10; 
		this.petWaste = this.petWaste -20;
		}
		
	public void Eat() {
		this.petHunger = this.petHunger -10;
		this.petThirst = this.petThirst +10; 
		this.petWaste = this.petWaste +10;
		}
	
	public void Drink() { 
		this.petThirst = this.petThirst -10; 
		this.petWaste = this.petWaste +10;
		}
	
	public void Play( ) {
		this.petBoredom = this.petBoredom -20;
		this.petThirst = this.petThirst +10; 
		Tick();}
	
	public void Bathe( ) {
		this.petCleanliness = this.petCleanliness +20; 
		Tick();}
	
	public void Tick() {
		this.petHunger = this.petHunger +10;
		this.petCleanliness = this.petCleanliness -10;
		this.petWaste = this.petWaste +10;
		this.petThirst = this.petThirst +10;
		this.petBoredom = this.petBoredom +20;
		
	}
	}