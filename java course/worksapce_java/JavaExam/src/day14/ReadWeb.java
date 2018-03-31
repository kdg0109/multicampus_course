package day14;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ReadWeb {
	public static void main(String[] args) {
		try {
			//입력 값: http://www.12betindia.com/wp-content/uploads/2017/01/EPL-1.jpg
			//디렉토리 확인
			String imageName = "c:/iotest/output/";
			File file = new File(imageName);
			if(!file.exists()) {
				file.mkdirs();
			}
			
			Scanner sc = new Scanner(System.in);
			String strURL = sc.nextLine();
			sc.close();
			//http://unico2013.dothome.co.kr/resweb/exam1.html		
			URL req = new URL(strURL);
			
			InputStream is = req.openStream();
			if(strURL.substring(strURL.lastIndexOf(".")+1, strURL.length()).equals("html")) {
				imageName += strURL.substring(strURL.lastIndexOf("/")+1, strURL.lastIndexOf("html")) + "txt";

				InputStreamReader isr = new InputStreamReader(is, "UTF-8");	
				BufferedReader br = new BufferedReader(isr);
				PrintWriter out = new PrintWriter(imageName, "UTF-8");
				BufferedWriter br1 = new BufferedWriter(out);
				while(true) {
					String data = br.readLine();
					if(data == null) 
						break;
					br1.write(data);
					br1.newLine();
				}	
				br.close();
				br1.close();
				out.close();
			}else {
				//디렉토리 경로에 이미지 명 추가
				imageName += strURL.substring(strURL.lastIndexOf("/"), strURL.length());
			
				FileOutputStream fos = new FileOutputStream(imageName);
				
				int input = 0;
				while(true) {
					input = is.read();
					if(input == -1) 
						break;
					fos.write(input);
				}
				fos.close();
			}
		}catch (MalformedURLException e) {
			System.out.println("URL 오류!!");
		}catch (IOException e) {
			System.out.println("IO 오류!!");
		} 
		
	}
}
