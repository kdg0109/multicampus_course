package day15;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

//���� �κ�
public class TcpIpServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println(getTime() + "������ �غ�Ǿ����ϴ�.");
		} catch ( IOException e) { e.printStackTrace(); }
		
		while(true) {
			try {
				System.out.println(getTime() + "���� ��û�� ��ٸ��ϴ�.");
				serverSocket.setSoTimeout(5*1000);		//5�ʰ� ���� ������ ���� ����
				Socket socket  = serverSocket.accept();		//���� �����忡�� �ؾ� ��Ƽ�� �ȴ�.
				System.out.println(getTime() + socket.getInetAddress() + "�κ��� �����û�� ���Խ��ϴ�.");
				
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);

				dos.writeUTF("����");
				System.out.println(getTime() + "�����͸� �����߽��ϴ�.");
				
				dos.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	static String getTime() {
		SimpleDateFormat f  = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}

}
