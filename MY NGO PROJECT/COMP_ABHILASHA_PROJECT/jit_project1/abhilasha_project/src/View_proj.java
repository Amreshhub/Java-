/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * View_proj.java
 *
 * Created on May 16, 2012, 12:11:36 AM
 */

/**
 *
 * @author Amresh
 */
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class View_proj extends javax.swing.JFrame implements ItemListener {
         Connection con;
	Statement st;
	ResultSet rs;
	ResultSetMetaData rmeta;


    /** Creates new form View_proj */
    public View_proj() {
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
            String sql="SELECT * FROM project_entry";
            rs=st.executeQuery(sql);
            String mid=cb1.getSelectedItem().toString();
            while(rs.next())
            {
                 if (mid.equals(rs.getString(1)))
            {
                   t2.setText(String.valueOf(mid));
                    //t2.setText(rs.getString(1));
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
        t3 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        t8 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t9 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        t10 = new javax.swing.JTextField();
        t11 = new javax.swing.JTextField();
        t12 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t13 = new javax.swing.JTextArea();
        cb1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("        Abhilasha Project View");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 18));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("        Abhilasha Project View");
        jLabel1.setName("jLabel1"); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 20, 250, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/HDWallpapers (7).jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setName("jLabel2"); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(4, -6, 810, 70);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel3.setText("Please  Select project name");
        jLabel3.setName("jLabel3"); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 90, 200, 20);

        jButton2.setText("Exit");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(730, 480, 73, 23);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Project name");
        jLabel5.setName("jLabel5"); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 137, 120, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date of Start");
        jLabel6.setName("jLabel6"); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 170, 110, 20);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Session");
        jLabel7.setName("jLabel7"); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(60, 380, 80, 20);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Area name");
        jLabel8.setName("jLabel8"); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(60, 200, 100, 20);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Year");
        jLabel9.setName("jLabel9"); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(60, 320, 50, 20);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Invest capital");
        jLabel10.setName("jLabel10"); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(60, 260, 120, 22);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Project Type");
        jLabel11.setName("jLabel11"); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(60, 290, 120, 22);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Wonar name");
        jLabel12.setName("jLabel12"); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(60, 410, 110, 22);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Total work Member");
        jLabel13.setName("jLabel13"); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(60, 230, 170, 22);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("By project");
        jLabel14.setName("jLabel14"); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(60, 350, 90, 20);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("All member name");
        jLabel15.setName("jLabel15"); // NOI18N
        jPanel1.add(jLabel15);
        jLabel15.setBounds(60, 440, 160, 20);

        t3.setName("t3"); // NOI18N
        jPanel1.add(t3);
        t3.setBounds(230, 170, 280, 20);

        t6.setName("t6"); // NOI18N
        jPanel1.add(t6);
        t6.setBounds(230, 260, 280, 20);

        t8.setName("t8"); // NOI18N
        jPanel1.add(t8);
        t8.setBounds(230, 320, 280, 20);

        t2.setName("t2"); // NOI18N
        jPanel1.add(t2);
        t2.setBounds(230, 140, 280, 20);

        t4.setName("t4"); // NOI18N
        jPanel1.add(t4);
        t4.setBounds(230, 200, 280, 20);

        t5.setName("t5"); // NOI18N
        jPanel1.add(t5);
        t5.setBounds(230, 230, 280, 20);

        t9.setName("t9"); // NOI18N
        jPanel1.add(t9);
        t9.setBounds(230, 350, 280, 20);

        t7.setName("t7"); // NOI18N
        jPanel1.add(t7);
        t7.setBounds(230, 290, 280, 20);

        t10.setName("t10"); // NOI18N
        jPanel1.add(t10);
        t10.setBounds(230, 380, 280, 20);

        t11.setName("t11"); // NOI18N
        jPanel1.add(t11);
        t11.setBounds(230, 410, 280, 20);

        t12.setName("t12"); // NOI18N
        jPanel1.add(t12);
        t12.setBounds(230, 440, 280, 60);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel16.setForeground(new java.awt.Color(255, 51, 51));
        jLabel16.setText("ABOUT");
        jLabel16.setName("jLabel16"); // NOI18N
        jPanel1.add(jLabel16);
        jLabel16.setBounds(620, 140, 70, 20);

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        t13.setColumns(20);
        t13.setRows(5);
        t13.setName("t13"); // NOI18N
        jScrollPane1.setViewportView(t13);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(520, 170, 280, 220);

        cb1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cb1.setName("cb1"); // NOI18N
        jPanel1.add(cb1);
        cb1.setBounds(240, 90, 260, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 90, 810, 530);

        jLabel4.setFont(new java.awt.Font("Arial Black", 3, 18));
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("ABHILASHA PARIWAR SWYEMSEVI SANSTHA MIRACHAIBARI KATIHAR BIHAR");
        jLabel4.setName("jLabel4"); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 70, 680, 14);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-827)/2, (screenSize.height-644)/2, 827, 644);
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
                new View_proj().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t11;
    private javax.swing.JTextField t12;
    private javax.swing.JTextArea t13;
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
