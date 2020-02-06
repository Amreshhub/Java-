import java.awt.*;
import java.awt.event.*;
class sde extends Frame implements ActionListener
{
	Label l1,l2,l3,l4;
	Choice cb1;
	TextField t1,t2;
	Button b1,b2;
	
//float e,f1,g;
public void d()
{
	l1=new Label("Enter Num 1:-");
	l2=new Label("Enter Num 2:-");
	l3=new Label("Resullt");
	cb1=new Choice();
	t1=new TextField();
	t2=new TextField();
	l4=new Label();
	b1=new Button("OK");
	b2=new Button("Exit");

 	setLayout(null);
	cb1.add("ADD");
	cb1.add("SUB");
	cb1.add("MULT");
	cb1.add("DEV");

	l1.setBounds(30,30,100,30);
	t1.setBounds(150,30,100,30);
	l2.setBounds(30,140,100,30);
	t2.setBounds(150,140,100,30);
	cb1.setBounds(30,270,100,30);
	b1.setBounds(150,270,80,20);
	l3.setBounds(30,340,100,30);
	l4.setBounds(150,340,100,30);
	b2.setBounds(60,400,80,20);

	add(l1);
	add(l2);
	add(l3);
	add(cb1);
	add(b1);
	add(b2);
	add(t1);
	add(t2);
	add(l4);
setBounds(30,30,500,500);
show();
setBackground(Color.PINK);
//cb1.addItemListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
wclose w1=new wclose();
addWindowListener(w1);

}//..close of d()

public void actionPerformed(ActionEvent ac)
	{
		if(ac.getSource()==b1)
		{
                                              if(cb1.getSelectedIndex()==0)
                                              {
                                                   int a=Integer.parseInt(t1.getText());
                                                   int b=Integer.parseInt(t2.getText());

                                                   int c=a+b;

                                                   l4.setText(String.valueOf(c));

                                             }



		if(cb1.getSelectedIndex()==1)
                                              {
                                                   int a=Integer.parseInt(t1.getText());
                                                   int b=Integer.parseInt(t2.getText());

                                                   int c=a-b;

                                                   l4.setText(String.valueOf(c));

                                             }

		if(cb1.getSelectedIndex()==2)
                                              {
                                                   int a=Integer.parseInt(t1.getText());
                                                   int b=Integer.parseInt(t2.getText());

                                                   int c=a*b;

                                                   l4.setText(String.valueOf(c));

                                             }


		if(cb1.getSelectedIndex()==3)
                                              {
                                                   int a=Integer.parseInt(t1.getText());
                                                   int b=Integer.parseInt(t2.getText());

                                                   int c=a/b;

                                                   l4.setText(String.valueOf(c));

                                             }




                                      }
                              if(ac.getSource()==b2)
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

class num2main
{
	public static void main(String d[])
	{
		
	
	sde f2=new sde();
	f2.d();
	}
}	  