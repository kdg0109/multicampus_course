package day2;

public class OperTest2 {
	public static void main(String[] args) {
		
		int su = 10;
		su += 10;	// su = su + 10
		System.out.println(su);
		
		char ch1 = 'A';
		ch1++;		//�ƽ�Ű �ڵ� 1 ���														Ÿ�� ����
		System.out.println(ch1);

		ch1 += 5;				//���� ���� ������ �� �ִ� ������. �������� ������						Ÿ�� ����
		System.out.println(ch1);
		
		ch1 = (char)(ch1 + 10);	//�� �� Ÿ���� �ٸ��� ������ Ÿ������ ���ߴµ� �ּ� int�� (��� ���� ����)	  	Ÿ�� ����
								//�׷��� ��� ������ int���� ���� �� ����ȯ �ʿ�
		
		System.out.println(ch1);
		
	}
}
