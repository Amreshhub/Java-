/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * View_member.java
 *
 * Created on May 15, 2012, 8:32:18 PM
 */

/**
 *
 * @author Amresh
 */
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class View_member extends javax.swing.JFrame implements ItemListener
{
        Connection con;
	Statement st;
	ResultSet rs;
	ResultSetMetaData rmeta;


    /** Creates new form View_member */
    public View_member() {
        initComponents();
        cb1.addItemListener(this);
        cb1.addItem("Select Item");
        
    }
    public boolean setconn(String ds,String user,String pwd)
{
	try{

	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	String url="jdbc:odbc:"+ds;
	con=DriverManager.getConnection(url,user,pwd);
	return(true);

	}
catch(Exception e)
{
	System.out.print(e.getMessage());
	 return(false);
}
    }
     public void mySelect(String table)
{
    try
    {
        st=con.createStatement();
        String sql="SELECT * From "+table;
        rs=st.executeQuery(sql);
        //myDisplayResult(result);
              while(rs.next())
           {
            cb1.addItem(rs.getString(1));
           }
    }
    catch(Exception e)
    {
        System.out.println("Error:"+e.getMessage());

    }



}
     public void itemStateChanged(ItemEvent ie)
     {
          try
        {
         if(ie.getSource()==cb1)
         {
            st=con.createStatement();
            String sql="SELECT * FROM NEW_MEMBER";
            rs=st.executeQuery(sql);
            String mid=cb1.getSelectedItem().toString();
            while(rs.next())
            {
                 if (mid.equals(rs.getString(1)))
            {
                   
                    t2.setText(rs.getString(2));
                    t3.setText(rs.getString(8));
                    t4.setText(rs.getString(3));
                    t5.setText(rs.getString(11));
                    t6.setText(rs.getString(6));
          } //}
            }           
            }        
          }
catch(Exception e)
{
	JOptionPane.showMessageDialog(this,e.getMessage());

}
     }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        cb1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Member display");
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/HDWallpapers (28).jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setName("jLabel1"); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 730, 50);

        jLabel2.setBackground(new java.awt.Color(255, 0, 51));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel2.setForeground(new java.awt.Color(255, 0, 102));
        jLabel2.setText("      Prticular View Of Our Members");
        jLabel2.setName("jLabel2"); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(380, 60, 310, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel6.setText("Member display");
        jLabel6.setName("jLabel6"); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(190, 60, 150, 20);

        jPanel1.setBackground(new java.awt.Color(247, 193, 193));
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(null);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel3.setText("Name");
        jLabel3.setName("jLabel3"); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(90, 90, 50, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel4.setText("Member id");
        jLabel4.setName("jLabel4"); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 60, 80, 20);

        t2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        t2.setName("t2"); // NOI18N
        jPanel1.add(t2);
        t2.setBounds(190, 90, 210, 23);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel5.setText("Post");
        jLabel5.setName("jLabel5"); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 120, 40, 17);

        t3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        t3.setName("t3"); // NOI18N
        jPanel1.add(t3);
        t3.setBounds(190, 120, 210, 23);

        jButton2.setText("Exit");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(620, 250, 80, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel7.setText("Add");
        jLabel7.setName("jLabel7"); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(90, 150, 27, 17);

        t4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        t4.setName("t4"); // NOI18N
        jPanel1.add(t4);
        t4.setBounds(190, 150, 210, 23);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel8.setText("Date of Joine");
        jLabel8.setName("jLabel8"); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(90, 180, 93, 17);

        t5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        t5.setName("t5"); // NOI18N
        jPanel1.add(t5);
        t5.setBounds(190, 180, 210, 23);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel9.setText("Year");
        jLabel9.setName("jLabel9"); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(90, 207, 40, 20);

        t6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        t6.setName("t6"); // NOI18N
        jPanel1.add(t6);
        t6.setBounds(190, 210, 210, 23);

        cb1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cb1.setName("cb1"); // NOI18N
        cb1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb1ItemStateChanged(evt);
            }
        });
        jPanel1.add(cb1);
        cb1.setBounds(190, 60, 210, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 80, 720, 310);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-739)/2, (screenSize.height-426)/2, 739, 426);
    }// </editor-fold>//GEN-END:initComponents

    

        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            // TODO add your handling code here:
            setVisible(false);
        }//GEN-LAST:event_jButton2ActionPerformed

        private void cb1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb1ItemStateChanged
     

        }//GEN-LAST:event_cb1ItemStateChanged


    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new View_member().setVisible(true);
                View_member vm=new View_member();
                vm.setVisible(true);
                 vm.setconn("ABHILASHADSN","ABHILASHA_PARIWAR","AMRESH");
                 vm.mySelect("New_Member");
                 


            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    // End of variables declaration//GEN-END:variables

}
