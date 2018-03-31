package day13;

import java.io.*;
import java.net.*;

public class URLTest1 {
	public static void main(String[] args) {
		try {
			URL req = new URL("http://www.weather.go.kr/wid/queryDFSRSS.jsp?zone=2823765000");
			InputStream is = req.openStream();			//��ǲ ��Ʈ���� ����Ʈ ��Ʈ��  		1����Ʈ�� �ѱ��� ����
			InputStreamReader isr = new InputStreamReader(is, "UTF-8");				//���ڿ��� �����ͼ� �ѱ� �ȱ���
			BufferedReader br = new BufferedReader(isr);
			while(true) {
//				int data = isr.read();		//�� ���ھ� ����..
				String data = br.readLine();
				if(data == null) 
					break;
//				System.out.print((char)data);
				System.out.print(data);
			}	
		}catch (MalformedURLException e) {
			System.out.println("URL���ڿ� ���� : " + e.getMessage());
		}catch (IOException e) {
			System.out.println("IO ���� : " + e.getMessage());
		}
	}
}
