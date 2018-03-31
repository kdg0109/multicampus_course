package day13;

import java.util.Arrays;
import java.util.HashSet;

class Person implements Comparable<Person>{
	String name;
	int age;
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person tmp = (Person)obj;
			return name.equals(tmp.name) && age == tmp.age;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	
	public String toString() {
		return name + ":" + age;
	}
	@Override
	public int compareTo(Person p) {
		int result = -1;
		if(age > p.age)		//아규먼트 더 적은 애를 1로 리턴하겠다  어떤경우에 양인지 음인지에 따라 오름차순 내림차순
			result = 1;
		return result;
	}
}
public class HashSetEx {
	public static void main(String[] args) {
		HashSet<Person> set = new HashSet<Person>();
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		set.add(new Person("Tom", 10));
		set.add(new Person("David", 20));
		set.add(new Person("Jarry", 30));
		System.out.println(set);
		Object ary[] = set.toArray();
		for(Object d : ary)
			System.out.println(d);
		Arrays.sort(ary);
		for(Object d : ary)
			System.out.println(d);
		
		int[] ary1 = {10, 2, 7, 15, 9, 20, 3};
		for(int d : ary1)
			System.out.println(d);
		Arrays.sort(ary1);
		for(int d : ary1)
			System.out.println(d);
		
//		System.out.println("0");
//		Person p1 = new Person("듀크", 22);
//		Person p2 = new Person("듀크", 22);
//		System.out.println(p1.hashCode());
//		System.out.println(p2.hashCode());
//		System.out.println(p1.equals(p2));					//내용은 같지만 각각의 객체를 참조하는 중	 hashCode, equals 사용안했을 때
////		Person p1 = new Person("듀크", 22);
////		System.out.println("2");
//		Person p3 = new Person("턱시", 30);
////		System.out.println(p3.hashCode());
//		System.out.println(p1.equals(p3));
//		Person p4 = p1;	
//		System.out.println(p1.equals(p4));					//동일 객체를 참조하니까  true	hashCode, equals 사용안했을 때
////		System.out.println(set);
	}
}
