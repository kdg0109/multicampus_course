package day5;

public class MethodTest2 {

	public static void main(String[] args) {
		System.out.println("main() �޼��� ���� ����");
		printMsg('#',"ȣ��1");
		printMsg('@',"ȣ��2");
		printMsg('&',"ȣ��3");
		System.out.println("main() �޼��� ���� ����");
	}
	
	public static void printMsg(char deco, String msg){
		System.out.println(deco+msg+deco);
	}

}
