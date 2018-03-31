package day2;

public class IfTest1 {
	public static void main(String[] args) {
		
		int num = (int)(Math.random()*10)+1;		//1부터 10까지
		
		if(num%2 != 0)  System.out.println(num + " : 홀수");		//등가 여부 체크
		else			System.out.println(num + " : 짝수");
		
		System.out.println("수행종료");
	}
}
