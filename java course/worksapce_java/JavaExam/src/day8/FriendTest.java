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
		friends[0] = new Friend("ȫ�浿A", "0104567890", "awvsbc@gmail.com");
		friends[1] = new Friend("ȫ�浿B", "0103245345", "nvqdvd@gmail.com");
		friends[2] = new Friend("ȫ�浿C", "0108435634", "sdbdsdvc@naver.com");
		friends[3] = new Friend("ȫ�浿D", "0101276834", "abdsdfc@gmail.com");
		friends[4] = new Friend("ȫ�浿E", "0103457123", "ase3qbc@gmail.com");
		System.out.println("�̸�	��ȭ��ȣ		�̸���");
		System.out.println("-----------------------------------------------------");
		for(Friend result : friends){
			System.out.println(result.getInfo());
		}
	}

}
