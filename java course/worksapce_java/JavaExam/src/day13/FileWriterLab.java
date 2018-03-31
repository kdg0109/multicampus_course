package day13;

import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

class KoreanDay {
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

public class FileWriterLab {
	public static void main(String[] args) {

		GregorianCalendar cal = new GregorianCalendar();
		String path = "C:/iotest";
		File isDir = new File(path);
		if(!isDir.exists()) {
			isDir.mkdirs();
		}
		try (FileWriter writer = new FileWriter("c:/iotest/lab_0109.txt");){ 
			writer.write("������ ");
			writer.write(KoreanDay.day);
			writer.write("�Դϴ�.");	
			writer.write("\r\n");
			
			
			writer.write("�赿���� ");
			writer.write(KoreanDay.birth);
			writer.write("�� �¾���ϴ�.");	
			System.out.println("���� ����");
		}catch(IOException ioe) {
			System.out.println("���Ϸ� ����� �� �����ϴ�.");
		}
	}
}
