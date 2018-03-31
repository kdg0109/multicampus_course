package day3;

public class ForTest7 {
	public static void main(String[] args) {
		int x, y;
		for(x = 1, y = 10; x <= 5 && y >= 5; x++, y--){			//for문 식(초기식;조건식;증감식)은 필요없으면 생략 가능
			System.out.println("x=" + x +", y=" + y);
		}
		System.out.println("종료 : x=" + x +", y=" + y);
	}
}
