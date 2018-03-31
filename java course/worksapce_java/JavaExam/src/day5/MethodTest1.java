package day5;

public class MethodTest1 {

	public static void main(String[] args) {
		System.out.println("main() 메서드 수행 시작");
		printMsg();
		printMsg();
		printMsg();
		System.out.println("main() 메서드 수행 종료");
	}
	
	public static void printMsg(){
		System.out.println("자바언어를 학습합니다.");
	}

}
