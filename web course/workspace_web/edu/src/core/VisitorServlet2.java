package core;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/visitor2")
public class VisitorServlet2 extends HttpServlet {
	//DB의 리스트를 읽어서 html로 뿌릴 것
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		try {
			//DB 접근
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery("select name, writedate, memo from visitor");
			
//			- write는 null이 있을 때 nullpoint 나옴
//			- println은 null 있어도 댐
			while(rs.next()){
				out.write(rs.getString("name") + rs.getString("writedate") + rs.getString("memo"));
				out.write("<br>");
			}
			
		} catch(ClassNotFoundException e){
			System.out.println("JDBC 드라이버 로딩 오류");
			return;
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try{
				if(rs != null)				rs.close();				
				if(stmt != null)			stmt.close();
				if(conn != null)			conn.close();
			} catch(SQLException e) {
				System.out.println("close 오류 발생");
			}
		}
		
		out.write("<hr><a href='/edu/htmlexam/visitor.html'>방명록 쓰기</a>");
		out.close();
	}
	
	//visitor.html에 데이터를 받아서 디비에 넣을것
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String name = "";
		try {
			//DB 접근
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
			pstmt = conn.prepareStatement("insert into visitor values (?, sysdate, ?)");
			request.setCharacterEncoding("utf-8");		//읽고 유니코드(utf-16)를 변환시켜내야함
			name = request.getParameter("name");
			pstmt.setString(1, name);
			pstmt.setString(2,  request.getParameter("memo"));
			pstmt.executeUpdate();
		} catch(ClassNotFoundException e){
			System.out.println("JDBC 드라이버 로딩 오류");
			return;
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try{
				if(pstmt != null)
					pstmt.close();
				
				if(conn != null)
					conn.close();
			} catch(SQLException e) {
				System.out.println("close 오류 발생");
			}
		}
		
		//html로 부터 post 받은 것
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("utf-8");		//읽고 유니코드(utf-16)를 변환시켜내야함
		out.println("<h2>" + name + "님의 글이 저장되었습니다. </h2>");
		out.print("<a href='/edu/visitor2'>방명록 리스트 보기</a>"); //servlet에서 href사용하면 get방식임
		out.close();
	}
}
