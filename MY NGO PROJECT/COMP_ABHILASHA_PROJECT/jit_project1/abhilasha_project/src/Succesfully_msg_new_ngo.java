/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Succesfully_msg_new_ngo.java
 *
 * Created on May 16, 2012, 10:19:34 PM
 */

/**
 *
 * @author Amresh
 */
public class Succesfully_msg_new_ngo extends javax.swing.JFrame {

    /** Creates new form Succesfully_msg_new_ngo */
    public Succesfully_msg_new_ngo() {
        initComponents();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add New NGO Succesfully Meassge");
        jLabel1.setName("jLabel1"); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 20, 320, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/GREAT WALL OF CINA.JPG"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setName("jLabel2"); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 640, 60);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel3.setText("You have New NGO Enterd Succesfully");
        jLabel3.setName("jLabel3"); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(130, 70, 280, 20);

        jButton1.setText("OK");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(60, 160, 70, 23);

        jButton2.setText("Exit");
        jButton2.setName("jButton2"); // NOI18N
        jPanel1.add(jButton2);
        jButton2.setBounds(470, 160, 73, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 80, 600, 220);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-608)/2, (screenSize.height-325)/2, 608, 325);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Succesfully_msg_new_ngo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
