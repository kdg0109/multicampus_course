package day2;

public class SwitchTest1 {
	public static void main(String[] args) {
		
		int grade = (int)(Math.random()*6)+1;	// 1 ~ 6

		switch (grade) {	//int��(byte, short, char�� ���� int�� ���ϱ� ����), String ���� ����
			case 1:	//���ͷ��� ����. (���)
			case 2:
			case 3:
				System.out.println(grade + " �г��� ���г��Դϴ�.");
				break;
			default:
				System.out.println(grade + " �г��� ���г��Դϴ�.");
		}
	}
}
