import java.awt.*;
import java.applet.*;
public class even extends Applet
{
	int num,b,num2;
	TextField a1,a2;
public void init(){
	a1=new TextField(20);
	add(a1);
}
public void paint(Graphics g)
{
	g.drawString("How many num do you want to enter:-",40,20);
	num=Integer.parseInt(a1.getText());
for(b=1;num<0;b++)
{
	g.deawString("Enter number:-"+String.valueOf(b+1),40,40);
	a2=new TextField(20);
	add(a2);
	num2=Integer.parseInt(a2.getText());
	if(num2%2==0)
	{                  
		g.drawString("Given number is Even:-"+String.valueOf(num2),40,60);
	}
	else{
		
		g.drawString("Given number is odd:-"+String.valueOf(num2),40,80);
	}
}
}
public boolean action(Event g,Object h)
{
	repaint();
	return(true);
}
}//close of class

