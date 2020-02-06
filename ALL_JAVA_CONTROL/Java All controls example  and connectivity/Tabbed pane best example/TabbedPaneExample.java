import p1.button1;
import p1.coffee;
import java.awt.*;
import javax.swing.*;
class TabbedPaneExample  extends  JFrame 
{
    private     JTabbedPane tabbedPane;
      
    public TabbedPaneExample()
    {
        Container c=this.getContentPane();
        c.setLayout( new BorderLayout() );
        button1 bt=new button1();
        coffee cf=new coffee();
        tabbedPane = new JTabbedPane();
        tabbedPane.addTab( "Page 1", bt );
        tabbedPane.addTab( "Page 2", cf );
        c.add( tabbedPane);
    }

    // Main method to get things started
    public static void main( String args[] )
    {
        TabbedPaneExample mainFrame = new TabbedPaneExample();
        mainFrame.setTitle( "Tabbed Pane Application" );
        mainFrame.setSize( 300, 200 );
        mainFrame.setBackground( Color.gray );
        mainFrame.setVisible( true );
    }
    
}

