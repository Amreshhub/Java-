import java.awt.*;
import java.awt.event.*;
class cbox extends Frame implements ItemListener,ActionListener
{
	TextField t1;
	Checkbox rb1,rb2,rb3,rb4,rb5,rb6,rb7,rb8, cb1,cb2,cb3;
	Button b1;
	CheckboxGroup cbg1,cbg2;
 public void design()
 {
 	
	t1=new TextField();
	cbg1=new CheckboxGroup();
	cbg2=new CheckboxGroup();
	
	rb1=new Checkbox("Backcolor",cbg1,false);
	rb2=new Checkbox("Forcolor",cbg1,false);
	
	rb3=new Checkbox("Red",cbg2,false);
	rb4=new Checkbox("Green",cbg2,false);
	rb5=new Checkbox("Black",cbg2,false);
	rb6=new Checkbox("Yellow",cbg2,false);
	rb7=new Checkbox("Brown",cbg2,false);
	rb8=new Checkbox("Pink",cbg2,false);
	
	cb1=new Checkbox("Bold");
	cb2=new Checkbox("Italic");
	cb3=new Checkbox("Underline");
	
	b1=new Button("Exit");

    

	setLayout(new GridLayout(4,4));
	
	//t1.setBounds(30,30,200,40);
	
//	cb1.setBounds(40,250,40,20);
//  cb2.setBounds(40,300,40,20);
//	cb3.setBounds(40,350,40,20);
	
//	rb1.setBounds()

    add(t1);
    
    add(cb1);
    add(cb2);
    add(cb3);
    
    add(rb1);
    add(rb2);
    add(rb3);
    add(rb4);
    add(rb5);
    add(rb6);
    add(rb7);
    add(rb8);
    
    add(b1);
    
    

/*	
	b1.setBounds(100,500,40,20);
	
	cb1.setFont(Font BOLD);
	cb2.setFont(Font ITALIC);
	cb3.setFont(Font UNDERLINE);
	add(t1);
	add(cb1);
	add(cb2);
	add(rb1);
	add(rb2);
	add(rb3);
	add(rb4);
	add(rb5);
	add(rb6);
	add(rb7);
	add(rb8);	*/
	
setBounds(20,20,500,500);
show();
b1.addActionListener(this);
cb1.addItemListener(this);
cb2.addItemListener(this);
rb1.addItemListener(this);
rb2.addItemListener(this);
rb3.addItemListener(this);
rb4.addItemListener(this);
rb5.addItemListener(this);
rb6.addItemListener(this);
rb7.addItemListener(this);
rb8.addItemListener(this);
wclose w1=new wclose();
addWindowListener(w1);
}//close of d()
public void itemStateChanged(ItemEvent ie)
{
	
	
	if (cb1.getState())
	{
		
		
		t1.setFont(new Font("Arial Black",Font.BOLD,25));
		
	}
	else
	{
		t1.setFont(new Font("Arial Black",Font.PLAIN,25));
	}


   if(rb3.getState())
   {
   	
   	if(rb1.getState())
   	{
   		
   		t1.setBackground(Color.RED);
   		
   	}
   	
   	if(rb2.getState())
   	{
   		
   		t1.setForeground(Color.RED);
   		
   	}
   	
   }

}

public void actionPerformed(ActionEvent ae)
{
	
	
}

}


class wclose extends WindowAdapter
{
	
	public void windowClosing(WindowEvent we)
	{
		
		System.exit(0);
		
	}
}
class checkboxmain
{
	
	public static void main(String args[])
	{
		
		cbox cobj1=new cbox();
		
		cobj1.design();
		
		
	}
}