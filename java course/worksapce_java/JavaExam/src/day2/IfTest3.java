package day2;

public class IfTest3 {
	public static void main(String[] args) {
		
		int score = (int)(Math.random()*101);	// 0 ~ 100
		/*
		 * 90 ~ 100 �̸� 	"x : A���"
		 * 80 ~ 89 �̸� 	"x : B���"
		 * 70 ~ 79 �̸� 	"x : C���"
		 * 60 ~ 69 �̸� 	"x : D���"
		 * 59 �����̸� 		"x : F���"
		 */
		
		if(90 <= score) 
			System.out.println( score + " : A���");
		else if(80 <= score)
			System.out.println( score + " : B���");
		else if(70 <= score)
			System.out.println( score + " : C���");
		else if(60 <= score)
			System.out.println( score + " : D���");
		else
			System.out.println( score + " : F���");
			
			
		System.out.println("��������");
	}
}
