import java.net.*;
class URLExample 
{
	public static void main(String[] args) 
	{
		try
		{
			//create a URL Object.
			URL url = new URL("https://gemini.google.com :8080/app?utm_source=sem&utm_medium=paid-media&utm_campaign=q4enIN_sem7&gclid=Cj0KCQiA35urBhDCARIsAOU7QwmroDyX-Me8RkzHilOXYwnCyAFr9Pr08yhp8l4oFTxR40PrtA0pd_IaAoyiEALw_wcB");
			
			//print part of URL.
			System.out.println("Give Protocol "+url.getProtocol());
			System.out.println("Give Host "+url.getHost());
			System.out.println("Give Port "+url.getPort());
			System.out.println("Give Path "+url.getPath());
			System.out.println("Give Query "+url.getQuery());
			System.out.println("Give Fragment "+url.getRef());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
