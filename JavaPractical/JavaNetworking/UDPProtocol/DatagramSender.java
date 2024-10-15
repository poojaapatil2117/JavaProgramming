import java.net.InetAddress;
import java.net.*;
public class DatagramSender 
{
	public static void main(String[] args) 
	{
		try
		{
			//Create Datagram Socket
			DatagramSocket socket = new DatagramSocket();

			//prepare data to sent
			String message = "Hello This is Text Messaage";
			byte buffer[]= message.getBytes();

			//get the destination address
			InetAddress receiverAddress = InetAddress.getByName("localhost");
			int receiverPort = 9876;

			//Create Datagram packet to sent.
			DatagramPacket packet = new DatagramPacket(buffer,buffer.length,receiverAddress,receiverPort);

			//send The Packet
			socket.send(packet);
			System.out.println("Message Sent " + message);

			//close the Socket
			socket.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
