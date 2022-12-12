/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Customer;

import Business.Customer.Customer;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseGymTrainer;
import Business.Network.Network;
import Business.Organization.GymTrainerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.GymTrainerWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author rutujakute
 */
public class GymTrainerPanel extends javax.swing.JPanel {

    /**
     * Creates new form GymTrainerPanelPanel
     */
    private Customer customer;
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Ecosystem system;
    Enterprise e;
    private Network network;

    public GymTrainerPanel(JPanel userProcessContainer, Ecosystem system, Network network, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.customer = customer;
        this.userAccount = userAccount;
        this.system = system;
        this.network = network;
        populateGymTrainerStatusTable();
    }

    private void populateGymTrainerStatusTable() {
        try
        {
        DefaultTableModel dtm = (DefaultTableModel) tblGymTrainer.getModel();
        dtm.setRowCount(0);
        Organization org = null;
        for (Enterprise enter : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enter instanceof EnterpriseGymTrainer) {
                e = enter;
            }
        }
        for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof GymTrainerOrganization) {
                org = organization;
                break;
            }
        }
        if (org != null) {
            for (WorkRequest request : org.getWorkQueue().getWorkRequestList()) {
                if (request.getSender().equals(userAccount)) {
                    Object row[] = new Object[5];
                    row[0] = request.getRequestID();
                    row[1] = request.getWorkMessage();
                    row[2] = request.getReceiver();
                    row[3] = ((GymTrainerWorkRequest) request).getGymTrainerResult();
                    row[4] = request.getWorkStatus();
                    dtm.addRow(row);
                }
            }
        }
        }
         catch(Exception e)
        {
             JOptionPane.showMessageDialog(this, "Please try again");
        }
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
        jLabel5 = new javax.swing.JLabel();
        btnGymTrainer = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGymTrainer = new javax.swing.JTable();

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 204, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 153, 0));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Gym Trainer");
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 110, 378, 61));

        btnGymTrainer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/imgSave.png"))); // NOI18N
        btnGymTrainer.setText("Submit Request to Gym Trainer");
        btnGymTrainer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGymTrainerActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnGymTrainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 370, 45));

        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/imgBack.png"))); // NOI18N
        backBtn.setText(" Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        kGradientPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 31, 146, 42));

        tblGymTrainer.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        tblGymTrainer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Request ID", "Message", "Trainer Name ", "Comments", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblGymTrainer);

        kGradientPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 687, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGymTrainerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGymTrainerActionPerformed
        // TODO add your handling code here:
        try
        {
          if (userAccount.getWorkQueue().getWorkRequestList().size() == 0) {

            GymTrainerWorkRequest request = new GymTrainerWorkRequest();
            request.setWorkMessage("Need Training");
            request.setSender(userAccount);
            request.setWorkStatus("Request Sent to Admin");
            System.out.print("Request sent to Admin");
            Organization org = null;

            for (Enterprise enter : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enter instanceof EnterpriseGymTrainer) {
                    e = enter;
                }
            }
            for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof GymTrainerOrganization) {
                    org = organization;
                    break;
                }
            }
            if (org != null) {
                org.getWorkQueue().getWorkRequestList().add(request);
                userAccount.getWorkQueue().getWorkRequestList().add(request);
            }
            JOptionPane.showMessageDialog(null, "Request has been sent. You will receive an email once it is processed!!", "Success", JOptionPane.INFORMATION_MESSAGE);
            populateGymTrainerStatusTable();
        } else {
            int x = userAccount.getWorkQueue().getWorkRequestList().size() - 1;
            WorkRequest r = userAccount.getWorkQueue().getWorkRequestList().get(x);
            if (r.getWorkStatus().toLowerCase().equals("result posted")) {

                GymTrainerWorkRequest request = new GymTrainerWorkRequest();
                request.setWorkMessage("Need Gym Trainer ");
                request.setSender(userAccount);
                request.setWorkStatus("Request Sent to Admin");
                System.out.print("Request sent to Admin");
                Organization org = null;

                for (Enterprise enter : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enter instanceof EnterpriseGymTrainer) {
                        e = enter;
                    }
                }
                for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof GymTrainerOrganization) {
                        org = organization;
                        break;
                    }
                }
                if (org != null) {
                    org.getWorkQueue().getWorkRequestList().add(request);
                    userAccount.getWorkQueue().getWorkRequestList().add(request);
                }
                JOptionPane.showMessageDialog(null, "Request has been sent. You will receive an email once it is processed!!", "Success", JOptionPane.INFORMATION_MESSAGE);
                populateGymTrainerStatusTable();

            } else {
                JOptionPane.showMessageDialog(null, "Please wait until the previous request has been processed !", "Alert", JOptionPane.WARNING_MESSAGE);
            }
        }
        }
         catch(Exception e)
        {
             JOptionPane.showMessageDialog(this, "Please try again");
        }
    }//GEN-LAST:event_btnGymTrainerActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        try {
            userProcessContainer.remove(this);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please try again");
        }
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnGymTrainer;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTable tblGymTrainer;
    // End of variables declaration//GEN-END:variables
}
