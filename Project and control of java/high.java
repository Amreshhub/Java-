import java.awt.*;
import java.applet.*;
public class high extends Applet
{
	int a=10,b=20;
public void paint(Graphics s){
	if(a>b){
		s.drawString("a is number",20,30);}
	else
	{
		s.drawString("b Highest number",30,40);}
}//close of paint
}//close of class
	