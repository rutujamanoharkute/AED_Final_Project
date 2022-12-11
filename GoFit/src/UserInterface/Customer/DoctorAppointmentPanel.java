/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Customer;

import Business.Ecosystem;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author rutujakute
 */
public class DoctorAppointmentPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorAppointmentPanel
     */
    
    private JPanel userProcessContainer;
    private Ecosystem system;
    private Network network;
    private UserAccount userAccount;
    public DoctorAppointmentPanel(JPanel userProcessContainer, Ecosystem system, Network network, UserAccount userAccount) {
        initComponents();
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system =system;
        this.network = network;
        this.userAccount = userAccount;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        btnPhysiotherapist = new javax.swing.JButton();
        btnPsychiatrist = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        btnCardiologist = new javax.swing.JButton();
        rightJPanel = new keeptoo.KGradientPanel();

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        btnPhysiotherapist.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnPhysiotherapist.setText("Physiotherapist");
        btnPhysiotherapist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhysiotherapistActionPerformed(evt);
            }
        });

        btnPsychiatrist.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnPsychiatrist.setText("Psychiatrist");
        btnPsychiatrist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPsychiatristActionPerformed(evt);
            }
        });

        backJButton.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        btnCardiologist.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnCardiologist.setText("Cardiologist");
        btnCardiologist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCardiologistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(backJButton)
                .addGap(79, 79, 79)
                .addComponent(btnCardiologist, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(btnPhysiotherapist, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(btnPsychiatrist, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(btnCardiologist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPhysiotherapist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPsychiatrist))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(kGradientPanel1);

        rightJPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(rightJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnCardiologistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCardiologistActionPerformed
        // TODO add your handling code here:
        CardiologistPanel panel = new CardiologistPanel(userProcessContainer, system, network, userAccount);
        rightJPanel.add("ManageCustomersJPanel", panel);
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_btnCardiologistActionPerformed

    private void btnPhysiotherapistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhysiotherapistActionPerformed
        // TODO add your handling code here:
        PhysiotherapistPanel panel = new PhysiotherapistPanel(userProcessContainer, system, network, userAccount);
        rightJPanel.add("ManageCustomersJPanel", panel);
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_btnPhysiotherapistActionPerformed

    private void btnPsychiatristActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPsychiatristActionPerformed
        // TODO add your handling code here:
        PsychiatristPanel panel = new PsychiatristPanel(userProcessContainer, system, network, userAccount);
        rightJPanel.add("ManageCustomersJPanel", panel);
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_btnPsychiatristActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnCardiologist;
    private javax.swing.JButton btnPhysiotherapist;
    private javax.swing.JButton btnPsychiatrist;
    private javax.swing.JSplitPane jSplitPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel rightJPanel;
    // End of variables declaration//GEN-END:variables
}
