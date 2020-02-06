import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;   
public class KeyListenerTester extends JFrame implements KeyListener,FocusListener
{  
  JTextField t1,t2;
  public KeyListenerTester(String s )
  {  
    super(s);
    Container c=this.getContentPane();
    c.setLayout(null);;
    t1=new JTextField();
    t2=new JTextField();
    t1.addKeyListener ( this ) ; 
	t2.addKeyListener ( this ) ; 
    t2.addFocusListener ( this ) ; 
	  t1.addFocusListener ( this ) ; 
    t1.setVisible(true);
    t1.setBounds(13,10,200,65);
    t2.setBounds(13,85,200,65);
    t2.setVisible(true);
    c.add(t1);
    c.add(t2);
  }
  public void keyTyped ( KeyEvent e )
  {}  
  public void keyPressed ( KeyEvent e)
  {  
    if(e.getKeyCode()==e.VK_F1)
       t1.setText("You have pressed F1");
	JOptionPane.showMessageDialog(null,e.getKeyCode());
    if(e.getKeyCode()==e.VK_DELETE)
       t1.setText("You have pressed DELETE");  
    if(e.getKeyCode()==e.VK_LEFT)
       t1.setText("You have pressed LEFT");  
    if(e.getKeyCode()==e.VK_1)
       t1.setText("You have pressed 1"); 
    if(e.getKeyCode()==e.VK_ESCAPE)
       System.exit(0);     
  }  
    public void keyReleased ( KeyEvent e )
    {  
     
    }  

   public void focusGained(FocusEvent fe)
   {
	if(fe.getSource()==t2)
      		t2.setText("FOCUS GAINED CALLED...."); 
	if(fe.getSource()==t1)
		t1.setText("This is text box1"); 
   } 
   public void focusLost(FocusEvent fe)
   {

      t2.setText("FOCUS LOST CALLED....");  
   } 
    public static void main (String[]args )
    {  
       KeyListenerTester al=new KeyListenerTester ( "Key Listener Tester" );
       al.setBounds(300,300,250,200);
       al.setVisible(true);
       al.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }  
  }  
