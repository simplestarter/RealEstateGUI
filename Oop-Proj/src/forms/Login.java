/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import database.UserData;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author Asus-User
 */
public class Login extends javax.swing.JFrame {
    
    public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        btnLogin.setEnabled(false);
    }
    
    public void clear(){
        txtEmail.setText("");
        txtPassword.setText("");
        btnLogin.setEnabled(false);
    }
    
    public void validateFields(){
        String email = txtEmail.getText();
        String password = txtPassword.getText();
        boolean valid = email.matches(emailPattern) && !password.equals("");

        btnLogin.setEnabled(valid);
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
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnForgotPass = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 0, 0));
        jLabel1.setText("Login");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, -1, -1));

        txtEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 351, -1));

        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 350, -1));

        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, -1, -1));

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, -1, -1));

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit small.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 340, -1, -1));

        btnForgotPass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnForgotPass.setText("Fogot Password?");
        btnForgotPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgotPassActionPerformed(evt);
            }
        });
        getContentPane().add(btnForgotPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 160, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("Sign Up");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 390, -1, -1));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 80)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/popupicons/OOP-FinalProjCoverIcon.png"))); // NOI18N
        jLabel5.setText("Real Estate Management System");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/OopProj-ClearCover.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnForgotPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgotPassActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new ForgotPassword().setVisible(true);
    }//GEN-LAST:event_btnForgotPassActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String email = txtEmail.getText();
        String password = txtPassword.getText();
        User user = null;
        user = UserData.login(email, password);
        if(user == null)
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">Incorrect Username or Password</b></html>", "Message", JOptionPane.ERROR_MESSAGE);
        else{
            if(user.getStatus().equals("false")){
                ImageIcon icon = new ImageIcon("src/popupicons/wait.png");
                JOptionPane.showMessageDialog(null, "<html><b style=\"color:orange\">Wait for Admin Approval</b></html>", "Message", JOptionPane.INFORMATION_MESSAGE, icon);
                clear();
            }
            if(user.getStatus().equals("true")){
                setVisible(false);
                new Home(email).setVisible(true);
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you want to Close the Application?", "SELECT", JOptionPane.YES_NO_OPTION);
        if(a == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new SignUp().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

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
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnForgotPass;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
