import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

class Emp {
	private String ename;
	private int sal;
	Emp(String ename, int sal) {
		this.ename = ename;
		this.sal = sal;
	}	
	String showInfo(){
		return String.format("%s 직원은 월급이 %,d원입니다.",ename , sal);
	}
}
public class SelectEmp {
	public static void main(String[] args) {
		ArrayList<Emp> arrayList = new ArrayList<>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "work", "work");
			Statement stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery("select ename, sal from emp");

			while(rs.next()) {
				arrayList.add(new Emp(rs.getString("ename"), rs.getInt("sal")));
			}
			for(Emp emp : arrayList){
				System.out.println(emp.showInfo());
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println("오류 발생 : " + e);
		}
	}
}
