import java.awt.*;
class forme1 extends Frame
{
	TextField t1,t2;
	Label  l1,l2;
	Button b1,b2;
	Color c1;
public void design()
{
	l1=new Label("labal1");
	l2=new Label("labal2");
	t1=new TextField("TEXT1");
	t2=new  TextField("TEXT2");
	b1=new Button("Button1");
	b2=new Button("Button2");

setLayout(null);
	l1.setBounds(20,20,80,100);
	t1.setBounds(100,20,80,100);
	l2.setBounds(20,140,80,100);
	t2.setBounds(120,140,80,100);
	b1.setBounds(40,300,100,100);
	b2.setBounds(180,300,100,100);
		add(l1);
		add(l2);
		add(t1);
		add(t2);
		add(b1);
		add(b2);
	setBackground(Color.RED);
}
}
     	class fome2main
{
	public static void main(String args[])
	{
		
		forme1 f1=new forme1();
		f1.setTitle("FOME1");
		f1.setBounds(20,20,500,500);
		f1.show();
		f1.design();
}
}