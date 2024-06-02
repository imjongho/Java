package Week_13_Homework;

import java.io.*;
import java.net.*;
import java.util.HashMap;
import java.util.Map;

public class Server {

	BufferedReader in = null;
	BufferedWriter out = null;
	ServerSocket listener = null;
	Socket socket = null;
	Map<String, String> scores = new HashMap<>(); // 학생 이름과 학점을 저장할 맵
	
    // score.txt 파일을 읽고 이름에 해당하는 학점을 맵에 저장하는 메소드
    public void loadScores() {
        try (BufferedReader br = new BufferedReader(new FileReader("D:/Java/eclipse-workspace/Java_Programming2/src/Week_13_Homework/score.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {	// 한 줄씩 읽기
                String[] parts = line.split(" ");
                if(parts.length == 2) {  // 이름과 학점이 있는 경우에만 맵에 추가
                    scores.put(parts[0], parts[1]);
                }
            }
        } catch (IOException e) {
            System.out.println("score.txt 파일을 읽는 도중 오류가 발생했습니다: " + e.getMessage());
        }
    }
	
    
    // 학생 이름을 받아 해당하는 학점을 반환하는 메소드
    public String getGrade(String name) {
        return scores.getOrDefault(name, "?");
    }
    
	
	public Server() {
		loadScores(); // 서버 시작 시 학점 로드
		System.out.println("score.txt 읽기 완료");	// 시작시 한번만 읽고 해시맵에 저장
		
		try {
			listener = new ServerSocket(9999);
			System.out.println("연결을 기다리고 있습니다...");
			socket = listener.accept();
			System.out.println("클라이언트 연결됨");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				String studentName = in.readLine();	// 클라이언트로부터 학생 이름을 받음
	            // System.out.println(studentName);
				if (studentName.equals("bye")) {
	            	 break;
	            }
				
				// 이름으로 score.txt 파일에서 학점을 찾아 전송
				String grade = getGrade(studentName);
				System.out.println(studentName + ":" + grade);
                out.write(grade + "\n"); // 메시지 전송
                out.flush(); // 버퍼 비우기
			}
		} catch(IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
                if (out != null) out.close();
                if (in != null) in.close();
                if (socket != null) socket.close();
                if (listener != null) listener.close();
			} catch(IOException e) {
				System.out.println("자원을 해제하는 도중 오류가 발생했습니다: " + e.getMessage());
			}
		}
		
	}
	
	
    public static void main(String[] args) {
        new Server(); // 서버 시작
    }
    
	
}



