package day10;

import java.net.InetAddress;

public class RuntimeTest {
	public static void main(String[] args) throws Exception {
		Runtime r =Runtime.getRuntime();	//The constructor Runtime() is not visible �����ڸ� ������Ҵ�.
//		r.exec("c:/windows/notepad.exe");	/* 		 / or \\   		*/
		
		Runtime r2 =Runtime.getRuntime();
		Runtime r3 =Runtime.getRuntime();
		System.out.println(r);
		System.out.println(r2);
		System.out.println(r3);
		
		InetAddress add = InetAddress.getByName("www.multicampus.co.kr");		//Ip �ּ� ã��
		InetAddress add2 = InetAddress.getLocalHost();		//Ip �ּ� ã��
		System.out.println(add);
		System.out.println(add2);
	 
	}
}