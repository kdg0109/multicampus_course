package day8;
class Person {
	private String name;
	Person(String name) {
		this.name = name;
	}
	Person( ) {
	}
	public String getInfo(){
		return name;
	}
}
public class FriendTest {
	public static void main(String[] args) {
		Friend[] friends = new Friend[5];
		friends[0] = new Friend("홍길동A", "0104567890", "awvsbc@gmail.com");
		friends[1] = new Friend("홍길동B", "0103245345", "nvqdvd@gmail.com");
		friends[2] = new Friend("홍길동C", "0108435634", "sdbdsdvc@naver.com");
		friends[3] = new Friend("홍길동D", "0101276834", "abdsdfc@gmail.com");
		friends[4] = new Friend("홍길동E", "0103457123", "ase3qbc@gmail.com");
		System.out.println("이름	전화번호		이메일");
		System.out.println("-----------------------------------------------------");
		for(Friend result : friends){
			System.out.println(result.getInfo());
		}
	}

}
