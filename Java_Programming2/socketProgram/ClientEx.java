package socketProgram;
import java.io.*;
import java.net.*;
import java.util.*;

public class ClientEx {
	
	BufferedReader in = null;
	BufferedWriter out = null;
	ServerSocket listener = null;
	Socket socket = null;
	Scanner sc = new Scanner(System.in);
	
	public ClientEx() {
		try {
			socket = new Socket("localhost", 9999);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				System.out.print("보내기>>");
				String outputMessage = sc.nextLine();
				if(outputMessage.equalsIgnoreCase("bye")){
					out.write(outputMessage+"\n");
					out.flush();
					break;
				}
				out.write(outputMessage + "\n");
				out.flush();
				String inputMessage = in.readLine();
				System.out.println("서버 : " + inputMessage);
			}
		} catch(IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				sc.close();
				if(socket != null) {
					socket.close();
				}
			} catch(IOException e) {
				System.out.println("클라이언트와 채팅 중 오류가 발생했습니다.");
			}
		}
	}
}
