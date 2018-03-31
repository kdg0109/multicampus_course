package day2;

public class TimeTest {
	public static void main(String[] args) {
		
		int time = 32150;
		int hour, min, sec;
		
		hour = time/3600;
//		min = (time%3600)/60;
//		sec = (time%3600)%60;
		
		time = time%3600;

		min = time%3600/60;
		time = time%60;
		
		sec = time;
			
			
		System.out.println(hour + "시간 " + min + "분 " + sec + "초");
	}
}
