package day11;

import java.net.URL;

public class ExceptionTest1 {

	public static void main(String[] args) throws Exception{
		System.out.println("main(); �������..");
		Thread.sleep(3000);
		System.out.println("main(); ��������..");
		URL url = new URL("http://www.naver.com");
	}

}
