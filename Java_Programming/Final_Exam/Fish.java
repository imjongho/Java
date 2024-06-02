package Final_Exam;

//다섯 번 중 세번은 제자리에 있고, 나머지 두 번은 4가지 방향 중 랜덤하게 한 칸씩 움직임
public class Fish extends GameObject {
	
	int cnt = 0;
	
	public Fish(int x, int y, int distance) {
		super(x, y, distance);
	}
	
	
	@Override
	public void move() {
		int move = (int)(Math.random()*4);	// 0~3 상하좌우
		switch(move)
		{
			case 0:
				// left
				x -= distance;	
				if(x < 0) 
					x = 0;
				break;
			case 1:	// right
				x += distance;
				if(x >= Game.Max_X) 
					x = Game.Max_X - distance;
				break;
			case 2:	// up
				y -= distance;	
				if(y < 0) 
					y = 0;
				break;
			case 3:	// down
				y += distance;	
				if(y >= Game.Max_Y) 
					y = Game.Max_Y - distance;
				break;
		}
	}
	
	
	@Override
	public char getShape() {	// Fish의 모양 리턴
		return '@';
	}
	
}



