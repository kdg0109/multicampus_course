package day6;

import java.util.Scanner;

/*
	�ﰢ���� ���� ������ �Է¹޴� �κп��� ���� ���� �Ǹ� �ٽ� �Է¹ް� �����Ѵ�.
 */
public class ContinueTest4 {

	public static void main(String[] args) {
		final char DECO_MARK = '$';
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("���ڸ� �Է��ϼ��� : ");
			int num = scan.nextInt();
			
			if(num <= 0)
				continue;		//�ݺ��� ������� �ٽ� �ö�
			
			for (int i = 1; i <= num; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(DECO_MARK);
				}
				System.out.println();
			}

			System.out.print("1�� ���, 2�� ���� ");
			num = scan.nextInt();

			if (num == 2){
				System.out.println("�����մϴ�");
				break;
				}
		}
		scan.close();
		System.out.println("-��������-");
	}
}
