package Class10;

class Max {

	public int test(int num1, int num2) {
		int max = 0;
		if(num1 >= num2) {
			max = num1;
		}
		else {
			max = num2;
		}
		
		return max;
	}
	
	public double test(double num1, double num2) {
		double max = 0.0;
		if(num1 >= num2) {
			max = num1;
		}
		else {
			max = num2;
		}
		
		return max;
	}
	
}


public class MaxValueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Max mt = new Max();
		int r = mt.test(4, 6);
		double r1 = mt.test(4.2, 6.1);
		System.out.println("두 정수 중 큰 값은 " + r);
		System.out.println("두 실수 중 큰 값은 " + r1);
		
	}

}
