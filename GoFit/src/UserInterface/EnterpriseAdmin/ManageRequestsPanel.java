/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.EnterpriseAdmin;

import Business.Ecosystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Harshada
 */
public class ManageRequestsPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageRequestsPanel
     */
    
    private Ecosystem system;
    private Enterprise enterprise;
    private JPanel userContainer;
    private UserAccount userAccount;
    
    public ManageRequestsPanel(JPanel userContainer, Enterprise enterprise, UserAccount userAccount, Organization organization, Ecosystem system) {
        initComponents();
         this.userContainer = userContainer;
        this.userAccount = userAccount;
        this.system = system;
        this.enterprise = enterprise;
        populateComboOrganization();
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
        comboOrganization = new javax.swing.JComboBox();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequest = new javax.swing.JTable();
        lblAssignTask = new javax.swing.JLabel();
        comboEmployee = new javax.swing.JComboBox<>();
        assignBtn = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Organization");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblWorkRequest.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        tblWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Customer Requested", "Receiver", "Goal", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblWorkRequest);

        lblAssignTask.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAssignTask.setText("Assign Selected Task to");

        assignBtn.setText("Assign");
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setText("MANAGE REQUESTS");

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
            .addGap(0, 782, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(230, 230, 230)
                            .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jLabel1)
                            .addGap(38, 38, 38)
                            .addComponent(comboOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(btnSearch))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(lblAssignTask, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)
                            .addComponent(comboEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(160, 160, 160)
                            .addComponent(assignBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnBack))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 582, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(comboOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSearch))))
                    .addGap(40, 40, 40)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(44, 44, 44)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblAssignTask, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addComponent(assignBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28)
                    .addComponent(btnBack)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try
        {
        comboEmployee.removeAllItems();
        String organization = comboOrganization.getSelectedItem().toString();
        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (o.getName().equals(organization)) {

                for (Employee emp : o.getEmployeeList().getEmployeeList()) {
                    comboEmployee.addItem(emp.getEmployeeName());
                }
            }
            populateTableWorkRequest();
        }
        }
         catch(Exception e)
        {
             JOptionPane.showMessageDialog(this, "Please try again");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed
        // TODO add your handling code here:
        try
        {
        int selectedRow = tblWorkRequest.getSelectedRow();
        if (selectedRow >= 0)
        {
            WorkRequest r = (WorkRequest) tblWorkRequest.getValueAt(selectedRow, 2);
            if (!r.getWorkStatus().equals("Assigned") && !r.getWorkStatus().equals("Result Posted"))
            {
                for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList())
                {
                    for (UserAccount user : org.getUserAccountList().getUserAccountList())
                    {
                        if (comboEmployee.getSelectedItem().equals(user.getEmployee().getEmployeeName()))
                        {

                            int x = user.getWorkQueue().getWorkRequestList().size();
                            if (x > 0) {
                                WorkRequest workRequest = user.getWorkQueue().getWorkRequestList().get(x - 1);
                                String st = workRequest.getWorkStatus();
                                if (st.equals("Assigned")) {
                                    JOptionPane.showMessageDialog(this, "A request is already opened for the assignee", "Error", JOptionPane.ERROR_MESSAGE);
                                    return;

                                } else {
                                    r.setReceiver(user);
                                    r.setWorkStatus("Assigned");
                                    JOptionPane.showMessageDialog(this, "Request has been assigned successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                                    user.getWorkQueue().getWorkRequestList().add(r);

                                }
                            } else {
                                r.setReceiver(user);
                                r.setWorkStatus("Assigned");
                                JOptionPane.showMessageDialog(this, "Request is assigned successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                                user.getWorkQueue().getWorkRequestList().add(r);

                            }
                        }
                    }
                }
                populateTableWorkRequest();
            } else {
                if (r.getWorkStatus().equals("Assigned")) {
                    JOptionPane.showMessageDialog(this, "Request is assigned already. Please wait till it gets processed", "Alert", JOptionPane.INFORMATION_MESSAGE);
                } else if (r.getWorkStatus().equals("Result has been posted. Please check")) {
                    JOptionPane.showMessageDialog(this, "Request is posted already", "Alert", JOptionPane.INFORMATION_MESSAGE);
                }

            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to perform operation", "Error", JOptionPane.ERROR_MESSAGE);
        }
        }
         catch(Exception e)
        {
             JOptionPane.showMessageDialog(this, "Please try again");
        }
    }//GEN-LAST:event_assignBtnActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        try
        {
        userContainer.remove(this);
        CardLayout layout = (CardLayout) userContainer.getLayout();
        layout.previous(userContainer);
        }
         catch(Exception e)
        {
             JOptionPane.showMessageDialog(this, "Please try again");
        }
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignBtn;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> comboEmployee;
    private javax.swing.JComboBox comboOrganization;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAssignTask;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblWorkRequest;
    // End of variables declaration//GEN-END:variables

    private void populateComboOrganization() {
        try
        {
         comboOrganization.removeAllItems();

        comboEmployee.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            comboOrganization.addItem(organization.toString());
        }
        }
         catch(Exception e)
        {
             JOptionPane.showMessageDialog(this, "Please try again");
        }
    }

    private void populateTableWorkRequest() {
        DefaultTableModel model = (DefaultTableModel) tblWorkRequest.getModel();

        model.setRowCount(0);
        String organization = comboOrganization.getSelectedItem().toString();
        for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (o.getName().equals(organization)) {
                for (WorkRequest workRequest : o.getWorkQueue().getWorkRequestList()) {
                    Object[] row = new Object[4];

                    row[0] = workRequest.getSender().getCustomer().getName();
                    row[1] = workRequest.getReceiver() == null ? null : workRequest.getReceiver().getEmployee().getEmployeeName();
                    row[2] = workRequest;
                    row[3] = workRequest.getWorkStatus();

                    model.addRow(row);
                }
            }
        }
    
    }
}
