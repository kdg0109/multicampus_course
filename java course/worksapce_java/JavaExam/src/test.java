
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

	public static void b(String strNum) {		//num : ����, count�� �ڸ���
		String result = "";
		int resultNum =  Integer.parseInt(strNum);
		System.out.println("���� : " + resultNum);
		for(int i = 0; i < strNum.length(); i++) {
			result  += strNum.charAt(i);
			resultNum += Integer.parseInt(strNum.substring(i, i+1));
		}
		System.out.println(result + "//" + resultNum);
	}
}
