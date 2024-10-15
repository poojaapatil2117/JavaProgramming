import java.util.Random;
class WorkThread extends Thread
{
	public WorkThread()
	{
		start();
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(" "+Thread.currentThread().getName());
			try{Thread.sleep(new Random().nextInt(1000));}catch(Exception e){}
		}
	}
}
class Runner extends Thread
{
	public void run()
	{
		while(true)
		{
			try{Thread.sleep(new Random().nextInt(2000));}catch(Exception e){}
			System.out.println("Ob Is running"+ this.isAlive());
		}
	}
}

class DaemonThread
{
	public static void main(String[] args) 
	{
		Runner r = new Runner();
		r.setDaemon(true);
		r.start();
		System.out.println("Ob Is running"+r.isAlive());

		Thread tar[]=new Thread[4];

		for(int i=0;i<tar.length;i++)
		{
			tar[i]=new WorkThread();
		}
		System.out.println("Ob Is running"+r.isAlive());
		System.out.println("Main Ended");
	}
}
