import java.sql.*;

public class ConnectDB {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
			DatabaseMetaData meta = conn.getMetaData();
			
			System.out.println("Database: " + meta.getDatabaseProductName());
			System.out.println(" version " + meta.getDatabaseProductVersion());
			System.out.print("User name: " + meta.getUserName());
			conn.close();
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
