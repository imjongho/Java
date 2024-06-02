package Class13;
import java.util.Scanner;

public class StringTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">>");
		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer(str);
		
		while(true) {
			System.out.print("Command: ");
			String command = sc.nextLine();
			
			if(command.equals("exit")) {
				System.out.println("End...");
				break;
			}
			
			// !기준으로 나눔
			String[] tokens = command.split("!");	
			//System.out.println(tokens[0]);
			//System.out.println(tokens[1]);
			
			if(tokens.length != 2) {	// 배열 크기는 2
				System.out.println("잘못된 명령입니다!");
			}
			else {
				if(tokens[0].length() == 0 || tokens[1].length() == 0) {
					System.out.println("잘못된 명령입니다!");
					continue;
				}
				
				int index = sb.indexOf(tokens[0]);
				System.out.println(index);
				if(index == -1) {
					System.out.println("찾을 수 없습니다!");
					continue;
				}
				
				sb.replace(index, index+tokens[0].length(), tokens[1]);
				System.out.println(sb.toString());
			}
			
		}
		
		
		sc.close();
	}

}
