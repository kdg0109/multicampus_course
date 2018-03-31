import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class InputProduct2 {
	public static void main(String[] args) {
		
		setProductData();
		
		
	}
	private static void setUpdate(Product product) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
			PreparedStatement pstmt = conn.prepareStatement("insert into product values(?,?,?,?,?)");
			//�̸� ����
			pstmt.setString(1, product.getId());
			pstmt.setString(2, product.getClassid());
			pstmt.setString(3, product.getName());
			pstmt.setInt(4, product.getBalance());
			pstmt.setFloat(5, product.getPrice());
//			stmt.executeUpdate("insert into product values"
//					+ "(lpad('"+product.getId()+"', 5,'0'), '"+product.getClassid()+"', '"+product.getName()+"', "+product.getBalance()+", "+product.getPrice()+")");
			
			pstmt.executeUpdate();
			
			pstmt.close();
			conn.close();
			setSelect(product);
		} catch (Exception e) {
			System.out.println("�����ϴ� ���� ������ �߻��߽��ϴ�. ó������ �ٽ� �Է����ּ���.");
			setProductData();
		}
	}
	

	private static void setProductData() {
		Product product = new Product();
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("��ǰ ID�� �Է��ϼ��� :");
			product.setId(sc.nextLine());
			System.out.println("��ǰ�� CLASSID�� �Է��ϼ��� :");
			product.setClassid(sc.nextLine());
			System.out.println("��ǰ���� �Է��ϼ��� :");
			product.setName(sc.nextLine());
			System.out.println("��ǰ ������ �Է��ϼ��� :");
			product.setPrice(sc.nextFloat());
			sc.nextLine();
			System.out.println("��ǰ ����� �Է��ϼ��� : ");
			product.setBalance(sc.nextInt());
			sc.nextLine();

			sc.close();
			setUpdate(product);
		}catch (Exception e) {
			System.out.println("�����ϴ� ���� ������ �߻��߽��ϴ�. ó������ �ٽ� �Է����ּ���.");
			setProductData();
		}
		
	}
	
	private static void setSelect(Product product) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
			Statement stmt = conn.createStatement();
			PreparedStatement pstmt = conn.prepareStatement("select id, classid, name, balance, price from product");
			
//			ResultSet rs = stmt.executeQuery("select id, classid, name, balance, price from product");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getString("id") + "	");
				System.out.print(rs.getString("classid") + "	");
				System.out.print(rs.getString("name") + "	");
				System.out.print(rs.getInt("balance") + "	");
				System.out.println(rs.getFloat("price"));
			}
			
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
		}
	}
}

