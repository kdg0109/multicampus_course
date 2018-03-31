import java.sql.*;

public class SelectTable {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
			System.out.println("���ϵ� Connection ��ü : " + conn.getClass().getName());
			Statement stmt = conn.createStatement();
			System.out.println("���ϵ� Statement ��ü : " + stmt.getClass().getName());

			ResultSet rs = stmt.executeQuery("select * from product");
			
			System.out.print(rs.next() + "	");
			while(rs.next()) {
				System.out.print(rs.getString("id") + "	");
//				System.out.print(rs.getString(1) + "	");
				System.out.print(rs.getString("classid") + "	");
//				System.out.print(rs.getString(2) + "	");
				System.out.print(rs.getString("name") + "	");
				System.out.print(rs.getInt("balance") + "	");
				System.out.println(rs.getFloat("price"));
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println("���� �߻� : " + e);
		}
	}
}
