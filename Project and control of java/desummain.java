import java.awt.*;
import java.awt.event.*;
class dsum extends Frame implements ActionListener
{
	Label l1,l2;
	TextField t1,t2;
	Button b1,b2;
	int sum,num,d;
public void d()
{
	l1=new Label("Enter any no:-");
	l2=new Label("Sum of Degit");
	t1=new TextField();
	t2=new TextField();
	b1=new Button("SUM");
	b2=new Button("Exit");

	setLayout(null);
	setBackground(Color.RED);
	
	l1.setBounds(30,30,100,20);
	t1.setBounds(150,30,100,20);
	l2.setBounds(30,140,100,20);
	t2.setBounds(150,140,100,20);
	b1.setBounds(50,300,70,20);
	b2.setBounds(140,300,70,20);
		add(l1);
		add(l2);
		add(t1);
		add(t2);
		add(b1);
		add(b2);

	setBounds(30,30,500,500);
	show();
  	
 	wclose w1=new wclose();
	addWindowListener(w1);
	b1.addActionListener(this);
	b2.addActionListener(this);
}//close of desin
public void actionPerformed(ActionEvent ac)
{
	if(ac.getSource()==b1)
	{
		num=Integer.parseInt(t1.getText());
		 for(;num>0;)
		{
			d=num%10;
			sum=sum+d;
			num=num/10;
	
			}
		t2.setText(String.valueOf(sum));

	}
		if(ac.getSource()==b2)
		{
			System.exit(0);
			}
		}
}
class wclose extends WindowAdapter
{
	public void windowClosing(WindowEvent wc)
	{
		System.exit(0);
	}
}

class desummain
{
	public static void main(String s[])
	{
	dsum  d1=new dsum();
		d1.d();
	}
}