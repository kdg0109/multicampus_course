import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

class Product {

	private String id;
	private String classid;
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int balance;
	private float price;
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClassid() {
		return classid;
	}

	public void setClassid(String classid) {
		this.classid = classid;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}

public class InputProduct {
	public static void main(String[] args) {
		
		setProductData();
		
		
	}
	private static void setUpdate(Product product) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
			Statement stmt = conn.createStatement();
			
			stmt.executeUpdate("insert into product values"
					+ "(lpad('"+product.getId()+"', 5,'0'), '"+product.getClassid()+"', '"+product.getName()+"', "+product.getBalance()+", "+product.getPrice()+")");
			

			stmt.close();
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
			
			
			ResultSet rs = stmt.executeQuery("select id, classid, name, balance, price from product");

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
