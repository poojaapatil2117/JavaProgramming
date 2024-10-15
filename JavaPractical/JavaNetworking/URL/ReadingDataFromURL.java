import java.net.URL;
import java.net.URLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.io.IOException;
class ReadingDataFromURL 
{
	public static void main(String[] args)  throws MalformedURLException ,IOException
	{
		//create an URL Object
		URL url = new URL("https://archerinfotech.in/");

		//Open The connection to URL
		URLConnection urlconnection = url.openConnection();

		//get The input Stream from urlConnection.
		BufferedReader reader = new BufferedReader(new InputStreamReader(urlconnection.getInputStream()));

		//read data from URL:
		String inputLine;
		while((inputLine=reader.readLine())!= null)
		{
			System.out.println(inputLine);
		}

		//close the input stream.
		reader.close();
	}
}
