/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * new_project.java
 *
 * Created on May 15, 2012, 11:27:18 PM
 */

/**
 *
 * @author Amresh
 */
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class new_project extends javax.swing.JFrame {
        Connection con;
	Statement st;
	ResultSet rs;
	ResultSetMetaData rmeta;


    /** Creates new form new_project */
    public new_project() {
        initComponents();
        cb1.addItem("BIHAR GOVT");
        cb1.addItem("INDIA GOVT");
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
        jLabel8 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        t7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        t8 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        t9 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t10 = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        t11 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cb1 = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("   ABHILASHA PARIWAR PROJRCT ENTERY FROM");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 18));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("   ABHILASHA PARIWAR PROJRCT ENTERY FROM");
        jLabel1.setName("jLabel1"); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 10, 450, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/HDWallpapers (15).jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setName("jLabel2"); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 800, 60);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel3.setText("Project name");
        jLabel3.setName("jLabel3"); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 40, 100, 20);

        t1.setName("t1"); // NOI18N
        jPanel1.add(t1);
        t1.setBounds(140, 40, 150, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel4.setText("Date of Start");
        jLabel4.setName("jLabel4"); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 70, 90, 20);

        t2.setName("t2"); // NOI18N
        jPanel1.add(t2);
        t2.setBounds(140, 70, 150, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel5.setText("Arreya Name");
        jLabel5.setName("jLabel5"); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 100, 90, 17);

        t3.setName("t3"); // NOI18N
        jPanel1.add(t3);
        t3.setBounds(140, 100, 150, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel6.setText("Total working member");
        jLabel6.setName("jLabel6"); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 130, 160, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel7.setText("Investment Captial");
        jLabel7.setName("jLabel7"); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 160, 150, 17);

        t4.setName("t4"); // NOI18N
        jPanel1.add(t4);
        t4.setBounds(200, 130, 90, 20);

        t5.setName("t5"); // NOI18N
        jPanel1.add(t5);
        t5.setBounds(200, 160, 90, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel8.setText("Project Type");
        jLabel8.setName("jLabel8"); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 190, 90, 17);

        t6.setName("t6"); // NOI18N
        jPanel1.add(t6);
        t6.setBounds(140, 190, 150, 20);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel9.setText("Year");
        jLabel9.setName("jLabel9"); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 220, 40, 17);

        t7.setName("t7"); // NOI18N
        jPanel1.add(t7);
        t7.setBounds(140, 220, 150, 20);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel10.setText("By Project");
        jLabel10.setName("jLabel10"); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 250, 80, 17);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel11.setText("Session");
        jLabel11.setName("jLabel11"); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(30, 280, 70, 14);

        t8.setName("t8"); // NOI18N
        jPanel1.add(t8);
        t8.setBounds(130, 280, 160, 20);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel12.setText("Onwer Name");
        jLabel12.setName("jLabel12"); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(30, 310, 90, 17);

        t9.setName("t9"); // NOI18N
        jPanel1.add(t9);
        t9.setBounds(130, 310, 160, 20);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel13.setText("All Working Member Name in Project");
        jLabel13.setName("jLabel13"); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(30, 340, 260, 17);

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        t10.setColumns(20);
        t10.setRows(5);
        t10.setName("t10"); // NOI18N
        jScrollPane1.setViewportView(t10);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 360, 260, 96);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel15.setText("About Project");
        jLabel15.setName("jLabel15"); // NOI18N
        jPanel1.add(jLabel15);
        jLabel15.setBounds(500, 40, 100, 17);

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        t11.setColumns(20);
        t11.setRows(5);
        t11.setName("t11"); // NOI18N
        jScrollPane2.setViewportView(t11);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(400, 70, 310, 96);

        jButton2.setText("Submit");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(85, 463, 90, 30);

        jButton3.setText("Cencel");
        jButton3.setName("jButton3"); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(690, 460, 90, 30);

        cb1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cb1.setName("cb1"); // NOI18N
        jPanel1.add(cb1);
        cb1.setBounds(140, 250, 150, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 89, 800, 500);

        jLabel16.setFont(new java.awt.Font("Arial", 3, 18));
        jLabel16.setForeground(new java.awt.Color(51, 0, 51));
        jLabel16.setText("ABHILASHA PARIWAR SWYEMSEVI SANSTHA MIRCHAIBARI KATIHAR");
        jLabel16.setName("jLabel16"); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(50, 60, 630, 20);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-806)/2, (screenSize.height-623)/2, 806, 623);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
             String pname =t1.getText();
             String sdate =t2.getText();
             String Aname =t3.getText();
             String tworkar =t4.getText();
             String incapital =t5.getText();
             String ptype =t6.getText();
             String year =t7.getText();
             String by=cb1.getSelectedItem().toString();
             String session =t8.getText();
             String oname =t9.getText();
             String allwork =t10.getText();
             String about =t11.getText();

        con.setAutoCommit(false);
        PreparedStatement ps=con.prepareStatement("INSERT INTO  project_entry VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1,pname);
        ps.setString(2,sdate);
        ps.setString(3,Aname);
        ps.setString(4,tworkar);
        ps.setString(5,incapital);
        ps.setString(6,ptype);
        ps.setString(7,year);
        ps.setString(8,by);
        ps.setString(9,session);
        ps.setString(10,oname);
        ps.setString(11,allwork);
        ps.setString(12,about);

        ps.addBatch();
        int r[]=ps.executeBatch();
        con.commit();
        JOptionPane.showMessageDialog(this,"Record Saved Successfully");

    }//GEN-LAST:event_jButton2ActionPerformed
catch(Exception e)
{
	System.out.print(e.getMessage());
	// return(false);
}
    }

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            // TODO add your handling code here:
            setVisible(false);
  
        }//GEN-LAST:event_jButton3ActionPerformed
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new new_project().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextArea t10;
    private javax.swing.JTextArea t11;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    // End of variables declaration//GEN-END:variables

}