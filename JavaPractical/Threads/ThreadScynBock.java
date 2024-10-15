/* Same Object  of lock

class Mystack 
{
	private int Maxsize;
	private int[] StackArray;
	Object lock;
	private int top;

	public Mystack(int size)
	{
		this.Maxsize=size;
		this.StackArray=new int[Maxsize];
		this.top=-1;
		lock = new Object();
	}

	public void push(int value)
	{

		synchronized(lock)
		{
			try{Thread.sleep(500);}catch(Exception e){}
			if(isFull())
			{
				System.out.println("Stack Is Full Can Not Push Elements:"+value);
				return;
			}
			StackArray[++top]=value;
		}

	}

	public int pop()
	{
		synchronized(lock)
		{
			try{Thread.sleep(400);}catch(Exception e){}
			if(isEmpty())
			{
				System.out.println("Stack is Empty Can Not PoP Element:");
				return -1;
			}
			return StackArray[top--];
		}
	}

	public boolean isEmpty()
	{
		return (top == -1);
	}

	public boolean isFull()
	{
		return (top == Maxsize-1);
	}
}

class PushAccessThread extends Thread
{
	Mystack stack;
	public PushAccessThread(Mystack stack)
	{
		this.stack=stack;
		start();
	}

	public void run()
	{
		for(int i=21;i<35;i++)
		{
			stack.push(i);
			System.out.println("Push"+i);
		}
	}
}
class PopAccessThread extends Thread
{
	Mystack stack;
	public PopAccessThread(Mystack stack)
	{
		this.stack=stack;
		start();
	}
	public void run()
	{
		for(int i=21;i<35;i++)
		{
			System.out.println("Pop:"+stack.pop());
		}
	}
}

class  ThreadScynBock
{
	public static void main(String[] args) 
	{
		Mystack stack=new Mystack(14);

		PushAccessThread a1 = new PushAccessThread(stack);
		PopAccessThread a2 = new PopAccessThread(stack);


	}
}

output
Push21
Pop:21
Push22
Pop:22
Push23
Pop:23
Push24
Pop:24
Push25
Pop:25
Push26
Pop:26
Push27
Pop:27
Push28
Pop:28
Push29
Pop:29
Push30
Pop:30
Push31
Pop:31
Push32
Pop:32
Push33
Pop:33
Push34
Pop:34
Press any key to continue . . .

//==========================================================================================================

// when two different objects are there used as a lock, the we will see the parallel execution.
//(like unsynchronized)

class Mystack 
{
	private int Maxsize;
	private int[] StackArray;
	Object lock1;
	Object lock2;
	private int top;

	public Mystack(int size)
	{
		this.Maxsize=size;
		this.StackArray=new int[Maxsize];
		this.top=-1;
		lock1 = new Object();
		lock2 = new Object();
	}

	public void push(int value)
	{

		synchronized(lock1)
		{
			try{Thread.sleep(500);}catch(Exception e){}
			if(isFull())
			{
				System.out.println("Stack Is Full Can Not Push Elements:"+value);
				return;
			}
			StackArray[++top]=value;
		}

	}

	public int pop()
	{
		synchronized(lock2)
		{
			try{Thread.sleep(400);}catch(Exception e){}
			if(isEmpty())
			{
				System.out.println("Stack is Empty Can Not PoP Element:");
				return -1;
			}
			return StackArray[top--];
		}
	}

	public boolean isEmpty()
	{
		return (top == -1);
	}

	public boolean isFull()
	{
		return (top == Maxsize-1);
	}
}

class PushAccessThread extends Thread
{
	Mystack stack;
	public PushAccessThread(Mystack stack)
	{
		this.stack=stack;
		start();
	}

	public void run()
	{
		for(int i=21;i<35;i++)
		{
			stack.push(i);
			System.out.println("Push"+i);
		}
	}
}
class PopAccessThread extends Thread
{
	Mystack stack;
	public PopAccessThread(Mystack stack)
	{
		this.stack=stack;
		start();
	}
	public void run()
	{
		for(int i=21;i<35;i++)
		{
			System.out.println("Pop:"+stack.pop());
		}
	}
}

class  ThreadScynBock
{
	public static void main(String[] args) 
	{
		Mystack stack=new Mystack(14);

		PushAccessThread a1 = new PushAccessThread(stack);
		PopAccessThread a2 = new PopAccessThread(stack);


	}
}

output
Stack is Empty Can Not PoP Element:
Pop:-1
Push21
Pop:21
Push22
Pop:22
Push23
Pop:23
Push24
Pop:24
Push25
Pop:25
Stack is Empty Can Not PoP Element:
Pop:-1
Push26
Pop:26
Push27
Pop:27
Push28
Pop:28
Push29
Pop:29
Stack is Empty Can Not PoP Element:
Pop:-1
Push30
Pop:30
Push31
Pop:31
Push32
Push33
Push34
Press any key to continue . . .

//===========================================================================================\

class Mystack 
{
	private int Maxsize;
	private int[] StackArray;
	Object lock1;
	Object lock2;
	private int top;

	public Mystack(int size)
	{
		this.Maxsize=size;
		this.StackArray=new int[Maxsize];
		this.top=-1;
		lock1 = new Object();
		lock2 = new Object();
	}

	public void push(int value)
	{

		synchronized(this)
		{
			try{Thread.sleep(500);}catch(Exception e){}
			if(isFull())
			{
				System.out.println("Stack Is Full Can Not Push Elements:"+value);
				return;
			}
			StackArray[++top]=value;
		}

	}

	public int pop()
	{
		synchronized(this)
		{
			try{Thread.sleep(400);}catch(Exception e){}
			if(isEmpty())
			{
				System.out.println("Stack is Empty Can Not PoP Element:");
				return -1;
			}
			return StackArray[top--];
		}
	}

	public boolean isEmpty()
	{
		return (top == -1);
	}

	public boolean isFull()
	{
		return (top == Maxsize-1);
	}
}

class PushAccessThread extends Thread
{
	Mystack stack;
	public PushAccessThread(Mystack stack)
	{
		this.stack=stack;
		start();
	}

	public void run()
	{
		for(int i=21;i<35;i++)
		{
			stack.push(i);
			System.out.println("Push"+i);
		}
	}
}
class PopAccessThread extends Thread
{
	Mystack stack;
	public PopAccessThread(Mystack stack)
	{
		this.stack=stack;
		start();
	}
	public void run()
	{
		for(int i=21;i<35;i++)
		{
			System.out.println("Pop:"+stack.pop());
		}
	}
}

class  ThreadScynBock
{
	public static void main(String[] args) 
	{
		Mystack stack=new Mystack(14);

		PushAccessThread a1 = new PushAccessThread(stack);
		PopAccessThread a2 = new PopAccessThread(stack);
	}
}

output:

Push21
Pop:21
Push22
Pop:22
Push23
Pop:23
Push24
Pop:24
Push25
Pop:25
Push26
Pop:26
Push27
Pop:27
Push28
Pop:28
Push29
Pop:29
Push30
Pop:30
Push31
Pop:31
Push32
Pop:32
Push33
Pop:33
Push34
Pop:34
Press any key to continue . . .

*/
//============================================================================================================

class Counter 
{
    private int count = 0;

    public void increment() {
        synchronized (this) {
			for(int i=0;i<10;i++)
			{
				count++;
				//System.out.println("Count = "+count);
				//try{Thread.sleep(600);}catch(Exception e){}
			}
        }
    }

    public int getCount() {
        synchronized (this) {
            return count;
        }
    }
}

class  ThreadScynBock
{
	public static void main(String[] args) 
	{
		Counter c = new Counter();

		Thread t = new Thread()
		{
			public void run()
			{
				c.increment();
				System.out.println("Count = "+c.getCount());
			}

		};
		t.start();

		//------------------------------------------
		/*
		Thread t1 = new Thread()
		{
			public void run()
			{
				c.increment();
			}

		};
		t1.start();*/
	}
}