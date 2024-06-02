package Final_Exam;

public class Hunter extends GameObject {
	
	int cnt = 0;
	
	public Hunter(int x, int y, int distance) {
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
	public char getShape() {	// Hunter의 모양
		return 'H';
	}
}
