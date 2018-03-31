import java.sql.*;

public class InsertVisitor2 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
//			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@70.12.114.109:1521:XE", "jdbctest", "jdbctest");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
			PreparedStatement pstmt = conn.prepareStatement(
					"insert into visitor values (?, ?, ?)"
				);
//			pstmt.setString(1,  "둘리1");
//			pstmt.setDate(2,  new java.sql.Date(new java.util.Date().getTime()));
//			pstmt.setString(3,  "즐거운 하루!!");

//			pstmt.setString(1,  "둘리2");
//			pstmt.setTimestamp(2,  new java.sql.Timestamp(new java.util.Date().getTime()));
//			pstmt.setString(3,  "즐거운 하루!!");
//			pstmt.executeUpdate();

			pstmt.setString(1,  "둘리3");
			pstmt.setString(2, "2018-01-10");
			pstmt.setString(3,  "즐거운 하루!!");
			pstmt.executeUpdate();
			
			pstmt.close();
			conn.close();
			System.out.println("글이 저장 완료되었어요.");
		} catch (Exception e) {
			System.out.println("오류 발생 : " + e);
		}
	}
}
