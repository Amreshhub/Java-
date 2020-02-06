import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
class _Table extends JFrame
{
       public _Table()
       {
	double sum=0.0;
	int i,j;
	Container c=getContentPane();
        c.setLayout(new BorderLayout()) ;
	Object cols[]={"Eid","Name","Salary"};
        Object row[][]=new Object[4][3];
	Object x;
	for(i=0;i<3;i++)
	{
		for(j=0;j<=2;j++)
		{
			if(j==0)
				row[i][j]=JOptionPane.showInputDialog("Enter the employee id for["+i+"]["+j+"]:-");
			if(j==1)
				row[i][j]=JOptionPane.showInputDialog("Enter the employee name for["+i+"]["+j+"]:-");
			if(j==2)
				row[i][j]=JOptionPane.showInputDialog("Enter the employee salary for["+i+"]["+j+"]:-");
		}
	}
	
	
	row[3][0]="Summation";
        row[3][1]="====>>>";
        JTable tab=new JTable(row,cols);
       	tab.setFont(new Font("Arial",Font.BOLD,10));
       	tab.setRowHeight(20);
       	tab.setGridColor(Color.green);
	tab.setBackground(Color.white);
	tab.setEnabled(true);
	for(i=0;i<tab.getRowCount()-1;i++)
	{
         		x=tab.getValueAt(i,2);
         		double p=Double.parseDouble(x.toString());
         		sum+=p;
	 }
	 tab.setValueAt(String.valueOf(sum),i,2);
         JTableHeader head=tab.getTableHeader();
	 head.setBackground(Color.orange);
	 head.setFont(new Font("Arial",Font.BOLD,20));
	 tab.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
	 c.add("North",head);
         c.add("Center",tab);
	      
       }
       public static void main(String args[])
       {
              	_Table demo=new _Table();
              	int w = Toolkit.getDefaultToolkit().getScreenSize().width;
     	        int h = Toolkit.getDefaultToolkit().getScreenSize().height;
	        demo.setSize(w,h);
	        demo.setVisible(true);
              	demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       }
 }
