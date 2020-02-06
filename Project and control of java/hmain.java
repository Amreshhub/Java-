import java.awt.*;
class  refome extends Frame
{
	Label  l1,l2;
	TextField t1,t2;
	Button b1,b2;
public void de()
{
	l1 =new Label("NAME1:-");
	l2=new Label("NAME2:-");
	t1=new TextField("Text1");
	t2=new TextField("Text2");
	b1=new Button("OK");
	b2=new Button("CANCEL");
	
	setLayout(null);
	l1.setBounds(20,20,70,100);
	t1.setBounds(100,50,70,20);
	l2.setBounds(40,40,70,100);
	t2.setBounds(200,40,70,100);
	b1.setBounds(400,60,70,100);
	b2.setBounds(500,60,70,100);
		add(l1);
		add(l2);
		add(t1);
		add(t2);
		add(b1);
		add(b2);
	setBackground(Color.RED);
}
}
class hmain
{
	public static void main(String args[])
	{
		refome f1=new refome();
		f1.setTitle("AMRESH");
		f1.setBounds(20,20,500,500);
		f1.de();
		f1.show();
	}
}