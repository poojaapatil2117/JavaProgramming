/*
	If the URL supports writing (e.g., HTTP POST requests), 
	you can write data to the URL using the getOutputStream() method 
	of the URLConnection class.
*/

import java.io.OutputStream;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.io.IOException;

class WritingDataToURL 
{
	public static void main(String[] args) throws IOException
	{
		//Create the URL Object
		URL url = new URL("http://www.example.com/post");

		//Open the connection for URL 
		URLConnection urlConn = url.openConnection();

		//Enable the Output For Connection
		urlConn.setDoOutput(true);

		//Write The Data To URL
		OutputStream outputStream = urlConn.getOutputStream();
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
		writer.write("Param1 = value1 & Param2 = Value2");
		writer.flush();
		writer.close();
	}
}
