import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class menu22 extends JFrame implements ActionListener
{
        JMenuBar jmenubar1;
        JMenu jmenu1,submenu;
        JMenuItem jmenuitem1,jmenuitem2,jmenuitem3;
        JMenuItem subitem1,subitem2;
        Container c;
        menu22()
        {
                c=getContentPane();
                c.setLayout(new BorderLayout());
                c.setBackground(Color.cyan);
                jmenubar1=new JMenuBar();
                jmenu1=new JMenu("File");

                jmenuitem1=new JMenuItem("New",new ImageIcon("new.gif"));
                jmenuitem2=new JMenuItem("Open",new ImageIcon("c://open.gif"));
                jmenuitem3=new JMenuItem("Exit");
	
	jmenu1.add(jmenuitem1);
                jmenu1.add(jmenuitem2);
                jmenuitem1.setMnemonic('n');

                jmenu1.addSeparator();
                jmenu1.add(jmenuitem3);
                jmenu1.addSeparator();
                jmenubar1.add(jmenu1);

                submenu=new JMenu("Sub Menu");
                subitem1=new JMenuItem("Sub Menu1");
                subitem2=new JMenuItem("Sub Menu2");

                submenu.add(subitem1);
                submenu.add(subitem2);
		subitem1.setBackground(Color.green);

                                     jmenu1.add(submenu);

		               
         	jmenuitem1.addActionListener(this);
         	jmenuitem2.addActionListener(this);
         	jmenuitem3.addActionListener(this);
         	subitem1.addActionListener(this);
         	subitem2.addActionListener(this);

         	c.add("North",jmenubar1);
         }

         public void actionPerformed(ActionEvent e)
         {
         	if(e.getSource()==subitem1)
                 {
        		c.setBackground(Color.blue);
                        jmenubar1.add(jmenu1);
                 }
                        
        	else if(subitem2.isArmed())
        		c.setBackground(Color.pink);
        	else if(jmenuitem3.isArmed())
                         System.exit(0);
        	else
        		c.setBackground(Color.green);
        }
        public static void main(String args[])
        {
        	menu22 menuobj=new menu22();
        	menuobj.setSize(400,400);
        	menuobj.setVisible(true);
        	menuobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	menuobj.setTitle("Menu bar is displaying");
        }
}




