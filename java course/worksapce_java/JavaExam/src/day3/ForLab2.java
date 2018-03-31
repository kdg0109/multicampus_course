package day3;

public class ForLab2 {
	public static void main(String[] args) {

		int resultA = 1;	//Â¦¼ö °ö Even
		int resultB = 1;	//È¦¼ö °ö Odd

		for(int num = 5; num <= 20; num++){			
			if(num%2 == 0){
				resultA *= num;
			}else{
				resultB *= num;
			}
		}

		System.out.println("Â¦¼öÀÇ °ö : " + resultA);
		System.out.print("È¦¼öÀÇ °ö : " + resultB);
	}
}
