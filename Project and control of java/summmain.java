import java.awt.*;
import java.awt.event.*;
 class sum1 extends Frame implements ActionListener
	{
	Label l1,l2,l3,l4; 
	Button b1,b2;
	TextField t1,t2,t3;     	
	Color  c1;
	float a,b,c;
public void de()
{
	l1=new Label("Enter num 1:-");
	l2=new Label("Enter num 2:-");
	l3=new Label("Result:-");
	l4=new Label();
	t1=new TextField();
	t2=new TextField();
	t3=new TextField();
	b1=new Button("Ok");
	b2=new Button("Exit");
	c1=new Color(12,45,67);
	setBackground(c1);
 	setLayout(null);
	
	l1.setBounds(30,30,50,50);
	t1.setBounds(90,30,50,50);
	l2.setBounds(30,70,50,50);
	t2.setBounds(90,70,50,50);
	l3.setBounds(30,150,50,50);
	t3.setBounds(90,150,50,50);
	l4.setBounds(30,310,50,50);
	b1.setBounds(50,400,50,50);
	b2.setBounds(110,400,50,50);
	//setBackground(34,67,89);
	b1.addActionListener(this);
	b2.addActionListener(this);
	
	set.Bounds(20,20,500,500);
	show();
}//close of de
public void actionperformed(ActionEvent ac)
{
	if(ac.getSource()==b1)
	{
		a=Float.valueOf(t1.getText());
		b=Float.valueOf(t2.getText());
		 c=a+b;
		l4.setText(String.valueOf(c));
		}
	if(ac.getSource()==b2)
	{
		System.exit(0);
		}
}
class summmain
{
	public static void   main(String args[])
	{
		sum1 b=new sum1();
		      b.de();
	}
}
}//close of class