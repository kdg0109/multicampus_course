package day2;

public class IfTest1 {
	public static void main(String[] args) {
		
		int num = (int)(Math.random()*10)+1;		//1���� 10����
		
		if(num%2 != 0)  System.out.println(num + " : Ȧ��");		//� ���� üũ
		else			System.out.println(num + " : ¦��");
		
		System.out.println("��������");
	}
}
