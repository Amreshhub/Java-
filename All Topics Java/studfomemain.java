import java.awt.*;
import java.awt.event.*;
class fome extends Frame implements ItemListener,ActionListener
{
	Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l,li;
	TextField t1,t2,t3,t4[];
	CheckboxGroup cbg1;
	Checkbox  rb1,rb2,cb1,cb2,cb3,cb4;
	Choice cmb1,cmb2;
	Button b1,b2;

	String name,city;
	double fee;
	int roll;
public void de()
{	
	
	l1=new Label("Name");
	l2=new Label("Roll");
	l3=new Label("Fee");
	l4=new Label("Qulifection");
	l5=new Label("Genreal");
	l6=new Label("City");
	l7=new Label("Hobby");
	l8=new Label("Name");
	l9=new Label("Roll");
	l10=new Label("Fee");
	l11=new Label("Qulifaction");
	l12=new Label("Genral");
	l13=new Label("City");
	l14=new Label("Hobby");
	
	cbg1=new CheckboxGroup();
	rb1=new Checkbox("mail",cbg1,false);
	rbg2=new Checkbox("Femal",cbg1,false);
	cb1=new Checkbox("Redding");
	cb2=new Checkbox("Playing");
	cb3=new Checkbox("Eiting")
	cb4=new Checkbox("Singing");
	cmb1=new Choice();
	cmb2=new Choice();
	b1=new Button("Accept");
	b2=new Button("PRINT");
		
	cmb1.add("Matirc");
	cmb1.add("Inter");
	cmb1.add("Geratiaion");
	
	cbm2.add("KATIHAR");
	cbm2.add("PATNA");
	cbm2.add("HAJIPUR");
	setLayout(null);
	setBounds(20,20,3000,3000);
	show();


	l1.setBounds(30,30,100,20);
	t1.setBounds(140,30,100,20);
	l2.setBounds(250,30,100,20);
	t2.setBounds(360,30,100,20);
	l3.setBounds(30,140,100,20);
	t3.setBounds(140,140,100,20);
	l4.setBounds(250,140,100,20);
	cmb1.setBounds(360,140,100,20);
	l5.setBounds(30,280,100,20);
	rb1.setBounds(140,280,80,20);
	rb2.setBounds(230,280,80,20);
	l6.setBounds(320,280,100,20);
	cmb2.setBounds(430,280,100,20);
	l7.setBounds(30,560,100,20);
	cb1.setBounds(140,560,80,20);
	cb2.setBounds(230,560,80,20);
	cb3.setBounds(330,560,80,20);
	cb4.setBounds(430,560,80,20);
	l.setBounds(1,600,600);
	b1.setBounds(30,700,100,20);
	b2.setBounds(520,700,100,20);
	li.setBounds(1,900,600);
	l8.setBounds(30,1000,100,20);
	l9.setBounds(140,1000,100,20);
	l10.setBounds(250,1000,100,20);
	l11.setBounds(360,1000,100,20);
	l12.setBounds(470,1000,100,20);
	l13.setBounds(580,1000,100,20);
	l14.setBounds(690,1000,100,20);
	int c=30,r=1100,w=100,h=20;
                for(int i=0;i<30;i++)
	{
		t4[i].setBounds(c,r,w,h);
		 r=r+100;
		c=c+110;
		}
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
	add(l);
	add(li);
	add(t1);
	add(t2);
	add(t3);
	add(t4);
	add(cb1);
	add(cb2);
	add(cb3);
	add(cb4);
	add(cmb1);
	add(cmb2);
	add(b1);
	add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
cmb1.addItemListener(this);
cmb2.addItemListener(this);	
wclose w1=new wclose();
addWindowListener(w1);
setBackground(Color.RED);
}//close of de()
public void itemStateChanged(ItemEvent ic)
{
}
}
public void actionPerformed(ActionEvent ac)
{
}

class wclose extends windowAdapter
{
	public void windowClosing(WindowEvent wc)
	{
		System.exit(0);
	}
}
class studfomemain
{
	public static void main(String args[])
	{
		fome k=new fome();
		k.de();
	}
}		