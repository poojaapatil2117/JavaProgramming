/*
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Resources
{
	
	public void DoSomething()
	{
		System.out.println("Hi");
	}
	public void DoLoging()
	{
		System.out.println("Bye");
	}
}
class ConcurrentLockExa implements Runnable
{
	Resources Reso;
	private Lock lock;
	public ConcurrentLockExa(Resources Reso)
	{
		this.Reso=Reso;
		this.lock = new ReentrantLock();
	}
	public void run()
	{
		try
		{
			if(lock.tryLock(10,TimeUnit.SECONDS))
			{
				Reso.DoSomething();
			}
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		finally
		{
			lock.unlock();
		}
		Reso.DoLoging();
	}
}
class DeadLockInThreadUsingReentrantLock 
{
	public static void main(String[] args) 
	{
		Resources Res= new Resources();

		Thread c= new Thread(new ConcurrentLockExa(Res));

		c.start();
	}
}

//=======================================================================================


import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;


class Message
{
	private String message;
	boolean empty=true;
	private Lock lock = new ReentrantLock();
	private Condition notEmpty = lock.newCondition();
	private Condition notFull = lock.newCondition();

	public String read() throws Exception
	{
		lock.lock();
		try
		{
			while(empty)
			{
				notEmpty.await(); 
			}
			empty=true;
			notFull.signalAll();
			return message;
		}
		finally
		{
			lock.unlock();
		}
	}

	public void write(String message) throws Exception
	{
		lock.lock();
		try
		{
			while(!empty)
			{
				notFull.await();
			}
			this.message = message;
			empty=false;
			notEmpty.signalAll();
		}
		finally
		{
			lock.unlock();
		}
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
		try
		{
			for(String LastString=message.read();!"Finished:".equals(LastString);LastString=message.read())
			{
				System.out.println(LastString);
				try{Thread.sleep(random.nextInt(2000));}catch(Exception e){}
			}
		}catch (Exception e){}	
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
			try
			{
				message.write(Msg[i]);
				try{Thread.sleep(random.nextInt(2000));}catch(Exception e){}
			}catch (Exception e){}
		}

		try
		{
			message.write("Finished:");
		}
		catch (Exception e){}
	}
}
class DeadLockInThreadUsingReentrantLock 
{
	public static void main(String[] args) 
	{
		Message message = new Message();
		Thread read = new Thread(new reader(message));
		Thread write = new Thread(new writer(message));

		Thread write1 = new Thread(new writer(message));
		Thread read1 = new Thread(new reader(message));
		

		read.start();
		write.start();

		write1.start();
		read1.start();
		
	}
}


//=========================================================================================

//counter Example Without Using Lock

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
class Runner
{
	int cnt=0;
	Lock lock = new ReentrantLock();

	public void Incre()
	{
		try
		{
			for (int i=0;i<10;i++)
			{
				cnt++;
				System.out.println(Thread.currentThread().getName()+ "  Count "+cnt);
				try{Thread.sleep(1000);}catch(Exception e){}
			}
		}
		catch(Exception e){}
	}
}


class DeadLockInThreadUsingReentrantLock 
{
	public static void main(String[] args) 
	{
		Runner r = new Runner();

		Thread t1 = new Thread(){
			public void run()
			{
				r.Incre();
			}
		};
		t1.start();

		Thread t2 = new Thread(){
			public void run()
			{
				r.Incre();
			}
		};
		t2.start();
	}
}

//---------- Output on run without Using Lock ---------------------

Thread-1  Count 2
Thread-0  Count 2
Thread-0  Count 3
Thread-1  Count 3
Thread-1  Count 4
Thread-0  Count 5
Thread-1  Count 6
Thread-0  Count 6
Thread-1  Count 7
Thread-0  Count 8
Thread-0  Count 10
Thread-1  Count 9
Thread-0  Count 11
Thread-1  Count 12
Thread-0  Count 13
Thread-1  Count 14
Thread-0  Count 15
Thread-1  Count 16
Thread-0  Count 17
Thread-1  Count 18
Press any key to continue . . .


//=======================================================================

// Count Example With USing Lock

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
class Runner
{
	int cnt=0;
	Lock lock = new ReentrantLock();

	public void Incre()
	{
		lock.lock();
		try
		{
			for (int i=0;i<10;i++)
			{
				cnt++;
				System.out.println(Thread.currentThread().getName()+ "  Count "+cnt);
				try{Thread.sleep(1000);}catch(Exception e){}
			}
		}
		catch(Exception e){}
		finally
		{lock.unlock();}
	}
}


class DeadLockInThreadUsingReentrantLock 
{
	public static void main(String[] args) 
	{
		Runner r = new Runner();

		Thread t1 = new Thread(){
			public void run()
			{
				r.Incre();
			}
			
		};
		t1.start();

		Thread t2 = new Thread(){
			public void run()
			{
				r.Incre();
			}
		};
		t2.start();
	}
}

//==================================================================

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
class Runner
{
	int cnt=0;
	public void Incre()
	{
			for (int i=0;i<10;i++)
			{
				cnt++;
				System.out.println(Thread.currentThread().getName()+ "  Count "+cnt);
				try{Thread.sleep(1000);}catch(Exception e){}
			}
	}
}


class DeadLockInThreadUsingReentrantLock 
{
	public static void main(String[] args) 
	{
		Runner r = new Runner();

		Lock lock = new ReentrantLock();


		Thread t1 = new Thread(){

			public void run()
			{
				lock.lock();
				try
				{
					r.Incre();
				}
				catch(Exception e){}
				finally
				{
					lock.unlock();
				}
			}
		};
		t1.start();

		Thread t2 = new Thread(){

			public void run()
			{
				lock.lock();
				try
				{
					r.Incre();
				}
				catch(Exception e){}
				finally
				{
					lock.unlock();
				}
			}
		};
		t2.start();
	}
}

/----------------- Ouput On Run --------------------
Thread-0  Count 1
Thread-0  Count 2
Thread-0  Count 3
Thread-0  Count 4
Thread-0  Count 5
Thread-0  Count 6
Thread-0  Count 7
Thread-0  Count 8
Thread-0  Count 9
Thread-0  Count 10
Thread-1  Count 11
Thread-1  Count 12
Thread-1  Count 13
Thread-1  Count 14
Thread-1  Count 15
Thread-1  Count 16
Thread-1  Count 17
Thread-1  Count 18
Thread-1  Count 19
Thread-1  Count 20
Press any key to continue . . .

//===================================================================================

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
class Runner
{
	int cnt=0;
	public void Incre()
	{
			for (int i=0;i<10;i++)
			{
				cnt++;
				System.out.println(Thread.currentThread().getName()+ "  Count "+cnt);
				try{Thread.sleep(1000);}catch(Exception e){}
			}
	}
}


class DeadLockInThreadUsingReentrantLock 
{
	public static void main(String[] args) 
	{
		Runner r = new Runner();

		Lock lock = new ReentrantLock();
		Lock lock1 = new ReentrantLock();


		Thread t1 = new Thread(){

			public void run()
			{
				lock.lock();
				try
				{
					r.Incre();
				}
				catch(Exception e){}
				finally
				{
					lock.unlock();
				}
			}
		};
		t1.start();

		Thread t2 = new Thread(){

			public void run()
			{
				lock1.lock();
				try
				{
					r.Incre();
				}
				catch(Exception e){}
				finally
				{
					lock1.unlock();
				}
			}
		};
		t2.start();
	}
}

//--------------------- output on run ------------------------------
Thread-1  Count 2
Thread-0  Count 2
Thread-1  Count 3
Thread-0  Count 3
Thread-1  Count 4
Thread-0  Count 5
Thread-1  Count 6
Thread-0  Count 7
Thread-1  Count 8
Thread-0  Count 9
Thread-1  Count 10
Thread-0  Count 11
Thread-1  Count 12
Thread-0  Count 13
Thread-1  Count 14
Thread-0  Count 15
Thread-1  Count 16
Thread-0  Count 17
Thread-1  Count 18
Thread-0  Count 19
Press any key to continue . . .
*/
//====================================================================================


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
class Runner
{
	int cnt=0;
	Lock lock = new ReentrantLock();
	public void Incre()
	{
			for (int i=0;i<10;i++)
			{
				cnt++;
				System.out.println(Thread.currentThread().getName()+ "  Count "+cnt);
				try{Thread.sleep(1000);}catch(Exception e){}
			}
	}
}


class DeadLockInThreadUsingReentrantLock 
{
	public static void main(String[] args) 
	{
		Runner r = new Runner();

		Thread t1 = new Thread(){

			public void run()
			{
				r.Incre();
			}
		};
		t1.start();
	}
}





