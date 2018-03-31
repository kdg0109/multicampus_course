package day13;

import java.io.*;
import java.net.*;

public class URLTest1 {
	public static void main(String[] args) {
		try {
			URL req = new URL("http://www.weather.go.kr/wid/queryDFSRSS.jsp?zone=2823765000");
			InputStream is = req.openStream();			//인풋 스트림은 바이트 스트림  		1바이트라서 한글은 깨짐
			InputStreamReader isr = new InputStreamReader(is, "UTF-8");				//문자열을 가져와서 한글 안깨짐
			BufferedReader br = new BufferedReader(isr);
			while(true) {
//				int data = isr.read();		//한 문자씩 읽음..
				String data = br.readLine();
				if(data == null) 
					break;
//				System.out.print((char)data);
				System.out.print(data);
			}	
		}catch (MalformedURLException e) {
			System.out.println("URL문자열 오류 : " + e.getMessage());
		}catch (IOException e) {
			System.out.println("IO 오류 : " + e.getMessage());
		}
	}
}
