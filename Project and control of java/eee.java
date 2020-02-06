import java.awt.*;
import java.awt.event.*;
class mix extends Frame implements ActionListener,AdjustementListener
{
	TextField t1;
	Label l1,l2,l3,l4,l5,l6;
	Scrollbar sb1,sb2,sb3;
public void de()
{
	t1=new TextField();
	l1=new Label("RED");
	l2=new Label("GREEN");
	l3=new Label("BLUE");
	l4=new Label();
	l5=new Label();
	l6=new Label();
	sb1=new Scrollbar("HSB1");
	sb2=new Scrollbar("HSB2");
	sb3=new Scrollbar("HSb3");
	
	setLayout(null);
	
	l1.setBounds(30,30,100,30);
	sb1.setBounds(140,30,300,30);
	l2.setBounds(450,30,60,50);
	l3.setBounds(30,160,100,30);
	sb2.setBounds(140,160,300,30);
	l4.setBounds(450,160,100,30);
	l5.setBounds(30,180,100,30);
	sb3.setBounds(140,180,300,30);
	l6.setBounds(450,180,100,30);
	t1.setBounds(30,200,400,40);

	setBounds(30,30,500,500);
	show();
	setBackground(Color.RED);
	add(l1);
	add(l2);
	add(l3);
	add(l4);
	add(l5);
	add(l6);
	add(sb1);
	add(sb2);
	add(sb3);
sb1.addAdjustementListener(this);
sb2.addAdjustementListener(this);
sb3.addAdjustementListener(this);
}//close of de()
