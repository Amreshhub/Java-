import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class ShowPanel extends JFrame implements ActionListener
{
	
	  JPanel p1;
	  JButton b1;
	  
	  public void design()
	  {
	  	
	  	p1=new JPanel();
	  	
	  	
	  	
	  	p1.setBorder(BorderFactory.createTitledBorder("WELCOME"));
	  	
	  	b1=new JButton("OK");
	  	
	  	
	  	setLayout(null);
	  	p1.setLayout(null);
	  	p1.setBounds(30,30,250,250);
	  	
	  	b1.setBounds(20,20,100,80);
	  	
	  	add(p1);
	  	p1.add(b1);
	  	setBounds(10,10,500,500);
	  	
	  	show();
	  	
	  	
	  b1.addActionListener(this);
	  
	  	
	  	
	  }


  public void actionPerformed(ActionEvent ae)
  {
  	
  }	  
	  
	  
	  
	  
}


class PanelDemo
{
	
	 public static void main(String args[])
	 {
	 	
	 	ShowPanel obj1=new ShowPanel();
	 	obj1.design();
	 	
	 	
	 }
}