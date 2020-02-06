//program based on employee
import java.awt.*;
import java.applet.*;
public class emp extends Applet
{
	String ename;
	long ecode;
	float basic,da,hra,ma,gross,itax,net;
public void init()
{
ename=(getParameter("c"));
ecode=Long.parseLong(getParameter("num1"));
basic=Float.valueOf(getParameter("num2"));
	}//close of init()
public void start()
{ 	
	da=basic*20/100;
	hra=basic*15/100;
	ma=basic*10/100;
	gross=basic+da+hra+ma;
	itax=gross*(12.5F)/100;
	net=gross-itax;
	}//close of start()
public void paint(Graphics g)
{
	g.drawString("*****************Sallery*******************",40,20);
	g.drawString("Employee name :-                               "+String.valueOf(ename),40,30);
	g.drawString("Employee code :-                               "+String.valueOf(ecode),40,40);
	g.drawString("Basic pay in Rs :-                               "+String.valueOf(basic),40,50);
	g.drawString("Dearness allowance in Rs :-              "+String.valueOf(da),40,60);
	g.drawString("House rent allowance in Rs :-           "+String.valueOf(hra),40,70);
	g.drawString("madical allowance in Rs :-                "+String.valueOf(ma),40,80);
	g.drawString("=======================================",40,90);
	g.drawString("Gross salary in Rs :-                           "+String.valueOf(gross),40,100);
	g.drawString("Incometax deduction in Rs :-            "+String.valueOf(itax),40,110);
	g.drawString("=======================================",40,120);
	g.drawString("Net Sallery in Rs:-                              "+String.valueOf(net),40,130);
}//close of paint()
 		}//close of class


	

	


