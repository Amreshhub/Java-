/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Issue_metting_later.java
 *
 * Created on May 17, 2012, 9:45:30 AM
 */

/**
 *
 * @author Amresh
 */
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Issue_metting_later extends javax.swing.JFrame {
        Connection con;
	Statement st;
	ResultSet rs;
	ResultSetMetaData rmeta;


    /** Creates new form Issue_metting_later */
    public Issue_metting_later() {
        initComponents();
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
        t1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t6 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Issue Metting latter By Abhilasha pariwar");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 18));
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Issue Metting latter By Abhilasha pariwar");
        jLabel1.setName("jLabel1"); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 20, 360, 22);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/HDWallpapers (53).jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setName("jLabel2"); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 810, 60);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel3.setText("Name of Appleceant");
        jLabel3.setName("jLabel3"); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 150, 150, 14);

        t1.setName("t1"); // NOI18N
        jPanel1.add(t1);
        t1.setBounds(200, 30, 180, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel4.setText("Topic of Metting");
        jLabel4.setName("jLabel4"); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 30, 120, 20);

        t2.setName("t2"); // NOI18N
        jPanel1.add(t2);
        t2.setBounds(200, 60, 180, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel5.setText("Date");
        jLabel5.setName("jLabel5"); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 60, 32, 17);

        t3.setName("t3"); // NOI18N
        jPanel1.add(t3);
        t3.setBounds(200, 90, 180, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel6.setText("Plase");
        jLabel6.setName("jLabel6"); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 90, 40, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel7.setText("Oregnaser by");
        jLabel7.setName("jLabel7"); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 120, 100, 17);

        t4.setName("t4"); // NOI18N
        jPanel1.add(t4);
        t4.setBounds(200, 120, 180, 20);

        t5.setName("t5"); // NOI18N
        jPanel1.add(t5);
        t5.setBounds(200, 150, 180, 20);

        jButton1.setText("Issue");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(49, 203, 80, 40);

        jButton2.setText("Exit");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(451, 203, 100, 40);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel8.setText("About Topic");
        jLabel8.setName("jLabel8"); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(460, 30, 90, 17);

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        t6.setColumns(20);
        t6.setRows(5);
        t6.setName("t6"); // NOI18N
        jScrollPane1.setViewportView(t6);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(430, 60, 166, 96);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 90, 660, 260);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel9.setText("Abhilasha pariwar Swyemsevi Sanstha");
        jLabel9.setName("jLabel9"); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(130, 60, 350, 22);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-667)/2, (screenSize.height-386)/2, 667, 386);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         try{
        String i1 =t1.getText();
        String i2 =t2.getText();
        String i3 =t3.getText();
        String i4 =t4.getText();
        String i5 =t5.getText();
        String i6 =t6.getText();


        con.setAutoCommit(false);
        PreparedStatement ps=con.prepareStatement("INSERT INTO metingletter VALUES(?,?,?,?,?,?)");

        ps.setString(1,i1);
        ps.setString(2,i2);
        ps.setString(3,i3);
        ps.setString(4,i4);
        ps.setString(5,i5);
         ps.setString(6,i6);


        ps.addBatch();
        int r[]=ps.executeBatch();
        con.commit();
        JOptionPane.showMessageDialog(this,"Record Saved Successfully");


    }
catch(Exception e)
{
	JOptionPane.showMessageDialog(this,e.getMessage());

}
    }//GEN-LAST:event_jButton1ActionPerformed

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
                new Issue_metting_later().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextArea t6;
    // End of variables declaration//GEN-END:variables

}