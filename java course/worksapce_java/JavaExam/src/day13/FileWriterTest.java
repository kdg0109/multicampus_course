package day13;

import java.io.*;

public class FileWriterTest {
	public static void main(String[] args) {
		FileWriter writer = null;
		String path = "C:/iotest";
		File isDir = new File(path);
		if(!isDir.exists()) {
			isDir.mkdirs();
		}
		try {
			writer = new FileWriter("c:/iotest/output.txt", true);					//파일명만 넣으면 overriding 
			char arr[] = {'객', '체', '지', '향', '언', '어', 'J', 'a', 'v', 'a' };
			for(int cnt = 0; cnt < arr.length; cnt++)
				writer.write(arr[cnt]);
			writer.write("\r\n");
			writer.write(arr);
			writer.write("\r\n");
			writer.write("OCJP 시험 대비");
			writer.write("\r\n");
			System.out.println("파일에 출력 완료!!");
		}catch(IOException ioe) {
			System.out.println("파일로 출력할 수 없습니다.");
		}finally {
			try {
				if (writer != null)
					writer.close();
			}catch (Exception e) {
				System.out.println("파일을 닫는 동안 오류 발생!!");
			}
		}
	}

}
