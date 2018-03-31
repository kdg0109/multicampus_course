package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import model.vo.NewsVO;

/**
 * 시퀀스 생성
 *select * from user_sequences;
 *create sequence news_seq
 *start with 1
 *increment by 1;
 */
public class NewsDAO {
	//DB 연결
	private Connection connectDBCP() {
		Connection conn = null;
		try {
//			Context context = new InitialContext();
//			DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/oraDB");
//			conn = ds.getConnection();
			
			//JUnit 단위 테스트는 Tomcat 서버가 제공하는 connection pool을 사용은 못해.
			//그래서 바로 DB접속 구문 작성해야 함
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
			
		} catch (Exception e){
			e.printStackTrace();
		} 
		return conn;
	}
	//DB insert
	public boolean insert(NewsVO vo) {
		boolean result = true;
		Connection conn = connectDBCP();
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
			pstmt = conn.prepareStatement("insert into news values (news_seq.nextval, ?, ?, ?, sysdate, 0)");
			pstmt.setString(1, vo.getWriter());
			pstmt.setString(2, vo.getTitle());
			pstmt.setString(3, vo.getContent());
			pstmt.executeUpdate();
		} catch (Exception e){
			e.printStackTrace();
			result = false;
		} finally {
			try{
				if(pstmt != null)		pstmt.close();
				if(conn != null)		conn.close();
			} catch(SQLException e) {
				System.out.println("close 오류 발생");
			}
		}
		return result;
	}
	//DB update
	public boolean update(NewsVO vo) {
		boolean result = true;
		Connection conn = connectDBCP();
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
			
			pstmt = conn.prepareStatement("update news set " + 
															" writer = '" + vo.getWriter() + "'" +
															", title = '" + vo.getTitle() + "'" +
															", content = '" + vo.getContent() + "'" +
															", cnt = " + vo.getCnt() +
															" where id =  " + vo.getId());
			pstmt.executeUpdate();
		} catch (Exception e){
			e.printStackTrace();
			result = false;
		} finally {
			try{
				if(pstmt != null)		pstmt.close();
				if(conn != null)		conn.close();
			} catch(SQLException e) {
				System.out.println("close 오류 발생");
			}
		}
		return result;
	}
	//DB delete
	public boolean delete(int id) {
		boolean result = true;
		Connection conn = connectDBCP();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement("delete from news where id = " + id);
			pstmt.executeUpdate();
		} catch (Exception e){
			e.printStackTrace();
			result = false;
		} finally {
			try{
				if(pstmt != null)		pstmt.close();
				if(conn != null)		conn.close();
			} catch(SQLException e) {
				System.out.println("close 오류 발생");
			}
		}
		return result;
	}
	//DB selectAll
	public ArrayList<NewsVO> listAll() {
		ArrayList<NewsVO> list = new ArrayList<>();
		Connection conn = connectDBCP();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select id, writer, title, content, writedate, cnt from news");
			NewsVO vo = null;
			while(rs.next()){
				vo = new NewsVO();
				vo.setId(rs.getInt("id"));
				vo.setWriter(rs.getString("writer"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setWritedate(rs.getString("writedate"));
				vo.setCnt(rs.getInt("cnt"));
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
	//DB select
	public NewsVO listOne(int id) {
		String sql = "update news set cnt = cnt+1 where id = " + id;
		
		Connection conn = connectDBCP();
		Statement stmt = null;
		ResultSet rs = null;
		NewsVO vo = null;
		try {
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			rs = stmt.executeQuery("select id, writer, title, content, writedate, cnt from news where id = " + id);
			while(rs.next()){
				vo = new NewsVO();
				vo.setId(rs.getInt("id"));
				vo.setWriter(rs.getString("writer"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setWritedate(rs.getString("writedate"));
				vo.setCnt(rs.getInt("cnt"));
			}
			
			//만약 null이면 null
			if(vo == null){
				return null;
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
		return vo;
	}
}
