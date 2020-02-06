import java.awt.*;
import java.awt.event.*;
class demostudent extends Frame implements ActionListener
{
	MenuBar mbr1;
	Menu m1;
	MenuItem  mi1,mi2,mi3;
	Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
	TextField t1,t2,t3,t4;
	Button b1,b2,b3;
public void d()
{
	mbr1=new MenuBar();
	m1=new Menu("Student");
	mi1=new MenuItem("Entery");
	mi2=new MenuItem("Display");
	mi3=new MenuItem("Exit");
	l1=new Label("Name");
	l2=new Label("Roll");
	l3=new Label("Fee");
	l4=new Label("Course");
	l5=new Label("--------------------------------------------------------------------------------------");
	l6=new Label("--------------------------------------------------------------------------------------");
	l7=new Label("Name");
	l8=new Label("Roll");
	l9=new Label("Fee");
	l10=new Label("Course");
	l11=new Label();
	l12=new Label();
	l13=new Label();
	l14=new Label();
	t1=new TextField();
	t2=new TextField();
	t3=new TextField();
	t4=new TextField();
	b1=new Button("Accept");
	b2=new Button("Display");
	b3=new Button("Exit");

setLayout(null);
setMenuBar(mbr1);
mbr1.add(m1);
m1.add(mi1);
m1.add(mi2);
m1.add(mi3);


l1.setBounds(30,55,60,30);
t1.setBounds(100,55,60,30);
l2.setBounds(180,55,60,30);
t2.setBounds(260,55,60,30);
l3.setBounds(30,120,60,30);
t3.setBounds(100,120,60,30);
l4.setBounds(180,120,60,30);
t4.setBounds(260,120,60,30);                                
l5.setBounds(10,180,800,10);
b1.setBounds(40,200,90,20);
b2.setBounds(260,200,90,20);
l6.setBounds(10,230,800,10);			
l7.setBounds(30, 260,60,30);
l11.setBounds(100,260,60,30);
l8.setBounds(30,300,60,30);
l12.setBounds(100,300,60,30);
l9.setBounds(30,340,60,30);
l13.setBounds(100,340,60,30);
l10.setBounds(30,380,60,30);
l14.setBounds(100,380,60,30);
b3.setBounds(180,340,40,20);
	add(l1);
	add(l2);
	add(l3);
	add(l4);
	add(l5);
	add(l6);
	add(l7);
	add(l8);
	add(l9);
	add(l10);
	add(l11);
	add(l12);
	add(l13);
	add(l14);
	add(b1);
	add(b2);
	add(b3);
	add(t1);
	add(t2);
	add(t3);
	add(t4);
setBounds(20,20,500,500);
show();
mi1.addActionListener(this);
mi2.addActionListener(this);
mi3.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
setBackground(Color.PINK);
wclose w1=new wclose();
addWindowListener(w1);
b1.setVisible(false);
b2.setVisible(false);
l7.setVisible(false);
l8.setVisible(false);
l9.setVisible(false);
l10.setVisible(false);
l11.setVisible(false);
l12.setVisible(false);
l13.setVisible(false);
l14.setVisible(false);
b3.setVisible(false);
l1.setVisible(false);
l2.setVisible(false);
l3.setVisible(false);
l4.setVisible(false);
t1.setVisible(false);
t2.setVisible(false);
t3.setVisible(false);
t4.setVisible(false);
l5.setVisible(false);
l6.setVisible(false);






}//close of d


public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==mi1)
	{
		l1.setVisible(true);
		l2.setVisible(true);
		l3.setVisible(true);
		l4.setVisible(true);
		l5.setVisible(true);
		l6.setVisible(true);
		t1.setVisible(true);
		t2.setVisible(true);
		t3.setVisible(true);
		t4.setVisible(true);
		b1.setVisible(true);
		b2.setVisible(true);
		String name=(t1.getText());
		int roll= Integer.parseInt(t2.getText());
		int fee= Integer.parseInt(t3.getText());
		String  course=(t4.getText());
		
		if(ae.getSource()==mi2)
		{
			
		 	l11.setText(String.valueOf(name));
			l12.setText(String.valueOf(roll));
			l13.setText(String.valueOf(fee));
			l14.setText(String.valueOf(course));
		    
		     
			l7.setVisible(true);
			l8.setVisible(true);	
			l9.setVisible(true);
			l10.setVisible(true);
			l11.setVisible(true);
			l12.setVisible(true);
			l13.setVisible(true);
			l14.setVisible(true);
			b3.setVisible(true);
		        
		}
	}		
	

	if(ae.getSource()==b2)
	{
			l7.setVisible(true);
			l8.setVisible(true);	
			l9.setVisible(true);
			l10.setVisible(true);
			l11.setVisible(true);
			l12.setVisible(true);
			l13.setVisible(true);
			l14.setVisible(true);
			b3.setVisible(true);
		}
		
if(ae.getSource()==mi2)
	{
			l7.setVisible(true);
			l8.setVisible(true);	
			l9.setVisible(true);
			l10.setVisible(true);
			l11.setVisible(true);
			l12.setVisible(true);
			l13.setVisible(true);
			l14.setVisible(true);
			b3.setVisible(true);
		}
if(ae.getSource()==mi3)
	{
		System.exit(0);
	}
if(ae.getSource()==b3)
{
	System.exit(0);
}
}
		
}//close of class

class wclose extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}
class sfomemain
{
	public static void main(String args[])
	{
		demostudent sd=new demostudent();
		sd.d();
	}
}		 			