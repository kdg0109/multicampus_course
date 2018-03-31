package day4;

public class ArrayLab1 {
	public static void main(String[] args) {
		int nums[ ] = new int[10];
		int sum = 0;
		String result = "";
		
		result += "모든 원소의 값 : ";
		for(int i = 0; i < nums.length; i++){
			nums[i] = (int)(Math.random()*17)+4;
			sum += nums[i];
		
			result += nums[i];
			if(i+1 != nums.length){
				result +=", ";
			}
		}
		result +="\n모든 원소의 합 : " + sum;
		System.out.println(result);
	}
}
