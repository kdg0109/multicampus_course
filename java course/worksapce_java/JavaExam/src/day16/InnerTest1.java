package day16;

class Outer {
	void pr() {
		System.out.println("Outer's pr() Method !!");
	}
	
	// ���� �ν��Ͻ� Ŭ����
	class Inner {
		void pr() {
			System.out.println("Inner's pr(); Method !!");
		}
	}
	
	//���� ����ƽ Ŭ����
	static class Static_Inner {
		static void pr() {
			System.out.println("Static_Inner's pr() Method !!");
		}
	}
}

public class InnerTest1 {

	public static void main(String[] args) {
		Outer.Static_Inner.pr();
		Outer o = new Outer();
		o.pr();
		Outer.Inner i = o.new Inner();	//new Outer().new Inner();
		i.pr();
	}
}
