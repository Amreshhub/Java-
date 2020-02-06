import java.awt.*;
class f2 extends Frame
{
	Button b1,b2;
	Label  l1,l2;
	TextField t1,t2;
	Color c1;
public void d()
{
		l1=new Label("Name1:");
		b1=new Button("OK");
		l2=new Label("Name2");
		b2 =new Button("EXIT");
		t1=new TextField(20);
		t2=new TextField(20);
			setLayout(null);
		l1.setBounds(20,20,100,100);
		t1.setBounds(140,20,100,100);
		l2.setBounds(20,140,100,100);
		t2.setBounds(140,140,100,100);
		b1.setBounds(40,300,100,100);
		b2.setBounds(180,300,100,100);

			add(l1);
			add(l2);
			add(b1);
			add(b2);
			add(t1);
			add(t2);
			
			setBackground(Color.BLUE);
}//close of degine

}//close of  extends
	class  gmain
	{
	public static void main(String args[])
	{
		f2 f =new f2();
		f.d();
		f.setTitle("STUDENT FOME");
			f.setBounds(30,30,500,500);
			f.show();
	}//close of main
}//close of gmain
						

	