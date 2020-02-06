    import java.awt.*;
    import javax.swing.*;
    public class Jlabel1 extends JFrame
    { 
       JLabel lbl;
       public Jlabel1()
       {
           Container c=this.getContentPane();
           c.setLayout(new FlowLayout());
           c.setBackground(Color.blue);
           Font f=new Font("Helvetica",Font.ITALIC,32);
           lbl=new JLabel("HELLO PRAVEEN");
           lbl.setFont(f);
           lbl.setForeground(Color.red);
           lbl.setVisible(true);
           lbl.setToolTipText("This is praveen");
           lbl.setHorizontalTextPosition(JLabel.LEFT);
           c.add(lbl);
       }
    
    public  static void main(String args[])
    {
          Jlabel1 lblobj=new Jlabel1();
          lblobj.setTitle("My first label is displaying....");
          lblobj.setSize(500,300);
          lblobj.setVisible(true);
          lblobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
  }                 