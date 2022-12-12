/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import admin.AdaminMAin;
import java.awt.Color;
import teacher.TeacherMain;

/**
 *
 * @author Amitkumar011
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setSize(400,320);
        this.setResizable(false);
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TmainBtn = new javax.swing.JButton();
        AdmBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jLabel1.setText("Easy Paper Setter");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 50, 250, 40);

        jLabel2.setText("Click to User Login");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 150, 200, 20);

        jLabel3.setText("Click to Admin Login");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 230, 148, 20);

        TmainBtn.setText("TEACHER");
        TmainBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TmainBtnActionPerformed(evt);
            }
        });
        getContentPane().add(TmainBtn);
        TmainBtn.setBounds(280, 140, 110, 29);

        AdmBtn.setText("ADMIN");
        AdmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdmBtnActionPerformed(evt);
            }
        });
        getContentPane().add(AdmBtn);
        AdmBtn.setBounds(280, 220, 110, 29);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data/O.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 410, 301);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TmainBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TmainBtnActionPerformed
        // TODO add your handling code here:
        new TeacherMain().setVisible(true);
    }//GEN-LAST:event_TmainBtnActionPerformed

    private void AdmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdmBtnActionPerformed
        // TODO add your handling code here:
        new AdaminMAin().setVisible(true);
    }//GEN-LAST:event_AdmBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdmBtn;
    private javax.swing.JButton TmainBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
