package day8;

class A {
	A() {
		super();
		System.out.println("A클래스의 객체 생성");
	}
}
class B extends A {
	B(int num) {
		System.out.println("B클래스의 객체 생성");
	}
	
}
class C extends B {			//this 호출 하고 있는 애는 조상 메서드를 안감
	C() {
		super(10);					//조상에 맞게 
		System.out.println("C클래스의 객체 생성");
	}
}
public class ABCTest {			//모든 생성자 메서드는 this 호출 제외하고 호출되자 마자 조상 메서드를 호출함.
	public static void main(String[] args) {
		new C();		//new C -> C 의 인스턴스를 생성하여라		-> C의 생성자 클래스를 호출 상속해준 부모 생성자도 다 돌림 모두 돌림
						//최상위 클래스부터 마무리하고 내려감
	}
}
