package day2;

public class SwitchTest1 {
	public static void main(String[] args) {
		
		int grade = (int)(Math.random()*6)+1;	// 1 ~ 6

		switch (grade) {	//int형(byte, short, char도 가능 int에 속하기 때문), String 형만 가능
			case 1:	//리터럴만 가능. (상수)
			case 2:
			case 3:
				System.out.println(grade + " 학년은 저학년입니다.");
				break;
			default:
				System.out.println(grade + " 학년은 고학년입니다.");
		}
	}
}
