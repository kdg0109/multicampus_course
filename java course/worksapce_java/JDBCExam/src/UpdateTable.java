import java.sql.*;

public class UpdateTable {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
			PreparedStatement pstmt = conn.prepareStatement(
					"update product set balance= 100 where id = ?");
			pstmt.setString(1,  args[0]);
			int update_su = pstmt.executeUpdate();
			System.out.println("수정된 레코드 수 : " + update_su);
			System.out.println("상품번호가 " + args[0] + "인 상품의 balance 필드 수정완료");
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println("오류 발생 : " + e);
		}
	}
}
