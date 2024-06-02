package IO_Example;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test6_XorEnc {

	static byte[] key = { 10, 20, 30, 40 };
	
	public static void main(String[] args) throws Exception {
		System.out.println("XorEncoding begins.");
		
		// 암호화할 원본 파일과 암호화된 파일의 입출력 스트림을 생성합니다.
		FileInputStream is = new FileInputStream("textXorEnc.txt");
		FileOutputStream os = new FileOutputStream("textXorEnc.enc");
		
		byte[] data = new byte[1024];
		int read = is.read(data);
		int index = 0;
		while(read != -1) {
			// 데이터를 XOR 연산을 통해 암호화합니다.
			for(int k = 0; k < read; k++) {
				data[k] ^= key[index % key.length];
				index++;
			}
			// 암호화된 데이터를 출력 파일에 쓰기합니다.
			os.write(data, 0, read);
			// 다음 블록을 읽습니다.
			read = is.read(data);
		}
		
		// 출력 스트림을 비우고 닫습니다.
		os.flush();
		os.close();
		// 입력 스트림을 닫습니다.
		is.close();
		
	}

}
