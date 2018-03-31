package day3;

public class ForLab1 {
	public static void main(String[] args) {
		
		int count = (int)(Math.random()*8)+3;	//난수에 n을 곱한다면 나올 수 있는 최대 수는 n-1
		
		int deco = (int)(Math.random()*3)+1;
		char munja;
		switch (deco) {
		case 1:
			munja = '*';
			break;
		case 2:
			munja = '$';
			break;
		default:
			munja = '#';
		}
		
		for(int i = 1; i <= count; i++){
			System.out.print(munja);
		}
	}
}
