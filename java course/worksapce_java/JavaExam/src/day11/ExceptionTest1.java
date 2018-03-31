package day11;

import java.net.URL;

public class ExceptionTest1 {

	public static void main(String[] args) throws Exception{
		System.out.println("main(); 수행시작..");
		Thread.sleep(3000);
		System.out.println("main(); 수행종료..");
		URL url = new URL("http://www.naver.com");
	}

}
