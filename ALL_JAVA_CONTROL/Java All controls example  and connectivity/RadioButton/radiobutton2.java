import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class radiobutton2 extends JFrame implements ItemListener
{
   JRadioButton radio[];
   JTextField text;
   ButtonGroup group;
   public radiobutton2()
   { 
     Container c=this.getContentPane();
     c.setLayout(new FlowLayout())  ;
     c.setBackground(Color.cyan);

     radio=new JRadioButton[5];
     group=new ButtonGroup();
     text=new JTextField(20);  
     for(int intindex=0;intindex<radio.length;intindex++)
     {
        radio[intindex]=new JRadioButton("Radio"+(intindex+1));   
        radio[intindex].addItemListener(this);
        c.add(radio[intindex]);
        group.add(radio[intindex]);
     }
     c.add(text);
  }
  public void itemStateChanged(ItemEvent ie)
  {
     String outstring=new String("Currently Selected:\n");
     for(int loopindex=0;loopindex<radio.length;loopindex++)
     {
        if(radio[loopindex].isSelected())
           outstring+="Radio button " + (loopindex+1);
     }
     text.setText(outstring);
  }
  public static void main(String args[])
  {
    radiobutton2 rdb2=new radiobutton2();
    rdb2.setTitle("Radio Button Operation....");
    rdb2.setSize(200,200);
    rdb2.setVisible(true);
    rdb2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}  
