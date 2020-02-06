import javax.swing.*;
class student
{
	String sid,sname;
	int coures_fee,inst1,inst2,inst3,total,balence;
	
	public void accept(String s,String stu_id,int cf)
	{
		sid=stu_id;
		sname=s;
		coures_fee=cf;
	}
	public void input(int i1,int i2,int i3)
	{
		inst1=i1;
		inst2=i2;
		inst3=i3;
	}
	public void calculate()
	{
		total=inst1+inst2+inst3;
		balence=coures_fee-total;
	}
	public void display()
	{
		System.out.println("**********Student recored********************");
		System.out.println("Student id:-"+sid);
		System.out.println("Student name:-"+sname);
		System.out.println("Student Course:-"+coures_fee);
		System.out.println("===============================================");
		System.out.println("Total instolment:-"+total);
		System.out.println("Balence:-          "+balence);
		System.out.println("***********************************************");
		
	}
}
	
	class student_main
	{
		public static void main(String args[])
		{
		String	sid=JOptionPane.showInputDialog(null,"Enter Student id:-");
			
		String	sname=JOptionPane.showInputDialog(null,"Enter Student name:-");
		int	coures_fee=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter cource fee:"));
		int	inst1=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter First instollement:"));
		int	inst2=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Second instollement:"));
		int	inst3=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter third instollement:"));
				 student sobj=new student();
				 sobj.accept(sid,sname,coures_fee);
				 sobj.input(inst1,inst2,inst3);
				 sobj.calculate();
				 sobj.display();

		}
	}
