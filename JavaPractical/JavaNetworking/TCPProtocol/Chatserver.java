import java.io.*;
import java.net.*;

class Chatserver 
{
	public static void main(String[] args) 
	{
		try(ServerSocket serverSocket = new ServerSocket(12345))
		{
			System.out.println("Server is Listening on port 1234");

			Socket socket = serverSocket.accept();

			System.out.println("Client is Connected");

			new Thread(new ClientHandler(socket)).start();
		}

		catch(IOException e)
		{
			System.out.println("Server Exception"+e.getMessage());
			e.printStackTrace();
		}
	}
}
class ClientHandler implements Runnable
{
	private Socket socket;

	public ClientHandler(Socket socket)
	{
		this.socket=socket;
	}

	public void run()
	{
		try(
			InputStream input = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			OutputStream output = socket.getOutputStream();
			PrintWriter writer = new PrintWriter(output,true);
		){
			BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

			String text;
			do
			{
				//read message from client:
				text=reader.readLine();
				System.out.println("client :"+text);

				//Server Responce

				if(!text.equalsIgnoreCase("exit"))
				{
					System.out.println("Server :");
					String responce = consoleReader.readLine();
					writer.println(responce);
				}
			}
			while (!text.equalsIgnoreCase("exit"));

			System.out.println("Client is Disconnected");
		}
		catch(IOException e)
		{
			System.out.println("Server Exception :"+e.getMessage());
			e.printStackTrace();
		}
	}
}