package day8;

public class KoreanDayTest {
	public static void main(String[] args) {
		System.out.print("오늘은 ");
		System.out.print(KoreanDay.day);		//KoreanDay라는 클래스를 부를 때, 그 안의 static 블럭이 먼저 실행된다.
		System.out.print("입니다.");
	}
}
