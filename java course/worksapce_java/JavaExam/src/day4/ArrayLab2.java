package day4;

public class ArrayLab2 {
	public static void main(String[] args) {
		char javaArray[ ] = {'J', 'a', 'v', 'a'};
		//�ҹ��� ���� : 97-122
		//�빮�� ���� : 65-90
		String result = "";

		result += "��ȯ�� �迭  : ";
		for(int i = 0; i < javaArray.length; i++){
			/*97, 0x61, 'a' ��� �ҹ��� a�� ��Ī�� 
			�׸��� char���� int �� �����ڴ� �� ū int�� char�� �ڵ� ����ȯ*/
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
