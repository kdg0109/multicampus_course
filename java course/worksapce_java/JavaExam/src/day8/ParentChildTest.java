package day8;
//default�� java.lang.Object
class Parent extends java.lang.Object {
	int x = 1;
	int y = 2;
	//public�� overriding �� ��, �ڽĵ� �Ȱ��� ��ġ ���Ѿ� �� �޼��� ����, ������ ��� ��� overriding�� �Ѻ��Ⱑ ���� �Ȱ�����
	public String toString() {				//�̰� overloading ��. �̸��� �����鼭 ���������� �ٸ���
		return super.toString() + " : Parent Ŭ������ ��ü��!!";
	}
}
class Child extends Parent {
	int x = 10;
	void pr() {
		int x = 100;
		System.out.println(x);			// 100
		System.out.println(this.x);		// 10
		System.out.println(super.x);	// 1
		System.out.println(y);			// 2
		System.out.println(this.y);		// 2
		System.out.println(super.y);	// 2
//		System.out.println(z);			// error ��������, �������, ������� �ϳ��� ����. error
	}
	public String toString() {				//�̰� overloading ��. �̸��� �����鼭 ���������� �ٸ���
		return super.toString() + " : Child Ŭ������ ��ü��!!";
	}
}
public class ParentChildTest {
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.toString());
		System.out.println(p);
		System.out.println("---------------");
		Child c = new Child();
		System.out.println(c.toString());
		System.out.println(c);
		c.pr();
	}

}
