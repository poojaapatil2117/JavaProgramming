//Using Thread ThreadGroup

class FirstThread extends Thread
{
	public FirstThread(ThreadGroup tg,String name)
	{
		super(tg,name);
	}
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println(Thread.currentThread());
			try{Thread.sleep(300);}catch(Exception e){}
		}
	}
		
}

class SecoundThread extends Thread
{
	
	public SecoundThread(ThreadGroup tg,String name)
	{
		super(tg,name);
	}
	public void run()
	{
		for(int i=0;i<40;i++)
		{
			System.out.println(Thread.currentThread());
			try{Thread.sleep(300);}catch(Exception e){}
		}
	}
}
class ThirdThread extends Thread
{
	
	public ThirdThread(ThreadGroup tg,String name)
	{
		super(tg,name);
	}
	public void run()
	{
		for(int i=0;i<40;i++)
		{
			System.out.println(Thread.currentThread());
			try{Thread.sleep(300);}catch(Exception e){}
		}
	}
		
}

class ThreadThreadGroup
{
	public static void main(String[] args) 
	{

		ThreadGroup tg=new ThreadGroup("MyThreadGroup");

		FirstThread f = new FirstThread(tg,"one");
		f.start();

		SecoundThread s = new SecoundThread(tg,"Two");
		s.start();

		ThirdThread t = new ThirdThread(tg,"Third");
		t.start();

		for(int i=0;i<40;i++)
		{
			System.out.println("Active Thread Count: "+tg.activeCount());
			System.out.println(Thread.currentThread());
			try{Thread.sleep(400);}catch(Exception e){}
		}
	}
}

//=================================================================
/*
//Using Runnable ThreadGroup

class FirstThread implements Runnable
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println(Thread.currentThread());
			try{Thread.sleep(300);}catch(Exception e){}
		}
	}
		
}

class SecoundThread implements Runnable
{
	public void run()
	{
		for(int i=0;i<40;i++)
		{
			System.out.println(Thread.currentThread());
			try{Thread.sleep(300);}catch(Exception e){}
		}
	}
}
class ThirdThread implements Runnable
{
	public void run()
	{
		for(int i=0;i<40;i++)
		{
			System.out.println(Thread.currentThread());
			try{Thread.sleep(300);}catch(Exception e){}
		}
	}
		
}

class ThreadThreadGroup
{
	public static void main(String[] args) 
	{

		ThreadGroup tg=new ThreadGroup("MyThreadGroup");

		Thread f = new Thread(tg,new FirstThread());
		f.setName("One");
		f.start();

		Thread s = new Thread(tg,new SecoundThread());
		s.setName("Two");
		s.start();

		Thread t = new Thread(tg,new ThirdThread());
		t.setName("Thrird");
		t.start();

		for(int i=0;i<40;i++)
		{
			System.out.println("Active Thread Count: "+tg.activeCount());
			System.out.println(Thread.currentThread());
			try{Thread.sleep(400);}catch(Exception e){}
		}
	}
}
*/
//======================================================================================
/*

class FirstThread extends Thread
{
	public FirstThread(String name)
	{
		super(name);
	}
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println(Thread.currentThread()+" - "+i);
			try{Thread.sleep(300);}catch(Exception e){}
		}
	}
		
}

class SecoundThread extends Thread
{
	
	public SecoundThread(String name)
	{
		super(name);
	}
	public void run()
	{
		for(int i=0;i<40;i++)
		{
			System.out.println(Thread.currentThread()+" - "+i);
			try{Thread.sleep(300);}catch(Exception e){}
		}
	}
}
class ThirdThread extends Thread
{
	
	public ThirdThread(String name)
	{
		super(name);
	}
	public void run()
	{
		for(int i=0;i<40;i++)
		{
			System.out.println(Thread.currentThread()+" - "+i);
			try{Thread.sleep(300);}catch(Exception e){}
		}
	}
		
}

class ThreadThreadGroup
{
	public static void main(String[] args) 
	{

		FirstThread f = new FirstThread("one");
		f.start();

		SecoundThread s = new SecoundThread("Two");
		s.start();

		ThirdThread t = new ThirdThread("Third");
		t.start();

		System.out.println("First is Alive:"+f.isAlive());
		System.out.println("Secound Is Alive:"+s.isAlive());
		System.out.println("Third Is Alive:"+t.isAlive());

		for(int i=0;i<40;i++)
		{
			System.out.println(Thread.currentThread()+" - "+i);
			try{Thread.sleep(300);}catch(Exception e){}
			if(i==10)
			{
				try{s.join();}catch(Exception e){}
			}
		}

		System.out.println("First is Alive:"+f.isAlive());
		System.out.println("Secound Is Alive:"+s.isAlive());
		System.out.println("Third Is Alive:"+t.isAlive());
	}
}
*/

