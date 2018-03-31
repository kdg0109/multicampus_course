package day13;

import java.io.*;

public class FileReaderTest2 {
	public static void main(String[] args) {
		try(FileReader reader = new FileReader ("c:/iotest/output.txt");
			BufferedReader br = new BufferedReader(reader);){
			String data;
			while(true) {
				data = br.readLine();
				if(data == null)
					break;
				System.out.println(data);
			}
		}catch(FileNotFoundException ioe) {
			System.out.println("파일이 존재하지 않습니다..");
		}catch(IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		}
	}
}
