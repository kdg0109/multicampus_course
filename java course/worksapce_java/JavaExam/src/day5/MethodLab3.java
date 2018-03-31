package day5;

public class MethodLab3 {
	public static void main(String[] args) {
		changeMethod(true);
		
/*		int result;
		
		
		for(int i = 0; i<5; i++){
			result = getRandom(10);
			System.out.print(result);
			if(i != 4)
				System.out.print(", ");
		}
		System.out.println();
		for(int i = 0; i<5; i++){
			result = getRandom(10, 20);
			System.out.print(result);
			if(i != 4)
				System.out.print(", ");
		}*/
	}
	
	static void changeMethod(boolean check){
		int result = 0;
		for(int i = 0; i<5; i++){
			if(check)	result = getRandom(10);
			else		result = getRandom(10, 20);
			
			System.out.print(result);
			if(i != 4){				
				System.out.print(", ");		
			}else if(check){		
				System.out.println();
				changeMethod(false);
			}
		}
	}
	
	public static int getRandom(int n){				return (int)(Math.random()*n)+1;		}
	public static int getRandom(int n1, int n2) {		return (int)(Math.random()*(n2-n1+1))+n1;	}
}
