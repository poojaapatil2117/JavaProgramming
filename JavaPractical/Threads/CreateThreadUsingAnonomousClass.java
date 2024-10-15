
class CreateThreadUsingAnonomousClass 
{
	public static void main(String[] args) 
	{
		Thread t1=new Thread(new Runnable(){
			public void run()
			{
				for(int i=0;i<10;i++)
				{
					System.out.println(Thread.currentThread());
					try{Thread.sleep(400);}catch(Exception e){}
				}
			}
		});
			t1.setName("one");
			t1.start();
	

		Thread t2=new Thread(new Runnable(){
			public void run()
			{
				for(int i=0;i<10;i++)
				{
					System.out.println(Thread.currentThread());
					try{Thread.sleep(400);}catch(Exception e){}
				}
			}
		});
			t2.setName("Two");
			t2.start();
		
	}
}

