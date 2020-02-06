import java.awt.*;
import java.javax.swing.*;
class screen extends JWindow
{
	JProgressBar pb1;
	JLabel l1,l2;
public void de()
{
	pb1=new JProgressBar(0,100);
	pb1.setStringPainted(true);
	l1=new JLabel("WELCOME");
	l2=new JLabel("PlEASE WATE");
	
	setBounds(10,10,500,500);
	l1.setBounds(20,50,300,30);
	pb1.setBounds(10,100,400,10);
	l2.setBounds(20,150,100,20);
	add(l1);
	add(l2);
	add(pb1);
	
try
{
	for(i=0;i<=100;i+=2)
	{
		pb1.setValue(pb1.getValue()+i);
		pb1.setString(String.valueOf(i)+"%");
		Thread.sleep(1000);
	}
}


setVisible(false);
from1 f=new from1();
f.setVisible(true);
f.de();
catch Exception e;
{
}
}
}


