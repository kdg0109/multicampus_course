import java.sql.*;

public class SelectVisitor {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
//		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@70.12.114.109:1521:XE", "jdbctest", "jdbctest");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
		Statement stmt = conn.createStatement();
//		ResultSet rs = stmt.executeQuery(
//				"select name, to_char(writedate, 'yyyy') year, memo from visitor order by year desc");
		ResultSet rs = stmt.executeQuery(
				"select name, writedate, memo from visitor");
		
		while(rs.next()){
			System.out.print(rs.getString("name") + "	");
			System.out.print(rs.getString("writedate") + "	");
			System.out.println(rs.getString("memo"));
		}
	}
}
