import java.awt.*;
import java.awt.event.*;
class color extends Frame implements ActionListener
{
	Button b1;
	List l1;
	TextField t1;
public void de()
{
	 l1=new List();
	t1=new TextField();
	b1=new Button("Exit");
	l1.add("Red");
	l1.add("Green");
	l1.add("Blue");
	l1.add("Black");
	
	setLayout(null);
	
	t1.setBounds(30,30,400,200);
	l1.setBounds(50,300,200,80);
	b1.setBounds(280,300,80,20);
	setBounds(30,30,500,500);
	show();
	add(l1);
	add(t1);
	add(b1);
	setBackground(Color.RED);
	l1.addActionListener(this);
	b1.addActionListener(this);
	    wclose w1=new wclose();
	addWindowListener(w1);
}
 public void actionPerformed(ActionEvent ac)
{
	if(ac.getSource()==l1)
	{
		if(l1.getSelectedIndex()==0)
		{
			t1.setBackground(Color.RED);
		}
		if(l1.getSelectedIndex()==1)
		{
			t1.setBackground(Color.GREEN);
		}
		if(l1.getSelectedIndex()==2)
		{
			t1.setBackground(Color.BLUE);
		}
		if(l1.getSelectedIndex()==3)
		{
			t1.setBackground(Color.BLACK);
		}


	}
		if(ac.getSource()==b1)
		{
			System.exit(0);
	  	}

}
}

class wclose extends WindowAdapter
{
	public void windowClosing(WindowEvent w)
	{
		System.exit(0);
	}
}

class cmain
{
	public static void main(String s[])
	{
				
		color v=new color();
		v.de();
	}
}	