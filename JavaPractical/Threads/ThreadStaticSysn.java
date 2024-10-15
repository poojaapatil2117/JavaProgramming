//--------------------------
/*
class ShowArray
{
	private int x[]={1,11,22,33,44,55,66,77,88,99};

	synchronized public void print()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(x[i]);
			try{Thread.sleep(400);}catch(Exception e){}
		}
	}
}


class ThreadStaticSysn 
{
	public static void main(String[] args) 
	{
		ShowArray s= new ShowArray();

		Thread t1=new Thread()
		{
			public void run()
			{
				s.print();
			}
		};
		t1.start();

		//-------------------------------

		Thread t2=new Thread()
		{
			public void run()
			{
				s.print();
			}
		};
		t2.start();
	}
}

//Output
1
11
22
33
44
55
66
77
88
99
1
11
22
33
44
55
66
77
88
99
Press any key to continue . . .

//=======================================================================

class ShowArray
{
	private int x[]={1,11,22,33,44,55,66,77,88,99};

	synchronized public void print()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(x[i]);
			try{Thread.sleep(700);}catch(Exception e){}
		}
	}
}


class ThreadStaticSysn 
{
	public static void main(String[] args) 
	{
		ShowArray s= new ShowArray();

		Thread t1=new Thread()
		{
			public void run()
			{
				s.print();
			}
		};
		t1.start();

		//-------------------------------

		Thread t2=new Thread()
		{
			public void run()
			{
				s.print();
			}
		};
		t2.start();

		//============================================

		ShowArray s1= new ShowArray();

		Thread t11=new Thread()
		{
			public void run()
			{
				s1.print();
			}
		};
		t11.start();

		//-------------------------------

		Thread t22=new Thread()
		{
			public void run()
			{
				s1.print();
			}
		};
		t22.start();
	}
}

//output

1
1
11
11
22
22
33
33
44
44
55
55
66
66
77
77
88
88
99
99
1
1
11
11
22
22
33
33
44
44
55
55
66
66
77
77
88
88
99
99
Press any key to continue . . .

//=============================================================================================================

using Static

class ShowArray
{
	private static int x[]={1,11,22,33,44,55,66,77,88,99};

	synchronized static public void print()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(x[i]);
			try{Thread.sleep(700);}catch(Exception e){}
		}
	}
}


class ThreadStaticSysn 
{
	public static void main(String[] args) 
	{
		ShowArray s= new ShowArray();

		Thread t1=new Thread()
		{
			public void run()
			{
				s.print();
			}
		};
		t1.start();

		//-------------------------------

		Thread t2=new Thread()
		{
			public void run()
			{
				s.print();
			}
		};
		t2.start();

		//============================================

		ShowArray s1= new ShowArray();

		Thread t11=new Thread()
		{
			public void run()
			{
				s1.print();
			}
		};
		t11.start();

		//-------------------------------

		Thread t22=new Thread()
		{
			public void run()
			{
				s1.print();
			}
		};
		t22.start();
	}
}

1
11
22
33
44
55
66
77
88
99
1
11
22
33
44
55
66
77
88
99
1
11
22
33
44
55
66
77
88
99
1
11
22
33
44
55
66
77
88
99
Press any key to continue . . .

*/

class Counter
{
    private int count = 0;

    public void increment() {
        synchronized (this) {
            count++;
        }
    }

    public int getCount() {
        synchronized (this) {
            return count;
        }
    }
}
class ThreadStaticSysn 
{
	public static void main(String[] args) 
	{
		Counter c= new Counter();
		Thread t=new Thread()
		{
			public void run()
			{
				System.out.println("Increament by:"+c.increment());
				System.out.println("Count:"+c.getCount());
			}
		};
		t.start();
	}
}
