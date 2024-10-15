import java.io.*;
import java.net.*;

public class  GreetingClient
{
	public static void main(String[] args) 
	{
		String serverName="localhost";
		int port =1200;

		try
		{
			System.out.println("Connecting to "+serverName+" On port " +port);
			Socket client = new Socket(serverName,port);

			System.out.println("Just Connected to "+client.getRemoteSocketAddress());
			OutputStream outToServer = client.getOutputStream();
			DataOutputStream out = new DataOutputStream(outToServer);

			out.writeUTF("Hello From "+client.getLocalSocketAddress());

			InputStream inFromServer=client.getInputStream();

			DataInputStream in = new DataInputStream(inFromServer);

			System.out.println("Server Says "+in.readUTF());
			client.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
