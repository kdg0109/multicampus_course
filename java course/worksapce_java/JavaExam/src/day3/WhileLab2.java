package day3;

public class WhileLab2 {
	public static void main(String[] args) {
		int num;
		int count = 0;
		final char MUNJA = 'A'; //65535������ char ������ �־��� �� �ִ�.
		
		while(true){
			num = (int)(Math.random()*31);
			if(num == 0 || num >= 27){
				break;
			}
			count++;
			System.out.println((char)(MUNJA+num-1) + "(" + num + ")");
		}
		
		System.out.println("����Ƚ���� " + count + " ���Դϴ�");
	}
}
