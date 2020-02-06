import java.awt.*;
class fom extends Frame
{
	Button b1,b2;
	Label l1,l2;
	TextField t1,t2;
public void deg ()
{
	l1=new Label("NAME:-");
	l2=new Label("NAME:-");
	t1=new TextField("TEXT1");
	t2=new TextField("TEXT2");
	b1=new Button("Ok");
	b2=new Button("CANCEL");
	
	setLayout(null);

	l1.setBounds(30,30,60,60);
	t1.setBounds(100,30,60,60);
	l2.setBounds(30,70,60,60);
	t2.setBounds(100,90,60,60);
	b1.setBounds(30,400,60,60);
	b2.setBounds(100,400,60,60);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(b2);
	setBackground(Color.PINK);
	}
}
	class fmain
	{
		public  static void main(String args[])
		{
			
		
			fom  j =new fom();
			j.setTitle("ADDREASS");
			j.setBounds(20,20,1000,1000);
			j.deg();
			j.show();
		}
	}	 
