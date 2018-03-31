package day4;

public class ArrayTest1 {
	public static void main(String[] args) {
										//char 형은 '\u0000' 가 default
		int score[ ] = new int[5];		//참조변수는 타입에 상관없이 항상 4바이트
		System.out.println(score);		//[I@15db9742     @를 기준으로 @ 앞이 타입 정보. 
										//@ 뒤는 16진수 참조 값 (5개 방을 갖는 배열의 고유 주소값 = JVM이 부여한 논리적 주소값)
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		
		
		double score1[ ] = new double[5];
		System.out.println(score1);		//[D@6d06d69c     @를 기준으로 @ 앞이 타입 정보. 
										//@ 뒤는 16진수 참조 값 (5개 방을 갖는 배열의 고유 주소값 = JVM이 부여한 논리적 주소값)
		System.out.println(score1[0]);
		System.out.println(score1[1]);
		System.out.println(score1[2]);
	
	
		boolean score2[ ] = new boolean[5];	//[Z@7852e922		자바가 내장하고 있는 배열을 나타내는 명칭 [Z
		System.out.println(score2);
		System.out.println(score2[0]);
		System.out.println(score2[1]);
		System.out.println(score2[2]);
	}
}
