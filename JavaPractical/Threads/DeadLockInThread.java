
// The Deadlock in synchronization -  Reader-Writer Problem.
/*

import java.util.Random;
class Message
{
	private String message;
	boolean empty=true;

	public synchronized String read()
	{
		while(empty)
		{
			System.out.println("Waiting For Write:");
			try{Thread.sleep(1000);}catch(Exception e){}
		}
		
		empty=true;
		return message;
	}

	public synchronized void write(String message)
	{
		while(!empty)
		{
			System.out.println("Wait for Read:");
			try{Thread.sleep(1000);}catch(Exception e){}
		}
		this.message = message;
		empty=false;
	}
}

class reader implements Runnable
{
	private Message message;

	public reader(Message message)
	{
		this.message = message;
	}
	public void run()
	{
		Random random =new Random();

		for(String LastString=message.read();!"Finished:".equals(LastString);LastString=message.read())
		{
			System.out.println(LastString);
			try{Thread.sleep(random.nextInt(2000));}catch(Exception e){}
		}
		
	}
}
class writer implements Runnable
{
	private Message message;
	public writer(Message message)
	{
		this.message = message;
	}
	public void run()
	{
		String Msg[]={"Johnny, Johnny, Yes Papa",
               		 "Eating sugar? No, Papa!",
                	"Telling lies? No, Papa!",
                	"Open your mouth, Ha! Ha! Ha!"};

		Random random=new Random();

		for (int i=0;i<Msg.length;i++)
		{
			message.write(Msg[i]);
			try{Thread.sleep(random.nextInt(2000));}catch(Exception e){}
		}

		message.write("Finished:");
	}
	
}

class DeadLockInThread 
{
	public static void main(String[] args) 
	{
		Message ob = new Message();
		

		Thread t1 = new Thread(new writer(ob));
		Thread t2 = new Thread(new reader(ob));

		t1.start();
		t2.start();
	}
}

//---------- Output ----------
Johnny, Johnny, Yes Papa
Eating sugar? No, Papa!
Waiting For Write:
Waiting For Write:
Waiting For Write:
Waiting For Write:
Waiting For Write:
Waiting For Write:
Waiting For Write:

it Gives Random Output infinity Times...........

*/

//=================================================================================



import java.util.Random;
class Message
{
	private String message;
	boolean empty=true;

	public synchronized String read()
	{
		while(empty)
		{
			try{wait();}catch(Exception e){}
		}
		notifyAll();
		empty=true;
		return message;
	}

	public synchronized void write(String message)
	{
		while(!empty)
		{
			try{wait();}catch(Exception e){}
		}
		notifyAll();
		this.message = message;
		empty=false;
	}
}

class reader implements Runnable
{
	private Message message;

	public reader(Message message)
	{
		this.message = message;
	}
	public void run()
	{
		Random random =new Random();

		for(String LastString=message.read();!"Finished:".equals(LastString);LastString=message.read())
		{
			System.out.println(LastString);
			try{Thread.sleep(random.nextInt(2000));}catch(Exception e){}
		}
		
	}
}
class writer implements Runnable
{
	private Message message;
	public writer(Message message)
	{
		this.message = message;
	}
	public void run()
	{
		String Msg[]={"Johnny, Johnny, Yes Papa",
               		 "Eating sugar? No, Papa!",
                	"Telling lies? No, Papa!",
                	"Open your mouth, Ha! Ha! Ha!"};

		Random random=new Random();

		for (int i=0;i<Msg.length;i++)
		{
			message.write(Msg[i]);
			try{Thread.sleep(random.nextInt(2000));}catch(Exception e){}
		}

		message.write("Finished:");
	}
	
}

class DeadLockInThread 
{
	public static void main(String[] args) 
	{
		Message ob = new Message();
		

		Thread t1 = new Thread(new writer(ob));
		Thread t2 = new Thread(new reader(ob));
		Thread t3 = new Thread(new reader(ob));

		t1.start();
		t2.start();
		t3.start();
	}
}

//---------------- output on run -----------------
/*
Johnny, Johnny, Yes Papa
Eating sugar? No, Papa!
Telling lies? No, Papa!
Open your mouth, Ha! Ha! Ha!
Press any key to continue . . .*/
