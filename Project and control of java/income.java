import java.awt.*;
import java.applet.*;
public class income extends Applet
{
	String in1,in2,in3,in4,in5;
	Float  ir1,ir2,ir3,ir4,ir5,p1,p2,p3,p4,p5,vat,qu1,qu2,qu3,qu4,qu5,t1,t2,t3,t4,t5;
    	Font f1;
	Color c1;
TextField   iname1,iname2,iname3,iname4,iname5,irate1,irate2,irate3,irate4,irate5,ip1,ip2,ip3,ip4,ip5,ivat,q1,q2,q3,q4,q5;
public void init()
{	
	iname1 =new TextField(20);
	iname2=new TextField(20);
	iname3 =new TextField(20);
	iname4=new TextField(20);
	iname5 =new TextField(20);
	
	
	add(iname1);
	add(iname2);
	add(iname3);
	add(iname4);
	add(iname5);
	
	irate1=new TextField(10);
	irate2=new TextField(10);
	irate3=new TextField(10);
	irate4=new TextField(10);
	irate5=new TextField(10);

	add(irate1);
	add(irate2);
	add(irate3);
	add(irate4);
	add(irate5);

	
	ip1=new TextField(10);
	ip2=new TextField(10);
	ip3=new TextField(10);
	ip4=new TextField(10);
	ip5=new TextField(10);

	add(ip1);
	add(ip2);
	add(ip3);
	add(ip4);
	add(ip5);
	
	
	q1 =new TextField(20);
	q2=new TextField(20);
	q3 =new TextField(20);
	q4=new TextField(20);
	q5 =new TextField(20);

	
	add(q1);
	add(q2);
	add(q3);
	add(q4);
	add(q5);
	
	


	ivat=new TextField(10);
	
	add(ivat);
f1=new Font("Arial",Font.BOLD,20);
c1=new Color(34,56,78);
}//close of init()

public void paint(Graphics g)
{
	g.setFont(f1);
	setBackground(Color.GREEN );
	g.setColor(Color.RED);
//g.drawString("****************************NAME OFTAM**************************",40,20);
//g.drawString("**1.Enter Itam name**",40,40);
//g.drawString("*Enter itam name 1:",40,60);
g.drawString("*Enter itam name 2:",40,80);
g.drawString("*Enter itam name 3:",40,100);
g.drawString("*Enter itam name 4:",40,120);
g.drawString("*Enter itam name 5:",40,140);
g.drawString("****************************RATE OF ITAM**************************",40,160);
g.drawString("**2.Enter Itam rate**",40,180);
g.drawString("*Enter itam rate 1:",40,200);
g.drawString("*Enter itam rate 2:",40,220);
g.drawString("*Enter itam rate3:",40,240);
g.drawString("*Enter itam rate4:",40,260);
g.drawString("*Enter itam rate 5:",40,280);
g.drawString("****************************PRICE OF ITAM*************************",40,300);
g.drawString("**3.Enter Itam price**",40,320);
g.drawString("*Enter itam price 1:",40,340);
g.drawString("*Enter itam price 2:",40,360);
g.drawString("*Enter itam price3:",40,380);
g.drawString("*Enter itam price4:",40,400);
g.drawString("*Enter itam price5:",40,420);
g.drawString("****************************NO OF ITAM*************************",40,440);
g.drawString("**3.Enter Itam price**",40,460);
g.drawString("*Enter itam price 1:",40,480);
g.drawString("*Enter itam price 2:",40,500);
g.drawString("*Enter itam price3:",40,520);
g.drawString("*Enter itam price4:",40,540);
g.drawString("*Enter itam price5:",40,560);
g.drawString("Vate in all rate:",40,580);
g.drawString("===========================================================",40,600);



in1=(iname1.getText());
in2=(iname2.getText());
in3=(iname3.getText());
in4=(iname4.getText());
in5=(iname5.getText());

ir1=Float.valueOf(irate1.getText());
ir2=Float.valueOf(irate2.getText());
ir3=Float.valueOf(irate3.getText());
ir4=Float.valueOf(irate4.getText());
ir5=Float.valueOf(irate5.getText());

p1=Float.valueOf(ip1.getText());
p2=Float.valueOf(ip2.getText());
p3=Float.valueOf(ip3.getText());
p4=Float.valueOf(ip4.getText());
p5=Float.valueOf(ip5.getText());

qu1=Float.valueOf(q1.getText());
qu2=Float.valueOf(q2.getText());
qu3=Float.valueOf(q3.getText());
qu4=Float.valueOf(q4.getText());
qu5=Float.valueOf(q5.getText());


vat=Float.valueOf(ivat.getText());

		t1=p1*ir1*qu1;
		t2=p2*ir2*qu2;
		t3=p3*ir3*qu3;
		t4=p4*ir4*qu4;
		t5=p5*ir5*qu5;
g.setColor(Color.BLUE);
g.drawString("********************Bill 1 ***************************",40,620);
g.drawString("Producet name:-                      "+String.valueOf(in1),40,640);
g.drawString("Producet Rate:-                       "+String.valueOf(ir1),40,660);
g.drawString("Producet Price :-                     "+String.valueOf(p1),40,680);
g.drawString("Producet Queatety:-               "+String.valueOf(qu1),40,700);
g.drawString("=============================================",40,720);
g.drawString("Total Amount in Rs:-              "+String.valueOf(t1),40,740);
g.drawString("***************************************************",40,740);


g.setColor(Color.GREEN);
g.drawString("********************Bill 2 ***************************",40,780);
g.drawString("Producet name:-                      "+String.valueOf(in2),40,800);
g.drawString("Producet Rate:-                       "+String.valueOf(ir2),40,820);
g.drawString("Producet Price :-                     "+String.valueOf(p2),40,840);
g.drawString("Producet Queatety:-               "+String.valueOf(qu2),40,860);
g.drawString("=============================================",40,880);
g.drawString("Total Amount in Rs:-              "+String.valueOf(t2),40,900);
g.drawString("***************************************************",40,920);


g.setColor(Color.RED);
g.drawString("********************Bill 3 ***************************",40,940);
g.drawString("Producet name:-                      "+String.valueOf(in3),40,960);
g.drawString("Producet Rate:-                       "+String.valueOf(ir3),40,980);
g.drawString("Producet Price :-                     "+String.valueOf(p3),40,1000);
g.drawString("Producet Queatety:-               "+String.valueOf(qu3),40,1020);
g.drawString("=============================================",40,1040);
g.drawString("Total Amount in Rs:-              "+String.valueOf(t3),40,1060);
g.drawString("***************************************************",40,1080);


g.setColor(Color.BLACK);
g.drawString("********************Bill 4 ***************************",40,1100);
g.drawString("Producet name:-                      "+String.valueOf(in4),40,1120);
g.drawString("Producet Rate:-                       "+String.valueOf(ir4),40,1140);
g.drawString("Producet Price :-                     "+String.valueOf(p4),40,1160);
g.drawString("Producet Queatety:-               "+String.valueOf(qu4),40,1180);
g.drawString("=============================================",40,1200);
g.drawString("Total Amount in Rs:-              "+String.valueOf(t4),40,1220);
g.drawString("***************************************************",40,1240);


g.setColor(Color.BLUE);
g.drawString("********************Bill 5 ***************************",40,1260);
g.drawString("Producet name:-                      "+String.valueOf(in5),40,1280);
g.drawString("Producet Rate:-                       "+String.valueOf(ir5),40,1300);
g.drawString("Producet Price :-                     "+String.valueOf(p5),40,1320);
g.drawString("Producet Queatety:-               "+String.valueOf(qu5),40,1340);
g.drawString("=============================================",40,1360);
g.drawString("Total Amount in Rs:-              "+String.valueOf(t5),40,1380);
g.drawString("***************************************************",40,1400);
}//close of paint()

 public boolean action(Event e,Object obj)
{
	repaint();
	return(true);
}
}//close of class














             