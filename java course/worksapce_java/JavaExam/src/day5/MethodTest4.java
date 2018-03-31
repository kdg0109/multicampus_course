package day5;

public class MethodTest4 {

	public static void main(String[] args) {
		System.out.println("main() 메서드 수행 시작");
		int result = addNumber();
//		char result = (char)addNumber();
		//메서드를 호출할 때, 하나의 메서드를 두번 이상 호출하게 될 경우, 변수에 담아 놓은 다음에 그 변수를 대신 사용하는게 효율적
		System.out.println("호출 결과값1 : " + result); //("호출 결과값1 : " + result) = 아규먼트
		
		result = addNumber(100, 200, 300);
		System.out.println("호출 결과값2 : " + result);
		result = addNumber(1000, 2000);
		System.out.println("호출 결과값3 : " + result);
		System.out.println("main() 메서드 수행 종료");
	}
	
	//overloading = 오버로딩 = 메서드 중복
	public static int addNumber(){
		return 28+20;
	}
	public static int addNumber(int n1, int n2){		//(int n1, int n2) = 매개 변수
		return n1 + n2;
	}
	public static int addNumber(int n1, int n2, int n3){
		return n1 + n2 + n3;
	}
}
