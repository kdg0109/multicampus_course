package day8;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class KoreanDay {
	public static String day;		//GregorianCalendar API�� ��� ���� ��ġ ��Ű�� ���Ͽ� 
	public static String birth;
	static String korDayName[] = {"", "�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����"	};
	static {
		GregorianCalendar cal = new GregorianCalendar();
		int numDay = cal.get(Calendar.DAY_OF_WEEK);	//��~��   1���� 7����
		day = korDayName[numDay];
		
		cal.set(Calendar.YEAR, 1991);
		cal.set(Calendar.MONTH, Calendar.JANUARY);
		cal.set(Calendar.DATE, 9);
		
		int birthday = cal.get(Calendar.DAY_OF_WEEK);
		birth = korDayName[birthday];
	}
}
