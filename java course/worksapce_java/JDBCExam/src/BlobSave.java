import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BlobSave {
	public static void main(String[] args) throws Exception {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
			
			File file = new File("picture2018.jpg");
			InputStream is = new FileInputStream(file);
			PreparedStatement pstmt = conn.prepareStatement("insert into picture values (?, ?, picture_seq.nextval)");
			pstmt.setString(1, "2018.jpg");
			pstmt.setBinaryStream(2,  is, file.length());
			pstmt.executeUpdate();
			pstmt.close();
			System.out.println("저장 성공!!");
			
	}
}