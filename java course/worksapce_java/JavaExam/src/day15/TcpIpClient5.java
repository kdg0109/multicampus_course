package day15;

import java.io.IOException;
import java.net.Socket;
import java.rmi.ConnectException;

//Ŭ���̾�Ʈ �κ�
public class TcpIpClient5 {
	public static void main(String[] args) {
		try {
			String serverIp = "127.0.0.1";
//			String serverIp = "70.12.114.109";
			Socket socket = new Socket(serverIp, 7777);

			System.out.println("������ ����Ǿ����ϴ�.");
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			
			sender.start();
			receiver.start();
			
		} catch (ConnectException ce) {
			ce.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
