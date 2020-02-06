import java.awt.*;
import java.awt.event.*;
class combo extends Frame implements ItemListener,ActionListener
{
	TextField t1;
	Label l1,l2 ;
	Choice cb1,cb2;
	Button b1;
public void de()
{
	t1=new TextField();
	l1=new Label("Choose one");
	l2=new Label("Choice Color");
	cb1=new Choice();
	cb2=new Choice();
	b1=new Button("exit");

	setLayout(null);
	
	t1.setBounds(30,30,400,120);
	l1.setBounds(30,460,100,30);
	l2.setBounds(170,460,100,30);
	cb1.setBounds(30,500,100,30);
	cb2.setBounds(170,500,100,30);
	b1.setBounds(70,600,80,20);

	cb1.add("BackColor");
	cb1.add("ForeColor");
	cb2.add("Red");
	cb2.add("Green");
	cb2.add("Blue");
	cb2.add("Pink");

	add(t1);
	add(l1);
	add(l2);
	add(cb1);
	add(cb2);
	add(b1);
setBackground(Color.YELLOW);

cb1.addItemListener(this);
cb2.addItemListener(this);
b1.addActionListener(this);
wclose w1=new wclose();
addWindowListener(w1);
setBounds(30,30,500,500);
	show();
}//close of de

public void itemStateChanged(ItemEvent ie)
{
	if(ie.getSource()==cb2)
	{
                           if(cb2.getSelectedIndex()==0)		
                           {
                                    if(cb1.getSelectedIndex()==0)
		{
			t1.setBackground(Color.RED);
		}
		if(cb1.getSelectedIndex()==1)
		{
			
			t1.setForeground(Color.RED);
		}
                           }


                        if(cb2.getSelectedIndex()==1)		
                           {
                                    if(cb1.getSelectedIndex()==0)
		{
			t1.setBackground(Color.GREEN);
		}
		if(cb1.getSelectedIndex()==1)
		{
			
			t1.setForeground(Color.GREEN);
		}
                           }

                      if(cb2.getSelectedIndex()==2)		
                           {
                                    if(cb1.getSelectedIndex()==0)
		{
			t1.setBackground(Color.BLUE);
		}
		if(cb1.getSelectedIndex()==1)
		{
			
			t1.setForeground(Color.BLUE);
		}
                           }




}
}


public void actionPerformed(ActionEvent ac)
{
	
//	if(ac.getSource()==b2)
//	{
//		System.exit(0);
		
	//}
     }

class wclose extends WindowAdapter
{
	public void windowClosing(WindowEvent wc)
	{
		System.exit(0);
	}
}
}

class combomain
{
	public static void main(String s[])
	{
		combo c1=new combo();
			c1.de();
	}
}

