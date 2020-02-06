import java.awt.*;
import java.awt.event.*;
class num extends Frame implements ActionListener
{
	Label  l1,l2,l3,l4;
	TextField t1,t2;
	Button b1,b2,b3,b4,b5;
	int a,b,sum,sub,mult,div;
public void d()
{
	l1=new Label("Enter 1no:-");
	l2=new Label("Enter 2no:-");
	l3=new Label("Resullt");
	l4=new Label();
	t1=new TextField();
	t2=new TextField();
	b1=new Button("ADD");
	b2=new Button("SUB");
	b3=new Button("MULT");
	b4=new Button("DIV");
	b5=new Button("Exit");
 
	setLayout(null);
	setBackground(Color.RED);

	l1.setBounds(30,30,100,30);
	t1.setBounds(150,30,100,30);
	l2.setBounds(30,80,100,30);
	t2.setBounds(150,80,100,30);
	l3.setBounds(30,130,100,30);
	l4.setBounds(150,130,100,30);
	b1.setBounds(30,160,80,30);
	b2.setBounds(120,160,80,30);
	b3.setBounds(210,160,80,30);
	b4.setBounds(30,200,80,30);
	b5.setBounds(120,200,80,30);

		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		

	setBounds(20,20,500,500);
	show();
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	
	wclose w1=new wclose();
	addWindowListener(w1);
}//close of de
public void actionPerformed(ActionEvent ac)
{
	if(ac.getSource()==b1)
	{
		a=Integer.parseInt(t1.getText());
		b=Integer.parseInt(t2.getText());
		  sum=a+b;
		l4.setText(String.valueOf(sum));
		}
	if(ac.getSource()==b2)
	{
		a=Integer.parseInt(t1.getText());
		b=Integer.parseInt(t2.getText());
		  sub=a-b;
		l4.setText(String.valueOf(sub));
		}
	if(ac.getSource()==b3)
	{
		a=Integer.parseInt(t1.getText());
		b=Integer.parseInt(t2.getText());
		  mult=a*b;
		l4.setText(String.valueOf(mult));
		}
	

	if(ac.getSource()==b4)
	{
		a=Integer.parseInt(t1.getText());
		b=Integer.parseInt(t2.getText());
		  div=a/b;
		l4.setText(String.valueOf(div));
		}
	if(ac.getSource()==b5)
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
class nummain
{
	public static void main(String a[])
	{
		num n=new num();
		       n.d();
		}
}	
	
	

	