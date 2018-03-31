package day12;

import java.util.*;

public class GenericTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();			// < > 를 안주면 모두 Object로 인식하게 된다.
		list.add("java");
		list.add(100);
		list.add("servlet");
		list.add("jdbc");
		/*
		 * 
		 * 인덱스가 필요함
		 * 
		 */
		//get을 이용하여 꺼냄
		for(int i = 0; i < list.size(); i++) 
			System.out.println(list.get(i));
		System.out.println();
		
		/*
		 * 
		 * 인덱스가 필요없음 대신 순서대로 꺼냄
		 * 속도도 get이용해서 꺼내는 것보다 빠름 아~주 큰 차이는 없음
		 * 
		 */
		//내부적으로 Iterator를 사용함
		for(Object value : list) {
			String s = (String)value;
			System.out.println(s);
		}
		System.out.println();
		
		Iterator iter = list.iterator();
		while(iter.hasNext()) {
			String s = (String)iter.next();
			System.out.println(s);
		}
	}
}
