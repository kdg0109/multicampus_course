package day4;

public class TwoArrayTest1 {
	public static void main(String[] args) {
		int[][] score = new int[5][3];
		System.out.println(score);							//	[[I@15db9742 ���ȣ�� 2��
		System.out.println(score[0]);	//���� �迭����			[I@6d06d69c ���ȣ�� 1��
		System.out.println(score[0][0]);	//���� �����ϴ� ���� �迭����
		
		
		System.out.println(score.length);		//���� �ٶ󺸴� ���� ����
		System.out.println(score[0].length);
		System.out.println(score[0][0]);		//���� �����͸� ������ �ִ� ������ �׷��� length�� ����
	}
}