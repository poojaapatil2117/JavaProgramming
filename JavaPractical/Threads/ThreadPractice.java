/*
class Demo extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{		
			System.out.println("Hello "+i);
			try{Thread.sleep(500);}catch(Exception e){};
		}
	}
}
class Sample extends Thread
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{		
			System.out.println("Bye "+i);
			try{Thread.sleep(500);}catch(Exception e){};
		}
	}
}
class ThreadPractice
{
	public static void main(String[] args) 
	{

		Demo t1 = new Demo();
		t1.start();
		
		Sample s1 = new Sample();
		s1.start();

	}
}
*/
//================================================================
/*
import java.lang.Thread;
class Demo extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{		
			System.out.println("Hello "+i+"-"+getName());
			try{Thread.sleep(500);}catch(Exception e){};
		}
	}
}
class Sample extends Thread
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{		
			System.out.println("Bye "+i+"-"+getName());
			try{Thread.sleep(500);}catch(Exception e){};
		}
	}
}
class ThreadPractice
{
	public static void main(String[] args) 
	{
		Demo t1 = new Demo();
		t1.start();
		
		Sample s1 = new Sample();
		s1.start();
		
		Sample s2 = new Sample();
		s2.start();
	}
}
*/
//====================================================================================

/*
class Demo extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello "+i+"-"+getName()+" "+getPriority());
			try{Thread.sleep(500);}catch(Exception e){};
		}
	}
}

class Sample extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Bye "+i+"-"+getName()+" "+getPriority());
			try{Thread.sleep(500);}catch(Exception e){};
		}
	}
}


class ThreadPractice
{
	public static void main(String[] args) 
	{
		Demo d1 = new Demo();
		d1.setPriority(Thread.MIN_PRIORITY);
		d1.start();

		Sample d2 = new Sample();
		d2.setName("Example");
		d2.setPriority(Thread.MAX_PRIORITY);
		d2.start();
	}
}

*/

//======================================================================
/*
class Demo implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello ");
			try{Thread.sleep(400);}catch(Exception e){};
		}
	}
}

class Sample implements Runnable
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println("Hiii  ");
			try{Thread.sleep(400);}catch(Exception e){}
		}
	}
}

class ThreadPractice
{
	public static void main(String[] args) 
	{
		Demo d1 = new Demo();
		Thread t1 = new Thread(d1);
		t1.start();

		Sample s1 = new Sample();
		Thread t2 = new Thread(s1);
		t2.start();
	}
}
*/
//======================================================================
/*
class Sample implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			Thread t = Thread.currentThread();
			System.out.println("Id : "+t.getId()+"\tName : "+t.getName()+"\tPriority : "+t.getPriority());
			try{Thread.sleep(400);}catch(Exception e){};
		}
	}
}

class ThreadPractice
{
	public static void main(String[] args) 
	{
		Sample s1 = new Sample();
		Thread t1 = new Thread(s1);
		t1.setName("MyThread");
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
	}
}
*/
//====================================================================
/*
class Sample implements Runnable
{
	private Thread t;
	public Sample(String name , int priority)
	{
		t=new Thread(this , name);
		t.setPriority(priority);
		t.start();
	}


	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(t);
			try{Thread.sleep(500);}catch(Exception e){};
		}
	}
}

class ThreadPractice
{
	public static void main(String[] args) 
	{
		Sample s1 = new Sample("MyThread",4);

		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getId()+" "+Thread.currentThread().getPriority()+" "+Thread.currentThread().getThreadGroup());
		}
	}
}
*/
//==============================================================
/*
class MyThread extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<15;i++)
			{
				System.out.println(i + " - "+this);
				Thread.sleep(600);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
class ThreadPractice 
{
	public static void main(String[] args) 
	{
		MyThread t1=new MyThread();
		t1.start();
		try{Thread.sleep(7000);}catch(Exception e){}
		t1.interrupt();
	}
}
*/
//====================================================
/*

class Message
{
	synchronized public void ShowMessage()
	{
		System.out.println("Hello");
		System.out.println("How");
		System.out.println("Are");
		System.out.println("You");

		try{Thread.sleep(400);}catch(Exception e){};

		System.out.println("Have");
		System.out.println("a");
		System.out.println("Nice");
		System.out.println("Day");
		System.out.println("------------------------------------");
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
		for(int i=0;i<5;i++)
		{
			msg.ShowMessage();
			try{Thread.sleep(300);}catch(Exception e){};
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
		for(int i=0;i<5;i++)
		{
			msg.ShowMessage();
			try{Thread.sleep(300);}catch(Exception e){};
		}
	}
}

class ThreadPractice 
{
	public static void main(String[] args) 
	{

		Message ob = new Message();

		Friends f = new Friends(ob);
		f.start();

		Relatives r = new Relatives(ob);
		r.start();
	}
}

*/
//===================================================================
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
			try{Thread.sleep(300);}catch(Exception e){};
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
		for(int i=0;i<20;i++)
		{
			System.out.println(Thread.currentThread()+" - "+i);
			try{Thread.sleep(300);}catch(Exception e){};
		}
	}
}

class ThreadPractice 
{
	public static void main(String[] args) 
	{
		FirstThread ft = new FirstThread("One");
		ft.start();

		SecoundThread st = new SecoundThread("Two");
		st.start();

		System.out.println("Thread FirstThreadAlive "+ft.isAlive());
		System.out.println("Thread SecoundThreadAlive"+st.isAlive());

		for(int i=0;i<20;i++)
		{
			System.out.println(Thread.currentThread()+" - "+i);
			try{Thread.sleep(400);}catch(Exception e){}

			if(i==15)
			{
				try{st.join();}catch(Exception e){}
			}
		}

		System.out.println("Thread 1 "+ft.isAlive());
		System.out.println("Thread 2 "+st.isAlive());

	}
}

*/
//=============================================================
/*

class MyThread extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<15;i++)
			{
				System.out.println(i + " - "+this);
				Thread.sleep(1000);
				
				
				
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
class ThreadPractice 
{
	public static void main(String[] args) 
	{
		MyThread t1=new MyThread();
		t1.start();

		try{Thread.sleep(7000);}catch(Exception e){}

		t1.interrupt();
		
		System.out.println(t1.isInterrupted());
	}
}
*/
//=================================================================

//Same Object;
/*
class MyStack
{
	private int MaxSize;
	private int Stackarr[];
	private int top;
	Object lock;

	public MyStack(int size)
	{
		this.MaxSize = size;
		this.Stackarr = new int[MaxSize];
		this.top=-1;
		lock = new Object();
	}
	public void Push(int Val)
	{
		synchronized(lock)
		{
			try{Thread.sleep(300);}catch(Exception e){};
			if(isFull())
			{
				System.out.println("Stack is Full You Can Not Insert Elements:");
				return ;
			}
			Stackarr[++top]=Val;
		}
	}

	public int Pop()
	{
		synchronized(lock)
		{
			try{Thread.sleep(300);}catch(Exception e){};
			if(isFull())
			{
				System.out.println("Stack is Empty Can Not POP Elements:");
				return -1;
			}
			return Stackarr[top--];
		}
	}

	public boolean isEmpty()
	{
		return (top==-1);
	}
	public boolean isFull()
	{
		return (top==MaxSize -1);
	}
}
class PushAccess extends Thread
{

	MyStack stack;
	public PushAccess(MyStack stack)
	{
		this.stack=stack;
		//start();
	}
	public void run()
	{
		for(int i=21;i<35;i++)
		{
			stack.Push(i);
			System.out.println("Push "+i);
		}
	}
}

class PopAccess extends Thread
{
	MyStack stack ;
	public PopAccess(MyStack stack)
	{
		this.stack=stack;
		//start();
	}
	public void run()
	{
		for(int i=21;i<35;i++)
		{
			System.out.println("Pop"+stack.Pop());
		}
	}
}
class ThreadPractice
{
	public static void main(String args[])
	{
		MyStack stack = new MyStack(14);

		PushAccess push = new PushAccess(stack);
		push.start();

		PopAccess pop = new PopAccess(stack);
		pop.start();
	}
}
*/
//=================================================================

/*
class MyStack
{
	private int MaxSize;
	private int Stackarr[];
	private int top;
	Object lock1;
	Object lock2;

	public MyStack(int size)
	{
		this.MaxSize = size;
		this.Stackarr = new int[MaxSize];
		this.top=-1;
		lock1 = new Object();
		lock2 = new Object();
	}
	public void Push(int Val)
	{
		synchronized(lock1)
		{
			try{Thread.sleep(600);}catch(Exception e){};
			if(isFull())
			{
				System.out.println("Stack is Full You Can Not Insert Elements:"+Val);
				return ;
			}
			Stackarr[++top]=Val;
		}
	}

	public int Pop()
	{
		synchronized(lock2)
		{
			try{Thread.sleep(300);}catch(Exception e){};
			if(isEmpty())
			{
				System.out.println("Stack is Empty Can Not POP Elements:");
				return -1;
			}
			return Stackarr[top--];
		}
	}

	public boolean isEmpty()
	{
		return (top==-1);
	}
	public boolean isFull()
	{
		return (top==MaxSize-1);
	}
}
class PushAccess extends Thread
{

	MyStack stack;
	public PushAccess(MyStack stack)
	{
		this.stack=stack;
		start();
	}
	public void run()
	{
		for(int i=21;i<35;i++)
		{
			stack.Push(i);
			System.out.println("Push "+i);
		}
	}
}

class PopAccess extends Thread
{
	MyStack stack ;
	public PopAccess(MyStack stack)
	{
		this.stack=stack;
		start();
	}
	public void run()
	{
		for(int i=21;i<35;i++)
		{
			System.out.println("Pop"+stack.Pop());
		}
	}
}
class ThreadPractice
{
	public static void main(String args[])
	{
		MyStack stack = new MyStack(14);

		PushAccess push = new PushAccess(stack);
		//push.start();

		PopAccess pop = new PopAccess(stack);
		//pop.start();
	}
}
*/
//======================================================
/*
class MyStack 
{
    private int maxSize;
    private int[] stackArray;
    private int top;
	Object lock1;
	Object lock2;
    public MyStack(int size) 
	{
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1; 
		lock1=new Object();
		lock2=new Object();
    }
    public void push(int value) 
	{
		// t1->, t2-O
		synchronized(lock1)
		{
			try{Thread.sleep(600);}catch(Exception e){}
			if (isFull()) 
			{
				System.out.println("Stack is full. Cannot push element " + value);
				return;
			}
			stackArray[++top] = value;
		}
    }
    public int pop() 
	{
		synchronized(lock2)
		{
			try{Thread.sleep(300);}catch(Exception e){}
			if (isEmpty()) 
			{
				System.out.println("Stack is empty. Cannot pop element.");
				return -1; 
			}

			return stackArray[top--];
		}
    }
    public boolean isEmpty() 
	{
        return (top == -1);
    }
    public boolean isFull() 
	{
        return (top == maxSize - 1);
    }
}
class PushAccessThread extends Thread
{
	MyStack stack;
	public PushAccessThread(MyStack stack)
	{
		this.stack=stack;
		start();
	}
	public void run()
	{
		for(int i=21;i<35;i++)
		{
			stack.push(i);
			System.out.println("Push: "+i);
		}
	}
}
class PopAccessThread extends Thread
{
	MyStack stack;
	public PopAccessThread(MyStack stack)
	{
		this.stack=stack;
		start();
	}
	public void run()
	{
		for(int i=21;i<35;i++)
			System.out.println("Pop: "+stack.pop());
	}
}
class ThreadPractice
{
	public static void main(String[] args) 
	{
		MyStack stack=new MyStack(14);

		PushAccessThread a1=new PushAccessThread(stack);
		PopAccessThread a2=new PopAccessThread(stack);
	}
}
*/

//====================================================================================
/*
class ShowArray
{
	static int x[]={1,11,22,33,44,55,66,77,88};

	synchronized static public void Print()
	{
		for(int i=0;i<9;i++)
		{
			System.out.println(x[i]);
			try{Thread.sleep(500);}
			catch(Exception e){}
		}
	}
}

class ThreadPractice
{
	public static void main(String[] args) 
	{
		ShowArray ob1 = new ShowArray();
		Thread t1 = new Thread(){
			public void run()
			{
				ob1.Print();
			}
		};
		t1.start();

		//---------------------------------

		Thread t2 = new Thread(){
			public void run()
			{
				ob1.Print();
			}
		};

		t2.start();

		//==================================================

		ShowArray ob2 = new ShowArray();

		Thread t12 = new Thread(){
			public void run()
			{
				ob2.Print();
			}
		};
		t12.start();

		//------------------------

		Thread t13 = new Thread(){
			public void run()
			{
				ob2.Print();
			}
		};
		t13.start();
	}
}
*/
//================================================================

import java.util.Random;

class Cart extends Thread
{
	double bill=0.0;
	public double GetBill()
	{
		return bill;
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try{Thread.sleep(400);}catch(Exception e){}
			System.out.println("Waiting...."+i);
		}
		
		synchronized(this)
		{
			for(int i=0;i<5;i++)
			{
				try{Thread.sleep(400);}catch(Exception e){}
				int price = new Random().nextInt(200);
				System.out.println("Item "+(i+1)+"Price :"+price);
				bill=bill+price;
			}
			this.notify();
		}
	}
}

class ThreadPractice
{
	public static void main(String[] args) 
	{
		Cart c = new Cart();
		c.start();

		synchronized(c)
		{
			for(int i=0;i<20;i++)
			{
				try{Thread.sleep(400);}catch(Exception e){}
				System.out.println("Main....."+i);

				if(i==10)
				{
					try{c.wait();}catch(Exception e){}
				}
			}
		}
		System.out.println("Total bill"+c.GetBill());
	}
}