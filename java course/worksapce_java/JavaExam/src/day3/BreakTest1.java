package day3;

public class BreakTest1 {
	public static void main(String[] args) {
		System.out.println("구구단");
		
		abc : for (int dan = 1; dan <= 9; dan++) {
			System.out.print(dan + "단 : ");				//	9번
			for (int num = 1; num <= 9; num++) {
				if(dan * num > 30)
					break abc;			//	기본 break 가장 가까운 반복문만 빠져 나간다. 따라서 라벨이 붙어있는 반복문 빠져나가 
										//	Java만 가능 goto는 지원 안함
				System.out.print(dan * num + "\t");		//	81번
				
			}
			System.out.println();						//	9번
			
		}
	}
}
