import java.lang.*;
import java.awt.*;
import java.awt.event.*;
class factriol extends Frame implements ActionListener
{
	Label l1,l2;
	Button b1,b2;
	TextField t1,t2;
	int fact,num;
public void de()
{
	l1=new Label("Enter any num:-");
	l2=new Label("Factriol");
	//l3=new Label();
	t1=new TextField();
	t2=new TextField();
	b1=new Button("Find");
	b2=new Button("Exit");

	setLayout(null);

	l1.setBounds(30,30,100,50);
	t1.setBounds(150,30,100,50);
	l2.setBounds(30,140,100,50);
	t2.setBounds(150,140,100,50);
	//l3.setBounds(30,180,100,50);
	b1.setBounds(80,200,80,50);
	b2.setBounds(170,200,80,50);
	add(l1);
	add(l2);
	add(t1);
	add(t2);
	//add(l3);
	add(b1);
	add(b2);
 	
	setBackground(Color.RED);
	b1.addActionListener(this);
	b2.addActionListener(this);
	wclose w1=new wclose();
	addWindowListener(w1);


	setBounds(20,20,500,500);
	show();
}//close of de
public void actionPerformed(ActionEvent a)
{
	if(a.getSource()==b1)
	{
		num=Integer.parseInt(t1.getText());
		for(fact=1;num>0;fact=fact*num,--num);
		t2.setText(String.valueOf(fact));
		}
	if(a.getSource()==b2)
	{
		System.exit(0);
	}
  }
}
 class wclose extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}
class factmain
{
	public static void main(String s[])
	{
		factriol f1=new factriol();
		f1.de();
	}
}
	