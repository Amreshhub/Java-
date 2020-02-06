import java.awt.*;
import java.applet.*;
public  class  emp3 extends Applet
{
	String ename,add;
	Long ecode;
	int ph_no;
	float basic ,da,hra,ma,gross,itax,net;
	TextField  a1,a2,a3,a4,a5;
	Font s1;
public void init()
{
	a1=new TextField(20);
	a2=new TextField(40);
	a3=new TextField(20);
	a4=new TextField(20);
	a5=new TextField(20);
	add(a1);
	add(a2);
	add(a3);
	add(a4);
	add(a5);
	s1=new Font("Roman",Font.BOLD,20);
}//close of init()

public void paint(Graphics g)
{
	g.setFont(s1);
	g.drawString("1.Enter Employee Name",50,20);
	g.drawString("2.Enter Employee Addreass",50,40);
	g.drawString("3.Enter Employee Code",50,60);
	g.drawString("4.Enter Employee Phone number",40,80);
	g.drawString("5.Enter Employee Basic pay",40,100);

	ename=(a1.getText());
	add=(a2.getText());
	ecode=Long.parseLong(a3.getText());
	ph_no=Integer.parseInt(a4.getText());
	basic=Float.valueOf(a5.getText());
	
	da=basic*20/100;
	hra=basic*15/100;
	ma=basic*12/100;
	gross=basic+da+hra+ma;
	itax=gross*(12.5F)/100;
	net=gross-itax;
	s1=new Font("Arial Black",Font.BOLD,45);
	g.setFont(s1);
	g.drawString("******************Employee Sallery***************",40,120);
	g.drawString("Employee name:-                                      "+String.valueOf(ename),40,140);
	g.drawString("Employee Addreass:-                                "+String.valueOf(add),40,160);
	g.drawString("Employee  code:-                                       "+String.valueOf(ecode),40,170);
	g.drawString("Employee Phon no:-                                  "+String.valueOf(ph_no),40,190);
	g.drawString("Employee Basic pay in Rs:-                      "+String.valueOf(basic),40,110);
	g.drawString("Employee Dearneass Allowance in Rs:-  "+String.valueOf(da),40,130);
	g.drawString("Employee House rent Allowance in Rs:- "+String.valueOf(hra),40,150);
	g.drawString("Employee Madical  Allowance in Rs:-     "+String.valueOf(ma),40,170);
	g.drawString("===========================================",40,190);
	g.drawString("Employee Gross/Total salery in Rs:-         "+String.valueOf(gross),40,210);
	g.drawString("Employee IncomeTex  in Rs:-                    "+String.valueOf(itax),40,230);
	g.drawString("===========================================",40,250);
	g.drawString("Employee Net salery in Rs:-                   	 "+String.valueOf(net),40,270);

}//close of paint
public  boolean action(Event g,Object h)
{
	repaint();
	return(true);
}
}//close of class
	




		
		
	
	