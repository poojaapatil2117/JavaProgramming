
import java.io.*;
import java.net.*;

public class  UpperCaseClient
{
	public static void main(String[] args) 
	{
		String hostname="localhost";
		int port=12345;

		try(Socket client = new Socket(hostname,port))
		{
			OutputStream output = client.getOutputStream();
			PrintWriter writer = new PrintWriter(output,true);
			InputStream input = client.getInputStream();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			
			BufferedReader consolereader = new BufferedReader(new InputStreamReader(System.in));

			String text;

			System.out.println("Enter Text (Type 'exit' to quit):");

			do
			{
				text=consolereader.readLine();
				writer.println(text);

				if(!text.equalsIgnoreCase("exit"))
				{
					String responce = reader.readLine();
					System.out.println("From Server "+responce);
				}

			}
			while(!text.equalsIgnoreCase("exit"));
		}
		catch (UnknownHostException ex)
		{
			System.out.println("Server Not Found "+ex.getMessage());
		}
		catch(IOException e)
		{
			System.out.println("IO Error "+e.getMessage());
		}
	}
}
