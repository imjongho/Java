package Class12;
import java.util.Scanner;


public class StackApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int size = sc.nextInt();
		StringStack st = new StringStack(size);
		
		while(true) {
			System.out.print("문자열 입력 >> ");
			String str = sc.next();
			
			if(str.equals("그만")) {
				System.out.print("스택에 저장된 모든 문자열 팝 : ");
				for(int i = st.length(); i > 0; i--) {
					System.out.print(st.pop() + " ");
				}
				break;
			}
			
			if(st.push(str) == false) {
				System.out.println("스택이 꽉 차서 푸시 불가!");
			}
			
			// System.out.println("현재 top의 위치: " + st.length());
			// System.out.println("저장 가능 개수: " + st.capacity() + "개");
			// System.out.println();
			
		}
		
		sc.close();
	}

}


















