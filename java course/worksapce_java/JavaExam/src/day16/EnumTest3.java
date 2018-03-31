package day16;

class Tour {
	enum Season {
		SPRING, SUMMER, FALL, WINTER
	}
}
public class EnumTest3 {
	public static void main(String[] args) {
		Tour.Season day[] = Tour.Season.values();
		for(Tour.Season value : day)
			System.out.println(value);
		Tour.Season season = Tour.Season.valueOf("SUMMER");
		System.out.println("Tour.Season.valueof(\"SUMMER\") : " + season);
	}
}