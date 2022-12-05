/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SystemAdminOps;

import Business.Ecosystem;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author Harshada
 */
public class ManageEnterpriseAdminPanel extends javax.swing.JPanel {

    private Ecosystem system;
    private JPanel userContainer;

    /**
     * Creates new form ManageEnterpriseAdminPanel
     *
     * @param userProcessContainer
     * @param system
     */
    public ManageEnterpriseAdminPanel(JPanel userProcessContainer, Ecosystem system) {
        initComponents();
        this.system = system;
        this.userContainer = userProcessContainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(401, 401, 401)
                .addComponent(btnBack)
                .addContainerGap(488, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(468, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(241, 241, 241))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userContainer.remove(this);
        Component[] trackComponent = userContainer.getComponents();
        Component eachComponent = trackComponent[trackComponent.length - 1];
        SystemAdminOperations sysAdminOps = (SystemAdminOperations) eachComponent;
        CardLayout cardLayout = (CardLayout) userContainer.getLayout();
        cardLayout.previous(userContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    // End of variables declaration//GEN-END:variables
}
