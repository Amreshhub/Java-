package call_sal_details;
import java.util.*;
import details;
class call_details{
public static void main(String args[]){
Scanner x=new Scanner(System.in);
System.out.println("Enter Employee code:-");
long ecode=x.nextLong();
System.out.println("Enter Employee name:-");
String name=x.next();
System.out.println("Enter Employee post:-");
String post=x.next();
System.out.println("Enter Basic pay in RS:-");
double basic=x.nextDouble();

Employee e=new Employee();
e=new Employee(ecode,name,post,basic);
e.input(ecode,name,post,basic);
e.cal_salary();
e.display();
}
}



