/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * pARTICULAR_BRANCH_dITELS.java
 *
 * Created on May 16, 2012, 7:32:40 PM
 */

/**
 *
 * @author Amresh
 */
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class pARTICULAR_BRANCH_dITELS extends javax.swing.JFrame implements ItemListener{
        Connection con;
	Statement st;
	ResultSet rs;
	ResultSetMetaData rmeta;


    /** Creates new form pARTICULAR_BRANCH_dITELS */
    public pARTICULAR_BRANCH_dITELS() {
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
            String sql="SELECT * FROM Newbranch";
            rs=st.executeQuery(sql);
            String mid=cb1.getSelectedItem().toString();
            while(rs.next())
            {
                 if (mid.equals(rs.getString(1)))
            {

                    t2.setText(rs.getString(1));
                    t3.setText(rs.getString(2));
                    t4.setText(rs.getString(3));
                    t5.setText(rs.getString(4));
                    t6.setText(rs.getString(5));
                     t7.setText(rs.getString(6));
                      t8.setText(rs.getString(7));
                       t9.setText(rs.getString(8));
                        t10.setText(rs.getString(9));
                         t11.setText(rs.getString(10));
                          t12.setText(rs.getString(11));

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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        t7 = new javax.swing.JTextArea();
        t8 = new javax.swing.JTextField();
        t9 = new javax.swing.JTextField();
        t10 = new javax.swing.JTextField();
        t11 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        t12 = new javax.swing.JTextArea();
        cb1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Particular Branch  View Of Abhilasha");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 18));
        jLabel1.setText("Particular Branch  View Of Abhilasha");
        jLabel1.setName("jLabel1"); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(350, 10, 320, 22);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/HDWallpapers (130).jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setName("jLabel2"); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 680, 40);

        jPanel1.setBackground(new java.awt.Color(240, 79, 116));
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel3.setText("Enter  Branch Code");
        jLabel3.setName("jLabel3"); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 10, 140, 20);

        jButton1.setText("Display");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(480, 10, 67, 23);

        jButton2.setText("Exit");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(581, 443, 80, 50);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address");
        jLabel5.setName("jLabel5"); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 90, 80, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Persedent Name");
        jLabel6.setName("jLabel6"); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(460, 60, 146, 22);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Branch Phon no");
        jLabel7.setName("jLabel7"); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 362, 140, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total member");
        jLabel8.setName("jLabel8"); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(50, 180, 130, 20);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Branch name");
        jLabel9.setName("jLabel9"); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(50, 150, 120, 22);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Dist");
        jLabel10.setName("jLabel10"); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(50, 120, 34, 22);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Secqratery name ");
        jLabel11.setName("jLabel11"); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(50, 390, 160, 22);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("About");
        jLabel12.setName("jLabel12"); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(510, 210, 52, 20);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Issue by Rajesh singh");
        jLabel13.setName("jLabel13"); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(440, 120, 200, 22);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Branch code");
        jLabel14.setName("jLabel14"); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(50, 60, 110, 22);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Total member name");
        jLabel15.setName("jLabel15"); // NOI18N
        jPanel1.add(jLabel15);
        jLabel15.setBounds(50, 210, 190, 22);

        t2.setName("t2"); // NOI18N
        jPanel1.add(t2);
        t2.setBounds(200, 60, 190, 20);

        t3.setName("t3"); // NOI18N
        jPanel1.add(t3);
        t3.setBounds(200, 90, 190, 20);

        t4.setName("t4"); // NOI18N
        jPanel1.add(t4);
        t4.setBounds(200, 120, 190, 20);

        t5.setName("t5"); // NOI18N
        jPanel1.add(t5);
        t5.setBounds(200, 150, 190, 20);

        t6.setName("t6"); // NOI18N
        jPanel1.add(t6);
        t6.setBounds(200, 180, 190, 20);

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        t7.setColumns(20);
        t7.setRows(5);
        t7.setName("t7"); // NOI18N
        jScrollPane1.setViewportView(t7);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(200, 240, 200, 110);

        t8.setName("t8"); // NOI18N
        jPanel1.add(t8);
        t8.setBounds(200, 360, 200, 20);

        t9.setName("t9"); // NOI18N
        jPanel1.add(t9);
        t9.setBounds(200, 390, 200, 20);

        t10.setName("t10"); // NOI18N
        jPanel1.add(t10);
        t10.setBounds(460, 90, 150, 20);

        t11.setName("t11"); // NOI18N
        jPanel1.add(t11);
        t11.setBounds(460, 150, 150, 20);

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        t12.setColumns(20);
        t12.setRows(5);
        t12.setName("t12"); // NOI18N
        jScrollPane2.setViewportView(t12);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(440, 240, 210, 110);

        cb1.setName("cb1"); // NOI18N
        jPanel1.add(cb1);
        cb1.setBounds(200, 10, 190, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 70, 670, 500);

        jLabel4.setFont(new java.awt.Font("Arial", 3, 18));
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Abhilasha pariwar Swyemsevi Sanstha Main Branch Mirchaibari Katihar");
        jLabel4.setName("jLabel4"); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 44, 620, 20);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-689)/2, (screenSize.height-613)/2, 689, 613);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:



    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pARTICULAR_BRANCH_dITELS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb1;
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
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t11;
    private javax.swing.JTextArea t12;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextArea t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    // End of variables declaration//GEN-END:variables

}
