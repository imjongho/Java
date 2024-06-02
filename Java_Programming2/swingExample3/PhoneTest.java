package swingExample3;
import java.util.Scanner;
import java.io.*;

public class PhoneTest {
	public static void main(String[] args) throws IOException {
		Scanner p = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("phoneTest.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		
		String name, pnum;
		
		for(int i = 1; i <= 5; i++) {
			System.out.print(i + "번째 학생의 이름과 전화번호를 입력하세요(공백으로 분리) : ");
			name = p.next();
			pnum = p.next();
			dos.writeUTF(name + " ");
			dos.writeUTF(pnum + " ");
		}
		System.out.println("phoneTest.txt 파일에 저장되었습니다");
		
	
	}

}
