package day12;

import java.util.Iterator;
import java.util.LinkedList;

import day8.Friend;

class Person {
	private String name;
	Person(String name) {
		this.name = name;
	}
	
	public String getInfo(){
		return name;
	}
}

public class FriendTestLinkedList {
	public static void main(String[] args) {
		LinkedList<Friend> friends = new LinkedList<>();

		friends.add(new Friend("È«±æµ¿A", "0104567890", "awvsbc@gmail.com"));
		friends.add(new Friend("È«±æµ¿B", "0103245345", "nvqdvd@gmail.com"));
		friends.add(new Friend("È«±æµ¿C", "0108435634", "sdbdsdvc@naver.com"));
		friends.add(new Friend("È«±æµ¿D", "0101276834", "abdsdfc@gmail.com"));
		friends.add(new Friend("È«±æµ¿E", "0103457123", "ase3qbc@gmail.com"));
		System.out.println("ÀÌ¸§	ÀüÈ­¹øÈ£		ÀÌ¸ÞÀÏ");
		System.out.println("-----------------------------------------------------");
		for(Friend result : friends){
			System.out.println(result.getInfo());
		}
//		Iterator<Friend> iter = friends.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next().getInfo());
//		}
	}

}
