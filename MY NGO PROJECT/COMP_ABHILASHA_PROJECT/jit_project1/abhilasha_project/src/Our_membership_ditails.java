/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Our_membership_ditails.java
 *
 * Created on May 16, 2012, 12:13:21 PM
 */

/**
 *
 * @author Amresh
 */
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Our_membership_ditails extends javax.swing.JFrame  implements ItemListener {
        Connection con;
	Statement st;
	ResultSet rs;
	ResultSetMetaData rmeta;


    /** Creates new form Our_membership_ditails */
    public Our_membership_ditails() {
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
}//close of conn()
     public void mySelect(String table)
{
    try
    {
        st=con.createStatement();
        String sql="SELECT * From "+table;
        rs=st.executeQuery(sql);
        //myDisplayResult(result);
       // rs.next();
        //t1.setText(rs.getString(1));
        //p1.setText(rs.getString(2));


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
            String sql="SELECT * FROM membership_entery";
            rs=st.executeQuery(sql);
            String mid=cb1.getSelectedItem().toString();
            while(rs.next())
            {
                 if (mid.equals(rs.getString(1)))
            {
                    t2.setText(String.valueOf(mid));
                    //t2.setText(rs.getString(2));
                    t3.setText(rs.getString(2));
                    t4.setText(rs.getString(3));
                    t5.setText(rs.getString(4));
                    t6.setText(rs.getString(5));
                    t7.setText(rs.getString(6));
                    t8.setText(rs.getString(7));
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
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        t8 = new javax.swing.JTextArea();
        cb1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Paricular Our Membership View");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 18));
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Paricular Our Membership View");
        jLabel1.setName("jLabel1"); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 290, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/The-best-top-love-desktop-wallpapers-39.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setName("jLabel2"); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 620, 60);

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel3.setText("Select NGO Name");
        jLabel3.setName("jLabel3"); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 40, 130, 20);

        jButton2.setText("Exit");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(510, 390, 90, 40);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel5.setText("Membership with");
        jLabel5.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jLabel5.setName("jLabel5"); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 100, 130, 17);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel6.setText("Our post");
        jLabel6.setName("jLabel6"); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 130, 70, 17);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel7.setText("Address");
        jLabel7.setName("jLabel7"); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 190, 58, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel8.setText("Date from");
        jLabel8.setName("jLabel8"); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(50, 160, 70, 17);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel9.setText("Project name");
        jLabel9.setName("jLabel9"); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(50, 230, 92, 17);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel10.setText("our work with");
        jLabel10.setName("jLabel10"); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(50, 260, 95, 17);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel11.setText("About");
        jLabel11.setName("jLabel11"); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(50, 290, 41, 17);

        t3.setName("t3"); // NOI18N
        jPanel1.add(t3);
        t3.setBounds(180, 130, 240, 20);

        t5.setName("t5"); // NOI18N
        jPanel1.add(t5);
        t5.setBounds(180, 190, 240, 20);

        t4.setName("t4"); // NOI18N
        jPanel1.add(t4);
        t4.setBounds(180, 160, 240, 20);

        t6.setName("t6"); // NOI18N
        jPanel1.add(t6);
        t6.setBounds(180, 220, 240, 20);

        t2.setName("t2"); // NOI18N
        jPanel1.add(t2);
        t2.setBounds(180, 100, 240, 20);

        t7.setName("t7"); // NOI18N
        jPanel1.add(t7);
        t7.setBounds(180, 260, 240, 20);

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        t8.setColumns(20);
        t8.setRows(5);
        t8.setName("t8"); // NOI18N
        jScrollPane1.setViewportView(t8);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(180, 290, 360, 96);

        cb1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cb1.setName("cb1"); // NOI18N
        jPanel1.add(cb1);
        cb1.setBounds(180, 40, 240, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 80, 610, 740);

        jLabel4.setFont(new java.awt.Font("Arial", 3, 18));
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Abhilasha Pariwar Swyemsevi Sanstha");
        jLabel4.setName("jLabel4"); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(120, 60, 360, 20);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-626)/2, (screenSize.height-549)/2, 626, 549);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Our_membership_ditails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextArea t8;
    // End of variables declaration//GEN-END:variables

}
