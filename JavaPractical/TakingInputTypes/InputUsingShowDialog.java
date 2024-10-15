import javax.swing.JOptionPane;
class InputUsingShowDialog
{	
	public static void main(String args[])
	{
		int x=0;
		double y=0.0;

		x=Integer.parseInt(JOptionPane.showInputDialog("Enter Any Int Value:"));
		y=Double.parseDouble(JOptionPane.showInputDialog("Enter Any Double Value:"));

		System.out.println("Int value="+x);
		System.out.println("Double Value="+y);
	}
}