/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Abhilasha_with_PartnerShip_Entery.java
 *
 * Created on May 16, 2012, 10:55:40 PM
 */

/**
 *
 * @author Amresh
 */
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Abhilasha_with_PartnerShip_Entery extends javax.swing.JFrame {
        Connection con;
	Statement st;
	ResultSet rs;
	ResultSetMetaData rmeta;


    /** Creates new form Abhilasha_with_PartnerShip_Entery */
    public Abhilasha_with_PartnerShip_Entery() {
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
        t10 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        t11 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        t12 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        t13 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        t14 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        t15 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        t7 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        t16 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        t8 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        t17 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t18 = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        t19 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        t9 = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Abhilasha With Partenership Work Entery form");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 18));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Abhilasha With Partenership Work Entery form");
        jLabel1.setName("jLabel1"); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 10, 410, 22);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/hk (3).jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setName("jLabel2"); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1000, 50);

        jPanel1.setBackground(new java.awt.Color(255, 102, 255));
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel3.setText("Project Name");
        jLabel3.setName("jLabel3"); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 50, 100, 17);

        t1.setName("t1"); // NOI18N
        jPanel1.add(t1);
        t1.setBounds(150, 50, 170, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel4.setText("Project Area");
        jLabel4.setName("jLabel4"); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 80, 86, 17);

        t2.setName("t2"); // NOI18N
        jPanel1.add(t2);
        t2.setBounds(150, 80, 170, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel5.setText("Our Ngo Name");
        jLabel5.setName("jLabel5"); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 110, 110, 14);

        t3.setName("t3"); // NOI18N
        jPanel1.add(t3);
        t3.setBounds(150, 110, 170, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel6.setText("Partenar Ngo Name");
        jLabel6.setName("jLabel6"); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(330, 50, 150, 17);

        t10.setName("t10"); // NOI18N
        jPanel1.add(t10);
        t10.setBounds(490, 50, 170, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel7.setText("Our Regersterion No");
        jLabel7.setName("jLabel7"); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(330, 80, 150, 17);

        t11.setName("t11"); // NOI18N
        t11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t11ActionPerformed(evt);
            }
        });
        jPanel1.add(t11);
        t11.setBounds(490, 80, 170, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel8.setText("Partenar Regersterion No");
        jLabel8.setName("jLabel8"); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(330, 110, 180, 17);

        t12.setName("t12"); // NOI18N
        jPanel1.add(t12);
        t12.setBounds(520, 110, 140, 20);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel9.setText("Our Secquerarty name");
        jLabel9.setName("jLabel9"); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 150, 170, 17);

        t4.setName("t4"); // NOI18N
        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        jPanel1.add(t4);
        t4.setBounds(210, 150, 110, 20);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel10.setText("Partenar Secqertery Name");
        jLabel10.setName("jLabel10"); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(330, 150, 190, 14);

        t13.setName("t13"); // NOI18N
        jPanel1.add(t13);
        t13.setBounds(520, 150, 140, 20);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel11.setText("Our Investement");
        jLabel11.setName("jLabel11"); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(40, 180, 130, 17);

        t5.setName("t5"); // NOI18N
        jPanel1.add(t5);
        t5.setBounds(160, 180, 160, 20);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel12.setText("Partenar Investement");
        jLabel12.setName("jLabel12"); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(330, 180, 170, 17);

        t14.setName("t14"); // NOI18N
        jPanel1.add(t14);
        t14.setBounds(500, 180, 160, 20);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel13.setText("Our Profit");
        jLabel13.setName("jLabel13"); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(40, 210, 80, 17);

        t6.setName("t6"); // NOI18N
        jPanel1.add(t6);
        t6.setBounds(160, 210, 160, 20);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel14.setText("Partenar profit");
        jLabel14.setName("jLabel14"); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(330, 210, 110, 17);

        t15.setName("t15"); // NOI18N
        jPanel1.add(t15);
        t15.setBounds(500, 210, 160, 20);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel15.setText("No Of Our Member In Project");
        jLabel15.setName("jLabel15"); // NOI18N
        jPanel1.add(jLabel15);
        jLabel15.setBounds(40, 240, 210, 17);

        t7.setName("t7"); // NOI18N
        jPanel1.add(t7);
        t7.setBounds(250, 240, 70, 20);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel16.setText("No Of Partenar  Member in Project");
        jLabel16.setName("jLabel16"); // NOI18N
        jPanel1.add(jLabel16);
        jLabel16.setBounds(330, 240, 250, 17);

        t16.setName("t16"); // NOI18N
        t16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t16ActionPerformed(evt);
            }
        });
        jPanel1.add(t16);
        t16.setBounds(580, 240, 80, 20);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel17.setText("Date Of Starting Project");
        jLabel17.setName("jLabel17"); // NOI18N
        jPanel1.add(jLabel17);
        jLabel17.setBounds(40, 270, 170, 17);

        t8.setName("t8"); // NOI18N
        jPanel1.add(t8);
        t8.setBounds(250, 270, 70, 20);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel18.setText("Date of Ending Project");
        jLabel18.setName("jLabel18"); // NOI18N
        jPanel1.add(jLabel18);
        jLabel18.setBounds(330, 270, 170, 17);

        t17.setName("t17"); // NOI18N
        jPanel1.add(t17);
        t17.setBounds(580, 270, 80, 20);

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel19.setText("Enter Our All Member name in Project");
        jLabel19.setName("jLabel19"); // NOI18N
        jPanel1.add(jLabel19);
        jLabel19.setBounds(670, 20, 270, 17);

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        t18.setColumns(20);
        t18.setRows(5);
        t18.setName("t18"); // NOI18N
        jScrollPane1.setViewportView(t18);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(720, 50, 166, 96);

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel20.setText(" Partenar All Member name in Project");
        jLabel20.setName("jLabel20"); // NOI18N
        jPanel1.add(jLabel20);
        jLabel20.setBounds(670, 150, 270, 17);

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        t19.setColumns(20);
        t19.setRows(5);
        t19.setName("t19"); // NOI18N
        jScrollPane2.setViewportView(t19);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(720, 170, 166, 96);

        jButton1.setText("Submit");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 433, 90, 40);

        jButton2.setText("Exit");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(873, 433, 90, 40);

        jLabel22.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel22.setText("About");
        jLabel22.setName("jLabel22"); // NOI18N
        jPanel1.add(jLabel22);
        jLabel22.setBounds(390, 300, 50, 17);

        jScrollPane3.setName("jScrollPane3"); // NOI18N

        t9.setColumns(20);
        t9.setRows(5);
        t9.setName("t9"); // NOI18N
        jScrollPane3.setViewportView(t9);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(256, 320, 410, 100);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 80, 1000, 480);

        jLabel21.setFont(new java.awt.Font("Arial", 3, 18));
        jLabel21.setText("Our Work With Other NGO");
        jLabel21.setName("jLabel21"); // NOI18N
        getContentPane().add(jLabel21);
        jLabel21.setBounds(310, 50, 230, 22);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1017)/2, (screenSize.height-598)/2, 1017, 598);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
             String pname =t1.getText();
             String pa =t2.getText();
             String onn =t3.getText();
             String osn =t4.getText();
             String oin =t5.getText();
             String op =t6.getText();
             String noomip =t7.getText();
             String date =t8.getText();
             String About=t9.getText();
             String pnn =t10.getText();
             String orno =t11.getText();
             String prno=t12.getText();
             String psn =t13.getText();
             String pin =t14.getText();
             String pp =t15.getText();
             String nopmip =t16.getText();
             String doep =t17.getText();
             String eoamnip =t18.getText();
             String pamnip =t19.getText();


        con.setAutoCommit(false);
        PreparedStatement ps=con.prepareStatement("INSERT INTO  partenership VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1,pname);
        ps.setString(2,pa);
        ps.setString(3,onn);
        ps.setString(4,osn);
        ps.setString(5,oin);
        ps.setString(6,op);
        ps.setString(7,noomip);
        ps.setString(8,date);
        ps.setString(9,pnn);
        ps.setString(10,orno);
        ps.setString(11,prno);
        ps.setString(12,psn);
        ps.setString(13,pin);
        ps.setString(14,pp);
        ps.setString(15,nopmip);
        ps.setString(16,doep);
        ps.setString(17,About);
        ps.setString(18,eoamnip);
        ps.setString(19,pamnip);


        ps.addBatch();
        int r[]=ps.executeBatch();
        con.commit();
        JOptionPane.showMessageDialog(this,"Record Saved Successfully");


    }//GEN-LAST:event_jButton1ActionPerformed
catch(Exception e)
{
	JOptionPane.showMessageDialog(this,e.getMessage());
	 //return(false);
}
}//close of conn()

        private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
            // TODO add your handling code here:
        }//GEN-LAST:event_t4ActionPerformed

        private void t11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t11ActionPerformed
            // TODO add your handling code here:
        }//GEN-LAST:event_t11ActionPerformed

        private void t16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t16ActionPerformed
            // TODO add your handling code here:
        }//GEN-LAST:event_t16ActionPerformed

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
                new Abhilasha_with_PartnerShip_Entery().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t11;
    private javax.swing.JTextField t12;
    private javax.swing.JTextField t13;
    private javax.swing.JTextField t14;
    private javax.swing.JTextField t15;
    private javax.swing.JTextField t16;
    private javax.swing.JTextField t17;
    private javax.swing.JTextArea t18;
    private javax.swing.JTextArea t19;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextArea t9;
    // End of variables declaration//GEN-END:variables

}