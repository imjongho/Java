package IO_Example;
import java.io.*;

public class Test2_A {

	public static void main(String[] args) throws Exception {
		int[] num = {1, 2, 3, 4, 5};
		String[] st = {"Kin", "Park", "Jung", "Lee" };
		
		ObjectOutputStream oos =
				new ObjectOutputStream(new FileOutputStream("tmp.txt"));
		oos.writeObject(num);	// 파일에 num 객체를 쓴다
		oos.writeObject(st);	// 파일에 st 객체를 쓴다
		oos.close();
		
		ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream("tmp.txt"));
		int[] num2 = (int[]) ois.readObject();	// 파일로 부터 객체 읽기
		String[] st2 = (String[]) ois.readObject();
		
		for(int i = 0; i < num2.length; i++) {	// 객체의 내용을 출력
			System.out.print(num2[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < st.length; i++) {
			System.out.print(st2[i] + " ");
		}
		
	}

}
