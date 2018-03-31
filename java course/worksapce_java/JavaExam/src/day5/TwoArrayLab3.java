package day5;

public class TwoArrayLab3 {
	public static void main(String[] args) {
		int munja[][] = { 
				{ 10, 20, 30, 40, 50},
				{ 5, 10, 15},
				{ 11, 22, 33, 44},
				{ 9, 8, 7, 6, 5, 4, 3, 2, 1},
				};
		int resultSum = 0;
		int cnt = 1;
		for(int[] row : munja){
			for(int sum : row){
				resultSum += sum;
			}
			System.out.println(cnt + "행의 합은 " + resultSum + " 입니다.");
			resultSum = 0;
			cnt++;
		}

	}
}