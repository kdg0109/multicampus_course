package day5;

public class MethodTest3 {

	public static void main(String[] args) {
		System.out.println("main() 메서드 수행 시작");
		int result = addNumber();
//		char result = (char)addNumber();
		//메서드를 호출할 때, 하나의 메서드를 두번 이상 호출하게 될 경우, 변수에 담아 놓은 다음에 그 변수를 대신 사용하는게 효율적
		System.out.println("호출 결과값1 : " + result);
		System.out.println("호출 결과값2 : " + result);
		System.out.println("호출 결과값3 : " + result);
		System.out.println("main() 메서드 수행 종료");
	}
	public static int addNumber(){
		return 28+20;
	}
}
