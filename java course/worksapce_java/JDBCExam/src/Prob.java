import java.sql.*;

public class Prob {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String fn1 = null;
		Class.forName("oracle.jdbc.driver.OracleDriver");

		fn1 = "E";
		kaja(fn1);
	}

	public static void kaja(String fn1) {
		String StrQuery = " where first_name like '" + fn1 +"%' ";
		try {
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(
							   "select first_name || '(' || last_name  || ') ' �̸�, to_char(salary, '999,999,999') || '��' �޿� "
							+ "from employees" + StrQuery 
							+ "order by salary");
			System.out.println("<< ���� ��� >>");
			System.out.println();
			while(rs.next()){
				System.out.print(rs.getString("�̸�"));
				System.out.println(rs.getString("�޿�"));
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			System.out.print("DB���� ���� �߻� : ");
			e.printStackTrace();
		}
	}
}
