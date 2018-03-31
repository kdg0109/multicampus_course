package day6;

public class MethodLab6 {
	public static void main(String[] args) {
		char[] a1 = {'A', 'b', 'C'};
		char[] a2 = {'a', 'b', 'c', 'D', 'E', 'F'};
		char[] a3 = {'z', 'S', 'Z', 'S'};
		printChars(a1, true, false);
		convertChar(a1);
		printChars(a1, false, false);
		
		printChars(a2, true, false);
		convertChar(a2);
		printChars(a2, false, false);
		
		printChars(a3, true, false);
		convertChar(a3);
		printChars(a3, false, true);
		
	}
	
	public static void convertChar(char[] array){
		for(int i = 0; i < array.length; i++){
			if(array[i] <= 90){
				array[i] += 32;
			}else{
				array[i] -= 32;
			}
		}
	}
	
	public static void printChars(char array[], boolean check, boolean finishCheck){
		if(check){
			System.out.println("-------------");
			System.out.print("호출전 : ");
		}else{
			System.out.print("호출후 : ");
		}
		if(array.length == 0){
			System.out.println("원소가 없음");
			return;
		}
		for(char a : array)
			System.out.print(a);
		System.out.println();
		
		if(finishCheck)
			System.out.println("-------------");
		//return
	}

}