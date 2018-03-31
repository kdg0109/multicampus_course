package day2;

public class TypeTest5 {
	public static void main(String[] args) {
		int num1 = 10;
		double num2 = num1;
		
		System.out.println(num1 + " : " + num2);
		
		num2 = 3.14;
		System.out.println(num2);
		
		num1 = (int)num2;				//강제 형변환 = 캐스팅 연산자  소수점 사라짐
		System.out.println(num1);
		
		int su = 10;
		
		su = su++ * 5;
		System.out.println(su);
		
		su = 10;
		System.out.println(su++);		//전달(출력)하고 나중에 연산해라
	}
}
