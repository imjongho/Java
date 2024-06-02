package Mentoring2_2;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Warrior:");
		Warrior warrior = new Warrior("Garen", 10);
		//System.out.println("Name: " + warrior.name);
		//System.out.println("Level: " + warrior.level);
		warrior.attack();
		System.out.println();
		
		System.out.println("Mage:");
		Mage mage = new Mage("Ryze", 12);
		//System.out.println("Name: " + mage.name);
		//System.out.println("Level: " + mage.level);
		mage.attack();
		System.out.println();
		
		System.out.println("Archer:");
		Archer archer = new Archer("Ashe", 8);
		//System.out.println("Name: " + archer.name);
		//System.out.println("Level: " + archer.level);
		warrior.attack();
		System.out.println();
	}

}
