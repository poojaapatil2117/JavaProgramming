// Program to where client send the string to server to convert it to uppercase and send
	// back to client after converting


import java.io.*;
import java.net.*;

public class  UpperCaseServer
{
	public static void main(String[] args) 
	{
		try(ServerSocket serverSocket = new ServerSocket(12345))
		{
			System.out.println("Server is Listning on Port 12345");
			Socket server = serverSocket.accept();
			System.out.println("Client is connected");

			InputStream input = server.getInputStream();

			BufferedReader reader = new BufferedReader(new InputStreamReader(input));

			OutputStream output = server.getOutputStream();

			PrintWriter writer = new PrintWriter(output,true);

			String text;

			do
			{
				text=reader.readLine();
				System.out.println("String Received "+text);

				if(text!=null && !text.equalsIgnoreCase("exit"))
				{
					String Uppercased = text.toUpperCase();
					writer.println(Uppercased);
				}
			}
			while (text!=null && !text.equalsIgnoreCase("exit"));
		}
		catch(IOException ex)
		{
			System.out.println("ServerException "+ex.getMessage());
			ex.printStackTrace();
		}
	}
}
