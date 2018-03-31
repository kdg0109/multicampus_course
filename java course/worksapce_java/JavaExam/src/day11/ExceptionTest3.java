package day11;

import java.util.Random;

class TestException extends Exception {
	//default 생성자는 안만들어주고 반드시 객체 생성할 때, 메시지를 남겨줄 것이다.
	TestException(String message) {
		super(message);
	}
}
public class ExceptionTest3 {
	public static void main(String[] args) {
		System.out.println("main() 수행시작");
		a();
		System.out.println("main() 수행종료");
	}
	static void a() {
		System.out.println("a() 수행시작");
		try {
			b();
		} catch (TestException e) {
			//System.out.println("오류 발생  : " +  e.getMessage());
//			return;
			e.printStackTrace();
			System.exit(0);				//JVM을 죽이자
			
		}
		System.out.println("a() 수행종료");
	}
	static void b() throws TestException {
		System.out.println("b() 수행시작");
		c();
		System.out.println("b() 수행종료");
	}
	static void c() throws TestException {
		System.out.println("c() 수행시작");
		boolean flag = new Random().nextBoolean();
		if(flag) {
			//메모리 상에 예외 객체가 생성되어 던져짐
			//c를 호출한 b가 catch가능한지 찾고, 없으니 a로 찾아서 수행을 넘겨줌
			throw new TestException("<<:::::테스트로 예외발생시킴");
		}else {
			System.out.println("ㅋㅋㅋㅋ");
		}
		System.out.println("c() 수행종료");
	}
}
