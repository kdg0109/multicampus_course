package day4;

public class ArrayTest1 {
	public static void main(String[] args) {
										//char ���� '\u0000' �� default
		int score[ ] = new int[5];		//���������� Ÿ�Կ� ������� �׻� 4����Ʈ
		System.out.println(score);		//[I@15db9742     @�� �������� @ ���� Ÿ�� ����. 
										//@ �ڴ� 16���� ���� �� (5�� ���� ���� �迭�� ���� �ּҰ� = JVM�� �ο��� ���� �ּҰ�)
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		
		
		double score1[ ] = new double[5];
		System.out.println(score1);		//[D@6d06d69c     @�� �������� @ ���� Ÿ�� ����. 
										//@ �ڴ� 16���� ���� �� (5�� ���� ���� �迭�� ���� �ּҰ� = JVM�� �ο��� ���� �ּҰ�)
		System.out.println(score1[0]);
		System.out.println(score1[1]);
		System.out.println(score1[2]);
	
	
		boolean score2[ ] = new boolean[5];	//[Z@7852e922		�ڹٰ� �����ϰ� �ִ� �迭�� ��Ÿ���� ��Ī [Z
		System.out.println(score2);
		System.out.println(score2[0]);
		System.out.println(score2[1]);
		System.out.println(score2[2]);
	}
}
