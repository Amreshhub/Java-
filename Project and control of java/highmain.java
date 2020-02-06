import java.awt.*;
import java.awt.event.*;
class high extends Frame implements ActionListener
{
	Label l1,l2,l3,l4,l5;
	TextField t1,t2,t3;
	Button b1,b2;
	int a,b,c;
public void de()
{
	l1=new Label("Enter 1no:-");
	l2=new Label("Enter 2no:-");
	l3=new Label("Enter 3no:-");
	l4=new Label("Resullt");
	l5=new Label();
	t1=new TextField();
	t2=new TextField();
	t3=new TextField();
	b1=new Button("Cheack");
	b2=new Button("Exit");
	setLayout(null);
	
	l1.setBounds(30,30,100,20);
	t1.setBounds(150,30,100,20);
	l2.setBounds(30,140,100,20);
	t2.setBounds(150,140,100,20);
	l3.setBounds(30,160,100,20);
	t3.setBounds(150,160,100,20);
	l4.setBounds(30,180,100,20);
	l5.setBounds(150,180,100,20);
	b1.setBounds(50,210,100,20);
	b2.setBounds(160,210,100,20);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(t1);
		add(t2);
		add(t3);
		add(b1);
		add(b2);
	setBackground(Color.RED);
	wclose w1=new wclose();
	addWindowListener(w1);
	b1.addActionListener(this);
	b2.addActionListener(this);
}//close of de
public void actionPerformed(ActionEvent ac)
{
	if(ac.getSource()==b1)
	{
		a=Integer.parseInt(t1.getText());
		b=Integer.parseInt(t2.getText());
		c=Integer.parseInt(t3.getText());
		if(a>b)
		{
			if(a>c)
			{
				l5.setText(String.valueOf(a));
			}else{
				l5.setText(String.valueOf(c));
			          }
		}else if(b>c)
			{
				l5.setText(String.valueOf(b));
			}
			else{
				l5.setText(String.valueOf(c));
		if(ac.getSource()==b2)
		{
			System.exit(0);
			}
		             

	}
}
}
}
class wclose extends WindowAdapter
{
	public void WindowClosing(WindowEvent we)
	{
		System.exit(0);
		}
}
class highmain
{
	public static void main(String a[])
	{
		high h=new high();
		 h.de();
		}

}

			
				
				
			

	
