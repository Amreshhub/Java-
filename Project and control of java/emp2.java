import java.awt.*;
import java.applet.*;
public class  emp2 extends Applet
{
	String ename;
	Long ecode;
	float basic,da,hra,ma,gross,itax,net;
	TextField t1,t2,t3;
public void init()
{
	t1= new TextField(20);
	t2= new TextField(20);
	t3= new TextField(20);
	add(t1);
	add(t2);
	add(t3);
}//close of init()
	public void paint(Graphics g)
	{
		g.drawString("1.Enter employee name",40,60);
		g.drawString("Enter each value of each box",40,40);
		g.drawString("2.Enter Employee code",40,80);
		g.drawString("3.Enter Employee Basic",40,100);
		ename=(t1.getText());
		ecode=Long.parseLong(t2.getText());
		basic=Float.valueOf(t3.getText());
	    	da=basic*20/100;
	    	hra=basic*10/100;
	    	ma=basic*12/100;
	  	 gross=basic+da+hra+ma;
		itax=gross*5/100;
		net=gross-itax;

g.drawString("**********************Sallery********************",40,120);
g.drawString("Employee name:-			"+ename,40,140 );
g.drawString("Employee code:-			"+ecode,40,160 );
g.drawString("Employee basic:-			"+basic,40,180 );
g.drawString("Dearrneass allowance:-		"+da,40,200 );
g.drawString("House rent allowance:-		"+hra,40,220 );
g.drawString("Madical allowance:-		"+ma,40,240 );
g.drawString("========================================",40,260 );
g.drawString("Gross sallery:-			"+gross,40,280 );
g.drawString("Income Tax  deduction in Rs:-		"+da,40,300 );
g.drawString("=========================================",40,320 );
g.drawString("Net Sallery in Rs:-                                      "+net,40,340 );

}//close of paint
public boolean action(Event e,Object obj)
{
	repaint();
	return(true);
}//close of action
}//close of class




		
	