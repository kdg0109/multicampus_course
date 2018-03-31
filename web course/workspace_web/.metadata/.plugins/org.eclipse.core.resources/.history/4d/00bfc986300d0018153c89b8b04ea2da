package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 * (Data Access Object) 데이터 접근 오브젝트 ex) insert( ), list( ) 를 작성해둔다
 */
public class VisitorDAO {
	public boolean insert(VisitorVO vo){
		boolean result = true;
//		ConnectDB obj = new ConnectDB();
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			//Connection Pool 을 연결하기 위한 context
			Context context = new InitialContext();
			//네이밍 서버(톰캣 안)에 접속하여 oraDB라는 애가 있는지 데이터 소스 객체를 찾아달라
			//이때도 객체 직렬화를 함
			DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/oraDB");
			conn = ds.getConnection();
			pstmt = conn.prepareStatement("insert into visitor values (?, sysdate, ?)");
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getMemo());
			pstmt.executeUpdate();
		} catch (Exception e){
			e.printStackTrace();
			result = false;
		} finally {
			try{
				if(pstmt != null)		pstmt.close();
				if(conn != null)		conn.close(); //애는 반납까지만 가능
			} catch(SQLException e) {
				System.out.println("close 오류 발생");
			}
		}
		return result;
	}
	
	public ArrayList<VisitorVO> list(){
		ArrayList<VisitorVO> list = new ArrayList<>();
//		ConnectDB obj = new ConnectDB();
//		Connection conn = obj.getConnect();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Context context= new InitialContext();		//Connection Pool 을 연결하기 위한 context
			DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/oraDB");//Servers의 context.xml에 넣은거
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select name, writedate, memo from visitor");
			VisitorVO vo = null;
//			- write는 null이 있을 때 nullpoint 나옴
//			- println은 null 있어도 댐
			while(rs.next()){
				vo = new VisitorVO();
				vo.setName(rs.getString("name"));
				vo.setWriteDate(rs.getString("writedate"));
				vo.setMemo(rs.getString("memo"));
				list.add(vo);
			}
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			try{
				if(rs != null)			rs.close();				
				if(stmt != null)		stmt.close();			
				if(conn != null)		conn.close(); //애는 반납까지만 가능
			} catch(SQLException e) {
				System.out.println("close 오류 발생");
			}
		}
		return list;
	}
	
	public ArrayList<VisitorVO> listByName(String name){
		ArrayList<VisitorVO> list = new ArrayList<>();
//		ConnectDB obj = new ConnectDB();
//		Connection conn = obj.getConnect();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Context context= new InitialContext();		//Connection Pool 을 연결하기 위한 context
			DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/oraDB");//Servers의 context.xml에 넣은거
			conn = ds.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select name, writedate, memo from visitor where name like '%" + name + "%'");
			VisitorVO vo = null;
//			- write는 null이 있을 때 nullpoint 나옴
//			- println은 null 있어도 댐
			while(rs.next()){
				vo = new VisitorVO();
				vo.setName(rs.getString("name"));
				vo.setWriteDate(rs.getString("writedate"));
				vo.setMemo(rs.getString("memo"));
				list.add(vo);
			}
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			try{
				if(rs != null)			rs.close();				
				if(stmt != null)		stmt.close();			
				if(conn != null)		conn.close(); //애는 반납까지만 가능
			} catch(SQLException e) {
				System.out.println("close 오류 발생");
			}
		}
		return list;
	}
}
