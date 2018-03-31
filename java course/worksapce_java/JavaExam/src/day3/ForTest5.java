package day3;

public class ForTest5 {
	public static void main(String[] args) {
		
/*		int count = (int)(Math.random()*7)+1;
		for(int i = 1; i <= count; i++)
			System.out.print('@');*/
		
		// $
		// $$
		// $$$
		// $$$$
		// $$$$$
		/*for(int line = 1; line <= 5; line++){
			for(int num = 1; num <= line; num++){
				System.out.print('$');
			}
			System.out.println();
		}*/
		
		char munja = 'A';
//		for(int line = 1; line <= 5; line++){
//			for(int num = 1; num <= line; num++){
//				System.out.print(munja++);
//			}
//			System.out.println();
//		}
		
		munja = '가';
		for(int line = 1; line <= 5; line++){
			for(int num = 1; num <= line; num++){
				System.out.print(munja++);
			}
			System.out.println();
		}
		
		/*for (int dan = 1; dan <= 9; dan++) {
			System.out.print(dan + "단 : ");				//9번
			for (int num = 1; num <= 9; num++) {
				System.out.print(dan * num + "\t");		//81번
			}
			System.out.println();						//9번
		}*/
		
	}
}
