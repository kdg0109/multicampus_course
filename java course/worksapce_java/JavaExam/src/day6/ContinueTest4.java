package day6;

import java.util.Scanner;

/*
	삼각형의 행의 갯수를 입력받는 부분에서 음의 값이 되면 다시 입력받게 변경한다.
 */
public class ContinueTest4 {

	public static void main(String[] args) {
		final char DECO_MARK = '$';
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("숫자를 입력하세요 : ");
			int num = scan.nextInt();
			
			if(num <= 0)
				continue;		//반복문 상단으로 다시 올라감
			
			for (int i = 1; i <= num; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(DECO_MARK);
				}
				System.out.println();
			}

			System.out.print("1은 계속, 2는 종료 ");
			num = scan.nextInt();

			if (num == 2){
				System.out.println("종료합니당");
				break;
				}
		}
		scan.close();
		System.out.println("-수행종료-");
	}
}
