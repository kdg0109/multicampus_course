package day4;

public class ArrayLab2 {
	public static void main(String[] args) {
		char javaArray[ ] = {'J', 'a', 'v', 'a'};
		//소문자 범위 : 97-122
		//대문자 범위 : 65-90
		String result = "";

		result += "변환된 배열  : ";
		for(int i = 0; i < javaArray.length; i++){
			/*97, 0x61, 'a' 모두 소문자 a를 지칭함 
			그리고 char형과 int 비교 연산자는 더 큰 int로 char를 자동 형변환*/
			if((int)javaArray[i] >= 97 && (int)javaArray[i] <= 122){
				javaArray[i] = (char)(javaArray[i] - 32);
			}else{
				javaArray[i] = (char)(javaArray[i] + 32);
			}
			
			result += javaArray[i];
			
			if(i+1 != javaArray.length){
				result += ", ";
			}
		}
		System.out.println(result);
	}
}
