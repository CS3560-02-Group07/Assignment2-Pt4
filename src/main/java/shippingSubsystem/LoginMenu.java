/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package shippingSubsystem;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ethan
 */
public class LoginMenu extends javax.swing.JFrame {

    Connection con = null; 
    ResultSet rs = null; 
    public LoginMenu() {
        initComponents();
        con = DataBase.myCon(); 
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor. hi
     * 
     * 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SignInPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        emailText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        IdText = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        CreateAccountPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        newEmailText = new javax.swing.JTextField();
        newPhoneText = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new java.awt.CardLayout());

        SignInPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 153, 255));
        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to not-Amazon Shipping ");
        jLabel1.setToolTipText("");
        jLabel1.setOpaque(true);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton2.setText("Sign in");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        emailText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Please Sign In:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("CustomerID: ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Email:");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 255));
        jButton1.setText("Log in as Employee");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SignInPanelLayout = new javax.swing.GroupLayout(SignInPanel);
        SignInPanel.setLayout(SignInPanelLayout);
        SignInPanelLayout.setHorizontalGroup(
            SignInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(SignInPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignInPanelLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(SignInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignInPanelLayout.createSequentialGroup()
                        .addGroup(SignInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(SignInPanelLayout.createSequentialGroup()
                                .addGroup(SignInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addGap(41, 41, 41)
                                .addComponent(IdText, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SignInPanelLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(179, 179, 179))))
        );
        SignInPanelLayout.setVerticalGroup(
            SignInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignInPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(SignInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(20, 20, 20)
                .addGroup(SignInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(39, 39, 39)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton1)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        getContentPane().add(SignInPanel, "card2");

        CreateAccountPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setBackground(new java.awt.Color(4, 81, 134));
        jLabel5.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Employee Sign In ");
        jLabel5.setToolTipText("");
        jLabel5.setOpaque(true);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel8.setText("Email: ");

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel9.setText("Employee ID: ");

        jButton3.setBackground(new java.awt.Color(4, 81, 134));
        jButton3.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Sign In ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CreateAccountPanelLayout = new javax.swing.GroupLayout(CreateAccountPanel);
        CreateAccountPanel.setLayout(CreateAccountPanelLayout);
        CreateAccountPanelLayout.setHorizontalGroup(
            CreateAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(CreateAccountPanelLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243))
            .addGroup(CreateAccountPanelLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(CreateAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(CreateAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(newPhoneText)
                    .addComponent(newEmailText, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                .addGap(156, 156, 156))
        );
        CreateAccountPanelLayout.setVerticalGroup(
            CreateAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateAccountPanelLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(CreateAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newEmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(CreateAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        getContentPane().add(CreateAccountPanel, "card4");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void emailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try{
         

            String email = emailText.getText();
            String id = IdText.getText();

            Statement stm = con.createStatement();

            String sql = "select * from customer where emailAddress='"+email+"'and customerID='"+id+"'";

            rs = stm.executeQuery(sql);

            if(rs.next()){
                
                System.out.println(rs.getInt(1) + rs.getString(2) + rs.getString(3)
                + rs.getString(4) + rs.getString(5));
                Customer newCustomer = new Customer(rs.getInt(1),rs.getString(2),rs.getString(4),rs.getString(5));
                
        
                new CustomerMenu(newCustomer).setVisible(true);
                dispose();
            }
            else{
                JOptionPane.showMessageDialog(this, "Email or ID is invalid");
                emailText.setText("");
                IdText.setText("");

            }
            con.close();
        }catch(Exception e){
            System.out.println("stil running");
            System.out.println((e.getMessage()));
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SignInPanel.setVisible(false);
        CreateAccountPanel.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        String empID = newPhoneText.getText();
        String email = newEmailText.getText(); 
  
        boolean loggedIn = false;
        
        
        
        try{
            Statement stm = con.createStatement();

            String sql = "select * from employee where emailAddress='"+email+"'and employeeID='"+empID+"'";
            
            
            //JOptionPane.showMessageDialog(this, "Account Created. Your customer id is: " + id);
            loggedIn = true; 
            
        }catch(Exception e){
            
            System.out.println((e.getMessage()));
        }
        
        if(loggedIn){
            CreateAccountPanel.setVisible(false);
            new StaffMenu().setVisible(true); 
            dispose(); 
        }
        else{
            JOptionPane.showMessageDialog(this, "Incorrect email / ID");
          
            newPhoneText.setText("");
            newEmailText.setText(""); 
           
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public boolean valid = false; 
    public String var = "";  
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
            java.util.logging.Logger.getLogger(LoginMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginMenu().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CreateAccountPanel;
    private javax.swing.JPasswordField IdText;
    private javax.swing.JPanel SignInPanel;
    private javax.swing.JTextField emailText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField newEmailText;
    private javax.swing.JTextField newPhoneText;
    // End of variables declaration//GEN-END:variables
}
