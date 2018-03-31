
public class test {

	public static void main(String[] args) {
		int num = 1;
		String st = null;
		while(num != 16) {
			st = Integer.toString(num);
			b(st);
			num++;
		}
	}

	public static void b(String strNum) {		//num : 숫자, count는 자릿수
		String result = "";
		int resultNum =  Integer.parseInt(strNum);
		System.out.println("시작 : " + resultNum);
		for(int i = 0; i < strNum.length(); i++) {
			result  += strNum.charAt(i);
			resultNum += Integer.parseInt(strNum.substring(i, i+1));
		}
		System.out.println(result + "//" + resultNum);
	}
}
