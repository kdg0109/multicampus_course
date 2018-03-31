package day2;

/**
 * 
 * && 사용
 *
 */
public class OperLabAnd {
	public static void main(String[] args) {
		
		int grade = (int)(Math.random()*6)+1;	// 1 ~ 6

		if(grade >= 1 && grade <= 3)
			System.out.println(grade + " 학년은 저학년입니다.");
		else
			System.out.println(grade + " 학년은 고학년입니다.");
			
	}
}
