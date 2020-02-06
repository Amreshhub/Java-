
import javax.swing.*;
import p1.child_student_info.*;
public class student_main
  {
  
	   child_student_info[]sobj=new child_student_info[2];
	     for(int i=0;i<=1;i++)
	{
	sid=JOptionPane.showInputDialog("Enter first insttlament:-");
	sname=JOptionPane.showInputDialog("Enter first insttlament:-");
	fee=Integer.parseInt(JOptionPane.showInputDialog("Enter first insttlament:-"));
	sobj[i]=new child_student_info(sid,sname,fee);
	sobj[i].accept();
	sobj[i].calculate();
	sobj[i].display();
	
	}
  }
	
