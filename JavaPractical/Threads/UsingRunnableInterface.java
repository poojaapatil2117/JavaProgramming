class MyRunnable implements Runnable
{
	private Thread t;

	public  MyRunnable(){}
	public  MyRunnable(String name,int Priority)
	{
		t=new Thread(this,name);
		t.setPriority(Priority);
		t.start();
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(t.getName()+" - "+t.getPriority()+" - "+t.getThreadGroup());
			try{Thread.sleep(400);}catch(Exception e){}
		}
	}
}
class YourRunnable implements Runnable
{
	private Thread t;

	public YourRunnable(){}
	public YourRunnable(String name,int Priority)
	{
		t=new Thread(this,name);
		t.setPriority(Priority);
		t.start();
	}
	public void run()
	{
		System.out.println(t);
		try{Thread.sleep(300);}catch(Exception e){}
	}

}

class UsingRunnableInterface 
{
	public static void main(String[] args) 
	{
		MyRunnable m= new MyRunnable("one",7);
	    YourRunnable y=new YourRunnable("two",8);

		for(int i=0;i<20;i++)
		{
			System.out.println(Thread.currentThread().getName()+" - "+Thread.currentThread().getPriority()+" - "+Thread.currentThread().getThreadGroup());
			try{Thread.sleep(400);}catch(Exception e){}
		}

	}
}
