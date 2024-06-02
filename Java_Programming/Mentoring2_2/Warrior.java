package Mentoring2_2;

public class Warrior extends Character {

	public Warrior(String name, int level) {
		super(name, level);
	}

	@Override
	public void attack() {
		System.out.println("Warrior " + name + " performs a melee attack");
	}

}
