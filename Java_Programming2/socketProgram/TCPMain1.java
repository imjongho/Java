package socketProgram;

public class TCPMain1 {
	public static void main(String[] args) {
        Thread serverThread = new Thread(() -> new ServerEx());
        serverThread.start();
        
        Thread clientThread = new Thread(() -> new ClientEx());
        clientThread.start();
	}

}
