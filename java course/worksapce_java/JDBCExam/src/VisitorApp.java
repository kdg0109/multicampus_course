import java.sql.*;
import java.util.Scanner;

public class VisitorApp {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static Scanner sc = null;
	
	public static void main(String[] args) throws Exception {
		init();						//�ʱ�ȭ
		while(true) {
			showMain();		//���� ���
		}
	}
	
	/*
	 * �ʱ�ȭ
	 */
	public static void init() {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
		sc = new Scanner(System.in);
		} catch(Exception e) {
			System.out.println("���� �߻� : " + e);
		}
	}

	/*
	 * ���� ȭ��
	 */
	public static  void showMain() {
		System.out.println("1. ���� �ۼ�");
		System.out.println("2. ���� ����Ʈ ���");
		System.out.println("3. ���� �˻�");
		System.out.println("4. ����");
		System.out.print("���ϴ� ����� �����ϼ��� : ");
		int choiceNum = 0;
		try {
			choiceNum = sc.nextInt();
			sc.nextLine();

		}catch(Exception e) {
			System.out.println("��ȿ���� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
			sc = new Scanner(System.in);		//���� �Է½� ���ѷ��� ����
			return ;
		}
		
		switch (choiceNum) {
		case 1:
			InsertVisitor(); // ���� �ۼ�
			break;
		case 2:
			SelectList(false); // ���� ����Ʈ ���
			break;
		case 3:
			SelectList(true); // ���� �˻�
			break;
		case 4:
			setFinish(); // �� ����
			break;
		default:
			return;
		}
	}
	
	/*
	 * ���� �ۼ�
	 */
	public static  void InsertVisitor() {
		try {
			pstmt = conn.prepareStatement("insert into visitor values (?, sysdate, ?)");
			System.out.print("�̸� :");
			pstmt.setString(1, sc.nextLine());
			
			System.out.print("�޸�� :");
			pstmt.setString(2,  sc.nextLine());
			
			pstmt.executeUpdate();
			pstmt.close();
			System.out.println("���� ����");
		} catch (SQLException e) {
			System.out.println("���� ����");
		}	
	}
	
	
	/*
	 * ���� ����Ʈ ���/�˻�			true�� �� ���� �˻�, false �� �� ���� ���
	 */
	public static  void SelectList(boolean stateCheck) {
		boolean searchList = false;
		String searchStr = "";
		String StrQuery = "";
		if(stateCheck) {
		System.out.print("�˻��� �޸���� �Է����ּ��� : ");
		searchStr =  sc.nextLine();
		StrQuery = " where memo like '%" + searchStr +"%'";
		}else {
			StrQuery = "";
		}
		try {
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
																	ResultSet.CONCUR_READ_ONLY);

//			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(
					"select name, writedate, memo from visitor" + StrQuery);
			System.out.println("---------------------------------");
//			rs.last();
//			int abc = rs.getRow();
//			System.out.println(abc + "///");
//			rs.previous();
//			System.out.println(abc + "///");
			while(rs.next()){
				System.out.println(rs.getString("name") + "(" + rs.getString("writedate") + ")");
				System.out.println(rs.getString("memo"));

				System.out.println("---------------------------------");
				searchList = true;
			}
			
			
//			do { 
//				
//			}while()
			if(rs.next()) {
				System.out.println(searchStr + "��(��) �����ϴ� ���� ã�� �� �����ϴ�.");
				return ;
			}
			
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/*
	 * �� ����
	 */
	private static void setFinish() {

		System.out.println("���� �����մϴ�.");
		try {
			conn.close();
			if(pstmt != null)
				pstmt.close();
			sc.close();
			System.exit(0);			//JVM ����
		}catch (Exception e) {
			System.out.println("���� �߻� : " + e);
		}
	}
}
