package Project3_Quadrangle;

// 사다리꼴 : 넓이 = {(윗변) + (밑변)} * (높이) / 2
public class Trapezoid extends Quadrangle {
	
	private int up_side;
	
	public Trapezoid(int up_side, int down_side, int height, String name) {
		super(height, down_side, name);
		
		this.up_side = up_side;
		Area();
	}

	@Override
	public void Area() {
		super.setArea((getUp_side() + super.getDown_side()) * super.getHeight() / 2);
	}
	
	
	// -------------- 접근자, 설정자 ---------------- 
	
	public int getUp_side() {
		return up_side;
	}

	public void setUp_side(int up_side) {
		this.up_side = up_side;
	}

}
