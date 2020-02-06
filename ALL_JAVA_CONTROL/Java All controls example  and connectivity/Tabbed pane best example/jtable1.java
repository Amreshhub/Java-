import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.border.*;
import java.util.*;
    public class jtable1 extends JPanel
    {
       jtable1()
       {
         Vector data=new Vector();
         Vector row=new Vector();
         Object x;
         row.add("Rama rao");
         row.add("Analyst");
         row.add("22000.00");
         data.add(row);

          row=new Vector();
          row.add("Srinivas kumar");
          row.add("Programmer");
          row.add("18000.50");
          data.add(row);

          row=new Vector();
          row.add("Vinaya devi");
          row.add("Programmer");
          row.add("16000.75");
          data.add(row);

         Vector cols=new Vector();
         cols.add("Employee Name");
         cols.add("Designation");
         cols.add("Salary");

         JTable tab=new JTable(data,cols);
         tab.setFont(new Font("Arial",Font.BOLD,30));
         tab.setRowHeight(40);
         tab.setGridColor(Color.red);
	 
         x=tab.getValueAt(0,2);
         double p=Double.parseDouble(x.toString());
         p+=2000.00;
	 
          JOptionPane.showMessageDialog((Component)null,p,"Message",JOptionPane.PLAIN_MESSAGE);
          
          JTableHeader head=tab.getTableHeader();
          tab.setBackground(Color.cyan);
          setLayout(new BorderLayout());
          add("North",head);
          add("Center",tab);
       }
            public static void main(String args[])
            {
              jtable1 demo=new jtable1();
              demo.setSize(300,300);
              demo.setVisible(true);
              demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           }
      }
