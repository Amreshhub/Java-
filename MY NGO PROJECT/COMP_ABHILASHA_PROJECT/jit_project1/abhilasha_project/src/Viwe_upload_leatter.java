        /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Viwe_upload_leatter.java
 *
 * Created on May 17, 2012, 10:56:19 AM
 */

/**
 *
 * @author Amresh
 */
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Viwe_upload_leatter extends javax.swing.JFrame {
        Connection con;
	Statement st;
	ResultSet rs;
	ResultSetMetaData rmeta;


    /** Creates new form Viwe_upload_leatter */
    public Viwe_upload_leatter() {
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
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        t4 = new javax.swing.JTextArea();
        ti1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View Upload Latter");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 18));
        jLabel1.setText("View Upload Latter");
        jLabel1.setName("jLabel1"); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 10, 170, 22);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/HDWallpapers (16).jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setName("jLabel2"); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 650, 50);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel3.setText("Enter Topic Name");
        jLabel3.setName("jLabel3"); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 30, 123, 17);

        jButton2.setText("Exit");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(480, 420, 80, 40);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel5.setText("Topic name");
        jLabel5.setName("jLabel5"); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 130, 80, 17);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel6.setText("Date");
        jLabel6.setName("jLabel6"); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(70, 160, 32, 17);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel7.setText("Referance no");
        jLabel7.setName("jLabel7"); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(70, 100, 100, 17);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel8.setText("About");
        jLabel8.setName("jLabel8"); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(70, 190, 41, 17);

        t1.setName("t1"); // NOI18N
        jPanel1.add(t1);
        t1.setBounds(180, 100, 230, 20);

        t2.setName("t2"); // NOI18N
        jPanel1.add(t2);
        t2.setBounds(180, 130, 230, 20);

        t3.setName("t3"); // NOI18N
        jPanel1.add(t3);
        t3.setBounds(180, 160, 230, 20);

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        t4.setColumns(20);
        t4.setRows(5);
        t4.setName("t4"); // NOI18N
        jScrollPane1.setViewportView(t4);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(180, 190, 230, 140);

        ti1.setName("ti1"); // NOI18N
        jPanel1.add(ti1);
        ti1.setBounds(210, 30, 190, 20);

        jButton1.setText("DISPLAY");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(460, 30, 90, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 80, 640, 490);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel4.setText("Abhilash Pariwar Swyemsevi Sanstha");
        jLabel4.setName("jLabel4"); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(170, 50, 270, 17);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-655)/2, (screenSize.height-598)/2, 655, 598);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         int flag=1;
        try
        {
            st=con.createStatement();
            String sql="SELECT * FROM upload_letter";
            rs=st.executeQuery(sql);
             String mid=ti1.getText();
            //String mid=JOptionPane.showInputDialog(this,"ENTER NAME OF POST");
            while(rs.next())
            {
                if (mid.equals(rs.getString(1)))
                {
                   // t1.setText(String.valueOf(mid));
                    t1.setText(rs.getString(3));
                    t2.setText(rs.getString(1));
                    t3.setText(rs.getString(2));
                    t4.setText(rs.getString(4));

                    //flag=2;
                    break;
                }
            }
            if(flag==2)
            {
                JOptionPane.showMessageDialog(this,"Invalid Name found ");
            }
    }
catch(Exception e)
{
	JOptionPane.showMessageDialog(this,e.getMessage());

}

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Viwe_upload_leatter().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextArea t4;
    private javax.swing.JTextField ti1;
    // End of variables declaration//GEN-END:variables

}