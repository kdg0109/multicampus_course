package day2;

public class OperTest3 {
	public static void main(String[] args) {
		double r_value; //		0.0 <= n < 1.0
	
		for(int i = 1; i <= 10; i++){
//			r_value = Math.random()*10;			//10À» °öÇÏ¸é 0 <= n < 10 (°öÇÑ ¼ö -1±îÁö ³ª¿È)
			r_value = Math.random();
			System.out.println(r_value + "\t" + r_value*6 + "\t"+
								(int)((r_value*6)+1));
		}
	}
}
