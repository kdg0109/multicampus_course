package day5;

public class MethodTest4 {

	public static void main(String[] args) {
		System.out.println("main() �޼��� ���� ����");
		int result = addNumber();
//		char result = (char)addNumber();
		//�޼��带 ȣ���� ��, �ϳ��� �޼��带 �ι� �̻� ȣ���ϰ� �� ���, ������ ��� ���� ������ �� ������ ��� ����ϴ°� ȿ����
		System.out.println("ȣ�� �����1 : " + result); //("ȣ�� �����1 : " + result) = �ƱԸ�Ʈ
		
		result = addNumber(100, 200, 300);
		System.out.println("ȣ�� �����2 : " + result);
		result = addNumber(1000, 2000);
		System.out.println("ȣ�� �����3 : " + result);
		System.out.println("main() �޼��� ���� ����");
	}
	
	//overloading = �����ε� = �޼��� �ߺ�
	public static int addNumber(){
		return 28+20;
	}
	public static int addNumber(int n1, int n2){		//(int n1, int n2) = �Ű� ����
		return n1 + n2;
	}
	public static int addNumber(int n1, int n2, int n3){
		return n1 + n2 + n3;
	}
}
