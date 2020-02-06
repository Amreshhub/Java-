//EXAMPLE TO DEMONSTRATE BUFFERED CLASS
import java.io.*;
class student
{
	String sid;
	String sname;
	int fee,inst1,inst2,inst3,total,bal;
	
public String input() throws  IOException
{
	BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
	return(b.readLine());
}



public student(String stid,String stname,int sfee)throws  IOException{
	
	System.out.println("Enter Three Instment:-");
	inst1=Integer.parseInt(input());
	inst2=Integer.parseInt(input());
	inst3=Integer.parseInt(input());
	
	sid=stid;
	sname=stname;
	fee=sfee;
	
}
public  student(){
	
	sid=null;
	sname=null;
	fee=0;
	inst1=0;
	inst2=0;
	inst3=0;
	total=0;
	bal=0;
}
public void calculate(){
	total=inst1+inst2+inst3;
	bal=total-fee;
}
public void disp(){
	System.out.println("===========Student record============");
	System.out.println("Student Name:-"+sname);
	System.out.println("Student id:-"+sid);
	System.out.println("Student fee:-"+fee);
	System.out.println("Student first instalment:-"+inst1);
	System.out.println("Student Second instalment:-"+inst2);
	System.out.println("STudent treeed instalment:-"+inst3);
	System.out.println("=======================================");
	System.out.println("Total inastalment;-"+total);
	System.out.println("Fee              :-"+fee);
	System.out.println("======================================");
	System.out.println("Balence              :-"+bal);
}

}
class BUFFERED_READER_CLASS
{
	public static void main(String args[])throws  IOException
	{
		
		String name ;
		String id;
		int fee;
		student s=new student();
		
		
		System.out.println("Enter Student name:-");
		name=s.input();
		System.out.println("Enter Student id:-");
		id=s.input();
		System.out.println("Enter student fee:-");
		fee=Integer.parseInt(s.input());
		student s2=new student(name,id,fee);
		s2.calculate();
		s2.disp();
	}
}