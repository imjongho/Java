package Mentoring2_2;

//게임 캐릭터의 기본 특성을 나타내는 추상클래스
public abstract class Character {
	
	public String name;
	public int level;
	
	public Character(String name, int level) {
		this.name = name;
		this.level = level;
		showInfo();
	}
	
	// 캐릭터의 공격동작을 구현하는 추상 메소드
	public abstract void attack();
	
	public void showInfo() {
		System.out.println("Name: " + name);
		System.out.println("Level " + level);
	}
}
