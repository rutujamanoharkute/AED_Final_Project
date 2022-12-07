/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.EnterpriseAdmin;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Harshada
 */
public class EnterpriseAdminOperationsPanel extends javax.swing.JPanel {

    /**
     * Creates new form EnterpriseAdminOperationsPanel
     */
    Enterprise enterprise;
    JPanel userContainer;
    UserAccount account;
    Organization organization;
    Ecosystem system;
    Network network;

    public EnterpriseAdminOperationsPanel(JPanel userProcessContainer, Enterprise enterprise, Organization organization, UserAccount account, Ecosystem system, Network network) {
        initComponents();
        this.organization = organization;
        this.enterprise = enterprise;
        this.userContainer = userProcessContainer;
        this.account = account;
        this.system = system;
        this.network = network;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnManageOrganization = new javax.swing.JButton();
        btnManageRequests = new javax.swing.JButton();
        btnMngEmployee = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setText("WELCOME ENTERPRISE ADMIN");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 372, -1));

        btnManageOrganization.setText("MANAGE ORGANIZATION");
        btnManageOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrganizationActionPerformed(evt);
            }
        });
        add(btnManageOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, 60));

        btnManageRequests.setText("MANAGE REQUESTS");
        add(btnManageRequests, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 250, 60));

        btnMngEmployee.setText("MANAGE EMPLOYEE");
        btnMngEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMngEmployeeActionPerformed(evt);
            }
        });
        add(btnMngEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 250, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrganizationActionPerformed
        // TODO add your handling code here:
        ManageOrganizationPanel manageOrganizationJPanel = new ManageOrganizationPanel(userContainer, enterprise);
        userContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout cardlayout = (CardLayout) userContainer.getLayout();
        cardlayout.next(userContainer);
    }//GEN-LAST:event_btnManageOrganizationActionPerformed

    private void btnMngEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMngEmployeeActionPerformed
        // TODO add your handling code here:
        ManageEmployeePanel manageEmployeePanel = new ManageEmployeePanel(userContainer, enterprise.getOrganizationDirectory(),system);
        userContainer.add("manageEmployeePanel", manageEmployeePanel);
        CardLayout cardlayout = (CardLayout) userContainer.getLayout();
        cardlayout.next(userContainer);
        
        
        
    }//GEN-LAST:event_btnMngEmployeeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageOrganization;
    private javax.swing.JButton btnManageRequests;
    private javax.swing.JButton btnMngEmployee;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
