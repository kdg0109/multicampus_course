package day5;

public class TwoArrayLab2 {
	public static void main(String[] args) {
		char munja[][] = { 
				{ 'B', 'C', 'A', 'A'},
				{ 'C', 'C', 'B', 'B'},
				{ 'D', 'A', 'A', 'D'},
				};
		int cntA = 0, cntB = 0, cntC = 0, cntD = 0;
		int result[];
		for(char[] row : munja){
			for(char al : row){
				switch (al) {
				case 'A':
					cntA++;
					break;
				case 'B':
					cntB++;
					break;
				case 'C':
					cntC++;
					break;
				default:
					cntD++;
					break;
				}
			}
		}
		result = new int[] { cntA, cntB, cntC, cntD };
		System.out.println("A 는 " + cntA + "개 입니다.");
		System.out.println("B 는 " + cntB + "개 입니다.");
		System.out.println("C 는 " + cntC + "개 입니다.");
		System.out.println("D 는 " + cntD + "개 입니다.");
	}
}