package p1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class KeyLstener extends JFrame implements KeyListener
{
	double num1=0.0,num2=0.0,sum=0.0,sub=0.0,mult=1,div=0.0;
	JTextField txt1,txt2,txt3;
	JLabel lbl1,lbl2,lbl3,lbl4,lbl5;
	public KeyLstener(String a)
	{
		super(a);
		Container c=this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.cyan);
		
		lbl1=new JLabel("Enter first number");
		lbl1.setBounds(70,50,200,20);
		lbl1.setForeground(Color.blue);
		
		txt1=new JTextField();
		txt1.setBounds(290,50,150,20);
		txt1.addKeyListener(this);
		
		lbl2=new JLabel("Enter second number");
		lbl2.setBounds(70,90,200,20);
		lbl2.setForeground(Color.blue);
		
		lbl4=new JLabel("F1=SUM, F2=SUBTARACT, F3=MULTIPLCATION");
		lbl5=new JLabel("F4=DIVISION, ESC=EXIT, DELETE=TO CLAER BOX");
		lbl4.setBounds(20,160,350,25);
		lbl5.setBounds(20,190,350,30);
		c.add(lbl4);
		c.add(lbl5);
				
		txt2=new JTextField();
		txt2.setBounds(290,90,150,20);
		txt2.addKeyListener(this);
		
		lbl3=new JLabel("Result");
		lbl3.setBounds(70,130,200,20);
		lbl3.setForeground(Color.blue);
		
		txt3=new JTextField();
		txt3.setBounds(290,130,150,20);

		c.add(lbl1);
		c.add(lbl2);
		c.add(txt1);
		c.add(txt2);
		c.add(lbl3);
		c.add(txt3);
	}
	void accept()
	{
		num1=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter first number"));
		txt1.setText(String.valueOf(num1));
		num2=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter second number"));
		txt2.setText(String.valueOf(num2));
	}
	void clear()
	{
		txt1.setText("");
		txt2.setText("");
		txt3.setText("");
	}
	void sum_cal()
	{
		accept();
		sum=num1+num2;
	}
	void sub_cal()
	{
		accept();
		sub=num1-num2;
	}
	void mult_cal()
	{
		accept();
		mult=num1*num2;
	}
	void div_cal()
	{
		accept();
		div=num1/num2;
	}
	public void keyPressed(KeyEvent ke)
	{
		if(ke.getKeyCode()==ke.VK_F1)
		{
			clear();
			sum_cal();
			txt3.setText(String.valueOf(sum));
		}
		if(ke.getKeyCode()==ke.VK_F2)
		{
			clear();
			sub_cal();
			txt3.setText(String.valueOf(sub));
		}
		if(ke.getKeyCode()==ke.VK_F3)
		{
			clear();
			mult_cal();
			txt3.setText(String.valueOf(mult));
		}
		if(ke.getKeyCode()==ke.VK_F4)
		{	
			clear();
			div_cal();
			txt3.setText(String.valueOf(div));
		}
		if(ke.getKeyCode()==ke.VK_ESCAPE)
		{
			System.exit(0);
		}
		if(ke.getKeyCode()==ke.VK_DELETE)
		{
			clear();
		}
				
	}
	public void keyTyped(KeyEvent ke)
	{
	}
	public void keyReleased(KeyEvent ke)
	{
	}
}
			