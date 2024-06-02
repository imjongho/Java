package Mentoring2_2;

public class Archer extends Character {

	public Archer(String name, int level) {
		super(name, level);
	}

	@Override
	public void attack() {
		System.out.println("Archer " + super.name + " shoots arrows at the enemy");
	}

}
