package NetWorkIO;

import java.net.*;
import java.io.*;

/**
 * Create The Server Class To Listen Client Request
 */
public class ServerSimple1{

	public static void main(String[] args) throws IOException {

		try (ServerSocket serverSocket = new ServerSocket(12345)) {
			System.out.println("Server is listening on port 12345");
			while (true) {
				Socket socket = serverSocket.accept();
				System.out.println("new Client is connected");

				//handling the client connection
				InputStream input = socket.getInputStream();

				BufferedReader reader = new BufferedReader(new InputStreamReader(input));

				String message = reader.readLine();

				System.out.println("Received " + message);

				socket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
