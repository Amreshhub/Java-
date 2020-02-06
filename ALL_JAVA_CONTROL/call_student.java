import javax.swing.*;
import p1.child_student_info;
class call_student{
public static void main(String a[]){
child_student_info[] sf=new child_student_info[5];
int i,cf,inst1,inst2,inst3;
String id,nm;
for(i=0;i<1;i++){
sf[i]=new child_student_info();
id=JOptionPane.showInputDialog("Enter the student id:");
nm=JOptionPane.showInputDialog("Enter the student name:");
  cf=Integer.parseInt(JOptionPane.showInputDialog("Enter the student course fee:"));
 // inst1=Integer.parseInt(JOptionPane.showInputDialog("Enter the first installment:"));
  //inst2=Integer.parseInt(JOptionPane.showInputDialog("Enter the second installment:"));
  //inst3=Integer.parseInt(JOptionPane.showInputDialog("Enter the third installment:"));
sf[i].accept(id,nm,cf);
sf[i].calculate();
}
for(i=0;i<1;i++)
{

System.out.println("********************************************");
sf[i].display();
System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
}
}
}