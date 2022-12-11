/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.StoreManager;

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
public class ManageStoreOperationsPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageStoreOperationsPanel
     */
    
     JPanel userContainer;
     private Ecosystem system;
     private UserAccount account;
     private Organization organization;
     private Enterprise enterprise;
     private UserAccount userAcc;
     
    
    public ManageStoreOperationsPanel(JPanel userContainer, Enterprise enterprise, Organization organization, UserAccount account, Ecosystem system, Network network) {
        initComponents();
        this.userContainer = userContainer;
        this.account=account;
        this.organization=organization;
        this.enterprise=enterprise;
        this.system=system;
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
        manageInventoryBtn = new javax.swing.JButton();
        manageOrdersBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("MANAGE STORE OPERATIONS");

        manageInventoryBtn.setText("Manage Stock");
        manageInventoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageInventoryBtnActionPerformed(evt);
            }
        });

        manageOrdersBtn.setText("Manage Orders");
        manageOrdersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrdersBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(285, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(manageInventoryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(manageOrdersBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(282, 282, 282))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(262, 262, 262))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(manageInventoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(manageOrdersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(375, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageInventoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageInventoryBtnActionPerformed
        ManageStockPanel panel = new ManageStockPanel(userContainer,organization,system,enterprise,account);
        userContainer.add("ManageStockPanel", panel);
        CardLayout layout = (CardLayout) userContainer.getLayout();
        layout.next(userContainer);
    }//GEN-LAST:event_manageInventoryBtnActionPerformed

    private void manageOrdersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrdersBtnActionPerformed
        ManageOrdersPanel panel = new ManageOrdersPanel(userContainer,organization, system,enterprise,account);
        userContainer.add("ManageOrdersJPanel", panel);
        CardLayout layout = (CardLayout) userContainer.getLayout();
        layout.next(userContainer);
    }//GEN-LAST:event_manageOrdersBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageInventoryBtn;
    private javax.swing.JButton manageOrdersBtn;
    // End of variables declaration//GEN-END:variables
}