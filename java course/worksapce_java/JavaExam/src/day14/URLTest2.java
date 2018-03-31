package day14;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class URLTest2 {
	public static void main(String[] args) {
		try {
			String imageName = "c:/iotest/duke.txt";
			URL req = new URL("http://fardamento.netshoes.net/BR/LNetshoes/production/20141031/BADGE/20141031BADGE0014096.jpg");
			InputStream is = req.openStream();			//��ǲ ��Ʈ���� ����Ʈ ��Ʈ��  		1����Ʈ�� �ѱ��� ����
			FileOutputStream fos = new FileOutputStream(imageName);
			int input = 0;
			while(true) {
//				int data = isr.read();		//�� ���ھ� ����..
				input = is.read();
				if(input == -1) 
					break;
				fos.write(input);
			}
			fos.close();
			System.out.println(imageName + "�� ���������� �����Ǿ����ϴ�.");
		}catch (MalformedURLException e) {
			System.out.println("URL���ڿ� ���� : " + e.getMessage());
		}catch (IOException e) {
			System.out.println("IO ���� : " + e.getMessage());
		}
	}
}

