package Class7;


class Dice {
	
	private int value;	// 주사위 눈
	
	// 생성자
	public Dice() {
		
	}
	
	// 주사위 던지기
	public void roll() {
		value = (int)(Math.random() * 6 + 1);	//1~6
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}


public class DiceTest {

	public static void main(String[] args) {
		Dice dice1 = new Dice();	// 객체 2개 생성
		Dice dice2 = new Dice();

		int cnt = 0;
		
		while(true) {
			dice1.roll();
			dice2.roll();
			System.out.println("주사위1=" + dice1.getValue() + " 주사위2=" + dice2.getValue());
			cnt++;
			
			if(dice1.getValue() + dice2.getValue() == 2) {
				System.out.print("(1, 1)이 나오는데 걸린 횟수 =" + cnt);
				break;
			}
		}
		
		
	}

}
