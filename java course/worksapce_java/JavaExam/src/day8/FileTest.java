package day8;

import java.io.File;
import java.util.Scanner;

public class FileTest {
	public static void main(String[] args) {
		System.out.println("ã�����ϴ� ���ϸ��� �Է����ּ��� : ");
		Scanner scan = new Scanner(System.in);
		String fileName = scan.nextLine();
//		File f = new File("C:/projects/workspace/JavaExam/src/" + fileName);
		File f = new File(fileName);
		scan.close();
		if(f.exists()){
			if(f.isDirectory()){
				System.out.println("���丮�Դϴ�.");
			}else{
				System.out.println(f.length() + " ����Ʈ�� �����Դϴ�.");
			}
		}else {
			System.out.println("�������� �ʽ��ϴ�.");
		}
	}
}
