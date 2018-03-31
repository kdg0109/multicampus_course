package day10;

import java.util.Random;

interface Drawable {
	public abstract void draw(); // public abstract �ڵ� �߰���
}

public class DrawableTest {
	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(3);		//0~3���� ���� ��
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
		System.out.println("���޵� ��ü�� Ŭ������ : " +  d.getClass().getName());
		d.draw();
	}
}
