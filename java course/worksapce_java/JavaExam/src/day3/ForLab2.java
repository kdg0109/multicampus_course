package day3;

public class ForLab2 {
	public static void main(String[] args) {

		int resultA = 1;	//¦�� �� Even
		int resultB = 1;	//Ȧ�� �� Odd

		for(int num = 5; num <= 20; num++){			
			if(num%2 == 0){
				resultA *= num;
			}else{
				resultB *= num;
			}
		}

		System.out.println("¦���� �� : " + resultA);
		System.out.print("Ȧ���� �� : " + resultB);
	}
}
