package day11;

public class ExceptionTest2 {

	public static void main(String[] args) throws Exception{	//<- ���ܰ� �߻��� ���ɼ��� �ִٶ�� �� �˸�
		System.out.println("�������..");
		try {
			int  num1 = Integer.parseInt(args[0]);
			int  num2 = Integer.parseInt(args[1]);
			int result = num1/num2;
			System.out.println("���� ��� : " + result);
		} catch (ArrayIndexOutOfBoundsException e){ 
			System.out.println("�ΰ��� ���α׷� �ƱԸ�Ʈ�� �Է��ϼ���");
		}/*catch (ArrayIndexOutOfBoundsException e){ 
			System.out.println("�ΰ��� ���α׷� �ƱԸ�Ʈ�� �Է��ϼ���");
		}*/ catch (ArithmeticException e) {		//�޸𸮿��� ���� ��ü�� ����
			System.out.println("�� ��° ���ڴ� 0�� �� �����");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
			return;
		} catch (NumberFormatException e) {
			System.out.println("���ڸ� �Է��ϼ���");
			e.printStackTrace();		//�񵿱���.  == ��Ƽ������ �̰� ȣ��Ǳ� ������ �ٸ� ������ ���۵�
		} finally {
			System.out.println("�� ���� �ݵ�� �����մϴ�");
		}
		System.out.println("��������");
	}
}
