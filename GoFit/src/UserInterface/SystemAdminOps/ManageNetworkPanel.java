/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SystemAdminOps;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Component;
import Business.Ecosystem;
import Business.Network.Network;

import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Harshada
 */
public class ManageNetworkPanel extends javax.swing.JPanel {

    private JPanel userContainer;
    private Ecosystem system;

    
    public ManageNetworkPanel(JPanel userContainer, Ecosystem system) {
        initComponents();

        this.userContainer = userContainer;
        this.system = system;
         populatenetworkTable();
    }
    
    
    private void populatenetworkTable() {
        DefaultTableModel model = (DefaultTableModel) networkTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            Object[] row = new Object[1];
            row[0] = network;
            model.addRow(row);
        }
        namejTextField.setText("");
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        networkTable = new javax.swing.JTable();
        deljButton1 = new javax.swing.JButton();
        SubmitjButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        namejTextField = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("MANAGE NETWORK");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 23, 247, 63));

        networkTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name"
            }
        ));
        jScrollPane1.setViewportView(networkTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 92, -1, 107));

        deljButton1.setText("DELETE");
        deljButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deljButton1ActionPerformed(evt);
            }
        });
        add(deljButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 226, -1, -1));

        SubmitjButton.setText("SUBMIT");
        SubmitjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitjButtonActionPerformed(evt);
            }
        });
        add(SubmitjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 421, -1, -1));

        jLabel2.setText("Enter State Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 352, -1, 25));

        namejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namejTextFieldActionPerformed(evt);
            }
        });
        add(namejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 352, 115, 25));
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

    private void namejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namejTextFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_namejTextFieldActionPerformed

    private void SubmitjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitjButtonActionPerformed
        // TODO add your handling code here:
          String name = namejTextField.getText();
            Network network = system.createAndAddNetwork();
            network.setNetworkName(name);
          populatenetworkTable();
          
    }//GEN-LAST:event_SubmitjButtonActionPerformed

    private void deljButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deljButton1ActionPerformed
        // TODO add your handling code here:
        int row = networkTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Select a row on which action is to be performed!!", "Alert:Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Network n  = (Network) networkTable.getValueAt(row, 0);
        system.getNetworkList().remove(n);
         populatenetworkTable();
    }//GEN-LAST:event_deljButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SubmitjButton;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton deljButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField namejTextField;
    private javax.swing.JTable networkTable;
    // End of variables declaration//GEN-END:variables
}
