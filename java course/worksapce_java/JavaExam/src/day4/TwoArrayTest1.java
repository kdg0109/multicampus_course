package day4;

public class TwoArrayTest1 {
	public static void main(String[] args) {
		int[][] score = new int[5][3];
		System.out.println(score);							//	[[I@15db9742 대괄호가 2개
		System.out.println(score[0]);	//행의 배열까지			[I@6d06d69c 대괄호가 1개
		System.out.println(score[0][0]);	//행이 참조하는 열의 배열까지
		
		
		System.out.println(score.length);		//행을 바라보는 참조 변수
		System.out.println(score[0].length);
		System.out.println(score[0][0]);		//실제 데이터를 가지고 있는 변수임 그래서 length가 없음
	}
}