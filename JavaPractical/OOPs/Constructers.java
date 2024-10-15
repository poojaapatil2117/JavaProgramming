class DefaluConstr
{
	private int x;
	private double y;

	public DefaluConstr()
	{
		System.out.println("In Default Constructer:");
		x=10;
		y=11;
	}

	public void ShowValue()
	{
		System.out.println(" x = "+x+" y = "+y);
	}
}



class Constructers 
{
	public static void main(String[] args) 
	{
				
		DefaluConstr d1 = new DefaluConstr();
		d1.ShowValue();

		DefaluConstr d2 = new DefaluConstr();
	    d2.ShowValue();

		DefaluConstr d3 = new DefaluConstr();
	    d3.ShowValue();


	}
}
