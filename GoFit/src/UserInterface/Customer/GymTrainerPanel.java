/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Customer;

import Business.Ecosystem;
import Business.Enterprise.EnterpriseGymTrainer;
import Business.Enterprise.Enterprise;
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
     * Creates new form GymnTrainerPanel
     */
    private JPanel userProcessContainer;
    private Ecosystem system;
    private Network network;
    private UserAccount userAccount;
    Enterprise e;

    public GymTrainerPanel(JPanel userProcessContainer, Ecosystem system, Network network, UserAccount userAccount) {
        initComponents();
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.network = network;
        this.userAccount = userAccount;

        populateGymnStatusTable();
    }

    private void populateGymnStatusTable() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) fitnessTbl.getModel();
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
        } catch (Exception e) {
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
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        msgTxt = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        btnRequestWorkout = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        fitnessTbl = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();

        jLabel6.setBackground(new java.awt.Color(80, 80, 82));
        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(80, 80, 82));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("FITNESS TRAINER");

        msgTxt.setColumns(20);
        msgTxt.setRows(5);
        jScrollPane1.setViewportView(msgTxt);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("Enter Your Message:");

        btnRequestWorkout.setBackground(new java.awt.Color(255, 102, 0));
        btnRequestWorkout.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnRequestWorkout.setText("Request Workouts");
        btnRequestWorkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestWorkoutActionPerformed(evt);
            }
        });

        fitnessTbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        fitnessTbl.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(fitnessTbl);

        backBtn.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        backBtn.setText(" Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                            .addGap(202, 202, 202)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(kGradientPanel1Layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRequestWorkout, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(239, 239, 239))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnRequestWorkout, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestWorkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestWorkoutActionPerformed
        try {
            if (userAccount.getWorkQueue().getWorkRequestList().size() == 0) {
                GymTrainerWorkRequest req = new GymTrainerWorkRequest();
                req.setSender(userAccount);
                req.setWorkMessage(msgTxt.getText());
                req.setWorkStatus("Request sent to Admin");
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
                    org.getWorkQueue().getWorkRequestList().add(req);
                    userAccount.getWorkQueue().getWorkRequestList().add(req);
                }
                JOptionPane.showMessageDialog(null, "Request has been sent. You will receive an email once it is processed!!", "Success", JOptionPane.INFORMATION_MESSAGE);
                populateGymnStatusTable();
            } else {
                int x = userAccount.getWorkQueue().getWorkRequestList().size() - 1;
                WorkRequest r = userAccount.getWorkQueue().getWorkRequestList().get(x);
                if (r.getWorkStatus().toLowerCase().equals("result posted")) {
                    GymTrainerWorkRequest req = new GymTrainerWorkRequest();
                    req.setSender(userAccount);
                    req.setWorkMessage(msgTxt.getText());
                    req.setWorkStatus("Request sent to Admin");
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
                        org.getWorkQueue().getWorkRequestList().add(req);
                        userAccount.getWorkQueue().getWorkRequestList().add(req);
                    }
                    JOptionPane.showMessageDialog(null, "Request has been sent. You will receive an email once it is processed!!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    populateGymnStatusTable();
                } else {
                    JOptionPane.showMessageDialog(null, "Please wait until the previous request has been processed !", "Alert", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please try again");
        }
        // TODO add your handling code here:

    }//GEN-LAST:event_btnRequestWorkoutActionPerformed

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
    private javax.swing.JButton btnRequestWorkout;
    private javax.swing.JTable fitnessTbl;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextArea msgTxt;
    // End of variables declaration//GEN-END:variables
}
