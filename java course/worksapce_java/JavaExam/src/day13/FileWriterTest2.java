package day13;

import java.io.*;

public class FileWriterTest2 {
	public static void main(String[] args) {
		String path = "C:/iotest";
		File isDir = new File(path);
		if(!isDir.exists()) {
			isDir.mkdirs();
		}
		//try �ȿ� ��ü ���� ��ü ������ �� ���, try���� ��� ������ �ڵ����� close���ش�.
		try (FileWriter writer = new FileWriter("c:/iotest/output.txt");){ //���ϸ� ������ overriding 
			char arr[] = {'��', 'ü', '��', '��', '��', '��', 'J', 'a', 'v', 'a' };
			for(int cnt = 0; cnt < arr.length; cnt++)
				writer.write(arr[cnt]);
			writer.write("\n");				//\n�ϳ��� �ִ°� �޸��忡�� ������ �ƴ�
			writer.write(arr);
			writer.write("\n");
			writer.write("OCJP ���� ���");
			writer.write("\n");
			System.out.println("���Ͽ� ��� �Ϸ�!!");
		}catch(IOException ioe) {
			System.out.println("���Ϸ� ����� �� �����ϴ�.");
		}
	}
}
