package Final_Exam;
import java.util.Scanner;

//사용자의 키 입력에 따라 왼쪽, 아래, 위, 오른쪽으로 distance만큼 움직임
public class Bear extends GameObject {
	private Scanner scanner = null;
	
	
	public Bear(int x, int y, int distance) {
		super(x, y, distance);
		scanner = new Scanner(System.in);
	}
	
	
	@Override
	public void move() {
		System.out.print("왼쪽(a), 아래(s), 위(d), 오른쪽(f) >> ");
		char c;
		c = scanner.next().charAt(0);
		switch(c) 
		{
			case 'a':	// left
				x -= distance;	
				if(x < 0) 
					x = 0;
				break;
			case 'f':	// right
				x += distance;
				if(x >= Game.Max_X) 
					x = Game.Max_X - distance;
				break;
			case 'd':	// up
				y -= distance;	
				if(y < 0) 
					y = 0;
				break;
			case 's':	// down
				y += distance;	
				if(y >= Game.Max_Y) 
					y = Game.Max_Y - distance;
				break;
		}
	}
	
	
	@Override
	public char getShape() {	// Bear의 모양 리턴
		return 'B';
	}
	
	
	
}