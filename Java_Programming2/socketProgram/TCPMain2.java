package socketProgram;

public class TCPMain2 {

	public static void main(String[] args) {
        Thread st = new Thread(() -> new CalcServerEx());
        st.start();
        
        Thread ct = new Thread(() -> new CalcClientEx());
        ct.start();
	}

}
