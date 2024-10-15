/* With ThreadSharedResources
class Message
{
	public void ShowMessage()
	{
		System.out.println("Hello");
		System.out.println("how");
		System.out.println("are");
		System.out.println("you?");
		try{Thread.sleep(400);}catch(Exception e){}
		System.out.println("all");
		System.out.println("the");
		System.out.println("best");
		System.out.println("-----------");
	}
}

class Friends extends Thread
{
	Message msg;

	public Friends(Message msg)
	{
		this.msg=msg;
	}

	public void run()
	{
		for(int i=0;i<3;i++)
		{
			msg.ShowMessage();
			try{Thread.sleep(400);}catch(Exception e){}
		}
		
	}
}
class Relatives extends Thread
{
	Message msg;

	public Relatives(Message msg)
	{
		this.msg=msg;
	}

	public void run()
	{
		for(int i=0;i<3;i++)
		{
			msg.ShowMessage();
			try{Thread.sleep(400);}catch(Exception e){}
		}
		
	}
}

class ThreadSharedResources 
{
	public static void main(String[] args) 
	{
		Message m=new Message();

		Friends ob1=new Friends(m);
		ob1.start();

		Relatives ob2 = new Relatives(m);
		ob2.start();

	}
}
*/
//=============================================================================================

//without ThreadSharedResources

class Message
{
	synchronized public void ShowMessage()
	{
		System.out.println("Hello");
		System.out.println("how");
		System.out.println("are");
		System.out.println("you?");
		try{Thread.sleep(400);}catch(Exception e){}
		System.out.println("all");
		System.out.println("the");
		System.out.println("best");
		System.out.println("-----------");
	}
}

class Friends extends Thread
{
	Message msg;

	public Friends(Message msg)
	{
		this.msg=msg;
	}

	public void run()
	{
		for(int i=0;i<3;i++)
		{
			msg.ShowMessage();
			try{Thread.sleep(400);}catch(Exception e){}
		}
		
	}
}
class Relatives extends Thread
{
	Message msg;

	public Relatives(Message msg)
	{
		this.msg=msg;
	}

	public void run()
	{
		for(int i=0;i<3;i++)
		{
			msg.ShowMessage();
			try{Thread.sleep(400);}catch(Exception e){}
		}
		
	}
}

class ThreadSharedResources 
{
	public static void main(String[] args) 
	{
		Message m=new Message();

		Friends ob1=new Friends(m);
		ob1.start();

		Relatives ob2 = new Relatives(m);
		ob2.start();

	}
}
