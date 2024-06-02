package databaseExample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest1 {
	public static void main(String[] args) {
		Connection conn;
		String url = "jdbc:mysql://localhost:3306/haksa?serverTimezone=UTC";
		
		String id = "root";
		String pw = "jongho4502@";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("DB연결완료");
			conn.close();
		} catch(ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch(SQLException e) {
			System.out.println("DB 연결 오류");
		}
		
	}

}
