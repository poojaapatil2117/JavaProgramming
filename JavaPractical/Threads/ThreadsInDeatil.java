
// 1.Creating mutiple threads of same thread class
/*
class DemoThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Heloo "+i);
			try{Thread.sleep(700);}catch(Exception e){}
		}
	}
}

class ThreadsInDeatil 
{
	public static void main(String[] args) 
	{
		DemoThread ob = new DemoThread();
		ob.start();

		DemoThread ob1 = new DemoThread();
		ob1.start();
	}
}
*/
//==================================================================================
/*
// 1.Creating threads of Multiple thread classes

class DemoThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello "+i);
			try{Thread.sleep(1000);}catch (Exception e){}
		}
	}
}
class SampleThread extends Thread
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println("Hii "+i);
			try{Thread.sleep(2000);}catch (Exception e){}
		}
	}
}

class ThreadsInDeatil 
{
	public static void main(String[] args) 
	{
		DemoThread D=new DemoThread();
		D.start();

		SampleThread S=new SampleThread();
		S.start();
	}
}

*/
//=============================================================================================

// getting default name of threads
/*
class DemoThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello "+i+" name: "+getName());
			try{Thread.sleep(200);}catch(Exception e){}
		}
	}
}
class SampleThread extends Thread
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println("Hiiii "+i+" name: "+getName());
			try{Thread.sleep(100);}catch(Exception e){}
		}
	}
}
class ThreadsInDeatil 
{
	public static void main(String[] args) 
	{

		DemoThread d = new DemoThread();
		d.start();

		SampleThread s= new SampleThread();
		s.start();

		SampleThread s1= new SampleThread();
		s1.start();
	}
}
*/
//====================================================================================================

// Using setName(), getName(), setPriority(), getPriotity(), getId() and Thread(String)Cnstructer
/*
class DemoThread extends Thread
{
	public DemoThread(String name)
	{
		super(name);
		setPriority(8);
	}

	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println("Id "+getId()+" Hiiii "+i+" name: "+getName()+"Priotity "+getPriority());
			try{Thread.sleep(100);}catch(Exception e){}
		}
	}
}
class SampleThread extends Thread
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println("Id "+getId()+" Hiiii "+i+" name: "+getName()+"Priotity "+getPriority());
			try{Thread.sleep(100);}catch(Exception e){}
		}
	}
}
class ThreadsInDeatil 
{
	public static void main(String[] args) 
	{
		DemoThread d= new DemoThread("HelloThread");
		d.start();

		SampleThread s = new SampleThread();
		s.setName("HiiThread");
		s.setPriority(7);
		s.start();

		SampleThread s1 = new SampleThread();
		s1.setName("AnotherHiiThread");
		s1.setPriority(Thread.MAX_PRIORITY);
		s1.start();
	}
}
*/
//================================================================================

// Using Runnable Interface to create the Threads
/*

class DemoThread implements Runnable
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println(" Hello "+i);
			try{Thread.sleep(100);}catch(Exception e){}
		}
	}
}
class SampleThread implements Runnable
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println(" Hiiii "+i);
			try{Thread.sleep(100);}catch(Exception e){}
		}
	}
}

class ThreadsInDeatil 
{
	public static void main(String[] args) 
	{

		Thread d= new Thread(new DemoThread());
		d.start();

		Thread s=new Thread(new SampleThread());
		s.start();
	}
}
*/
//=================================================

//Using CurrentThread:

class SampleThread implements Runnable
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			Thread t = Thread.currentThread();
			System.out.println(" Hiiii "+i+" Name: "+t.getName()+" Priority: "+t.getPriority());
			try{Thread.sleep(100);}catch(Exception e){}
		}
	}
}

class ThreadsInDeatil 
{
	public static void main(String[] args) 
	{

		SampleThread p=new SampleThread();
		Thread t =new Thread(p);
		t.setName("HeyThread");
		t.setPriority(8);
		t.start();

		Thread s=new Thread(new SampleThread());
		s.setName("HelloThread");
		s.setPriority(4);
		s.start();
	}
}
