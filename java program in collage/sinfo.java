//wap to input one student name,roll and fee print then;
import java.io.*;
class sinfo
{
public static void main(String args[]) throws IoException
{
String Sname=new String();
int roll;
float fee;

InputStreamReader amresh=new InputStreamReader(System.in);

BufferedReader puttu=new BufferedReader(amresh);

System.out.println("Enter Student name:");

Sname=puttu.readLine();

System.out.println("Enter Student Roll:-");
roll=Integer.ParseInt(puttu.readLine());
System.out.println("Enter Student fee:-");
fee=Float.valueof(puttu.readLine()) .float value();


System.out.println("name="+Sname);

System.out.println("Roll="+roll);

System.out.println("Fee="+fee);
}
}


