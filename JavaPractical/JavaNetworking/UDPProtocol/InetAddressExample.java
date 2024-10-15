
import java.net.InetAddress;
import java.net.UnknownHostException;
public class InetAddressExample 
{
	public static void main(String[] args) 
	{
		try
		{
			//Get InetAddress for Host Name
		
			System.out.println("----------Get InetAddress for Host Name (GetByName) -----------\n");
			InetAddress inetAddress = InetAddress.getByName("www.google.com");
			System.out.println("Host Name : "+inetAddress.getHostName());
			System.out.println("Host IPAddress : "+inetAddress.getHostAddress());
			System.out.println("Canonical Host Name : "+inetAddress.getCanonicalHostName());

			//Get InetAddress(IP Address) for Local Host

			System.out.println("\n----------Get InetAddress(IP Address) for Local Host-----------\n");
			InetAddress localAddress = InetAddress.getLocalHost();
			System.out.println("Local Host Name :"+localAddress.getHostName());
			
			System.out.println("Local Host Address :"+localAddress.getHostAddress());

			//Cheak If an Address is Reachable
			boolean reachable= inetAddress.isReachable(5000); //argument 5000 specifies the timeout in milisecouds.
			System.out.println(" Is Reachable? "+reachable);

			//Get All IP addresses for a Host Name
			//If One Domain Have Multiple Address
			
			InetAddress allAddress[] = InetAddress.getAllByName("www.google.com");
			System.out.println("");
			System.out.println("---------Get All IP addresses for a Host Name---------");
			for(InetAddress i : allAddress)
			{
				System.out.println("All Addresses "+i.getHostAddress());
			}

		}
		catch(UnknownHostException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
