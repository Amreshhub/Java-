import java.awt.*;
import java.awt.event.*;
class demo extends Frame implements ActionListener
{
	MenuBar mbr1;
	Menu   m1,m2;
	MenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7;
	TextArea t1;
public void de()
{
	mbr1=new MenuBar();
	m1=new Menu("File");
	m2=new Menu("Edit");
	mi1=new MenuItem("new");
	mi2=new MenuItem("Close");
	mi3=new MenuItem("Clear");
	mi4=new MenuItem("Exit");
	mi5=new MenuItem("Cut");
	mi6=new MenuItem("Copy");
	mi7=new MenuItem("Past");
	t1=new TextArea();
	setLayout(null);
	
	setMenuBar(mbr1);
	mbr1.add(m1);
	mbr1.add(m2);
	m1.add(mi1);
	m1.add(mi2);
	m1.add(mi3);
	m1.add(mi4);
	m2.add(mi5);
	m2.add(mi6);
	m2.add(mi7);
setBounds(10,10,600,600);
show();
//setBackground(Color.RED);
t1.setBounds(10,50,581,540);
add(t1);
mi1.addActionListener(this);
mi1.addActionListener(this);
mi2.addActionListener(this);
mi3.addActionListener(this);
mi4.addActionListener(this);
mi5.addActionListener(this);
mi6.addActionListener(this);
mi7.addActionListener(this);

wclose w1=new wclose();
addWindowListener(w1);
t1.setVisible(false);
}//close of de()

public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==mi1)
	{
		t1.setVisible(true);
	}
		if(ae.getSource()==mi2)
		{
			t1.setVisible(false);
		}
			if(ae.getSource()==mi3)
			{
				t1.setText("");
			}
				if(ae.getSource()==mi4)
				{
					System.exit(0);
				}
	    }//close of action
}//close of class
class wclose extends WindowAdapter
{
	public void windowClose(WindowEvent we)
	{
		System.exit(0);
	}
}
class demofome
{
	public static void main(String args[])
	{
		demo d1=new demo();
		d1.de();
	}
}	