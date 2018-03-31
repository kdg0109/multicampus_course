package day5;

public class MethodLab1 {
	public static void main(String[] args) {
		int nums[][] = { 
							{ '@', 3 }, 
							{ '%', 4 }, 
							{ 'A', 5 }, 
							{ '°¡', 3 }, 
						};
		for (int i = 0; i < nums.length; i++)	printMunja((char)nums[i][0], nums[i][1]);
	}
	
	public static void printMunja(char cha, int num){
		for(int i = 0; i<num; i++)		System.out.print(cha);
		System.out.println();
	}
}