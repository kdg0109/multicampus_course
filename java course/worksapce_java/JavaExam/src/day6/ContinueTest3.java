package day6;

import java.util.Scanner;

/*
 * 사용자가 원할 때 까지, 숫자 입력받고 삼각형을 출력한 후
 * 계속할건지 물어보고 1을 입력하면 계속 수행 2를 입력하면 종료
 */
public class ContinueTest3 {

	public static void main(String[] args) {
		final char DECO_MARK = '$';
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("숫자를 입력하세요 : ");
			int num = scan.nextInt();
			for (int i = 1; i <= num; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(DECO_MARK);
				}
				System.out.println();
			}

			System.out.print("1은 계속, 2는 종료 ");
			num = scan.nextInt();

			if (num == 2){
				System.out.print("종료합니당");
				break;
				}
		}
		scan.close();
		System.out.println("-수행종료-");
	}
}
