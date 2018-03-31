package day2;

public class ConditionOperTest {
	public static void main(String[] args) {
		
		int num = (int)(Math.random()*5)+1;	// 1 ~ 5
		int result;
		
		if(num == 1)
			result = 300 + 50;
		else if(num == 2)
			result = 300 - 50;
		else if(num == 3)
			result = 300 * 50;
		else if(num == 4)
			result = 300 / 50;
		else
			result = 300 % 50;
			
			
		System.out.println("°á°ú°ª :" + result);
	}
}
