package p1;
import javax.swing.*;
import p1.student_info;
import p1.inter;

public class  child_student_info extends student_info implements inter
{
	public child_student_info()
	{
		super();
	}
public void accept(String sid,String sname,int fee)
{
	int i1,i2,i3;
	i1=Integer.parseInt(JOptionPane.showInputDialog("Enter first insttlament:-"));
	i2=Integer.parseInt(JOptionPane.showInputDialog("Enter first insttlament:-"));
	i3=Integer.parseInt(JOptionPane.showInputDialog("Enter first insttlament:-"));
	
	super.accept(sid,sname,fee,i1,i2,i3);
}
public void display()
{
	System.out.println("First instalment1:-"+inst1);
	System.out.println("Second instalment1:-"+inst2);
	System.out.println("Third instalment"+inst3);
	System.out.println("Total lment1:-"+total);
	System.out.println("Total balance:-"+bal);
}
}