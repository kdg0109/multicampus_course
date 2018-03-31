package day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionReader {
	public static void main(String[] args)  {
		try {
			//이 문자열이 제대로된 문자열인가 URL객체가 확인해줌
			URL u = new URL("http://unico2013.dothome.co.kr/resweb/exam1.html");
			URLConnection uc = u.openConnection();
			//내용 추출
			//InputStream에서 URLConnection 사용 안할 때는 URL을 바로 openStream했었음
			// 단순한 openStream은 바디만 부르는 것. html이런거
			InputStream is = (InputStream)uc.getContent();	//리턴 값이 Object이기 때문에 강제 형변환
			BufferedReader in = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			String inputLine;
			while((inputLine = in.readLine()) != null)
				System.out.println(inputLine);
			//헤더 정보 추출
			System.out.println("Content-type: " + uc.getContentType());
			System.out.println("Date: " + new java.util.Date(uc.getDate()));
			System.out.println("Content-length: " + uc.getContentLength());
		} catch (MalformedURLException e) {
			System.err.println("URL is not a URL I understand");
		} catch (IOException e) {
			System.err.println(e);
		}
	}

}
