
/* interrupt Method In Java Thread Class:

class MyThread extends Thread
{
	public void run()
	{
			try
			{
					for(int i=0;i<15;i++)
					{
						System.out.println(i+"  -  "+this);
						Thread.sleep(1000);
					}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
}

class ThreadsSomeMethodsInJava 
{
	public static void main(String[] args) 
	{
		MyThread t1=new MyThread();
		t1.start();
		try{Thread.sleep(6000);}catch(Exception e){}
		t1.interrupt();
	}
}

//Ouput

0  -  Thread[Thread-0,5,main]
1  -  Thread[Thread-0,5,main]
2  -  Thread[Thread-0,5,main]
3  -  Thread[Thread-0,5,main]
4  -  Thread[Thread-0,5,main]
5  -  Thread[Thread-0,5,main]
java.lang.InterruptedException: sleep interrupted
        at java.base/java.lang.Thread.sleep(Native Method)
        at MyThread.run(ThreadsSomeMethodsInJava.java:11)
Press any key to continue . . .


//==============================================================

//isInterrupted() Method In Java Threads Class:

class MyThread extends Thread
{
	public void run()
	{
			System.out.println("is Interrupted "+this.isInterrupted());
			try
			{
					for(int i=0;i<15;i++)
					{
						System.out.println(i+"  -  "+this);
						Thread.sleep(1000);
					}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			//System.out.println("is Interrupted "+this.isInterrupted());
	}
}

class ThreadsSomeMethodsInJava 
{
	public static void main(String[] args) 
	{
		MyThread t1=new MyThread();
		t1.start();
		//try{Thread.sleep(6000);}catch(Exception e){}
		t1.interrupt();
	}
}

//Output

is Interrupted true
0  -  Thread[Thread-0,5,main]
java.lang.InterruptedException: sleep interrupted
        at java.base/java.lang.Thread.sleep(Native Method)
        at MyThread.run(ThreadsSomeMethodsInJava.java:62)
is Interrupted false
Press any key to continue . . .


//============================================================================================================

class MyThread extends Thread
{
	public void run()
	{
			System.out.println("is Interrupted "+this.isInterrupted());
			try
			{
					for(int i=0;i<15;i++)
					{
						System.out.println(i+"  -  "+this);
						Thread.sleep(600);
						System.out.println("is Interrupted "+this.isInterrupted());
					}
					
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
	}
}

class ThreadsSomeMethodsInJava 
{
	public static void main(String[] args) 
	{
		MyThread t1=new MyThread();
		t1.start();
		try{Thread.sleep(6000);}catch(Exception e){}
		t1.interrupt();
		System.out.println("is Interrupted "+t1.isInterrupted());
		
	}
}


//Output:

is Interrupted true

0  -  Thread[Thread-0,5,main]
1  -  Thread[Thread-0,5,main]
2  -  Thread[Thread-0,5,main]
3  -  Thread[Thread-0,5,main]
4  -  Thread[Thread-0,5,main]
5  -  Thread[Thread-0,5,main]
6  -  Thread[Thread-0,5,main]
7  -  Thread[Thread-0,5,main]
8  -  Thread[Thread-0,5,main]
9  -  Thread[Thread-0,5,main]
10  -  Thread[Thread-0,5,main]
11  -  Thread[Thread-0,5,main]
12  -  Thread[Thread-0,5,main]
13  -  Thread[Thread-0,5,main]
14  -  Thread[Thread-0,5,main]

is Interrupted false
Press any key to continue . . .


//==================================================================================

class MyThread extends Thread
{
	public void run()
	{
			System.out.println("is Interrupted "+this.interrupted());
			//System.out.println("is Interrupted "+this.isInterrupted());
			try
			{
					for(int i=0;i<15;i++)
					{
						System.out.println(i+"  -  "+this);
						Thread.sleep(1000);
						System.out.println("Interrupted: "+Thread.interrupted());

					}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
}

class ThreadsSomeMethodsInJava 
{
	public static void main(String[] args) 
	{
		MyThread t1=new MyThread();
		t1.start();
		try{Thread.sleep(6000);}catch(Exception e){}
		t1.interrupt();
		System.out.println("is Interrupted "+t1.isInterrupted());
	}
}


//Output
is Interrupted true
0  -  Thread[Thread-0,5,main]
Interrupted: false
1  -  Thread[Thread-0,5,main]
Interrupted: false
2  -  Thread[Thread-0,5,main]
Interrupted: false
3  -  Thread[Thread-0,5,main]
Interrupted: false
4  -  Thread[Thread-0,5,main]
Interrupted: false
5  -  Thread[Thread-0,5,main]
Interrupted: false
6  -  Thread[Thread-0,5,main]
Interrupted: false
7  -  Thread[Thread-0,5,main]
Interrupted: false
8  -  Thread[Thread-0,5,main]
Interrupted: false
9  -  Thread[Thread-0,5,main]
Interrupted: false
10  -  Thread[Thread-0,5,main]
Interrupted: false
11  -  Thread[Thread-0,5,main]
Interrupted: false
12  -  Thread[Thread-0,5,main]
Interrupted: false
13  -  Thread[Thread-0,5,main]
Interrupted: false
14  -  Thread[Thread-0,5,main]
Interrupted: false
Press any key to continue . . .


//===================================================================================


class MyThread extends Thread
{
	public MyThread(String name)
	{
		super(name);
		start();
	}
	public void run()
	{
		try
		{
			for(int i=0;i<20;i++)
			{
				System.out.println(i+" - "+this.getName());
				Thread.sleep(400);
			}
		}
		catch (Exception e)
		{
		}
	}
}
class ThreadsSomeMethodsInJava 
{
	public static void main(String[] args) 
	{
		MyThread t1= new MyThread("One");
		MyThread t2= new MyThread("two");
		MyThread t3= new MyThread("three");
		MyThread t4= new MyThread("four");
		MyThread t5= new MyThread("five");

		try
		{
			t3.yield();
			for(int i=0;i<20;i++)
			{
				System.out.println("Hi");
				Thread.sleep(300);
			}
		}
		catch(Exception e)
		{}
	}
}

*/


