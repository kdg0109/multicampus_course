package day8;

class A {
	A() {
		super();
		System.out.println("AŬ������ ��ü ����");
	}
}
class B extends A {
	B(int num) {
		System.out.println("BŬ������ ��ü ����");
	}
	
}
class C extends B {			//this ȣ�� �ϰ� �ִ� �ִ� ���� �޼��带 �Ȱ�
	C() {
		super(10);					//���� �°� 
		System.out.println("CŬ������ ��ü ����");
	}
}
public class ABCTest {			//��� ������ �޼���� this ȣ�� �����ϰ� ȣ����� ���� ���� �޼��带 ȣ����.
	public static void main(String[] args) {
		new C();		//new C -> C �� �ν��Ͻ��� �����Ͽ���		-> C�� ������ Ŭ������ ȣ�� ������� �θ� �����ڵ� �� ���� ��� ����
						//�ֻ��� Ŭ�������� �������ϰ� ������
	}
}
