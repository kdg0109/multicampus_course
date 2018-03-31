package day8;

import java.io.File;
import java.util.Scanner;

public class FileTest {
	public static void main(String[] args) {
		System.out.println("찾고자하는 파일명을 입력해주세요 : ");
		Scanner scan = new Scanner(System.in);
		String fileName = scan.nextLine();
//		File f = new File("C:/projects/workspace/JavaExam/src/" + fileName);
		File f = new File(fileName);
		scan.close();
		if(f.exists()){
			if(f.isDirectory()){
				System.out.println("디렉토리입니다.");
			}else{
				System.out.println(f.length() + " 바이트의 파일입니다.");
			}
		}else {
			System.out.println("존재하지 않습니다.");
		}
	}
}
