package Class3;

public class Test6 {

	public static void main(String[] args) {
		
		int num = 6;
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num; j++) {
				if(i + j == num) {
					System.out.println("(" + i + "," + j + ")");
				}
			}
		}
		
		
	}

}
