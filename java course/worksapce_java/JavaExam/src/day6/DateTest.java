package day6;

//java.lang ������ ��� ��Ű���� import
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class DateTest {
	public static void main(String[] args) {
		Date d = new Date();				//Date.toString�� �ܼ� public �̶� ��ü�� ����� �����ؾ���.
		System.out.println(d.toString());
		
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.get(Calendar.DAY_OF_MONTH));		//�̹��� 1�� �������� �� ���̳�
		System.out.println(gc.get(Calendar.DAY_OF_YEAR));		//���� �߿� ���� °�̳�
		System.out.println(gc.get(Calendar.DAY_OF_WEEK));		//�̹��� �Ͽ��� �������� �� ��° �����̳�
		
	}
}