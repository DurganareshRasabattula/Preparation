package concurrency.chapter6;

import concurrency.annotation.CouldBeHappier;

import java.net.ServerSocket;
import java.net.Socket;



/**
 * 6-1 串行的Web服务器
 */
@CouldBeHappier
public class SingleThreadWebServer extends AbstractWebServer{

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
        ServerSocket socket = new ServerSocket(80);
		while(true) {
			Socket connection = socket.accept();
			handleRequest(connection);
		}
	}
}
