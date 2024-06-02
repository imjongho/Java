package Mentoring2_2;

public class Mage extends Character {

	public Mage(String name, int level) {
		super(name, level);
	}

	@Override
	public void attack() {
		System.out.println("Mage " + name + " casts a powerful spell");
	}

}
