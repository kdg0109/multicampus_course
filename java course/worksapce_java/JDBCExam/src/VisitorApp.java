import java.sql.*;
import java.util.Scanner;

public class VisitorApp {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static Scanner sc = null;
	
	public static void main(String[] args) throws Exception {
		init();						//초기화
		while(true) {
			showMain();		//메인 출력
		}
	}
	
	/*
	 * 초기화
	 */
	public static void init() {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
		sc = new Scanner(System.in);
		} catch(Exception e) {
			System.out.println("오류 발생 : " + e);
		}
	}

	/*
	 * 메인 화면
	 */
	public static  void showMain() {
		System.out.println("1. 방명록 작성");
		System.out.println("2. 방명록 리스트 출력");
		System.out.println("3. 방명록 검색");
		System.out.println("4. 종료");
		System.out.print("원하는 기능을 선택하세요 : ");
		int choiceNum = 0;
		try {
			choiceNum = sc.nextInt();
			sc.nextLine();

		}catch(Exception e) {
			System.out.println("유효하지 않습니다. 다시 입력해주세요.");
			sc = new Scanner(System.in);		//문자 입력시 무한루프 방지
			return ;
		}
		
		switch (choiceNum) {
		case 1:
			InsertVisitor(); // 방명록 작성
			break;
		case 2:
			SelectList(false); // 방명록 리스트 출력
			break;
		case 3:
			SelectList(true); // 방명록 검색
			break;
		case 4:
			setFinish(); // 앱 종료
			break;
		default:
			return;
		}
	}
	
	/*
	 * 방명록 작성
	 */
	public static  void InsertVisitor() {
		try {
			pstmt = conn.prepareStatement("insert into visitor values (?, sysdate, ?)");
			System.out.print("이름 :");
			pstmt.setString(1, sc.nextLine());
			
			System.out.print("메모글 :");
			pstmt.setString(2,  sc.nextLine());
			
			pstmt.executeUpdate();
			pstmt.close();
			System.out.println("저장 성공");
		} catch (SQLException e) {
			System.out.println("저장 실패");
		}	
	}
	
	
	/*
	 * 방명록 리스트 출력/검색			true일 때 방명록 검색, false 일 때 방명록 출력
	 */
	public static  void SelectList(boolean stateCheck) {
		boolean searchList = false;
		String searchStr = "";
		String StrQuery = "";
		if(stateCheck) {
		System.out.print("검색할 메모글을 입력해주세요 : ");
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
				System.out.println(searchStr + "을(를) 포함하는 글을 찾을 수 없습니다.");
				return ;
			}
			
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/*
	 * 앱 종료
	 */
	private static void setFinish() {

		System.out.println("앱을 종료합니다.");
		try {
			conn.close();
			if(pstmt != null)
				pstmt.close();
			sc.close();
			System.exit(0);			//JVM 종료
		}catch (Exception e) {
			System.out.println("오류 발생 : " + e);
		}
	}
}
