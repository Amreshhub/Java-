/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * All_Partenarship_details.java
 *
 * Created on May 17, 2012, 12:00:23 AM
 */

/**
 *
 * @author Amresh
 */
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class All_Partenarship_details extends javax.swing.JFrame {
        Connection con;
	Statement st;
	ResultSet rs;
	ResultSetMetaData rmeta;


    /** Creates new form All_Partenarship_details */
    public All_Partenarship_details() {
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
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
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t12 = new javax.swing.JTextArea();
        t1 = new javax.swing.JTextField();
        t13 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t14 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t15 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        t16 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        t8 = new javax.swing.JTextField();
        t9 = new javax.swing.JTextField();
        t10 = new javax.swing.JTextField();
        t11 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        t18 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        t17 = new javax.swing.JTextArea();
        ti1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("All Partenarship details");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel1.setText("Partenership Work  With Abhilasha View");
        jLabel1.setName("jLabel1"); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 10, 360, 22);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/EIFEL TOWER OF FRANCE.JPG"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setName("jLabel2"); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 800, 60);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel3.setText("ENTER PROJECT NAME ");
        jLabel3.setName("jLabel3"); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 20, 170, 17);

        jButton1.setText("View");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(650, 10, 80, 30);

        jButton2.setText("Exit");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(660, 540, 90, 50);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel4.setText("Project Name");
        jLabel4.setName("jLabel4"); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 100, 120, 14);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel6.setText("project area");
        jLabel6.setName("jLabel6"); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 130, 110, 14);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel7.setText("our Ngo name");
        jLabel7.setName("jLabel7"); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 160, 130, 14);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel8.setText("our secqeratry name");
        jLabel8.setName("jLabel8"); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 190, 190, 14);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel9.setText("our Investemnt");
        jLabel9.setName("jLabel9"); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 220, 140, 14);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel10.setText("our profit");
        jLabel10.setName("jLabel10"); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 250, 90, 14);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel11.setText("No Of Our member in Project");
        jLabel11.setName("jLabel11"); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(20, 280, 260, 14);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel12.setText("Date of Start");
        jLabel12.setName("jLabel12"); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(20, 310, 110, 14);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel13.setText("About");
        jLabel13.setName("jLabel13"); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(160, 470, 60, 14);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel14.setText("Partnar ngo name");
        jLabel14.setName("jLabel14"); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(20, 340, 160, 14);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel15.setText("Our regestrion no");
        jLabel15.setName("jLabel15"); // NOI18N
        jPanel1.add(jLabel15);
        jLabel15.setBounds(20, 370, 170, 14);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel16.setText("Partnar regestrion no");
        jLabel16.setName("jLabel16"); // NOI18N
        jPanel1.add(jLabel16);
        jLabel16.setBounds(370, 100, 190, 20);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel17.setText("Partenar secquerarty");
        jLabel17.setName("jLabel17"); // NOI18N
        jPanel1.add(jLabel17);
        jLabel17.setBounds(370, 150, 190, 14);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel18.setText("Partenar  investment");
        jLabel18.setName("jLabel18"); // NOI18N
        jPanel1.add(jLabel18);
        jLabel18.setBounds(370, 190, 190, 14);

        jLabel20.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel20.setText("Partnar profit");
        jLabel20.setName("jLabel20"); // NOI18N
        jPanel1.add(jLabel20);
        jLabel20.setBounds(370, 240, 120, 14);

        jLabel21.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel21.setText("  End date");
        jLabel21.setName("jLabel21"); // NOI18N
        jPanel1.add(jLabel21);
        jLabel21.setBounds(20, 400, 90, 20);

        jLabel22.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel22.setText("all Our Member in project");
        jLabel22.setName("jLabel22"); // NOI18N
        jPanel1.add(jLabel22);
        jLabel22.setBounds(380, 310, 230, 14);

        jLabel23.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel23.setText("partenar member in project");
        jLabel23.setName("jLabel23"); // NOI18N
        jPanel1.add(jLabel23);
        jLabel23.setBounds(370, 280, 260, 20);

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        t12.setColumns(20);
        t12.setRows(5);
        t12.setName("t12"); // NOI18N
        jScrollPane1.setViewportView(t12);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(160, 490, 440, 96);

        t1.setName("t1"); // NOI18N
        jPanel1.add(t1);
        t1.setBounds(150, 100, 210, 20);

        t13.setName("t13"); // NOI18N
        jPanel1.add(t13);
        t13.setBounds(560, 100, 210, 20);

        t2.setName("t2"); // NOI18N
        jPanel1.add(t2);
        t2.setBounds(150, 130, 210, 20);

        t14.setName("t14"); // NOI18N
        jPanel1.add(t14);
        t14.setBounds(560, 150, 210, 20);

        t3.setName("t3"); // NOI18N
        jPanel1.add(t3);
        t3.setBounds(150, 160, 210, 20);

        t4.setName("t4"); // NOI18N
        jPanel1.add(t4);
        t4.setBounds(210, 190, 150, 20);

        t5.setName("t5"); // NOI18N
        jPanel1.add(t5);
        t5.setBounds(170, 220, 190, 20);

        t15.setName("t15"); // NOI18N
        jPanel1.add(t15);
        t15.setBounds(560, 190, 210, 20);

        t6.setName("t6"); // NOI18N
        jPanel1.add(t6);
        t6.setBounds(150, 250, 210, 20);

        t16.setName("t16"); // NOI18N
        jPanel1.add(t16);
        t16.setBounds(560, 230, 210, 20);

        t7.setName("t7"); // NOI18N
        jPanel1.add(t7);
        t7.setBounds(280, 280, 80, 20);

        t8.setName("t8"); // NOI18N
        jPanel1.add(t8);
        t8.setBounds(150, 310, 210, 20);

        t9.setName("t9"); // NOI18N
        jPanel1.add(t9);
        t9.setBounds(180, 340, 180, 20);

        t10.setName("t10"); // NOI18N
        jPanel1.add(t10);
        t10.setBounds(180, 370, 180, 20);

        t11.setName("t11"); // NOI18N
        jPanel1.add(t11);
        t11.setBounds(160, 400, 200, 20);

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        t18.setColumns(20);
        t18.setRows(5);
        t18.setName("t18"); // NOI18N
        jScrollPane2.setViewportView(t18);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(620, 280, 166, 260);

        jScrollPane3.setName("jScrollPane3"); // NOI18N

        t17.setColumns(20);
        t17.setRows(5);
        t17.setName("t17"); // NOI18N
        jScrollPane3.setViewportView(t17);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(380, 330, 220, 140);

        ti1.setName("ti1"); // NOI18N
        jPanel1.add(ti1);
        ti1.setBounds(250, 20, 250, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 110, 800, 630);

        jLabel5.setFont(new java.awt.Font("Arial", 3, 18));
        jLabel5.setText("Abhilasha pariwar SwyemSevi Sanstha");
        jLabel5.setName("jLabel5"); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(170, 60, 340, 22);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-815)/2, (screenSize.height-742)/2, 815, 742);
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
            String sql="SELECT * FROM partenership;";
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
                    t9.setText(rs.getString(9));
                    t10.setText(rs.getString(10));
                    t11.setText(rs.getString(16));
                    t12.setText(rs.getString(17));
                    t13.setText(rs.getString(11));
                    t14.setText(rs.getString(12));
                    t15.setText(rs.getString(13));
                    t16.setText(rs.getString(14));
                    t17.setText(rs.getString(18));
                    t18.setText(rs.getString(15));

                    //flag=2;
                    break;
                }
            }
            if(flag==2)
            {
                JOptionPane.showMessageDialog(this,"Invalid Mmembership Found ");
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
                new All_Partenarship_details().setVisible(true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
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
    private javax.swing.JTextArea t12;
    private javax.swing.JTextField t13;
    private javax.swing.JTextField t14;
    private javax.swing.JTextField t15;
    private javax.swing.JTextField t16;
    private javax.swing.JTextArea t17;
    private javax.swing.JTextArea t18;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    private javax.swing.JTextField ti1;
    // End of variables declaration//GEN-END:variables

}