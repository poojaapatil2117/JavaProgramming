/*
class MyExcuter extends Thread
{
	public void run()
	{
		int tot=0;
		for(int i=0;i<=10;i++)
		{
			tot=tot+i;
			System.out.println("tot = "+tot);
			try{Thread.sleep(1000);}catch(Exception e){}
		}
	}
}
class ExcutersInJava 
{
	public static void main(String[] args) 
	{
		MyExcuter m= new MyExcuter();
		m.start();
	}
}


//======================================================================================================

class MyExcuter extends Thread
{
	int start,end;

	public MyExcuter(int start,int end)
	{
		this.start=start;
		this.end=end;
	}

	public void run()
	{
		int tot=0;
		for(int i=start;i<=end;i++)
		{
			
			tot=tot+i;
			try{Thread.sleep(1000);}catch(Exception e){}
			System.out.println("Processing........"+Thread.currentThread().getName());
		}
		System.out.println("tot = "+tot);
	}
}
class ExcutersInJava 
{
	public static void main(String[] args) 
	{
		MyExcuter m1= new MyExcuter(1,10);
		m1.start();

		MyExcuter m2= new MyExcuter(2,5);
		m2.start();

		MyExcuter m3= new MyExcuter(5,8);
		m3.start();
	}
}


//=======================================

class MyTask
{
	int start,end;

	public MyTask(int start,int end)
	{
		this.start=start;
		this.end=end;
	}
	public void FindTotal()
	{
		int tot=0;
		for(int i=start;i<=end;i++)
		{
			
			tot=tot+i;
			try{Thread.sleep(1000);}catch(Exception e){}
			System.out.println("Processing........"+Thread.currentThread().getName());
		}
		System.out.println("tot = "+tot);
	}
}

class MyExcuter extends Thread
{
	MyTask task;

	public MyExcuter(MyTask task)
	{
		this.task=task;
	}

	public void run()
	{
		task.FindTotal();
	}
}
class ExcutersInJava 
{
	public static void main(String[] args) 
	{
		MyTask T= new MyTask(1,10);
		MyExcuter m1= new MyExcuter(T);
		m1.start();

		MyTask T1= new MyTask(5,10);
		MyExcuter m2= new MyExcuter(T1);
		m2.start();

		MyTask T2= new MyTask(8,10);
		MyExcuter m3= new MyExcuter(T2);
		m3.start();
	}
}
*/
//===========================================================================================


//This program demonstrates how to create a single-threaded executor to execute a Runnable task.

import java.util.concurrent.*;
class ExcutersInJava 
{
	public static void main(String[] args) 
	{
		ExecutorService pool = Executors.newSingleThreadExecutor();
		
		Runnable task = new Runnable(){
			public void run()
			{
				for(int i=0;i<10;i++)
				{
					System.out.println(i+" - "+Thread.currentThread().getName());
					try{Thread.sleep(500);}catch(Exception e){}
				}
			}
		};

		pool.execute(task);

		Runnable task1 = new Runnable(){
			public void run()
			{
				for(int i=0;i<10;i++)
				{
					System.out.println(i+" - "+Thread.currentThread().getName());
					try{Thread.sleep(500);}catch(Exception e){}
				}
			}
		};

		pool.execute(task1);
		pool.shutdown();
	}
}