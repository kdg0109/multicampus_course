import java.io.*;
import java.sql.*;

public class BlobRead {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
		Statement stmt = conn.createStatement();
		ResultSet rset = stmt.executeQuery("select * from picture where name = '2018.jpg'");

		if (rset.next()) {
			Blob blob = rset.getBlob(2);
			System.out.println(blob.length());
			InputStream is = blob.getBinaryStream();
			FileOutputStream fo = new FileOutputStream("new2018.jpg");

			int c = 0;
			while ((c = is.read()) != -1)
				fo.write(c);
			fo.close();
			is.close();
			Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe new2018.jpg");
		}else {
			System.out.println("추출된 데이터가 없습니다!!");
		}
	}
}