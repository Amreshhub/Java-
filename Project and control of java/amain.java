import java.awt.*;
class g extends Frame
{
	Button b1,b2;
	TextField t1,t2;
	Label l1,l2;
public void de()
{
	l1=new Label("name1:-");
	t1=new TextField("Text1");
	l2=new Label("name2:-");
	t2=new TextField("Text2");
	b1=new Button("OK");
	b2=new Button("cencle");
	
	setLayout(null);
	
	l1.setBounds(30,20,60,50);
	t1.setBounds(140,20,60,50);
	l2.setBounds(30,140,60,50);
	t2.setBounds(150,140,60,50);
	b1.setBounds(100,200,60,50);
	b2.setBounds(200,200,60,50);
	
	add(l1);
	add(l2);
	add(t1);
	add(t2);
	add(b1);
	add(b2);
	setBackground(Color.BLUE);
}
}
	class amain
	{
		public  static void main(String args[])
		{
			

			g i =new g();
			i.setTitle("AMRESH");
			i.setBounds(30,30,500,500);
			i.de();
			i.show();
		}
	}	