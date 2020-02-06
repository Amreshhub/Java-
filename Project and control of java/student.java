import java.awt.*;
import java.applet.*;
public class student extends Applet
{
	public void paint(Graphics g)
{
	String name = "amresh",course = "BCA";
	int enroll=12345;
	int roll=200;
	int c=40,cpp=68,java=70,total,per;
	
		total=c+cpp+java;
		per=total/3;
	g.drawString("STUDENT INFORAMATION",40,30);
	g.drawString("=========================",40,40);
	g.drawString("Student name="+name,40,50);
	g.drawString("Student course="+course,40,60);
	g.drawString("Student Enrollment no="+enroll,40,70);
	g.drawString("Student Roll="+roll,40,80);
	g.drawString("Marks obtant in C="+c,40,90);
	g.drawString("Marks obtant in CPP="+cpp,40,100);
	g.drawString("Marks obtant in JAVA="+java,40,110);	
	g.drawString("=========================",40,120);
	g.drawString("Total Marks obtant ="+total,40,130);
	g.drawString("Percentage of one student="+per+"%",40,140);
		if(per>=80)
		{
		g.drawString("Grade =A",40,150);
			}//close of for
	    	if(per>=65&&per<80)
		{
		g.drawString("Grade =B",40,160);
			}//close of for
		if(per>=45&&per<65)
		{
		g.drawString("Grade =C",40,170);
			}//close of for
		if(per<45)
		{
		g.drawString("Grade =Fail",40,180);		
			}//close of for
}//close of paint
}//close of class

		


			




	