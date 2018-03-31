package day14;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.*;

import javax.imageio.ImageIO;

public class URLTest3 {
	public static void main(String[] args) {
		try {
			String imageName = "c:/iotest/duke1.jpg";
			URL req = new URL("http://fardamento.netshoes.net/BR/LNetshoes/production/20141031/BADGE/20141031BADGE0014096.jpg");
			InputStream is = req.openStream();			//��ǲ ��Ʈ���� ����Ʈ ��Ʈ��  		1����Ʈ�� �ѱ��� ����
			BufferedImage bi = ImageIO.read(is);
			for(int y = 0; y < bi.getHeight(); y++) {
				for(int x = 0; x < bi.getWidth(); x++) {
					Color color = new Color(bi.getRGB(x,  y));
					int Y = (int) (0.299 * color.getRed() + 0.587 * color.getGreen() + 0.114 * color.getBlue());
					bi.setRGB(x,  y,  new Color(Y, Y, Y).getRGB());
				}
			}
			FileOutputStream fos = new FileOutputStream(imageName);
			ImageIO.write(bi, "JPG",  fos);
			
			fos.close();
			System.out.println(imageName + "�� ���������� �����Ǿ����ϴ�.");
		}catch (MalformedURLException e) {
			System.out.println("URL���ڿ� ���� : " + e.getMessage());
		}catch (IOException e) {
			System.out.println("IO ���� : " + e.getMessage());
		}
	}
}
