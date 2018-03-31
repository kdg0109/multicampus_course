package day8;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class KoreanDay {
	public static String day;		//GregorianCalendar API의 결과 값과 일치 시키기 위하여 
	public static String birth;
	static String korDayName[] = {"", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"	};
	static {
		GregorianCalendar cal = new GregorianCalendar();
		int numDay = cal.get(Calendar.DAY_OF_WEEK);	//일~토   1부터 7까지
		day = korDayName[numDay];
		
		cal.set(Calendar.YEAR, 1991);
		cal.set(Calendar.MONTH, Calendar.JANUARY);
		cal.set(Calendar.DATE, 9);
		
		int birthday = cal.get(Calendar.DAY_OF_WEEK);
		birth = korDayName[birthday];
	}
}
