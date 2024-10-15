/*
import java.util.Random;
class Cart extends Thread
{
	double bill=0.0;

	public double GetBill(){return bill;}

	public void run()
	{
			for(int i=0;i<5;i++)
			{
				try{Thread.sleep(300);}catch(Exception e){}
				System.out.println("waiting...."+i);
			}
		

		synchronized(this)
		{
			for(int i=0;i<5;i++)
			{
				try{Thread.sleep(300);}catch(Exception e){}
				int price = new Random().nextInt(200);
				System.out.println("Item "+(i+1)+"Price "+price);
				bill+=price;
			}
			this.notify();
		}
	}
}

class InterThreadCommunication 
{
	public static void main(String[] args) 
	{
		Cart ob =  new Cart();
		ob.start();

		synchronized(ob)
		{
			for(int i=0;i<20;i++)
			{
				try{Thread.sleep(300);}catch(Exception e){}
				System.out.println("Main "+i);
				if (i==10)
				{
					try{ob.wait();}catch(Exception e){}
				}
			}
		}

		System.out.println("The Tot Bill = "+ob.GetBill());
	}
}


//========================================================================================================


import java.util.Random;
class Cart extends Thread
{
	double bill=0.0;
	

	public double GetBill(){return bill;}

	public void run()
	{
		synchronized(this)
		{
			for(int i=0;i<5;i++)
			{
				try{Thread.sleep(300);}catch(Exception e){}
				System.out.println("waiting...."+i);
			}

			this.notify();
		}

		synchronized(this)
		{
			for(int i=0;i<5;i++)
			{
				try{Thread.sleep(300);}catch(Exception e){}
				int price = new Random().nextInt(200);
				System.out.println("Item "+(i+1)+"Price "+price);
				bill+=price;
				if(i==2)
				{
					try{this.wait();}catch(Exception e){}
				}
				
			}
			this.notify();
		}
	}
}

class InterThreadCommunication 
{
	public static void main(String[] args) 
	{
		Cart ob =  new Cart();
		ob.start();


		synchronized(ob)
		{
			for(int i=0;i<20;i++)
			{
				try{Thread.sleep(300);}catch(Exception e){}
				System.out.println("Main "+i);
				if (i==10)
				{
					try{ob.wait();}catch(Exception e){}
				}
			}
		}

		System.out.println("The Tot Bill = "+ob.GetBill());
	}
}


------------- Output -------------- 

Main 0
Main 1
Main 2
Main 3
Main 4
Main 5
Main 6
Main 7
Main 8
Main 9
Main 10
waiting....0
waiting....1
waiting....2
waiting....3
waiting....4
Item 1Price 53
Item 2Price 58
Item 3Price 127
Item 4Price 64
Item 5Price 2
Main 11
Main 12
Main 13
Main 14
Main 15
Main 16
Main 17
Main 18
Main 19
The Tot Bill = 304.0
Press any key to continue . . .



//=======================================

import java.util.Random;
class Cart extends Thread
{
	double bill=0.0;
	
	public double GetBill(){return bill;}

	public void run()
	{
		synchronized(this)
		{
			for(int i=0;i<5;i++)
			{
				try{Thread.sleep(300);}catch(Exception e){}
				int price = new Random().nextInt(200);
				System.out.println("Item "+(i+1)+"Price "+price);
				bill+=price;

			}
			this.notify();
		}
	}
}

class InterThreadCommunication 
{
	public static void main(String[] args) 
	{
		Cart ob =  new Cart();
		ob.start();


		synchronized(ob)
		{
			try{ob.wait();}catch(Exception e){}
		}

		System.out.println("The Tot Bill = "+ob.GetBill());
	}
}


-------------Output-----------

Item 1Price 51
Item 2Price 153
Item 3Price 4
Item 4Price 181
Item 5Price 46
The Tot Bill = 435.0
Press any key to continue . . .


//=======================================================================================

//Producer-Consumer Problem (Using wait() notify() )  - block synchronization implementation

class Resource
{
	private int value;
	public int GetValue(){return value;}
	{value = 0;}

	public void incre()
	{
		value+=1;
		System.out.println("After Produce Value is:"+value);
	}
	public void decr()
	{
		value-=1;
		System.out.println("After Consume Value is:"+value);
	}
}

class Producer extends Thread
{
	Resource res;

	public Producer(Resource res)
	{
		this.res=res;
		start();
	}

	public void run()
	{
		synchronized(res)
		{
			while(true)
			{
				if(res.GetValue()==1)
				{
					try{res.wait();}catch(Exception e){}
				}
				res.incre();
				res.notify();
				try{Thread.sleep(500);}catch(Exception e){}
			}
		}
	}
}

class Consumer extends Thread
{
	Resource res;

	public Consumer(Resource res)
	{
		this.res=res;
		start();
	}

	public void run()
	{
		synchronized(res)
		{
			while(true)
			{
				if(res.GetValue()==0)
				{
					try{res.wait();}catch(Exception e){}
				}
				res.decr();
				res.notify();
				try{Thread.sleep(700);}catch(Exception e){}
			}
		}
	}
}

class InterThreadCommunication 
{
	public static void main(String[] args) 
	{
		Resource R = new Resource();

		Producer P= new Producer(R);

		Consumer C = new Consumer(R);
	}
}

After Produce Value is:1
After Consume Value is:0
After Produce Value is:1
After Consume Value is:0
After Produce Value is:1
After Consume Value is:0
After Produce Value is:1
After Consume Value is:0

....Infinite Times

*/

//===============================================================================================

// Another ways - method synchronization implementation


class Producer implements Runnable
{
	Thread PThread;
	UpdateItems pitem;

	public Producer(UpdateItems pitem)
	{
		this.pitem=pitem;
		PThread=new Thread(this,"Producer");
		PThread.start();
	}

	public void run()
	{
		for(int i=0;i<6;i++)
		{
			try{Thread.sleep(500);}catch(Exception e){}
			pitem.Update(1);
		}
	}
}

class Consumer implements Runnable
{
	Thread CThread;
	UpdateItems citem;

	public Consumer(UpdateItems citem)
	{
		this.citem=citem;
		CThread=new Thread(this,"Consumer");
		CThread.start();
	}
	public void run()
	{
		for(int i=0;i<6;i++)
		{
			try{Thread.sleep(500);}catch(Exception e){}
			citem.Update(2);
		}
	}
}

class UpdateItems
{
	int n=0;
	synchronized public void Update(int chk)
	{
		if(chk==1)
		{
			n+=1;
			notify();
			System.out.println("Producing :"+n);
			try{wait();}catch(Exception e){e.printStackTrace();}
		}
		if(chk==2)
		{
			if(n==0)
			{
				try{wait();}catch(Exception e){e.printStackTrace();}
			}
			n-=1;
			notify();
			System.out.println("Consuming :"+n);
		}
	}
}

class InterThreadCommunication 
{
	public static void main(String[] args) 
	{
		UpdateItems items = new UpdateItems();

		new Producer(items);

		new Consumer(items);
	}
}


/*

class Producer implements Runnable
{
	Thread pthread;
	UpdateItems pitems;
	public Producer(UpdateItems pitems)
	{
		this.pitems=pitems;
		pthread=new Thread(this,"Producer");
		pthread.start();
	}
	public void run()
	{
		for(int i=0;i<6;i++)
		{
			try{Thread.sleep(1200);}catch(Exception e){}
			pitems.update(1);
		}
	}
}
class Consumer implements Runnable
{
	Thread cthread;
	UpdateItems citems;
	public Consumer(UpdateItems citems)
	{
		this.citems=citems;
		cthread=new Thread(this,"Consumer");
		cthread.start();
	}
	public void run()
	{
		for(int i=0;i<6;i++)
		{
			try{Thread.sleep(1200);}catch(Exception e){}
			citems.update(2);
		}
	}
}
class UpdateItems
{
	int n=0;
	synchronized public void update(int chk)
	{
		if(chk==1)
		{
			n+=1;
			notify();
			System.out.println("Producing: "+n);
			try{wait();}catch(Exception e){e.printStackTrace();}
		}
		if(chk==2)
		{
			if(n==0)
			{
				try{wait();}catch(Exception e){e.printStackTrace();}
			}
			n-=1;
			notify();
			System.out.println("Consuming: "+n);
		}
	}
}
class InterThreadCommunication 
{
	public static void main(String[] args) 
	{
		UpdateItems items=new UpdateItems();

		new Producer(items);
		new Consumer(items);
	}
}

*/