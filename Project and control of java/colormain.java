import java.awt.*;
import java.awt.event.*;
class cal extends Frame implements  ActionListener
{
	List li1;
	Button b1;
	TextField t1;
public void de()
{
	li1=new List();
	b1=new Button("Exit");
	t1=new TextField();
	setLayout(null);
	li1.add("Red");
	li1.add("Blue");
	li1.add("Green");
	li1.add("Pink");
	
	t1.setBounds(30,30,400,80);
	li1.setBounds(50,400,200,200);
	b1.setBounds(50,300,80,20);
	add(t1);
	add(li1);
	add(b1);

	b1.addActionListener(this);
	li1.addActionListener(this);
      wclose w1=new wclose();
      addWindowListener(w1);
setBounds(30,30,500,500);
show();
setBackground(Color.black);
}//close of  d


public void actionPerformed(ActionEvent ac)
{
	if(ac.getSource()==li1)
	{
		if(li1.getSelectedIndex()==0)
		{
			t1.setBackground(Color.RED);
		}
		
		if(li1.getSelectedIndex()==1)
		{
			t1.setBackground(Color.BLUE);
		}
		
		if(li1.getSelectedIndex()==2)
		{
			t1.setBackground(Color.GREEN);
		}
		if(li1.getSelectedIndex()==3)
		{
			t1.setBackground(Color.PINK);
		}
	}
 		if(ac.getSource()==b1)
		{
			System.exit(0);
	  	}
	    }
}



class wlose extends WindowAdapter
{
	public void windowClosing(WindowEvent wc)
	{
		System.exit(0);
	}
}

class  colormain
{
	public static void main(String args[])
	{
		cal r = new cal();
		      r.de();
	}
}		  