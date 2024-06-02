package databaseExample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest4 {

	public static void main(String[] args) {
		Connection conn;
		String url = "jdbc:mysql://localhost:3306/haksa?serverTimezone=UTC";
		
		String id = "root";
		String pw = "jongho4502@";
		
		Statement stmt;
		ResultSet result;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("DB연결완료");
			
			stmt = conn.createStatement();
			
			stmt.executeUpdate("delete from student where grade = 3");
			
			result = stmt.executeQuery("select * from student");
			
			while(result.next()) {
				int hakbun = result.getInt(1);
				String name = result.getString("name");
				String dept = result.getString("dept");
				int score = result.getInt(4);
				int grade = result.getInt("grade");
				System.out.println(hakbun + " " + name + " " + dept + " " + score + " " + grade);
			}
			
			result.close();
			stmt.close();
			conn.close();
			
		} catch(ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch(SQLException e) {
			System.out.println("DB 연결 오류");
		}

	}

}
