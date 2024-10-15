
// Event handlilng using anonymous inner class

import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame 
{
	Button b1,b2,b3;
	public MyFrame()
	{
		super("First Frame Example");
		setSize(400,300);
		setLayout(new FlowLayout());

		b1=new Button("Red");
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				String str=((Button)e.getSource()).getLabel();
				System.out.println(str+" Button pressed");
			}	
		});

		b2=new Button("Green");
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				String str=((Button)e.getSource()).getLabel();
				System.out.println(str+" Button pressed");
			}	
		});

		b3=new Button("Blue");
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				String str=((Button)e.getSource()).getLabel();
				System.out.println(str+" Button pressed");
			}	
		});

		add(b1);
		add(b2);
		add(b3);
	}
}
class DemoWindow2
{
	public static void main(String[] args) 
	{
		MyFrame mf=new MyFrame();
		mf.setVisible(true);
	}
}
