//package project;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class ho extends JFrame implements ItemListener,ActionListener
{
  double roomrent,tele,inte,air,total;
  String name;
  int ctr;
  JCheckBox chkTele,chkInt,chkAir;
  JTextField txt1,txt2,txt3;
  JLabel lbl1,lbl2,lbl3,lbl4,lbl5;
  JButton btnNew,btnExit,b1;
  public  void hot() 
  {
    Container c=this.getContentPane();
	c.setLayout(null);
	c.setBackground(Color.PINK);
	setLayout(null);
	setBounds(20,20,500,500);
	
	
	//Defined Check Box properties
	
	chkTele=new JCheckBox("Television   (100/-)");
	chkTele.setBounds(180,280,150,30);
	chkTele.setVisible(true);
	chkTele.setBackground(Color.green);
	
	chkInt=new JCheckBox("Internet     (50/-)");
	chkInt.setBounds(180,310,150,30);
	chkInt.setVisible(true);
	chkInt.setBackground(Color.green);
	
	chkAir=new JCheckBox("Air-Codition (100/-)");
	chkAir.setBounds(180,340,150,30);
	chkAir.setVisible(true);
	chkAir.setBackground(Color.green);
	
	//Defined Label properties
	
	lbl1=new JLabel("Customer ID");
	lbl1.setBounds(100,70,150,25);
	lbl1.setForeground(Color.blue);
	lbl1.setVisible(true);
	
	lbl2=new JLabel("Name");
	lbl2.setBounds(100,120,150,25);
	lbl2.setForeground(Color.black);
	lbl2.setVisible(true);    
	
	lbl3=new JLabel("Price");
	lbl3.setBounds(100,170,150,25);
	lbl3.setForeground(Color.black);
	lbl3.setVisible(true);
	
	lbl4=new JLabel("Total");
	lbl4.setBounds(100,220,150,25);
	lbl4.setForeground(Color.black);
	lbl4.setVisible(true);
	
	//Defined TextBox properties
	
	txt1=new JTextField("C1");
	txt1.setBounds(250,70,100,20);
	//txt1.setForeground(Color.rad);
	txt1.setVisible(true);
	txt1.setEnabled(false);
	
    txt2=new JTextField("");
	txt2.setBounds(250,120,100,20);
//	txt2.setForeground(Color.rad);
	txt2.setVisible(true);
	
	txt3=new JTextField("0");
	txt3.setBounds(250,170,100,20);
	//txt3.setForeground(Color.);
	txt3.setVisible(true);
	
	lbl5=new JLabel();
	lbl5.setBounds(250,220,100,20);
	lbl5.setForeground(Color.blue);
	lbl5.setVisible(true);
		
	//Defined Button properties
	
	btnNew=new JButton("New");
	btnNew.setBounds(50,400,100,20);
    btnNew.setToolTipText("Click to new Form Entry");
	
	btnExit=new JButton("Exit");
	btnExit.setBounds(190,400,100,20);
    btnExit.setToolTipText("Click to Close Appliction");
    
    b1=new JButton("Back");
	b1.setBounds(350,400,100,20);
    b1.setToolTipText("Click to Back Appliction");
	
	//Add ActionListener
	chkTele.addItemListener(this);
	chkInt.addItemListener(this);
	chkAir.addItemListener(this);
	btnNew.addActionListener(this);
	btnExit.addActionListener(this);
	b1.addActionListener(this);
	
	//Add Button and other action events
	
	c.add(chkTele);
	c.add(chkInt);
	c.add(chkAir);
    c.add(txt1);
	c.add(txt2);
	c.add(txt3);
	c.add(lbl5);
	c.add(lbl1);
	c.add(lbl2);
	c.add(lbl3);
	c.add(lbl4);
	c.add(btnNew);
	c.add(btnExit);
	c.add(b1);
	}
  public void itemStateChanged(ItemEvent ie)
	{
	  roomrent=Double.parseDouble(txt3.getText());
	  if(chkTele.isSelected())
	  {
	    roomrent=roomrent+100;
	    lbl5.setText(String.valueOf(roomrent));
	  }
	  if(chkInt.isSelected())
	  {
		roomrent=roomrent+50;
	    lbl5.setText(String.valueOf(roomrent));
	  }
	  if(chkAir.isSelected())
	  {
	    roomrent=roomrent+100;
	    lbl5.setText(String.valueOf(roomrent));
	  }
	  roomrent=0.0;
	  show();
	}
	public  void actionPerformed(ActionEvent ae)
	{
	 
	 if(ae.getSource()==btnNew){
	 for(ctr=1;ctr<20;ctr++){
	 if(ae.getSource()==btnNew)
	 {
	  	  txt1.setText("C"+ctr);
	      txt2.setText("");
		  txt3.setText("0");
		  lbl5.setText("0");
	  }
	  }}
	  if(ae.getSource()==btnExit)
	  {
	    System.exit(0);
	  }
	  if(ae.getSource()==b1)
	{
		tol f1=new tol();
		f1.tool();
		f1.setVisible(true);
		setVisible(false);
	}

	}
}
//class hotal
//{
//	public static void main(String args[])
//	{
//		ho h=new ho();
//		h.hot();
//		h.show();
//	}
//}