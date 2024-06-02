package IO_Example;
import java.io.*;

public class Test1_A {

	public static void main(String[] args) throws IOException {
		if(args.length != 2) {
			System.out.println("Enter Source file and target file");
			System.exit(0);
		}
		
		File sf = new File(args[0]);
		if(!sf.exists()) {	// 파일이 현 디렉토리에 존재하지 않는가?
			System.out.println("Source file does not exist");
			System.exit(0);
		}
		
		File tf = new File(args[1]);
		if(tf.exists()) {
			System.out.println("Target file already exists");
			System.out.println("Overwrite?(y/n)");
			char choice = (char) System.in.read();
			// 사용자로부터 하나의 문자를 입력받는다.
			if(choice == 'n' || choice == 'N') {
				System.exit(0);
			}
		}
		
		// File 객체를 이용하여 객체 생성
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sf));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(tf));
		
		System.out.println("Source file : " + args[0]);
		
		int i;
		while((i = bis.read()) != -1) {
			bos.write((byte)i);
		} // 소스파일로부터 한 바이트를 읽어서 타겟파이에 쓴다
		System.out.println("Target file : " + args[1]);
		
		System.out.println("Copy has been comleted.");
		bis.close();
		bos.close();

	}

}
