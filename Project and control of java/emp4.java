import java.awt.*;
import java.applet.*;
public  class emp4 extends Applet
{
	String ename,add;
	Long eid ,ph;
	Float basic,da,hra,ma,itax,gross,net;
	Color c1;
	Font f1;
	TextField t1,t2,t3,t4,t5;
public void init()
{
	t1=new TextField(20);
	t2=new TextField(20);
	t3=new TextField(20);
	t4=new TextField(20);
	t5=new TextField(20);
	add(t1);
	add(t2);
	add(t3);
	add(t4);
	add(t5);
c1=new Color(20,40,50);
}//close of init()
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		f1=new Font("Arial",Font.BOLD,20);
		g.setFont(f1);
		g.drawString("1.Enter Employee name:",40,60);
		g.drawString("2.Enter Employee Add",40,80);
		g.drawString("3.Enter Employee Id:",40,100);
		g.drawString("4.Enter Employee PHON NO:",40,120);
		g.drawString("5.Enter Employee Basic Pay in Rs:",40,140);
		
				setBackground(c1);		

		ename=(t1.getText());
		add=(t2.getText());
		eid=Long.parseLong(t3.getText());
		ph=Long.parseLong(t4.getText());
		basic=Float.valueOf(t5.getText());


		da=basic*20/100;
		hra=basic*15/100;
		ma=basic*12/100;
		gross=basic+da+hra+ma;
		itax=gross*(10.5F)/100;
		net=gross-itax;


		g.setColor(Color.BLUE);
		f1=new Font("Terminal",Font.BOLD,20);
		g.setFont(f1);

g.drawString("****************************Sallery**********************************",40,160);
	c1=new Color(34,67,90);
	g.setColor(c1);
	g.drawString("Employee name:-                                        "+String.valueOf(ename),40,180);
	g.drawString("Employee Adderass:-                                  "+String.valueOf(add),40,200);
	g.drawString("Employee ID:-                                             "+String.valueOf(eid),40,220);
	g.drawString("Employee Ph NO:-                                     "+String.valueOf(ph),40,240);
	g.drawString("Employee  Basic pay in Rs:-                     "+String.valueOf(basic),40,260);
	g.drawString("Employee Da in Rs:-              		     "+String.valueOf(da),40,280);
	g.drawString("Employee HRA  in Rs:-         		     "+String.valueOf(hra),40,300);
	g.drawString("Employee Madical allowance in Rs:-                        "+String.valueOf(ma),40,320);
	g.setColor(c1);
	g.drawString("==================================================",40,340);
	c1=new Color(54,87,56);
	g.setColor(c1);
	g.drawString("Employee Gross salery in Rs:-                  "+String.valueOf(gross),40,360);
	g.drawString("Employee income tax dedection in Rs:-  "+String.valueOf(itax),40,380);
	g.setColor(c1);
	g.drawString("===================================================",40,400);
	g.setColor(Color.GREEN);
	g.drawString("Net salary Amount in Rs:- 		        "+String.valueOf(net),40,420);
	g.setColor(Color.BLUE);
g.drawString("*******************************************************************",40,440);
try
{
	for(int d=1;d<=50;d++)
	{
		g.drawString("ADA  IT  THT COMPLIET SOFTWARE PARK",40,460);
			Thread.sleep(3000);
		g.drawString(" ",40,460);
			Thread.sleep(3000);
	}//close of for
}//close of try
catch(Exception e){}

}//close of paint()
public boolean action(Event e, Object obj)
{
	repaint();
	return(true);
}
}//close of class()	
			
			
	
		