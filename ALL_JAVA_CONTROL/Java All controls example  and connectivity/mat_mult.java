import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
class mat_mult extends JFrame implements ActionListener
{
	JButton b1;
	double sum=0,p,q;
	int i,j,k;
	Object x,y;
	JTable table1,table2,table3;
	public mat_mult()
	{
		Container c=getContentPane();
        c.setLayout(null);
		c.setBounds(100,100,600,600);
		Object cols1[]={"col1","col2","col3"};
		Object cols2[]={"col1","col2","col3"};
		Object cols3[]={"col1","col2","col3"};
                Object row1[][]=new Object[3][3];
		Object row2[][]=new Object[3][3];
		Object row3[][]=new Object[3][3];
		
        table1=new JTable(row1,cols1);
        table1.setFont(new Font("Arial",Font.BOLD,10));
        table1.setRowHeight(20);
        table1.setGridColor(Color.blue);
		table1.setBackground(Color.white);
		table1.setEnabled(true);
		table1.setBounds(100,100,200,200);
		
	 table2=new JTable(row2,cols2);
        table2.setFont(new Font("Arial",Font.BOLD,10));
        table2.setRowHeight(20);
        table2.setGridColor(Color.blue);
		table2.setBackground(Color.white);
		table2.setEnabled(true);
		table2.setBounds(400,100,200,200);
		
	 table3=new JTable(row3,cols3);
        table3.setFont(new Font("Arial",Font.BOLD,10));
        table3.setRowHeight(20);
        table3.setGridColor(Color.blue);
		table3.setBackground(Color.white);
		table3.setEnabled(false);
		table3.setBounds(300,400,200,200);
		
        JTableHeader head1=table1.getTableHeader();
		head1.setBackground(Color.cyan);
		head1.setFont(new Font("Arial",Font.BOLD,20));
		head1.setBounds(100,80,200,20);
		
		JTableHeader head2=table2.getTableHeader();
		head2.setBackground(Color.cyan);
		head2.setFont(new Font("Arial",Font.BOLD,20));
		head2.setBounds(400,80,200,20);
		
		JTableHeader head3=table3.getTableHeader();
		head3.setBackground(Color.cyan);
		head3.setFont(new Font("Arial",Font.BOLD,20));
		head3.setBounds(300,380,200,20);
		
		b1=new JButton("OK");
		b1.setBounds(380,650,70,30);
		b1.addActionListener(this);
		
		c.add(head1);
		c.add(head2);
		c.add(head3);
               c.add(table1);
		c.add(table2);
		c.add(table3);
		c.add(b1);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			for(k=0;k<3;k++)
			{
				for(j=0;j<3;j++)
				{
					sum=0;
					for(i=0;i<3;i++)
					{
						x=table1.getValueAt(k,i);
						p=Double.parseDouble(x.toString());
						y=table2.getValueAt(i,j);
					        q=Double.parseDouble(y.toString());
						sum=sum+(p*q);
					}
						table3.setValueAt(String.valueOf(sum),k,j);
				}
			}
			
		}
	}
	public static void main(String args[])
	{
        mat_mult t1=new mat_mult();
        int w = Toolkit.getDefaultToolkit().getScreenSize().width;
		int h = Toolkit.getDefaultToolkit().getScreenSize().height;
		t1.setSize(w,h);
        t1.setVisible(true);
        t1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
