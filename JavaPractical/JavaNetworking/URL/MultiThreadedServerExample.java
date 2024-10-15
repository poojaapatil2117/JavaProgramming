class MultiThreadedServerExample 
{
	public static void main(String[] args) throws IOException
	{
		ServerSocket serverSocket = new ServerSocket(9999);
		System.out.println("Server Listening on port 9999");

		while(true)
		{
			Socket clientSocket = serverSocket.accept();
		}
	}
}
