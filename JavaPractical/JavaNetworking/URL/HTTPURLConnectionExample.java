import java.net.URL;
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class HTTPURLConnectionExample
{
	public static void main(String[] args) throws Exception 
	{
		//Create the URL Object
		URL url = new URL("https://jsonplaceholder.typicode.com/posts");

		//Open Connection to the URL
		HttpURLConnection urlCon = (HttpURLConnection) url.openConnection();

		//Set the Request Method
		urlCon.setRequestMethod("GET");

		//set Request Header
		urlCon.setRequestProperty("User-Agent", "Mozilla/5.0");

		//get the Responce code
		int responceCode = urlCon.getResponseCode();
		System.out.println("Responce Code "+responceCode);

		//read the responce
		BufferedReader reader = new BufferedReader(new InputStreamReader(urlCon.getInputStream()));
		String inputLine;
		StringBuffer responce = new StringBuffer();

		while((inputLine = reader.readLine())!=null)
		{
			responce.append(inputLine);
		}

		reader.close();


		//print the Responce
		System.out.println("Responce = "+responce.toString());
	}
}
