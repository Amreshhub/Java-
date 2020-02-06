import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class TabbedPaneExample     extends     JFrame implements ActionListener
{
    private     JTabbedPane tabbedPane;
    private     JPanel      panel1;
    private     JPanel      panel2;
    private     JButton     b1  ;
    

    public TabbedPaneExample()
    {
        Container c=this.getContentPane();
        c.setLayout( new BorderLayout());
        // Create the tab pages
        createPage1();
        createPage2();
        // Create a tabbed pane
        tabbedPane = new JTabbedPane();
        tabbedPane.addTab( "Page 1", panel1 );
        tabbedPane.addTab( "Page 2", panel2 );
        c.add( tabbedPane);
    }

    public void createPage1()
    {
        panel1 = new JPanel();
        panel1.setLayout( null );

        JLabel label1 = new JLabel( "Username:" );
        label1.setBounds( 10, 15, 150, 20 );
        panel1.add( label1 );

        JTextField field = new JTextField();
        field.setBounds( 10, 35, 150, 20 );
        panel1.add( field );

        JLabel label2 = new JLabel( "Password:" );
        label2.setBounds( 10, 60, 150, 20 );
        panel1.add( label2 );

        JPasswordField fieldPass = new JPasswordField();
        fieldPass.setBounds( 10, 80, 150, 20 );
        panel1.add( fieldPass );
    }

    public void createPage2()
    {
        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        b1=new JButton("OK");
        b1.addActionListener(this);
        panel2.add( new JButton( "North" ) );
        panel2.add( new JButton( "South" ) );
        panel2.add(b1);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
       JOptionPane.showMessageDialog(null,"Welcome to Megasoft IT solution");
    }
   
    // Main method to get things started
    public static void main( String args[] )
    {
        // Create an instance of the test application
        TabbedPaneExample mainFrame = new TabbedPaneExample();
        mainFrame.setTitle( "Tabbed Pane Application" );
        mainFrame.setBounds( 200,200,200,200 );
        mainFrame.setBackground( Color.gray );
        mainFrame.setVisible( true );
    }
    
}









