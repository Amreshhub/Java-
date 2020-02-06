import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class jcombobox1 extends JFrame implements ItemListener,ActionListener
{
  JComboBox box;
  JLabel lbl1,lbl2;
  JButton button1;
  jcombobox1()
  {
    Container c=getContentPane();
    c.setLayout(null);
    
    box=new JComboBox();
    box.addItem("India"); 
    box.addItem("America");
    box.addItem("London");
    box.addItem("Japan");
    box.addItem("France");
    
    box.setBounds(170,70,100,40);
    
    c.add(box);
    
    lbl1=new JLabel();
    lbl1.setBounds(100,200,400,200);
    
    lbl2=new JLabel();
    lbl2.setBounds(140,230,400,200);
    
    c.add(lbl1);
    c.add(lbl2); 
    box.addItemListener(this);

    button1=new JButton("Remove each element"); 
    button1.addActionListener(this);
    button1.setBounds(50,70,100,50);
    c.add(button1);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
   
   public void itemStateChanged(ItemEvent ie)
   {
      String str=(String)box.getSelectedItem();
      int index=box.getSelectedIndex();
      int tot_count=box.getItemCount();
      lbl1.setText("You selected:"+str+" and its index is"+ index);
      lbl2.setText("Total count of element is"+tot_count);
   }
   public void actionPerformed(ActionEvent ae)
   {

     if(ae.getSource()==button1)
     {
      if(box.getItemCount()>0)
        box.removeItemAt(box.getSelectedIndex());
	//   box.removeAllItems();	
      else
      {
       lbl1.setText("No item found ");
       lbl2.setText("");
      }
     }

   }
   public static void main(String args[])
  {
     jcombobox1 demo =new jcombobox1();
     demo.setTitle("My combo box");
     demo.setSize(500,400);
     demo.setVisible(true);
  }
}    