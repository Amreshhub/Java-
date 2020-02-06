  import java.awt.*;
  import javax.swing.*;
  import javax.swing.table.*;
  class _Table extends JFrame
   {
       public _Table()
       {
	 double sum=0.0;
	 int i;
	 Container c=this.getContentPane();
         c.setLayout(new BorderLayout()) ;
         Object cols[]={"Eid","Name","Salary"};
         Object row[][]=new Object[3][3];
	 Object x;
	
         row[0][0]="E001";
         row[0][1]="Amit";
         row[0][2]="22000.00";
         
	 row[1][0]="E002";
         row[1][1]="Prashant";
         row[1][2]="18000.50";
          
	 
	 row[2][0]="Summation";
         row[2][1]="====>>>";
         
         JTable tab=new JTable(row,cols);
         tab.setFont(new Font("Arial",Font.BOLD,10));
         tab.setRowHeight(20);
         tab.setGridColor(Color.blue);
	 tab.setBackground(Color.white);
	 tab.setEnabled(false);
	 
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










