import java.awt.*;
class k extends Frame
{
	Button b1,b2;
	Label l1,l2,l3,l4;
	TextField t1,t2,t3,t4;
public void de()
{
	l1=new Label("NAME1:-") ;
	l2=new Label("NAME2:-") ;
	l3=new Label("NAME3:-") ;
	l4=new Label("NAME4:-") ;
	t1=new TextField("TEXT1");
	t2=new TextField("TEXT2");
	t3=new TextField("TEXT3");
	t4=new TextField("TEXT4");
	b1=new Button("OK");
	b2=new Button("CENCAL");

	setLayout(null);
	
	setBackground(Color.RED);
	
	l1.setBounds(30,30,30,60);
	t1.setBounds(70,30,30,60);
	l2.setBounds(30,70,30,60);
	t2.setBounds(70,90,30,60);
	l3.setBounds(30,100,30,60);
	t3.setBounds(70,100,30,60);
	l4.setBounds(30,130,30,60);
	t4.setBounds(70,130,30,60);
	b1.setBounds(30,200,40,70);
	b2.setBounds(80,200,40,70);

	add(l1);
	add(l2);
	add(l3);
	add(l4);
	add(t1);
	add(t2);
	add(t3);
	add(t4);
	add(b1);
	add(b2);

	}
}
	class kamain
	{
		public static void main(String args[])
		{
			
	
			k j=new k();
			j.setTitle("AMRESH");
			j.setBounds(20,20,1500,1500);
			j.de();
			j.show();
		}
	}