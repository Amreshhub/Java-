import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class JComboBoxd extends JFrame implements ItemListener,ActionListener
   {
      JComboBox box;
      JLabel lbl;
      JButton b1,b2,b3,b4,b5;
      JComboBoxd()
      {
         Container c=this.getContentPane();
         c.setLayout(null);
         b1=new JButton("set");
         b2=new JButton("Show Index");
         b3=new JButton("Item at index");
	 b4=new JButton("Remove Item");
	 b5=new JButton("Remove all");
                  
         lbl=new JLabel();
         lbl.setFont(new Font("lucida sans unicode",Font.BOLD,12));
         box=new JComboBox();
         box.addItem("India");
         box.addItem("America");
         box.addItem("Germany");
         box.addItem("Japan");
         box.addItem("France");
         box.setEditable(true);
         box.addItemListener(this);
         b1.addActionListener(this);
         b2.addActionListener(this);
         b3.addActionListener(this);
	 b4.addActionListener(this);
         b5.addActionListener(this);
	 b1.setBounds(70,70,120,50);
	 b2.setBounds(70,130,120,50);
	 b4.setBounds(200,130,120,50);
	 b3.setBounds(70,190,120,50);
	 b5.setBounds(200,190,120,50);
	 box.setBounds(200,70,120,50);
	 lbl.setBounds(200,250,240,70);
         c.add(box);
         c.add(b1);
         c.add(b2);
         c.add(b3);
         c.add(lbl);
	 c.add(b4);
	 c.add(b5);
                 
        }
      public void itemStateChanged(ItemEvent ie)
      {
          //String str=String.valueOf(box.getSelectedItem());
          lbl.setText("You Selected:-"+box.getSelectedItem());
      }
       public void actionPerformed(ActionEvent ae)
      {
          if (ae.getSource()==b1)
          {
            box.addItem(box.getSelectedItem());
          }
          if (ae.getSource()==b2)
          {
     lbl.setText("Your selected item index:"+String.valueOf(box.getSelectedIndex()));
          }
          if (ae.getSource()==b3)
          {
lbl.setText("Item at index:"+String.valueOf(box.getSelectedIndex())+" is  "+String.valueOf(box.getItemAt(box.getSelectedIndex())));
          }
	  if(ae.getSource()==b4)
     	  {
      		if(box.getItemCount()>0)
        		box.removeItemAt(box.getSelectedIndex());
		else
      			lbl.setText("No item found ");
       	  }
	  if(ae.getSource()==b5)
     	  {
      		box.removeAllItems();	
      		
     	  }
         
       }
      public static void main(String args[])
      {
          JComboBoxd demo=new JComboBoxd();
          demo.setTitle("My combo box");
          demo.setBounds(100,70,450,350);
          demo.setVisible(true);
          demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
     }
