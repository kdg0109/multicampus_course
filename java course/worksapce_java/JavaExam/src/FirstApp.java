//public class�� �ڹٿ� �̸��� ���ƾ� �Ѵ�.
public class FirstApp {
	public static void main(String[] args) {
		System.out.println("����");
		
		try{	
			System.out.println(10/0);	
		}catch (ArithmeticException e) {
			System.out.println("ArithmeticException �߻�");
		}
		
		System.out.println(100+200);
		System.out.println(100>200);
	}
}
