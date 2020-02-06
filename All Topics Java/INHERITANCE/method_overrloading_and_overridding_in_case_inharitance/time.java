//program to show method output() overriding by sub class full_time and part_time
//Defining super class Employee
class Employee{
  private String ename,address;
  private long mob_no;

	void input(String ename,String address,long mob_no){
		this.ename=ename;
		this.address=address;
		this.mob_no=mob_no;
		}
	void output(){
	   System.out.println("********Displaying Employee Information*******");
		System.out.println("Employee Name="+ename);
		System.out.println("Employee Address="+address);
		System.out.println("Employee Mobile_no="+mob_no);
		}
}//close of super class Employee
//Definnig sub class Full_time
class Full_time extends Employee{
  private String ecode,post;
  private double salary;

	void input(String ename,String address,long mob_no,String ecode,String post,double salary){
		input(ename,address,mob_no);
		this.ecode=ecode;
		this.post=post;
		this.salary=salary;
		}
	void output(){
	   super.output();
		System.out.println("Employee code="+ecode);
		System.out.println("Employee post="+post);
		System.out.println("Employee salary="+salary);
		}
}//close of sub class Full_time
//Definnig sub class part_time
class part_time extends Employee{

  private double dwases;

	void input(String ename,String address,long mob_no,double dwases){
		input(ename,address,mob_no);
		this.dwases=dwases;
		
		}
	void output(){
	   super.output();
		System.out.println("Employee Wases="+dwases);
		}
}//close of sub class part_time

class time{
	public static void main(String args[]){
	Full_time f=new Full_time();
	f.input("amresh","anisabad",12345,"e001","Manager",44000);
	f.output();
	
	part_time t=new part_time();
	t.input("Bikash","Boring_Road",2345,12000);
	t.output();
}
}

	

	
	 