/*
class ThisDemo
{
	private int x;
	public void demo()
	{
		x=100;
	}
	public void demo(int x)
	{
		this.x=x;
	}

	public void Show()
	{
		System.out.println(" x= "+x);
	}
}

class ThisKeyword 
{
	public static void main(String[] args) 
	{
		ThisDemo t=new ThisDemo();
		t.demo(5);
		t.Show()
	}
}
*/
//===============================================================================================


class ThisDemo
{
	private int x;
	public ThisDemo()
	{
		x=100;
		this(23);
	}
	public ThisDemo(int x)
	{
		this.x=x;
	}

	public void Show()
	{
		System.out.println(" x= "+x);
	}
}

class ThisKeyword 
{
	public static void main(String[] args) 
	{
		ThisDemo t=new ThisDemo(5);
		//t.ThisDemo(5);
		t.Show();
	}
}
