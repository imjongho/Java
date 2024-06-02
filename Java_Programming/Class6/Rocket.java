package Class6;

public class Rocket {
	
	int x, y;
	
	public Rocket(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "내용";
	}
	
	public void moveUp() {
		this.y += 1;
	}
	
}
