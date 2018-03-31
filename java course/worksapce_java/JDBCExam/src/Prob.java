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
							   "select first_name || '(' || last_name  || ') ' 이름, to_char(salary, '999,999,999') || '원' 급여 "
							+ "from employees" + StrQuery 
							+ "order by salary");
			System.out.println("<< 실행 결과 >>");
			System.out.println();
			while(rs.next()){
				System.out.print(rs.getString("이름"));
				System.out.println(rs.getString("급여"));
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			System.out.print("DB연동 오류 발생 : ");
			e.printStackTrace();
		}
	}
}
