package IO_Example;
import java.io.File;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		System.out.println("파일 탐색기");
		Scanner sc = new Scanner(System.in);
		
		File file = new File("C:\\");
		
		while(true) {
			File[] subFiles = file.listFiles();
			System.out.println("[" + file.getPath() + "]");
			
			for(int i = 0; i < subFiles.length; i++) {
				String res = "";
				File f = subFiles[i];
				
				if(f.isFile()) {
					res = "file";
				}
				else if(f.isDirectory()) {
					res = "dir";
				}
				
				System.out.print(res + "\t");
				System.out.printf("%-10s", f.length());
				System.out.printf("%s\n", f.getName().trim());
			}
			
			System.out.print(">>");
			String dir = sc.nextLine();
			String newDir = "";
			if(dir.equals("...")) {
				newDir = file.getParent();	// 상위 디렉토리로 이동
			}
			else {
				newDir = file.getPath().concat("\\" + dir);	// 하위 디렉토리로 이동
			}
			
			file = new File(newDir);
			
			if(!file.exists()) {
				System.out.println("파일 존재 X");
				break;
			}
			
			if(dir.equals("end")) {
				System.out.println("파일 탐색 종료");
				break;
			}
		}

		
		sc.close();
	}

}
