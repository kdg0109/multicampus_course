package day5;

public class MethodTest2 {

	public static void main(String[] args) {
		System.out.println("main() 메서드 수행 시작");
		printMsg('#',"호출1");
		printMsg('@',"호출2");
		printMsg('&',"호출3");
		System.out.println("main() 메서드 수행 종료");
	}
	
	public static void printMsg(char deco, String msg){
		System.out.println(deco+msg+deco);
	}

}
