/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * add_ngo_new.java
 *
 * Created on May 16, 2012, 9:02:52 PM
 */

/**
 *
 * @author Amresh
 */
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class add_ngo_new extends javax.swing.JFrame {
        Connection con;
	Statement st;
	ResultSet rs;
	ResultSetMetaData rmeta;


    /** Creates new form add_ngo_new */
    public add_ngo_new() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        t2 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        t8 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        t9 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        t10 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        t11 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        t12 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        t13 = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        t7 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add NGO Entery Form");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 18));
        jLabel1.setText("Add NGO Entery Form");
        jLabel1.setName("jLabel1"); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(520, 70, 210, 22);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Wonders (5).JPG"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setName("jLabel2"); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-6, -6, 800, 70);

        jPanel1.setBackground(new java.awt.Color(51, 153, 0));
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel3.setText("New NGO Name");
        jLabel3.setName("jLabel3"); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 25, 117, 25);

        t1.setName("t1"); // NOI18N
        jPanel1.add(t1);
        t1.setBounds(165, 28, 181, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel4.setText("Address Hade Branch");
        jLabel4.setName("jLabel4"); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 68, 152, 17);

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        t2.setColumns(20);
        t2.setRows(5);
        t2.setName("t2"); // NOI18N
        jScrollPane1.setViewportView(t2);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(166, 68, 180, 96);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel5.setText("Regstration no");
        jLabel5.setName("jLabel5"); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 171, 196, 17);

        t3.setName("t3"); // NOI18N
        jPanel1.add(t3);
        t3.setBounds(166, 170, 180, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel6.setText("Hade Branch");
        jLabel6.setName("jLabel6"); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 197, 90, 17);

        t4.setName("t4"); // NOI18N
        jPanel1.add(t4);
        t4.setBounds(166, 196, 180, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel7.setText("Our Branch Name");
        jLabel7.setName("jLabel7"); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(374, 29, 123, 17);

        t8.setName("t8"); // NOI18N
        jPanel1.add(t8);
        t8.setBounds(600, 28, 166, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel8.setText(" Our New Ngo Branch Address");
        jLabel8.setName("jLabel8"); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(374, 68, 212, 15);

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        t9.setColumns(20);
        t9.setRows(5);
        t9.setName("t9"); // NOI18N
        jScrollPane2.setViewportView(t9);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(600, 68, 166, 96);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel9.setText("Working Princpul");
        jLabel9.setName("jLabel9"); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(374, 171, 120, 17);

        t10.setName("t10"); // NOI18N
        jPanel1.add(t10);
        t10.setBounds(600, 175, 166, 20);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel10.setText("NGO Under Act");
        jLabel10.setName("jLabel10"); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(374, 207, 105, 17);

        t11.setName("t11"); // NOI18N
        jPanel1.add(t11);
        t11.setBounds(600, 206, 166, 20);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel11.setText("Total Member");
        jLabel11.setName("jLabel11"); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 222, 96, 19);

        t5.setName("t5"); // NOI18N
        jPanel1.add(t5);
        t5.setBounds(166, 222, 180, 20);

        t6.setName("t6"); // NOI18N
        jPanel1.add(t6);
        t6.setBounds(166, 253, 180, 20);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel12.setText("Ngo New Secqueraty");
        jLabel12.setName("jLabel12"); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 253, 145, 17);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel13.setText("NGO New Persident");
        jLabel13.setName("jLabel13"); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(374, 233, 222, 17);

        t12.setName("t12"); // NOI18N
        jPanel1.add(t12);
        t12.setBounds(600, 232, 166, 20);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel14.setText("Enter All Member Name");
        jLabel14.setName("jLabel14"); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(374, 254, 164, 17);

        jScrollPane3.setName("jScrollPane3"); // NOI18N

        t13.setColumns(20);
        t13.setRows(5);
        t13.setName("t13"); // NOI18N
        jScrollPane3.setViewportView(t13);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(600, 260, 166, 120);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel15.setText("About New NGO");
        jLabel15.setName("jLabel15"); // NOI18N
        jPanel1.add(jLabel15);
        jLabel15.setBounds(10, 290, 130, 17);

        jScrollPane4.setName("jScrollPane4"); // NOI18N

        t7.setColumns(20);
        t7.setRows(5);
        t7.setName("t7"); // NOI18N
        jScrollPane4.setViewportView(t7);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(10, 310, 430, 96);

        jButton1.setText("Submit");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(70, 413, 90, 30);

        jButton2.setText("Exit");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(661, 403, 90, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 100, 1120, 450);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-801)/2, (screenSize.height-584)/2, 801, 584);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
             String nname =t1.getText();
             String addhb =t2.getText();
             String rno =t3.getText();
             String HB =t4.getText();
             String tm =t5.getText();
             String nns =t6.getText();
             String About =t7.getText();
             String oBname =t8.getText();
             String onewbadd=t9.getText();
             String wp =t10.getText();
             String nuact =t11.getText();
             String nnp =t12.getText();
             String eamname =t13.getText();


        con.setAutoCommit(false);
        PreparedStatement ps=con.prepareStatement("INSERT INTO  Addnewngo VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1,nname);
        ps.setString(2,addhb);
        ps.setString(3,rno);
        ps.setString(4,HB);
        ps.setString(5,tm);
        ps.setString(6,nns);
        ps.setString(7,About);
        ps.setString(8,oBname);
        ps.setString(9,onewbadd);
        ps.setString(10,wp);
        ps.setString(11,nuact);
        ps.setString(12,nnp);
        ps.setString(13,eamname);


        ps.addBatch();
        int r[]=ps.executeBatch();
        con.commit();
        JOptionPane.showMessageDialog(this,"Record Saved Successfully");

    }//GEN-LAST:event_jButton1ActionPerformed
catch(Exception e)
{
	JOptionPane.showMessageDialog(this,e.getMessage());
	// return(false);
}
    }
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
                new add_ngo_new().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t11;
    private javax.swing.JTextField t12;
    private javax.swing.JTextArea t13;
    private javax.swing.JTextArea t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextArea t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextArea t9;
    // End of variables declaration//GEN-END:variables

}
