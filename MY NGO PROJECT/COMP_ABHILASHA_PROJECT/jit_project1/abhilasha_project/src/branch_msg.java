/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * branch_msg.java
 *
 * Created on May 16, 2012, 1:41:37 PM
 */

/**
 *
 * @author Amresh
 */
public class branch_msg extends javax.swing.JFrame {

    /** Creates new form branch_msg */
    public branch_msg() {
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
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 18));
        jLabel1.setText("comfarm Branch Entery");
        jLabel1.setName("jLabel1"); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 10, 210, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/HDWallpapers (32).jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setName("jLabel2"); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 630, 50);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14));
        jLabel3.setText("Are you seur Issue branch By Rajesh kumar singh");
        jLabel3.setName("jLabel3"); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 60, 350, 17);

        jButton1.setText("yes");
        jButton1.setName("jButton1"); // NOI18N
        jPanel1.add(jButton1);
        jButton1.setBounds(100, 140, 49, 23);

        jButton2.setText("No");
        jButton2.setName("jButton2"); // NOI18N
        jPanel1.add(jButton2);
        jButton2.setBounds(380, 140, 45, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 70, 630, 190);

        jLabel4.setFont(new java.awt.Font("Arial", 3, 12));
        jLabel4.setText("Abhilasha praiwar swyemsevi Sanstha");
        jLabel4.setName("jLabel4"); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(180, 50, 230, 15);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-634)/2, (screenSize.height-296)/2, 634, 296);
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new branch_msg().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
