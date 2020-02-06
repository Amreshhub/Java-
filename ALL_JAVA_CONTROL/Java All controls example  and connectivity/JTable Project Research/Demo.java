import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
class Demo extends JFrame
{
       public Demo(Object row[][])
       {
	 Container c=getContentPane();
         c.setLayout(new BorderLayout()) ;
         Object cols[]={"Prodid","Product","CP","Discount","SP"};
         JTable tab=new JTable(row,cols);
	 tab.setFont(new Font("Arial",Font.BOLD,10));
         tab.setRowHeight(20);
         tab.setGridColor(Color.blue);
	 tab.setBackground(Color.white);
	 tab.setEnabled(false);
	    
	 JTableHeader head=tab.getTableHeader();
	 head.setBackground(Color.orange);
	 head.setFont(new Font("Arial",Font.BOLD,20));
	 c.add("North",head);
         c.add("Center",tab);
	      
       }
       
}
