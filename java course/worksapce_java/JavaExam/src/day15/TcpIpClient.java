package day15;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.rmi.ConnectException;

//클라이언트 부분
public class TcpIpClient {
	public static void main(String[] args) {
		try {
			String serverIp = "127.0.0.1";
//			String serverIp = "70.12.114.109";
			System.out.println("서버에 연결 중입니다. 서버IP : " + serverIp);
			// 소켓을 생성하여 연결을 요청한다.
			Socket socket = new Socket(serverIp, 7777);
			
			InputStream in = socket.getInputStream();
			DataInputStream dis  = new DataInputStream(in);
			System.out.println("서버로부터 받은 메시지 : " + dis.readUTF());
			System.out.println("연결을 종료합니다.");
			
			dis.close();
			socket.close();
			System.out.println("연결이 종료되었습니다.");
		} catch (ConnectException ce) {
			ce.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
