import java.sql.*;

public class InsertVisitor {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
//		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@70.12.114.109:1521:XE", "jdbctest", "jdbctest");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
		PreparedStatement pstmt = conn.prepareStatement(
			"insert into visitor values (?, sysdate, ?)"
		);

		pstmt.setString(1, args[0]);
		pstmt.setString(2, args[1]);
		pstmt.executeUpdate();
		pstmt.close();
		conn.close();
		System.out.println(args[0] + "님의 글이 저장 완료되었어요.");
	}
}
