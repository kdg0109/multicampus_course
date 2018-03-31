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
			InputStream is = req.openStream();			//인풋 스트림은 바이트 스트림  		1바이트라서 한글은 깨짐
			FileOutputStream fos = new FileOutputStream(imageName);
			int input = 0;
			while(true) {
//				int data = isr.read();		//한 문자씩 읽음..
				input = is.read();
				if(input == -1) 
					break;
				fos.write(input);
			}
			fos.close();
			System.out.println(imageName + "가 성공적으로 생성되었습니다.");
		}catch (MalformedURLException e) {
			System.out.println("URL문자열 오류 : " + e.getMessage());
		}catch (IOException e) {
			System.out.println("IO 오류 : " + e.getMessage());
		}
	}
}

