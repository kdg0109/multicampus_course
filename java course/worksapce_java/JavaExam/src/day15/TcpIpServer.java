package day15;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

//서버 부분
public class TcpIpServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println(getTime() + "서버가 준비되었습니다.");
		} catch ( IOException e) { e.printStackTrace(); }
		
		while(true) {
			try {
				System.out.println(getTime() + "연결 요청을 기다립니다.");
				serverSocket.setSoTimeout(5*1000);		//5초간 연결 없으면 서버 종료
				Socket socket  = serverSocket.accept();		//여러 쓰레드에서 해야 멀티가 된다.
				System.out.println(getTime() + socket.getInetAddress() + "로부터 연결요청이 들어왔습니다.");
				
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);

				dos.writeUTF("ㅋㅋ");
				System.out.println(getTime() + "데이터를 전송했습니다.");
				
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
