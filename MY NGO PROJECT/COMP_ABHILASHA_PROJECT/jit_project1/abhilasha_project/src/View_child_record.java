/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * View_child_record.java
 *
 * Created on May 17, 2012, 12:40:40 PM
 */

/**
 *
 * @author Amresh
 */
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class View_child_record extends javax.swing.JFrame {
        Connection con;
	Statement st;
	ResultSet rs;
	ResultSetMetaData rmeta;



    /** Creates new form View_child_record */
    public View_child_record() {
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

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        t6 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        t8 = new javax.swing.JTextArea();
        ti1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Paricular View of Child Recored");
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/HDWallpapers (14).jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setName("jLabel2"); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 610, 50);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel3.setText("Enter Name Of Retrive Child");
        jLabel3.setName("jLabel3"); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(44, 70, 200, 17);

        jButton2.setText("Exit");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(540, 533, 60, 40);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Save the Child Please Do Not Use in Work");
        jLabel4.setName("jLabel4"); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(110, 20, 380, 22);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 18));
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Paricular View of Child Recored");
        jLabel1.setName("jLabel1"); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 0, 280, 20);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("Name ");
        jLabel5.setName("jLabel5"); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 120, 43, 17);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("Broker Name");
        jLabel6.setName("jLabel6"); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 150, 91, 17);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("Broker ADD");
        jLabel7.setName("jLabel7"); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 180, 81, 17);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setText("Date of get");
        jLabel8.setName("jLabel8"); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(50, 210, 77, 17);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("Abhilasha hand over With");
        jLabel9.setName("jLabel9"); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(50, 240, 179, 17);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setText("Address  to wich get abhilasha child");
        jLabel10.setName("jLabel10"); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(50, 270, 252, 17);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel11.setForeground(new java.awt.Color(255, 0, 51));
        jLabel11.setText("Abhilasha member name to get child");
        jLabel11.setName("jLabel11"); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(50, 300, 254, 17);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel12.setForeground(new java.awt.Color(255, 0, 51));
        jLabel12.setText("About");
        jLabel12.setName("jLabel12"); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(30, 490, 41, 17);

        t1.setName("t1"); // NOI18N
        jPanel1.add(t1);
        t1.setBounds(140, 120, 210, 20);

        t2.setName("t2"); // NOI18N
        jPanel1.add(t2);
        t2.setBounds(150, 150, 200, 20);

        t3.setName("t3"); // NOI18N
        jPanel1.add(t3);
        t3.setBounds(150, 180, 200, 20);

        t4.setName("t4"); // NOI18N
        jPanel1.add(t4);
        t4.setBounds(150, 210, 200, 20);

        t7.setName("t7"); // NOI18N
        jPanel1.add(t7);
        t7.setBounds(60, 330, 240, 20);

        t5.setName("t5"); // NOI18N
        jPanel1.add(t5);
        t5.setBounds(240, 240, 320, 20);

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        t6.setColumns(20);
        t6.setRows(5);
        t6.setName("t6"); // NOI18N
        jScrollPane1.setViewportView(t6);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(310, 270, 250, 96);

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        t8.setColumns(20);
        t8.setRows(5);
        t8.setName("t8"); // NOI18N
        jScrollPane2.setViewportView(t8);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(90, 460, 440, 96);

        ti1.setName("ti1"); // NOI18N
        jPanel1.add(ti1);
        ti1.setBounds(250, 70, 230, 20);

        jButton1.setText("CLICK ME");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(500, 60, 90, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 50, 600, 580);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-619)/2, (screenSize.height-673)/2, 619, 673);
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
            String sql="SELECT * FROM child_record";
            rs=st.executeQuery(sql);
             String mid=ti1.getText();
            //String mid=JOptionPane.showInputDialog(this,"ENTER NAME OF POST");
            while(rs.next())
            {
                if (mid.equals(rs.getString(1)))
                {
                   t1.setText(String.valueOf(mid));
                    //t1.setText(rs.getString(1));
                    t2.setText(rs.getString(2));
                    t3.setText(rs.getString(3));
                    t4.setText(rs.getString(4));
                    t5.setText(rs.getString(5));
                    t6.setText(rs.getString(6));
                    t7.setText(rs.getString(7));
                    t8.setText(rs.getString(8));
                    //flag=2;
                    break;
                }
            }
            if(flag==2)
            {
                JOptionPane.showMessageDialog(this,"Invalid Name Found ");
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
                new View_child_record().setVisible(true);
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
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextArea t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextArea t8;
    private javax.swing.JTextField ti1;
    // End of variables declaration//GEN-END:variables

}