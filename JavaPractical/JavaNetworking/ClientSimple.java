package NetWorkIO;

import java.net.*;
import java.io.*;

public class ClientSimple {

	public static void main(String[] args) {

		String hostname = "localhost";
		int port = 12345;

		try (Socket socket = new Socket(hostname, port)) {
			OutputStream output = socket.getOutputStream();
			PrintWriter printWriter = new PrintWriter(output, true);
			printWriter.println("Hello ,Server");

			InputStream input = socket.getInputStream();

			BufferedReader br = new BufferedReader(new InputStreamReader(input));

			String responce = br.readLine();

			System.out.println("Received " + responce);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
