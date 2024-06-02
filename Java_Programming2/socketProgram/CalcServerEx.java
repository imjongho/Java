package socketProgram;
import java.io.*;
import java.net.*;
import java.util.*;

public class CalcServerEx {

	BufferedReader in = null;
	BufferedWriter out = null;
	ServerSocket listener = null;
	Socket socket = null;
	
	public static String calc(String exp) {
		StringTokenizer st = new StringTokenizer(exp, " ");
		if(st.countTokens() != 3) {
			return "error";
		}
		
		String res = "";
		int op1 = Integer.parseInt(st.nextToken());
		String opcode = st.nextToken();
		int op2 = Integer.parseInt(st.nextToken());
		switch(opcode) {
		case "+": 
			res = Integer.toString(op1 + op2);
			break;
		case "-": 
			res = Integer.toString(op1 - op2);
			break;
		case "*": 
			res = Integer.toString(op1 * op2);
			break;
		default:
			res = "error";	
		}
		
		return res;
	}
	
	
	public CalcServerEx() {
		
		try {
			listener = new ServerSocket(9999);
			System.out.println("연결을 기다리고 있습니다...");
			socket = listener.accept();
			System.out.println("연결되었습니다.");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				String inputMessage = in.readLine();
				if(inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("클라이언트에서 bye로 연결을 종료하였음");
					break;
				}
				System.out.println("클라이언트 : " + inputMessage);
				
                // 서버 응답 추가
				String res = calc(inputMessage);
                out.write(res + "\n"); // 메시지 전송
                out.flush(); // 버퍼 비우기
			}
		} catch(IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close();
				listener.close();
			} catch(IOException e) {
				System.out.println("클라이언트와 채팅 중 오류가 발생했습니다.");
			}
		}
		
	}


	
}










