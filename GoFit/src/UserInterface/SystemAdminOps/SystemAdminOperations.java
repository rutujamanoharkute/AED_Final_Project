/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SystemAdminOps;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Harshada
 */
public class SystemAdminOperations extends javax.swing.JPanel {

    JPanel userContainer;
    Network network;
    Organization organization;
    Ecosystem system;
    Enterprise enterprise;
    UserAccount account;

    /**
     * Creates new form SystemAdminOperations
     *
     * @param userProcessContainer
     * @param enterprise
     * @param organization
     * @param account
     * @param business
     * @param network
     */
    public SystemAdminOperations(JPanel userProcessContainer, Enterprise enterprise, Organization organization, UserAccount account, Ecosystem business, Network network) {
        initComponents();
        this.userContainer = userProcessContainer;
        this.system = business;
        this.organization = organization;
        this.enterprise = enterprise;
        this.account = account;
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

        kGradientPanel1 = new keeptoo.KGradientPanel();
        manageNetwork = new javax.swing.JButton();
        manageEnterprise = new javax.swing.JButton();
        manageEnterpriseAdmin = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 204, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 153, 0));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageNetwork.setText("MANAGE NETWORK");
        manageNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageNetworkActionPerformed(evt);
            }
        });
        kGradientPanel1.add(manageNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 300, 58));

        manageEnterprise.setText("MANAGE ENTERPRISE");
        manageEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEnterpriseActionPerformed(evt);
            }
        });
        kGradientPanel1.add(manageEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 300, 62));

        manageEnterpriseAdmin.setText("MANAGE ENTERPRISE ADMIN");
        manageEnterpriseAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEnterpriseAdminActionPerformed(evt);
            }
        });
        kGradientPanel1.add(manageEnterpriseAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 300, 68));

        add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 530));
    }// </editor-fold>//GEN-END:initComponents

    private void manageNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageNetworkActionPerformed
        // TODO add your handling code here:
        try{
        ManageNetworkPanel manageNetworkJPanel = new ManageNetworkPanel(userContainer, system);
        userContainer.add("manageNetworkJPanel", manageNetworkJPanel);
        CardLayout layout = (CardLayout) userContainer.getLayout();
        layout.next(userContainer);
        
         }
        catch(Exception e){
            
                
             JOptionPane.showMessageDialog(this, "Please try again");
        
        }
    }//GEN-LAST:event_manageNetworkActionPerformed

    private void manageEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEnterpriseActionPerformed
        // TODO add your handling code here:
        try{
        ManageEnterprisePanel manageEnterprisePanel = new ManageEnterprisePanel(userContainer, system);
        userContainer.add("manageEnterprisePanel", manageEnterprisePanel);
        CardLayout layout = (CardLayout) userContainer.getLayout();
        layout.next(userContainer);
         }
        catch(Exception e){
            
                
             JOptionPane.showMessageDialog(this, "Please try again");
        
        }
    }//GEN-LAST:event_manageEnterpriseActionPerformed

    private void manageEnterpriseAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEnterpriseAdminActionPerformed
        // TODO add your handling code here:
        try{
        ManageEnterpriseAdminPanel manageEnterpriseAdminPanel = new ManageEnterpriseAdminPanel(userContainer, system);
        userContainer.add("manageEnterpriseAdminPanel", manageEnterpriseAdminPanel);
        CardLayout layout = (CardLayout) userContainer.getLayout();
        layout.next(userContainer);
         }
        catch(Exception e){
            
                
             JOptionPane.showMessageDialog(this, "Please try again");
        
        }
    }//GEN-LAST:event_manageEnterpriseAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton manageEnterprise;
    private javax.swing.JButton manageEnterpriseAdmin;
    private javax.swing.JButton manageNetwork;
    // End of variables declaration//GEN-END:variables
}
