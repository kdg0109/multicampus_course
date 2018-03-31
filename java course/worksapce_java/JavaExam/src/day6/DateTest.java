package day6;

//java.lang 제외한 모든 패키지는 import
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class DateTest {
	public static void main(String[] args) {
		Date d = new Date();				//Date.toString은 단순 public 이라서 객체를 만들고 접근해야함.
		System.out.println(d.toString());
		
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.get(Calendar.DAY_OF_MONTH));		//이번달 1일 기준으로 몇 일이냐
		System.out.println(gc.get(Calendar.DAY_OF_YEAR));		//올해 중에 몇일 째이냐
		System.out.println(gc.get(Calendar.DAY_OF_WEEK));		//이번주 일요일 기준으로 몇 번째 요일이냐
		
	}
}