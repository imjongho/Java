package Exception;

public class Test4 {

	public static void main(String[] args) {

		String[] stringNumber = {"23", "12", "3.141592"};
		
		for(int i = 0; i < 3; i++) {
			try {
				int num = Integer.parseInt(stringNumber[i]);
				System.out.println("Value converted to Integer: " + num);
			} catch(NumberFormatException e){
				System.out.println(stringNumber[i] + " cannot be converted to integer.");
			}
		}
		
	}

}
