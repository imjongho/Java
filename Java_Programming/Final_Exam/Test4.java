package Final_Exam;

//전체 게임을 진행하는 Game 클래스
class Game {
	
	char[][] map;	// 전체 맵
	static int Max_X = 20;
	static int Max_Y = 10;
	
	Bear bear;
	Fish fish;
	Hunter hunter;
	
	public Game() {
		map = new char[10][20];
		bear = new Bear(0, 0, 1);	// distance = 1로 생성
		fish = new Fish(2, 2, 2);	// distance = 2로 생성
		hunter = new Hunter(0, 0, 2);	// distance = 2로 생성
	}
	
	public void showMap() {
		System.out.println();
		
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				if(bear.getX() == j && bear.getY() == i) {
					map[i][j] = bear.getShape();	
				}
				else if(hunter.getX() == j && hunter.getY() == i) {
					// hunter가 bear를 잡으면 bear의 위치로 이동되게 보임
					if(hunter.collide(bear) == false) {		
						map[i][j] = hunter.getShape();	
					}
				}
				else if(fish.getX() == j && fish.getY() == i) {
					// bear가 fish를 먹으면 fish의 위치로 이동되게 보임
					if(bear.collide(fish) == false) {		
						map[i][j] = fish.getShape();	
					}
				}
				else {
					map[i][j] = '-';	// 아니면 '-'
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
			
			for(int i = 0; i < 5; i++) {	// 2/5확률
				//System.out.print(num1 + " " + num2);	// 언제 fish가 움직이는지
				showMap();
				if(bear.collide(fish) == true) {
					break;
				}
				if(hunter.collide(bear) == true) {
					break;
				}
				
				if((i == num1)||(i == num2)) {
					fish.move();
				}
				
				bear.move();
				hunter.move();
				
			}
			
			if(bear.collide(fish) == true) {
				System.out.println("Bear wins!!");
				break;
			}
			
			if(hunter.collide(bear) == true) {
				System.out.println("hunter wins!!");
				break;
			}
		}
	}
	
}



public class Test4 {

	public static void main(String[] args) {
		Game game = new Game();
		game.run();
	}

}
