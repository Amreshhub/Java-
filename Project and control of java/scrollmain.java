import java.awt.*;
import java.awt.event.*;
class mix2 extends Frame implements AdjustmentListener,ActionListener
{
	Label l1,l2,l3,l4,l5,l6;
	TextField t1;
	Scrollbar sb1,sb2,sb3;
	Button b1;
public void de()
{
	l1=new Label("RED");
	l2=new Label();
	l3=new Label("GREEN");
	l4=new Label();
	l5=new Label("BLUE");
	l6=new Label();
	sb1=new Scrollbar(0);
	sb2=new Scrollbar(1);
	sb3=new Scrollbar(1);
	t1=new TextField();
	b1=new Button("Exit");
	setLayout(null);

	l1.setBounds(30,30,100,30);
	sb1.setBounds(150,30,300,30);
	l2.setBounds(380,80,100,30);
	l3.setBounds(30,100,100,30);
	sb2.setBounds(150,100,300,30);
	l4.setBounds(30,100,100,30);
	l5.setBounds(30,170,100,30);
	sb3.setBounds(150,170,300,30);
	l6.setBounds(30,170,100,30);
	t1.setBounds(30,200,500,50);
	b1.setBounds(470,300,60,30);
	add(l1);
	add(l2);
	add(l3);
	add(l4);
	add(l5);
	add(l6);
	add(sb1);
	add(sb2);
	add(sb3);
	add(t1);
	add(b1);


	sb1.addAdjustmentListener(this);
	sb2.addAdjustmentListener(this);
	sb3.addAdjustmentListener(this);


	
	sb1.setValues(0,2,0,255);
	sb1.setUnitIncrement(2);

	sb2.setValues(0,2,0,255);
	sb2.setUnitIncrement(2);

	sb3.setValues(0,2,0,255);
	sb3.setUnitIncrement(2);

	//setBackground(Color.BLACK);
	
	setBounds(30,30,800,800);
	show();
	
	wclose w1=new wclose();
	addWindowListener(w1);
}//close of de()

public  void adjustmentValueChanged(AdjustmentEvent ae)
{
	int r=0,b=0,g=0;
	r=sb1.getValue();
	t1.setBackground(new Color (r,b,g));
	l2.setText(String.valueOf(r)+"%");

	b=sb1.getValue();
	t1.setBackground(new Color (r,b,g));
	l4.setText(String.valueOf(b)+"%");

	g=sb1.getValue();
	t1.setBackground(new Color (r,b,g));
	l6.setText(String.valueOf(g)+"%");

	}

public void actionPerformed(ActionEvent ac)
{
	if(ac.getSource()==b1)
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

class scrollmain
{
	public static void main(String args[])
	{
		mix2 n=new mix2();
		 n.de();
	}
}








