class Demo extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello "+i);
			try{Thread.sleep(770);}catch (Exception e){}
		}
	}
}

class  ThreadsInJava
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		d.start();

		Demo d1 = new Demo();
		d1.start();
	}
}
//=============================================================================================

/*

class Demo extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello "+i);
			try{Thread.sleep(770);}catch (Exception e){}
		}
	}
}
class Sample extends Thread
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println("Hii "+i);
			try{Thread.sleep(384);}catch(Exception e){}
		}
	}
}
class  ThreadsInJava
{
	public static void main(String[] args) 
	{
		Demo d = new Demo();
		d.start();

		Sample d1 = new Sample();
		d1.start();
	}
}

*/

//==========================================================================================================
/*
class Demo implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello "+i);
			try{Thread.sleep(770);}catch (Exception e){}
		}
	}
}

class  ThreadsInJava
{
	public static void main(String[] args) 
	{
		Thread d = new Thread (new Demo());
		d.start();

		Thread d1 = new Thread (new Demo());
		d1.start();
	}
}
*/
//===================================================================================================
/*
class Demo implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello "+i);
			try{Thread.sleep(770);}catch (Exception e){}
		}
	}
}
class Sample implements Runnable
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println("Hii "+i);
			try{Thread.sleep(384);}catch(Exception e){}
		}
	}
}
class  ThreadsInJava
{
	public static void main(String[] args) 
	{
		Thread d = new Thread (new Demo());
		d.start();

		Thread d1 = new Thread (new Sample());
		d1.start();
	}
}
*/

