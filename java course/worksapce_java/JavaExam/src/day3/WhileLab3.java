package day3;

public class WhileLab3 {
	public void main(String[] args) {
		int dan = 9;
		int num;
		while(dan >= 5){
			System.out.print(dan + "´Ü : ");		
			num = 1;
			while(num <= 9){
				System.out.print(dan + "x" + num + "=" + dan * num + "\t");	
				num++;
			}
			System.out.println();	
			dan--;
		}
	}
}
