package day3;

public class WhileLab1 {
	public static void main(String[] args) {
		int num = (int)(Math.random()*6)+5;
		int count = 1;
		System.out.println("[ for ��� ]");
		for(; count <= num; count++){
			System.out.println(count + " -> " + count*count);
		}

		System.out.println("[ while ��� ]");
		count = 1;
		while(num >= count){
			System.out.println(count + " -> " + count*count);
			count++;
		}
	}
}
