package day4;

public class ArrayLab3 {
	public static void main(String[] args) {
		int numArray[ ] = new int[10];
		char charArray[ ] = new char[10];
		String resultNum = "", resultChar = "";
		
		for(int i = 0; i < numArray.length; i++){
			numArray[i] = (int)(Math.random()*26)+1;	
			charArray[i] = (char)(numArray[i] + 64);	
			
			resultNum += numArray[i];
			resultChar += charArray[i];
			
			if(i+1 != numArray.length){
				resultNum += ", ";
				resultChar += ", ";
			}
		}
		
		System.out.println(resultNum + "\n" + resultChar);
	}
}
