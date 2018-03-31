//public class는 자바와 이름이 같아야 한다.
public class FirstApp {
	public static void main(String[] args) {
		System.out.println("ㅎㅇ");
		
		try{	
			System.out.println(10/0);	
		}catch (ArithmeticException e) {
			System.out.println("ArithmeticException 발생");
		}
		
		System.out.println(100+200);
		System.out.println(100>200);
	}
}
