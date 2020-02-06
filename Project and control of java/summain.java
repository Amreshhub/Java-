import java.awt.*;
import java.awt.event.*;
class sum extends Frame implements ActionListener
{
	Label l1,l2,l3,l4;
	TextField t1,t2;
	Button b1,b2;
	int a,b,c;
public void d()
{
	l1=new Label("Enter number 1:-");
	l2=new Label("Enter number 2:-");
	l3=new Label("Sum:-");
	l4=new Label();
	t1=new TextField();
	t2=new TextField();
//	t3=new TextField();
	b1=new Button("OK");
	b2=new Button("CANCEL");
	setLayout(null);
	setBackground(Color.BLUE);
	
	
	l1.setBounds(20,20,100,40);
	l2.setBounds(20,80,100,40);
	l3.setBounds(20,140,100,40);
	l4.setBounds(140,140,100,40);
	t1.setBounds(140,20,100,40);
	t2.setBounds(140,80,100,40);
	//t3.setBounds(80,90,40,40);
	b1.setBounds(40,200,80,40);
	b2.setBounds(180,200,80,40);

		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(t1);
		add(t2);
		//add(t3);
		add(b1);
		add(b2);
	setBounds(10,10,500,500);
	show();
b1.addActionListener(this);
b2.addActionListener(this);
wclose w1=new wclose();
addWindowListener(w1);
}//close of d


	public void actionperformed( ActionEvent ac)
	{
		if(ac.getSource()==b1)
		{
			a=Integer.parseInt(t1.getText());
			b=Integer.parseInt(t2.getText());
				c=a+b;
			l4.setText(String.valueOf(c));
			}//close of if
		if(ac.getSource()==b2)
		{
			System.exit(0);
		}
	}
}//class close

class wclose extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}

class summain
{
	public static void main(String args[])
	{
		sum s1=new sum();
		s1.d();
	}
}
	