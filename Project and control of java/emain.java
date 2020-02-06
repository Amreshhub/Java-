import java.awt.*;
import java.awt.event.*;
class refome extends Frame implements ActionListener
{
	Label l1,l2;
	List li1,li2;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
public void de()
{
	l1=new Label("Avalabel iteam");
	l2=new Label("Selected iteam");
	li1=new List();
	li2=new List();
	b1=new Button(">");
	b2=new Button(">|");
	b3=new Button("<");
	b4=new Button("|<");
	b5=new Button("Remove");
	b6=new Button("Remove All");
	b7=new Button("Remove");
	b8=new Button("Remove All");
	b9=new Button("Exit");
		setLayout(null);
	l1.setBounds(40,40,100,40);
	l2.setBounds(250,40,100,40);
	li1.setBounds(40,150,100,150);
	li2.setBounds(250,150,100,150);
	b1.setBounds(155,170,50,20);
	b2.setBounds(155,200,50,20);
	b3.setBounds(155,230,50,20);
	b3.setBounds(155,260,50,20);
	b4.setBounds(155,290,50,20);
	b5.setBounds(40,340,100,30);
	b6.setBounds(40,390,100,30);
	b7.setBounds(250,340,100,30);
	b8.setBounds(250,390,100,30);
	b9.setBounds(135,450,120,40);
	

	li1.add("BOOK");
	li1.add("PEN");
	li1.add("Marker");
	

	add(li1);
	add(li2);
	add(l1);
	add(l2);
	add(b1);
	add(b2);
	add(b3);
	add(b4);
	add(b5);
	add(b6);
	add(b7);
	add(b8);
	add(b9);

setBounds(30,30,500,500);
		show();

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);

wclose w1 =new wclose();
addWindowListener(w1);

setBackground(Color.BLUE);
}//close of de
public void actionPerformed(ActionEvent ac)
{
        int n;
	if(ac.getSource()==b1)
	{
		String  itam=li1.getSelectedItem();
		li2.add(itam);
		li1.remove(li1.getSelectedIndex());
	}
	if(ac.getSource()==b2)
	{
		 n=li1.getItemCount();
	    for(int i=0;i<n;i++)
	     {
		String itam=li1.getItem(i);
		 	li2.add(itam);
		}
		li1.clear();
	}


	if(ac.getSource()==b3)
	{
		String  itam=li2.getSelectedItem();
		li1.add(itam);
		li2.remove(li2.getSelectedIndex());
	}
	if(ac.getSource()==b4)
	{
		 n=li2.getItemCount();
	    for(int i=0;i<n;i++)
	     {
		String itam=li2.getItem(i);
		 	li1.add(itam);
		}
		li2.clear();
	}
		if(ac.getSource()==b5)
		{
			li1.remove(li1.getSelectedItem());
			}
		if(ac.getSource()==b6)
		{
			 n=li1.getItemCount();
		     for(int i=0;i>0;i++)
		     {
			String itam=li1.getSelectedItem();
			li1.remove(li1.getSelectedItem());
			}
			li1.clear();
		if(ac.getSource()==b7)
		{
			li2.remove(li2.getSelectedItem());
			}
		if(ac.getSource()==b8)
		{
			 n=li2.getItemCount();
		     for(int i=0;i>0;i++)
		     {
			String itam=li2.getSelectedItem();
			li2.remove(li2.getSelectedItem());
			}
			li2.clear();
		
		if(ac.getSource()==b9)
		{
			System.exit(0);
			
		}		
		
     }
}
}
}

class wclose extends WindowAdapter
{
	public void windowClosing(WindowEvent ac)
	{
		System.exit(0);
	}
}
class  emain
{
	public static void main(String an[])
	{
						

		refome k=new refome();
		     k.de();
	}
}
			