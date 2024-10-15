import java.io.*;
import java.net.*;


class ChatClient
{
	public static void main(String[] args) 
	{
		String hostname="localhost";
		int port =12345;

		try(Socket socket = new Socket(hostname,port))
		{
			OutputStream output = socket.getOutputStream();
			PrintWriter writer = new PrintWriter(output,true);
			InputStream input = socket.getInputStream();

			BufferedReader reader = new BufferedReader(new InputStreamReader(input));

			BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

			new Thread(new ServerHandler(reader)).start();

			System.out.println("Enter text (typer 'exit' to quit");

			String text ;
			do
			{
				System.out.println("Client");
				text = consoleReader.readLine();
				writer.println(text);
			}
			while(!text.equalsIgnoreCase("exit"));
		}
		catch(UnknownHostException e)
		{
			System.out.println("Server Not Found "+e.getMessage());
		}
		catch(IOException ex)
		{
			System.out.println("IOError "+ex.getMessage());
		}
	}
}

class ServerHandler implements Runnable
{
	private BufferedReader reader;

	public ServerHandler(BufferedReader reader)
	{
		this.reader=reader;
	}

	public void run()
	{
		try
		{
			String responce;
			while((responce=reader.readLine())!=null)
			{
				System.out.println("Server "+responce);
			}
		}catch(IOException e)
		{
			System.out.println("Server Handler Exception"+e.getMessage());
			e.printStackTrace();
		}
	}
}
