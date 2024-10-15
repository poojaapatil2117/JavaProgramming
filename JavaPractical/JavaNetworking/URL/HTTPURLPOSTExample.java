import java.io.*;
import java.net.*;
class  HTTPURLPOSTExample
{
	public static void main(String[] args) throws Exception
	{
		//Create The URL Object
		URL url = new URL("https://jsonplaceholder.typicode.com/posts");

		//Open the connection
		HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();

		//Set the Request method to push
		urlConn.setRequestMethod("POST");

		//set Request Headers.
         urlConn.setRequestProperty("User-Agent", "Mozilla/5.0");
         urlConn.setRequestProperty("Content-Type", "application/json; utf-8");
         urlConn.setRequestProperty("Accept", "application/json");

		 //enabling Output Stream
		 urlConn.setDoOutput(true);

		 //create json payload
		 String jsonInputString = "{\"title\":\"foo\",\"body\":\"bar\",\"userId\":1}";

		 //Write the json data to output Stream.
		 try(OutputStream os = urlConn.getOutputStream())
		 {
			byte input[] = jsonInputString.getBytes("utf-8");
			os.write(input,0,input.length);
		 }

		 //get The responce code.
		 int responseCode = urlConn.getResponseCode();
         System.out.println("Response Code: " + responseCode);

		 BufferedReader in = new BufferedReader(new InputStreamReader(urlConn.getInputStream(),"utf-8"));
		 String inputLine;

		 StringBuilder responce= new StringBuilder();

		 while((inputLine = in.readLine())!=null)
		{
			responce.append(inputLine.trim());
		}

		in.close();

		System.out.println("Responce "+responce.toString());
	}
}
