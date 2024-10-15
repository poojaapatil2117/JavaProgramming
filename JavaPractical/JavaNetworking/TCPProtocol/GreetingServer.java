import java.io.*;
import java.net.*;

public class GreetingServer extends Thread
{
	private ServerSocket serverSocket;

	public GreetingServer(int port) throws IOException
	{
		serverSocket = new ServerSocket(port);
	}

	public void run()
	{
		while(true)
		{
			try
			{
				System.out.println("Waiting For Client on port  "+serverSocket.getLocalPort() +"....");
				Socket server = serverSocket.accept();
				System.out.println("Just Connected to "+server.getRemoteSocketAddress());

				DataInputStream input = new DataInputStream(server.getInputStream());

				System.out.println(input.readUTF());

				DataOutputStream output = new DataOutputStream(server.getOutputStream());

				output.writeUTF("Thank You For Connectting to "+server.getLocalSocketAddress()+ "Good Bye");

				server.close();	
			}
			catch (SocketTimeoutException s)
			{
				System.out.println("Socket Timed Out");
				break;
			}
			catch(IOException e)
			{
				e.printStackTrace();
				break;
			}
		}
	}

	public static void main(String[] args) 
	{
		int port=1200;
		try
		{
			Thread t = new GreetingServer(port);
			t.start();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
