package day10;

import java.util.Random;

interface Drawable {
	public abstract void draw(); // public abstract 자동 추가됨
}

public class DrawableTest {
	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(3);		//0~3까지 랜덤 값
		Drawable d = null;
		if(num == 0)
			d = new Rect();
		else if(num == 1)
			d = new Circle();
		else if(num == 2)
			d = new Diamond();
		output(d);
	}
	public static void output(Drawable d) {
		System.out.println("전달된 객체의 클래스명 : " +  d.getClass().getName());
		d.draw();
	}
}
