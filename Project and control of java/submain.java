import java.awt.*;
import java.awt.event.*;
class sub extends FrameImplimentsActionListener
{
	Button b1,b2;
	Label  l1,l2,l3,l4;
	TextField t1,t2,t3;
	float a,b,c;
public void de()
{
	l1 =new Label("Enter number one:-");
	l2=new Label("Enter number second:-");
	l3=new Label("Sum=");
	l4=new Label();
	t1=new TextField();
	t2=new TextField();
	t3=new TextField();
	b1=new Button("OK");
	b2=new Button("Cencel");
	 setLayout(null);
	
	l1.setBounds(30,30,50,50);
	t1.setBounds(90,30,50,50);
	l2.setBounds(30,70,50,50);
	t2.setBounds(90,70,50,50);
	l3.setBounds(30,90,50,50);
	t3.setBounds(100,90,50,50);
	l4.setBounds(30,110,50,50);
	b1.setBounds(50,400,50,50);
	b2.setBounds(110,400,50,50);
	
	setBounds(20,20,500,500);
	show();
	b1.addActionListener(this);
	b2.addActionListener(this);
	
}//close of de

public void actionperforme(ActionEvent a)
{
		
	if(a.getSource()==b1)
	{
	a=Float.valueOf(t1.getText());
	b=Float.valueOf(t2.getText());
		c=a-b;
	l4.setText(String.valueOf(c));
		}
	if(a.getSource()==b2)
	{
		System.exit(0);
	}
}
}//close of class
class submain
{
	public static void main(String args[])
	{
		sub  g=new sub();
		g.de();
	}
}//close of main class