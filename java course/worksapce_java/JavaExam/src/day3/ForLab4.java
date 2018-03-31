package day3;

public class ForLab4 {
	public static void main(String[] args) {

		for (int line = 7; line >= 1; line--) {
			for (int num = 1; num <= line; num++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
