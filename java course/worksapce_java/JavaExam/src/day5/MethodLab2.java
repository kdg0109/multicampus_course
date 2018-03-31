package day5;

public class MethodLab2 {
	public static void main(String[] args) {
		int num1;
		int num2;
		int result;
		for(int i = 0; i<5; i++){
			num1 = (int)(Math.random()*30)+1;
			num2 = (int)(Math.random()*30)+1;
			result = showMinus(num1, num2);
			System.out.println(num1 + " 와 " + num2 + " 의 차는 " + result + " 입니다.");
		}
	}
	
	public static int showMinus(int num1, int num2){
		if(num1 == num2){			return 0;			}
		else if(num1-num2 > 0){		return num1-num2;	}
		else{						return num2-num1;	}
	}
}