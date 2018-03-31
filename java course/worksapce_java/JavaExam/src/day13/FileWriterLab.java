package day13;

import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

class KoreanDay {
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

public class FileWriterLab {
	public static void main(String[] args) {

		GregorianCalendar cal = new GregorianCalendar();
		String path = "C:/iotest";
		File isDir = new File(path);
		if(!isDir.exists()) {
			isDir.mkdirs();
		}
		try (FileWriter writer = new FileWriter("c:/iotest/lab_0109.txt");){ 
			writer.write("오늘은 ");
			writer.write(KoreanDay.day);
			writer.write("입니다.");	
			writer.write("\r\n");
			
			
			writer.write("김동건은 ");
			writer.write(KoreanDay.birth);
			writer.write("에 태어났습니다.");	
			System.out.println("수행 종료");
		}catch(IOException ioe) {
			System.out.println("파일로 출력할 수 없습니다.");
		}
	}
}
