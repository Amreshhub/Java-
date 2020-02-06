package p1;
class student_info
{
	protected  String sid,sname;
	protected  int inst1,inst2,inst3,fee,total,bal;
	
	student_info()
	{
		sid=null;
		sname=null;
		fee=0;
		inst1=0;
		inst2=0;
		inst3=0;
	}
public void accept(String sid,String sname,int fee,int inst1,int inst2,int inst3)
{
	this.sid=sid;
	this.sname=sname;
	this.fee=fee;
	this.inst1=inst1;
	this.inst2=inst2;
	this.inst3=inst3;
}
public void calculate()
{
	total=inst1+inst2+inst3;
	bal=fee-total;
}
public void display()
{
	System.out.println("Student id:-"+sid);
	System.out.println("Student name:-"+sname);
	System.out.println("Student fee:-"+fee);
	
}

}//close of class