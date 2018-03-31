package day12;

import java.util.*;

public class GenericTestNew {

	public static void main(String[] args) {
//		ArrayList<String> list = new ArrayList<String>();			//명시적으로 <String>을 줌으로써 값을 좀더 확실하게 대입할 수 있음
//		list.add("java");
//		list.add("100");
//		list.add("servlet");
//		list.add("jdbc");
//		/*
//		 * 
//		 * 인덱스가 필요함
//		 * 
//		 */
//		//get을 이용하여 꺼냄
//		for(int i = 0; i < list.size(); i++) 
//			System.out.println(list.get(i));
//		System.out.println();
//		
//		/*
//		 * 
//		 * 인덱스가 필요없음 대신 순서대로 꺼냄
//		 * 속도도 get이용해서 꺼내는 것보다 빠름 아~주 큰 차이는 없음
//		 * 
//		 */
//		//내부적으로 Iterator를 사용함
//		for(String s : list) {
//			System.out.println(s);
//		}
//		System.out.println();
//		
//		Iterator<String> iter = list.iterator();
//		while(iter.hasNext()) {
//			String s = iter.next();
//			System.out.println(s);
//		}
		
		HashSet<String> set = new HashSet<String>();
		set.add("자바");
		set.add("카푸치노");
		set.add("에스프레소");
		set.add("자바");
		for(String abc : set){
			System.out.println(abc);
		}
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()){
			String s = iter.next();
			System.out.println(s);
		}

		for(int i = 0; i < set.size(); i++) {
			System.out.println(set.toArray()[i]);
		}
	}
}
