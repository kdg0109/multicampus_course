package day12;
import java.util.Date;
public class CreateGenericTest {
	public static void main(String[] args) {
		Value1 o1 = new Value1();
		o1.put("abc");
		String s1 = o1.get(); 
		System.out.println(s1);		
		
		Value2 o2 = new Value2();
		o2.put("abc");
		String s2 = (String)o2.get(); 
		System.out.println(s2);

		Value3<String> o3 = new Value3<String>();
//		Value3<String> o3 = new Value3<>();				생성자 뒤에 <> 로 비어있는 꺽쇠로 가능
		o3.put("abc");
		String s3 = o3.get(); 
		System.out.println(s3);	
		
		Value3<Date> o4 = new Value3<Date>();		
		o4.put(new Date());
		Date s4 = o4.get(); 
		System.out.println(s4);	
	}
}
class Value1 {
	String obj;
	void put(String obj){
		this.obj = obj;
	}
	String get() {
		return obj;
	}
}


// 다른 타입도 가능하지만 형 변환을 해줘야함
class Value2 {
	Object obj;
	void put(Object obj){
		this.obj = obj;
	}
	Object get() {
		return obj;
	}
}



// Value3<Card> v = new Value3<Card>();
// Value3<String> v = new Value3<String>();

//Value3를 객체 생성할 때 MY의 형을 선택  		동적으로 생성
class Value3<MY> {
	MY obj;
	void put(MY obj){
		this.obj = obj;
	}
	MY get() {
		return obj;
	}
}













