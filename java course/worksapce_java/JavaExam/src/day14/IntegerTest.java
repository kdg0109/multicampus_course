package day14;
public class IntegerTest {
	public static void main(String[] args) {
		String s1 = Integer.toBinaryString(12);
		String s2 = Integer.toBinaryString(88);
	    
		System.out.printf("%s\n", s1);
		System.out.printf("%s\n", s2);

		int num1 = Integer.parseInt(s1 ,2); //2������ �ν��Ͼ� �ٲ���
		int num2 = Integer.parseInt(s2, 2);
//
//		int num1 = Integer.parseInt(s1);
//		int num2 = Integer.parseInt(s2);
		System.out.printf("%d\n", num1);
		System.out.printf("%d\n", num2);
	}
}
