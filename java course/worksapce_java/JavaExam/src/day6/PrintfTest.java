package day6;

import java.text.DecimalFormat;

public class PrintfTest {
	public static void main(String[] args) {
		System.out.printf("�׽�Ʈ�Դϴ�%n");						//%n�� �����ϰ� �׳� ���� \n�� ���� \n���°� �� ����
		System.out.printf("%d %x %o %c\n", 100, 100, 100, 100);	//%x 16���� %o 8����
		System.out.printf("%c %c %c %c\n", '��', 'A', '!', '3');
		System.out.printf("%b\n",  true);
		System.out.printf("%f %e\n",  100.0, 100.0);			//%f ���� �Ҽ��� �� .���� 6�ڸ�����
		System.out.printf("%.2f\n",  123.5678);
		System.out.printf("|%s|\n","�ڹ�");
		System.out.printf("|%10s|\n", "�ڹ�");
		System.out.printf("|%-10s|\n", "�ڹ�");
		System.out.printf("%,d��\n", 1000000);
		
		
		double num = 29600000;  // "��õ�������ʸ�" �̶�� ���ڸ� ����
	    DecimalFormat df = new DecimalFormat("#,##0.00");
	    String don = df.format(num);
//	    double abc = Double.parseDouble(don);
	    System.out.println(don);
		
//		Scanner scan = new Scanner(System.in);
	}

}
