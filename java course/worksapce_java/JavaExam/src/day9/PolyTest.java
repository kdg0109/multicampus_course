package day9;

public class PolyTest {
	public static void main(String[] args) {
		printObjectInfo(new Object());
		printObjectInfo(new String("가나다"));
		printObjectInfo("ABC");
		printObjectInfo(new java.io.File("c:/"));
		printObjectInfo(new int[10]);
		printObjectInfo(new char[5]);
		printObjectInfo(new Integer(100));
		printObjectInfo(new java.util.Date());
		printObjectInfo(new day6.Student());
		printObjectInfo(1000);
		printObjectInfo(3.14);
		printObjectInfo('가');
		printObjectInfo(true);
	}
	static void printObjectInfo(Object o) {
//		System.out.println(o.toString());
		if(o instanceof String) {
			System.out.println("문자열 객체 : " + o.toString()+"(" + ((String)o).length() + ")");
		}else {
			System.out.println("전달된 객체의 클래스명 : " + o.getClass().getName());
		}
	}
}
