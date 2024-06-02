package Class11_2;

// 전체 게임을 진행하는 Game 클래스
class Game {
	
	char[][] map;	// 전체 맵
	static int Max_X = 20;
	static int Max_Y = 10;
	
	Bear bear;
	Fish fish;
	
	public Game() {
		map = new char[10][20];
		bear = new Bear(0, 0, 1);
		fish = new Fish(2, 2, 1);
	}
	
	public void showMap() {
		System.out.println();
		
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				if(bear.getX() == j && bear.getY() == i) {
					map[i][j] = bear.getShape();	// Bear의 위치
				}
				else if(fish.getX() == j && fish.getY() == i) {
					// Bear가 fish를 먹으면 fish의 위치로 이동되게 보임
					if(bear.collide(fish) == false) {		
						map[i][j] = fish.getShape();	// Fish의 위치
					}
				}
				else {
					map[i][j] = '-';	// 둘 다 아니면 '-'
				}
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
	
	
	public void run() {
		System.out.println("**Bear의 Fish 먹기 게임을 시작합니다.**");
		// 5번 중 2번은 랜덤하게 한칸씩 움직임(3번은 제자리)
		
		while(true) {
			int num1 = (int)(Math.random()*5);	// 0~4
			int num2 = (int)(Math.random()*5);
			
			do {	// 중복 제거
				num2 = (int)(Math.random()*5);
			}while(num1 == num2);
			
			for(int i = 0; i < 5; i++) {
				System.out.print(num1 + " " + num2);	// 언제 fish가 움직이는지
				showMap();
				if(bear.collide(fish) == true) {
					break;
				}
				
				if((i == num1)||(i == num2)) {
					fish.move();
				}
				bear.move();
			}
			
			if(bear.collide(fish) == true) {
				System.out.println("Bear wins!!");
				break;
			}
		}
	}
	
	
	
}



public class GameTest {

	public static void main(String[] args) {
		Game game = new Game();
		game.run();
	}

}






