/*
import java.awt.*;

class DemoFrame 
{
	public static void main(String[] args) 
	{
		Frame f = new Frame("Frame1");
		f.setSize(500,600);
		f.setVisible(true);
	}
}

//-------------------------------------------------------------------

//Buttons

import java.awt.*;
import java.awt.event.*;
class Myframe extends Frame implements ActionListener
{
	Button b1,b2,b3;
	public Myframe()
	{
		super("Frame1");
		setSize(500,600);
		setLayout(new FlowLayout());

		b1=new Button("red");
		b1.addActionListener(this);

		b2=new Button("Blue");
		b2.addActionListener(this);

		b3=new Button("green");
		b3.addActionListener(this);

		add(b1);
		add(b2);
		add(b3);
	}

	public void actionPerformed(ActionEvent e)
	{
		String str = ((Button)e.getSource()).getLabel();
		System.out.println(str+" Button Pressend");
	}
}
class DemoFrame 
{
	public static void main(String[] args) 
	{
		
		Myframe mf = new Myframe();
		mf.setVisible(true);
	}
}

//===========================================================================

//cheack-box and CheckboxGroup
import java.awt.*;
import java.awt.event.*;
class Myframe extends Frame implements ActionListener
{
	Checkbox check,check1,check2;
	CheckboxGroup group;

	//GridLayout gride;

	public Myframe()
	{
		super("Frame1");
		setSize(500,600);
		setLayout(new FlowLayout());

		//CheackBox
		//check=new Checkbox("Agree");

		//Group for Check.  
		group=new CheckboxGroup(); //CheckboxGroup
		check1=new Checkbox("male",group,false);
		check2=new Checkbox("female",group,true);


		//addinFrame
		//add(check);
		
		setLayout(new GridLayout(25,5));
		add(check1);
		add(check2);
	}
	public void actionPerformed(ActionEvent e)
	{
		String str = ((Button)e.getSource()).getLabel();
		System.out.println(str+" Button Pressend");
	}
}
class DemoFrame 
{
	public static void main(String[] args) 
	{
		
		Myframe mf = new Myframe();
		mf.setVisible(true);
	}
}

//=============================================================
//Choice:Excample

import java.awt.*;
import java.awt.event.*;
class ChoiceExample extends Frame 
{
	Choice ch;

	public ChoiceExample()
	{
		super("Choice"); 
		setSize(300,500);
		setLayout(new FlowLayout());

		ch=new Choice();
		ch.add("Red");
		ch.add("Black");
		ch.add("Blue");

		add(ch);
	}
}

class DemoFrame 
{
	public static void main(String[] args) 
	{
		ChoiceExample ce = new ChoiceExample();
		ce.setVisible(true);
	}
}

//================================================================================

//ChatGPT:

import java.awt.*;
import java.awt.event.*;
class DemoFrame 
{
	public static void main(String[] args) 
	{
		//create main frame.
		Frame mainframe = new Frame("MainFrame");
		mainframe.setSize(300,500);
		mainframe.setLayout(new FlowLayout());


		Button openownerdialogbutton = new Button("open dialog");
		mainframe.add(openownerdialogbutton);

		Dialog owenerdialog = new Dialog(mainframe,"OwenerDialog",false);
		owenerdialog.setSize(200,400);
		owenerdialog.setLayout(new FlowLayout());

		Button openchilddialogbutton = new Button("open child dialog");
		owenerdialog.add(openchilddialogbutton);

		Dialog childdialog = new Dialog(owenerdialog,"childDialog");
		childdialog.setSize(100,200);
		childdialog.setLayout(new FlowLayout());

		Label childdialoglabel = new Label("Child Dialog");
		childdialog.add(childdialoglabel);

		openownerdialogbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                owenerdialog.setVisible(true);
            }
        });

		 openchilddialogbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                childdialog.setVisible(true);
            }
        });


		mainframe.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                mainframe.dispose();
                owenerdialog.dispose();
                childdialog.dispose();
            }
        });

		mainframe.setVisible(true);
	}
}

//=====================================================================================

//Creating Dialog

import java.awt.*;
import java.awt.event.*;
class DemoFrame 
{
	public static void main(String[] args) 
	{
		Frame mainframe = new Frame("MainFrame");
		mainframe.setSize(300,400);
		mainframe.setLayout(new FlowLayout());

		Button Dialogbutton = new Button("Open Diaglog");
		mainframe.add(Dialogbutton);

		Dialog dialog = new Dialog(mainframe,"Diaglog",false);
		dialog.setSize(200,300);
		dialog.setLayout(new FlowLayout());

		Dialogbutton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				dialog.setVisible(true);
			}
		});

		mainframe.setVisible(true);
	}
}

//==================================================================================

//Creating the Lable

import java.awt.*;
import java.awt.event.*;
class DemoFrame 
{
	public static void main(String[] args) 
	{
		Frame f = new Frame("MainFrame");
		f.setSize(300,400);
		f.setLayout(new FlowLayout());

		Label label = new Label("This is lable");
		f.add(label);

		f.setVisible(true);
	}
}

//===================================================

//List

import java.awt.*;
import java.awt.event.*;
class DemoFrame 
{
	public static void main(String[] args) 
	{
		Frame f = new Frame("MainFrame");
		f.setSize(300,400);
		f.setLayout(new FlowLayout());

		List list = new List(6,true);
		list.add("Rohit");
		list.add("Virat");
		list.add("Dhoni");
		list.add("Ravindra");
		list.add("Kuldeep");
		list.add("Arshdeep");
		list.add("Bumrah");

		Label label= new Label("Selected : none");

		list.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e)
			{
				String[]  selectItems = list.getSelectedItems();
				String selectedtext = "Selected "+String.join(" ,", selectItems);
				label.setText(selectedtext);
			}
		});

		f.add(list);
		f.add(label);
		f.setVisible(true);
	}
}

*/
//=================================================================

//ScrollBar

/*
Fields
HORIZONTAL	: A constant that indicates a horizontal scroll bar.
VERTICAL	: A constant that indicates a vertical scroll bar.

import java.awt.*;
import java.awt.event.*;
class DemoFrame 
{
	public static void main(String[] args) 
	{
		Frame f = new Frame("MainFrame");
		f.setSize(300,300);
        f.setLayout(new BorderLayout());
		//f.setLayout(new FlowLayout());

		Scrollbar vertical = new Scrollbar(Scrollbar.VERTICAL,0,1,0,255);
		Scrollbar horizontal = new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,300);

		Label vlabel= new Label("vertical scrollbar : 0");
		Label hlabel= new Label("horizontal scrollbar : 0");

		vertical.addAdjustmentListener(new AdjustmentListener(){
			public void adjustmentValueChanged(AdjustmentEvent e)
			{
				vlabel.setText("Vertical Scrollbar Value :"+vertical.getValue());
			}
		});

		horizontal.addAdjustmentListener(new AdjustmentListener(){
			public void adjustmentValueChanged(AdjustmentEvent e)
			{
				hlabel.setText("Horizontal Scrollbar Value :"+horizontal.getValue());
			}
		});

		f.add(vertical,BorderLayout.EAST);
		f.add(horizontal,BorderLayout.SOUTH);
		f.add(vlabel,BorderLayout.NORTH);
		f.add(hlabel,BorderLayout.CENTER);

		f.setVisible(true);
	}
}

//=======================================================================

//TextArea 

import java.awt.*;
import java.awt.event.*;
class DemoFrame 
{
	public static void main(String[] args) 
	{
		Frame f = new Frame("MainFrame");
		f.setSize(300,450);
		
		f.setLayout(new BorderLayout());
		f.setLayout(new FlowLayout());


		TextArea textArea = new TextArea("hello",5,40);
		TextField textfield = new TextField("Enter Text Here");

		Label label = new Label("Text Area");
		Label labetextfield = new Label("TextFieldArea");


		Button ShowtextButton = new Button("ShowText");
		
		Button ShowtextfieldButton = new Button("ShowTextfield");

		ShowtextButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				label.setText("Text Area :"+textArea.getText());
				System.out.println(textArea.getText());
			}
		});


		ShowtextfieldButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				labetextfield.setText("Text Field Area :"+textfield.getText());
				System.out.println(textfield.getText());2
			}
		});

		//text area 
		f.add(labetextfield);
		f.add(textfield);
		f.add(ShowtextfieldButton);
		//-----------------------------------
		//textfield
		f.add(textArea);
		f.add(label,BorderLayout.SOUTH);
		f.add(ShowtextButton);

		f.setVisible(true);
	}
}

*/
//=================================================================================

//MenuComponent: 
import java.awt.*;
import java.awt.event.*;
class DemoFrame 
{
	public static void main(String[] args) 
	{
		Frame f = new Frame("MenuComponent");
		f.setSize(300,450);
		
		f.setLayout(new BorderLayout());
		f.setLayout(new FlowLayout());


		//Menubar
		MenuBar menubar = new MenuBar();

		//menu
		Menu menu =new Menu("file");

		//MenuItem
		MenuItem  menunew = new MenuItem("new");
		MenuItem  menuopen = new MenuItem("open");
		MenuItem  menuclose = new MenuItem("close");
		MenuItem  menudelete = new MenuItem("delete");
		MenuItem  menusave = new MenuItem("save");

		menu.add(menunew);
		menu.add(menuopen);
		menu.add(menuclose);
		menu.add(menudelete);
		menu.add(menusave);
		menu.addSeparator(); //add seaparate


		menubar.add(menu);

		//--------------------------------------------------

		Menu Editmenu = new Menu("edit");
		MenuItem  menucut= new MenuItem("cut");
		MenuItem  menupaste= new MenuItem("paste");

		Editmenu.add(menucut);
		Editmenu.add(menupaste);

		menubar.add(Editmenu);
		
		f.setMenuBar(menubar);

		f.setVisible(true);
	}
}
