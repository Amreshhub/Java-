//package project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
  public class empp extends JFrame implements ActionListener
{
	JTextField  t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JButton b1,b2,b3,b4;

	public  void design()
	{
		t1=new  JTextField();
		t2=new  JTextField();
		t3=new  JTextField();
		t4=new  JTextField();
		t5=new  JTextField();
		t6=new  JTextField();
		t7=new  JTextField();
		t8=new  JTextField();
		t9=new  JTextField();
		t10=new JTextField();
		t11=new JTextField();
		t12=new JTextField();	
		t13=new JTextField();
		
		l1=new JLabel("Employee Report");
		l2=new JLabel("Employee ID");
		l3=new JLabel("Employee Name");
		l4=new JLabel("Basic Salery");
		l5=new JLabel("TA");
		l6=new JLabel("DA");
		l7=new JLabel("HRA");
		l8=new JLabel("Gross Salary");
		l9=new JLabel("Tax");
		l10=new JLabel("Net Salary");
		
		b1=new JButton("Calculate");
		b2=new JButton("Clear");
		b3=new JButton("Exit");
		b4=new JButton("Back");
		
		setLayout(null);
		setBounds(20,20,500,500);
		show();
		setBackground(Color.PINK);
		setTitle("EMPLOYEE REPORT");
		
		l1.setBounds(100,100,20,30);
		l2.setBounds(20,20,100,30);
		t1.setBounds(140,20,100,30);
		l3.setBounds(20,60,100,30);
		t2.setBounds(140,60,100,30);
		l4.setBounds(20,100,100,30);
		t3.setBounds(140,100,100,30);
		l5.setBounds(20,140,100,30);
		t4.setBounds(140,140,100,30);
		t5.setBounds(260,140,80,20);
		l6.setBounds(20,180,100,30);
		t6.setBounds(140,180,100,30);
		t7.setBounds(260,180,80,20);
		l7.setBounds(20,220,100,30);
		t8.setBounds(140,220,100,30);
		t9.setBounds(260,220,80,20);
		l8.setBounds(20,260,100,30);
		t10.setBounds(140,260,100,30);
		l9.setBounds(20,300,100,30);
		t11.setBounds(140,300,100,30);
		t12.setBounds(260,300,80,20);
		l10.setBounds(20,340,100,30);
		t13.setBounds(140,340,100,30);
		
		b1.setBounds(10,400,100,20);
		b2.setBounds(120,400,80,20);
		b3.setBounds(220,400,80,20);
		b4.setBounds(320,400,80,20);
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(t5);
		add(t6);
		add(t7);
		add(t8);
		add(t9);
		add(t10);
		add(t11);
		add(t12);
		add(t13);
		
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
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		
		t4.setEnabled(false);
		t6.setEnabled(false);
		t8.setEnabled(false);
		t10.setEnabled(false);
		t11.setEnabled(false);
	    t13.setEnabled(false);
		
	}

	

public void actionPerformed(ActionEvent ae)
{
	
	
		
	if(ae.getSource()==b3)
	{
		 System.exit(0);
	}
	
	if(ae.getSource()==b4)
	{
		tol rt=new tol();
		rt.tool();
		rt.setVisible(true);
		setVisible(false);
		
	}


	String	code=(t1.getText());
	String	name=(t2.getText());
	double  basic=Double.parseDouble(t3.getText());
	double  ta=Double.parseDouble(t5.getText());
	double  da=Double.parseDouble(t7.getText());
	double  hra=Double.parseDouble(t9.getText());
	double  tax=Double.parseDouble(t12.getText());
	
	if(ae.getSource()==b1)
	{
	double	t=basic*ta/100;
	double  d=basic*da/100;
	double  h=basic*hra/100;
	
	double gross=basic+t+d+h;
	double ti=gross*ta/100;
	double net=gross-ta;
	
	t1.setText(code);
	t2.setText(name);
	t3.setText(String.valueOf(basic));
	t4.setText(String.valueOf(t));
	t6.setText(String.valueOf(d));
	t8.setText(String.valueOf(h));
	t10.setText(String.valueOf(gross));
	t11.setText(String.valueOf(ti));
	t13.setText(String.valueOf(net));
	}
	
	if(ae.getSource()==b2)
	{
		t1.setText(" ");
		t2.setText(" ");
		t3.setText(" ");
		t4.setText(" ");
		t6.setText(" ");
		t8.setText(" ");
		t10.setText(" ");
		t11.setText(" ");
	    t13.setText(" ");
	    t12.setText(" ");
	    t9.setText(" ");
	    t7.setText(" ");
	    t5.setText(" ");
		
	}



}
}


//catch(Exception e)
//{
//}



//class emp
//{
//	public static void main(String args[])
//	{
//		empp e=new empp();
//		e.design();
		
//	}
//}
