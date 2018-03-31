package day6;

import java.text.DecimalFormat;

public class PrintfTest {
	public static void main(String[] args) {
		System.out.printf("테스트입니당%n");						//%n만 유일하게 그냥 개형 \n도 같음 \n쓰는게 더 나음
		System.out.printf("%d %x %o %c\n", 100, 100, 100, 100);	//%x 16진수 %o 8진수
		System.out.printf("%c %c %c %c\n", '가', 'A', '!', '3');
		System.out.printf("%b\n",  true);
		System.out.printf("%f %e\n",  100.0, 100.0);			//%f 고정 소수점 수 .이하 6자리까지
		System.out.printf("%.2f\n",  123.5678);
		System.out.printf("|%s|\n","자바");
		System.out.printf("|%10s|\n", "자바");
		System.out.printf("|%-10s|\n", "자바");
		System.out.printf("%,d원\n", 1000000);
		
		
		double num = 29600000;  // "이천구백육십만" 이라는 숫자를 대입
	    DecimalFormat df = new DecimalFormat("#,##0.00");
	    String don = df.format(num);
//	    double abc = Double.parseDouble(don);
	    System.out.println(don);
		
//		Scanner scan = new Scanner(System.in);
	}

}
