package day2;

public class OperTest2 {
	public static void main(String[] args) {
		
		int su = 10;
		su += 10;	// su = su + 10
		System.out.println(su);
		
		char ch1 = 'A';
		ch1++;		//아스키 코드 1 상승														타입 유지
		System.out.println(ch1);

		ch1 += 5;				//양의 값만 저장할 수 있는 정수형. 문자형에 적합함						타입 유지
		System.out.println(ch1);
		
		ch1 = (char)(ch1 + 10);	//두 항 타입이 다르면 동일한 타입으로 맞추는데 최소 int임 (산술 이항 연산)	  	타입 변경
								//그래서 결과 변수가 int보다 작을 때 형변환 필요
		
		System.out.println(ch1);
		
	}
}
