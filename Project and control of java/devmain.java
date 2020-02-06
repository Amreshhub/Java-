import java.awt.*;
import java.awt.event.*;
class dev extends FrameimplimentsActionListener
{
	Label l1,l2,l3,l4;
	TextField t1,t2,t3;
	Button b1,b2;
	int a,b,c;
public void de()
{
	l1=new Label("Enter num 1:-");
	l2=new Label("Enter num 2:-");
	l3=new Label("Result:-");
	l4=new Label();
	t1=new TextField();
	t2=new TextField();
	t3=new TextField();
	b1=new Button("OK");
	b2=new Button("Exit");
setLayout(null);
	
	l1=setBounds(30,30,50,50);
	t1=setBounds(100,30,50,50);
	l2=setBounds(30,100,50,50);
	t2=setBounds(100,100,50,50);
	l3=setBounds(30,210,50,50);
	t3=setBounds(100,210,50,50);
	l4=setBounds(30,450,50,50);
	b1=setBounds(50,30,50,50);
	b2=setBounds(110,30,50,50);
	setBounds(30,30,500,500);
	show();
	b1.addActionListener(this);
	b2.addActionListener(this);
	setBackground(Color.RED);
}//close of de

public void  ActionPerform(ActionEvent ac)
{
	if(ac.getSource==b1)
	{
		a=Integer.parseInt(t1.setText());
		b=Integer.parseInt(t2.setText());
			c=a/b;
		}
	if(ac.getSource==b2)
	{
		System.exit(0);
	}
}
class  devmain
{
	public static void main(String args[])
	{
		dev  f=new dev();
		f.de();
		}
}
}


		
	