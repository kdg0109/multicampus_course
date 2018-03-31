package day13;

import java.io.*;

public class FileWriterTest2 {
	public static void main(String[] args) {
		String path = "C:/iotest";
		File isDir = new File(path);
		if(!isDir.exists()) {
			isDir.mkdirs();
		}
		//try 안에 객체 파일 객체 생성을 할 경우, try문이 모두 끝나면 자동으로 close해준다.
		try (FileWriter writer = new FileWriter("c:/iotest/output.txt");){ //파일명만 넣으면 overriding 
			char arr[] = {'객', '체', '지', '향', '언', '어', 'J', 'a', 'v', 'a' };
			for(int cnt = 0; cnt < arr.length; cnt++)
				writer.write(arr[cnt]);
			writer.write("\n");				//\n하나만 있는건 메모장에서 개행이 아님
			writer.write(arr);
			writer.write("\n");
			writer.write("OCJP 시험 대비");
			writer.write("\n");
			System.out.println("파일에 출력 완료!!");
		}catch(IOException ioe) {
			System.out.println("파일로 출력할 수 없습니다.");
		}
	}
}
