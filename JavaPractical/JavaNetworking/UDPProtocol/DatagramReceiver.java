import java.net.*;
public class DatagramReceiver 
{
	public static void main(String[] args) 
	{
		try
		{
			//create DatagramSocket to receive the packet on port
			DatagramSocket socket = new DatagramSocket(9876);

			//Preapre buffer to hold the Incomming Data

			byte buffer[] = new byte[1024];

			//create datagram packet to receive the data
			DatagramPacket packet = new DatagramPacket(buffer,buffer.length);

			//recieve the packet
			socket.receive(packet);

			//extract the Data From Packet
			String message = new String(packet.getData(),0,packet.getLength());
			System.out.println("Message Received "+message);

			socket.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
