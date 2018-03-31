import java.sql.*;

public class DeleteTable {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
			PreparedStatement pstmt = conn.prepareStatement(
					"delete from product where balance < ?");
			pstmt.setInt(1,  Integer.parseInt(args[0]));
			int del_su = pstmt.executeUpdate();
			System.out.println("재고가 " + args[0] + "미만인 상품 정보를 " + del_su + "개 삭제하였습니다.");
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println("오류 발생 : " + e);
		}
	}
}
