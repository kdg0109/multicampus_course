package day5;

public class MethodTest3 {

	public static void main(String[] args) {
		System.out.println("main() �޼��� ���� ����");
		int result = addNumber();
//		char result = (char)addNumber();
		//�޼��带 ȣ���� ��, �ϳ��� �޼��带 �ι� �̻� ȣ���ϰ� �� ���, ������ ��� ���� ������ �� ������ ��� ����ϴ°� ȿ����
		System.out.println("ȣ�� �����1 : " + result);
		System.out.println("ȣ�� �����2 : " + result);
		System.out.println("ȣ�� �����3 : " + result);
		System.out.println("main() �޼��� ���� ����");
	}
	public static int addNumber(){
		return 28+20;
	}
}
