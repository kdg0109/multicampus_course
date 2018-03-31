package day8;
//default로 java.lang.Object
class Parent extends java.lang.Object {
	int x = 1;
	int y = 2;
	//public을 overriding 할 땐, 자식도 똑같이 일치 시켜야 함 메서드 유형, 접근자 모두 모두 overriding은 겉보기가 완전 똑같은거
	public String toString() {				//이건 overloading 임. 이름이 같으면서 참조변수만 다른거
		return super.toString() + " : Parent 클래스의 객체임!!";
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
//		System.out.println(z);			// error 지역변수, 멤버변수, 조상까지 하나도 없음. error
	}
	public String toString() {				//이건 overloading 임. 이름이 같으면서 참조변수만 다른거
		return super.toString() + " : Child 클래스의 객체임!!";
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
