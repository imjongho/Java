package IO_Example;
import java.util.Scanner;
import java.io.File;

public class Test4_FileExplorer {
	
	Scanner sc;
	private File currentDir = null;
	private File subFiles[] = null;
	
	public Test4_FileExplorer(String dirName) {	// 생성자
		currentDir = new File(dirName);
	}
	
	private void showSubDirtories() {
		System.out.println("\t[" + currentDir.getPath() + "]");
		subFiles = currentDir.listFiles();	// File 배열로 변환
		for(File f : subFiles) {
			System.out.print((f.isFile())?"file":"dir");
			System.out.printf("%-15s", "\t\t" + f.length() + "바이트");
			System.out.print("\t\t" + f.getName() + "\n");
		}
	}
	
	private boolean contains(String filename) {
		for(File f : subFiles) {
			if(f.getName().equalsIgnoreCase(filename)) {
				return true;
			}
		}
		return true;
	}
	
	
	private void run() {
		sc = new Scanner(System.in);
		System.out.println("***** 파일 탐색기입니다. *****");
		showSubDirtories();
		
		while(true) {
			System.out.print(">>");
			String command = sc.nextLine().trim();	// 한 라인을 읽고 앞뒤에 입력한 빈칸 지우기
			if(command.equals("그만")) {
				break;
			}
			
			if(command.equals("..")) {
				String s = currentDir.getParent();
				if(s == null) {		// s가 null이면, surrentDir가 현재 최상위 디렉토리라서 부모 디렉토리가 없음
					continue;
				}
				else {
					currentDir = new File(currentDir.getParent());
					showSubDirtories();
				}
			}
			else {	// command는 서브디렉토리 이름
				if(contains(command)) {	
					if(new File(currentDir, command).isDirectory()) {	// 디렉토리라면
						currentDir = new File(currentDir, command);
						showSubDirtories();
					}
					else {	// 파일인 경우
						System.out.println("\t디렉토리가 아닙니다.!");
					}
				}
			}
			
		}
		
		sc.close();
	}
	
	
	public static void main(String[] args) {
		Test4_FileExplorer fe = new Test4_FileExplorer("C:\\");
		fe.run();
	}

}
