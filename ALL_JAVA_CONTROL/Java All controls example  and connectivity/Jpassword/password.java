import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class password extends JFrame implements ActionListener
{
     	JLabel jlbPassword;
     	JPasswordField jpwName;
     	JButton b1;
	public password()
       	{
         		Container c=this.getContentPane();
        		c.setLayout(null);
         		c.setBackground(Color.cyan);
	         	jlbPassword=new JLabel("Enter the password");
         		jpwName=new JPasswordField();
         		jpwName.setEchoChar('*');
		b1=new JButton("Click Here!");
         		b1.addActionListener(this);
	 	b1.setBounds(10,10,120,40);
	 	jpwName.setBounds(10,60,120,40);
         		c.add(jlbPassword);
         		c.add(jpwName);
         		c.add(b1);
	 
       	}
           	public void actionPerformed(ActionEvent ae)
           	{
             	 	if(ae.getSource()==b1)
              		{
                 		String pass=jpwName.getText();
                 		if(pass.equals("praveen"))
		        		JOptionPane.showMessageDialog(null,"Correct password");
		 	else
                    			JOptionPane.showMessageDialog(null,"Sorry.Try again");
              		}
         	 }
             public static void main(String args[])
              {
                	password but4=new password();
                	but4.setTitle("Button Operation....");
                	but4.setBounds(200,150,140,150);
                	but4.setVisible(true);
                	but4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              }
 }
