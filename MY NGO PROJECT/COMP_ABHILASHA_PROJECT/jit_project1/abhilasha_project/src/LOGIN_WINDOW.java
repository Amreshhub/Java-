/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LOGIN_WINDOW.java
 *
 * Created on May 14, 2012, 10:58:41 PM
 */

/**
 *
 * @author Amresh
 */
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LOGIN_WINDOW extends javax.swing.JFrame implements ActionListener{
        Connection con;
	Statement st;
	ResultSet rs;
	ResultSetMetaData rmeta;



    /** Creates new form LOGIN_WINDOW */
    public LOGIN_WINDOW() {
        initComponents();
        setconn("ABHILASHADSN","ABHILASHA_PARIWAR","AMRESH");
        b1.addActionListener(this);
        //b2.addActionListener(this);
    }
    public boolean setconn(String ds,String user,String pwd)
    {
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String url="jdbc:odbc:"+ds;
            con=DriverManager.getConnection(url,user,pwd);
            DatabaseMetaData meta=con.getMetaData();
            return(true);
           // st=con.createStatement();
           // String sql="SELECT * FROM LOGIN_ABHILASHA";
           // rs=st.executeQuery(sql);
            //rs.next();
            //t1.setText(rs.getString(1));

            
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        p1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenuBar2.setName("jMenuBar2"); // NOI18N

        jMenu1.setText("File");
        jMenu1.setName("jMenu1"); // NOI18N
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenu2.setName("jMenu2"); // NOI18N
        jMenuBar2.add(jMenu2);

        jMenuBar3.setName("jMenuBar3"); // NOI18N

        jMenu3.setText("File");
        jMenu3.setName("jMenu3"); // NOI18N
        jMenuBar3.add(jMenu3);

        jMenu4.setText("Edit");
        jMenu4.setName("jMenu4"); // NOI18N
        jMenuBar3.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN WINDOW");
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 153, 255));
        jPanel2.setName("jPanel2"); // NOI18N
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel1.setText("USERNAME");
        jLabel1.setName("jLabel1"); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(30, 60, 103, 22);

        t1.setName("t1"); // NOI18N
        jPanel2.add(t1);
        t1.setBounds(170, 60, 242, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel2.setText("PASSWORD");
        jLabel2.setName("jLabel2"); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 100, 106, 22);

        b1.setFont(new java.awt.Font("Tahoma", 1, 14));
        b1.setText("LOGIN");
        b1.setName("b1"); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel2.add(b1);
        b1.setBounds(90, 150, 88, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton2.setText("EXIT");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(230, 150, 86, 30);

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 1, 24));
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText(" Main Branch MirchaiBari Katihar");
        jLabel3.setName("jLabel3"); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(140, 0, 350, 24);

        p1.setName("p1"); // NOI18N
        jPanel2.add(p1);
        p1.setBounds(170, 100, 240, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("RAJESH SINGH");
        jLabel6.setName("jLabel6"); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(460, 200, 103, 17);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/DSC02588.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jLabel7.setName("jLabel7"); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(430, 40, 160, 150);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 60, 610, 230);

        jLabel4.setFont(new java.awt.Font("Monotype Corsiva", 1, 30));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Abhilasha Pariwar SwyemSevi Sanstha");
        jLabel4.setName("jLabel4"); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 20, 520, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/HDWallpapers (77).jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setName("jLabel5"); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 610, 60);

        jMenuBar1.setName("jMenuBar1"); // NOI18N
        setJMenuBar(jMenuBar1);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-619)/2, (screenSize.height-327)/2, 619, 327);
    }// </editor-fold>//GEN-END:initComponents

    public void actionPerformed(ActionEvent ae)
{
         if(ae.getSource()==b1)
        {
             try
          {
        st=con.createStatement();
        String sql="SELECT * From login_abhilasha";
        rs=st.executeQuery(sql);
        rs.next();
        String un=t1.getText().trim();
        String pwd=p1.getText().trim();
        if(un.equals(rs.getString(1)) && pwd.equals(rs.getString(2)))
        {
            MINU_LIST ml=new MINU_LIST();
            ml.setVisible(true);
            setVisible(false);

        }
        else
        {
            JOptionPane.showMessageDialog(this,"User Name And Password Invalid","Information",JOptionPane.INFORMATION_MESSAGE);
            t1.setFocusable(true);

        }
          }
          catch(Exception e)
          {
         System.out.println("Error:"+e.getMessage());
          }

         }

    }
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed


           




       
    }//GEN-LAST:event_b1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                      System.exit(0);
                      
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new LOGIN_WINDOW().setVisible(true);
               LOGIN_WINDOW l1=new LOGIN_WINDOW();
                l1.show();
                l1.setconn("ABHILASHADSN","ABHILASHA_PARIWAR","AMRESH");
                l1.mySelect("login_abhilasha");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField p1;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables

}
