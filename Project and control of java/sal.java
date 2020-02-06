import java.awt.*;
import java.applet.*;
public class sal extends Applet
{
	int basic,gs,total,ta,da,hra,ma,pf;
	
	public void init(){
	basic=8000;
	}//close of init()
		public void start()
		{	
			ta=basic*5/100;
			da=basic*8/100;
			hra=basic*10/100;
			ma=basic*15/100;
			pf=basic*20/100;
			total=basic+ta+da+hra+ma;
			gs=total-pf;
				}//close of start()
	public void paint(Graphics a)
	{
		a.drawString("**************************************************",40,40);
		a.drawString("===========SALLARY==============",40 ,50);
		a.drawString("Basic pay in Rs:-"+basic,40,60);
		a.drawString("Travel allowens in Rs:-                                  	"+ta,40,70);
		a.drawString("Dearneass allowens in Rs:-			"+da,40,80);
		a.drawString("House rent allowence in Rs:-			"+ hra,40,90);
		a.drawString("madical allowance in Rs:-			"+ ma,40,100);
		a.drawString("================================",40,110);
		a.drawString("Total salary in Rs:-			"+ total,40,120);
		a.drawString("Deduceton in provznal fand in Rs:-		"+ pf,40,130);
		a.drawString("================================",40,140);
		a.drawString("Gross/net sallery in Rs:-			"+gs,40,150);
		a.drawString("***************************************************",40,160);
		}//close of paint()
	}//close of class