/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserInterface;

import Business.DB4OUtil.DB4OUtil;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author Harshada
 */
public class MainJFrame extends javax.swing.JFrame {

    private final DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    Ecosystem system;
    Network network;

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftPane = new javax.swing.JSplitPane();
        leftPanel = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnSignUp = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leftPane.setBackground(new java.awt.Color(255, 255, 255));
        leftPane.setMaximumSize(new java.awt.Dimension(1025, 604));
        leftPane.setMinimumSize(new java.awt.Dimension(1025, 604));
        leftPane.setPreferredSize(new java.awt.Dimension(1025, 604));

        leftPanel.setBackground(new java.awt.Color(255, 255, 255));
        leftPanel.setMaximumSize(new java.awt.Dimension(300, 554));
        leftPanel.setMinimumSize(new java.awt.Dimension(300, 554));
        leftPanel.setPreferredSize(new java.awt.Dimension(300, 554));

        lblUsername.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUsername.setText("Username");

        lblPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPassword.setText("Password");

        btnSignUp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/addCustomer.png"))); // NOI18N
        btnSignUp.setText("SIGNUP");

        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/logout.png"))); // NOI18N
        btnLogout.setText("LOGOUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/login.png"))); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(leftPanelLayout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(leftPanelLayout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(leftPanelLayout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(lblPassword))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40))
        );

        leftPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnLogin, btnLogout, btnSignUp});

        leftPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtPassword, txtUsername});

        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogout)
                .addGap(18, 18, 18)
                .addComponent(btnSignUp)
                .addContainerGap())
        );

        leftPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnLogin, btnLogout, btnSignUp});

        leftPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtPassword, txtUsername});

        leftPane.setLeftComponent(leftPanel);

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setMaximumSize(new java.awt.Dimension(800, 604));
        container.setMinimumSize(new java.awt.Dimension(800, 604));
        container.setPreferredSize(new java.awt.Dimension(800, 604));
        container.setLayout(new java.awt.CardLayout());
        leftPane.setRightComponent(container);

        getContentPane().add(leftPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 1019, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        try {
            txtUsername.setText("");
            txtPassword.setText("");
            btnLogout.setEnabled(false);
            txtUsername.setEnabled(true);
            txtPassword.setEnabled(true);
            btnSignUp.setVisible(true);
            btnLogin.setEnabled(true);

            container.removeAll();
            leftPane.setLeftComponent(leftPanel);

            container.setLayout(new java.awt.CardLayout());
            leftPane.setRightComponent(container);
            getContentPane().add(leftPane, "card2");
            pack();
            leftPane.setDividerLocation(300);
            dB4OUtil.storeSystem(system);
        } catch (Exception e) {
            System.out.println("Logging you out");
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:

        String userName = txtUsername.getText();
        String password = txtPassword.getText();
        UserAccount userAccount = system.getUserAccountList().authenticateUser(userName, password);
        Organization organizationItem = null;
        Enterprise enterpriseItem = null;
        if (userAccount == null) {
            for (Network networkItem : system.getNetworkList()) {
                for (Enterprise e : networkItem.getEnterpriseDirectory().getEnterpriseList()) {
                    userAccount = e.getUserAccountList().authenticateUser(userName, password);
                    if (userAccount == null) {
                        for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
                            userAccount = organization.getUserAccountList().authenticateUser(userName, password);
                            if (userAccount != null) {
                                enterpriseItem = e;
                                organizationItem = organization;
                                break;
                            }
                        }

                    } else {
                        enterpriseItem = e;
                        break;
                    }
                    if (organizationItem != null) {
                        break;
                    }
                }
                if (enterpriseItem != null) {
                    break;
                }
            }
        }
        if (userAccount != null && userAccount.getCustomer() != null) {
            network = userAccount.getCustomer().getNetwork();

        }
        if (userAccount == null) {
            JOptionPane.showMessageDialog(null, "Please enter correct credentials");
            return;
        } else {
            CardLayout layout = (CardLayout) container.getLayout();
            container.add("workArea", userAccount.getRole().createWorkArea(container, enterpriseItem, organizationItem, userAccount, system, network));
            layout.next(container);
        }

        txtUsername.setEnabled(false);
        btnLogin.setEnabled(false);
        btnLogout.setEnabled(true);
        btnSignUp.setVisible(false);
        txtPassword.setEnabled(false);
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JPanel container;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JSplitPane leftPane;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
