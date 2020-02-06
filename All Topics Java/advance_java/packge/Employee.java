package details;
public class Employee{

private long ecode;
private String name,post;
private double basic,da,hra,ma=1500,gross,itax=0.0,net;

public Employee(){
ecode=1234456;
name="AMRESH";
post="MANAGER";
basic=0.0;
}

public Employee(long ecode,String name,String post,double basic){
this.ecode=ecode;
this.name=name;
this.post=post;
this.basic=basic;
}
 void input(long ecode,String name,String post,double basic){
this.ecode=ecode;
this.name=name;
this.post=post;
this.basic=basic;
}
void cal_salary(){
da=basic*30/100;
hra=basic*20/100;
gross=basic+da+hra+ma;
if(gross>=15000)
itax=gross*12/100;
net=gross-itax;
}
void display(){

	System.out.println("********Employee Detials*********");
	System.out.println("Employee Ecode            :-"+ecode);
	System.out.println("Name                      :-"+name);
	System.out.println("Employee post             :-"+post);
	System.out.println("Basic pay in RS           :-"+basic);
	System.out.println("Dearness allowance in Rs  :-"+da);
	System.out.println("House rent allowance in Rs:-"+da);
	System.out.println("Madical allowance in Rs   :-"+da);
	System.out.println("----------------------------------");
	System.out.println("Gross/TOtal Amount ion RS :-"+gross);
	System.out.println("Incometax dedction in RS  :-"+itax);
	System.out.println("====================================");
	System.out.println("Net Salary Amount in Rs   :-"+itax);
}
}

