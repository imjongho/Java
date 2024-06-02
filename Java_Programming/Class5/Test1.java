package Class5;

public class Test1 {

	public static void main(String[] args) {
		double[] num = {1.0, 2.0, 3.0, 4.0};
		double sum = 0.0;
		double max = num[0];
		
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
			sum += num[i];
		}
		
		System.out.println();
		System.out.println("sum = " + sum);
		
		for(double j : num) {
			if(j > max) {
				max = j;
			}
		}
		System.out.println("max = " + max);
		
	}

}
