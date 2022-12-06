/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SystemAdminOps;

import Business.Ecosystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Role.Admin;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Geets
 */
public class ManageEnterpriseAdminPanel extends javax.swing.JPanel {

    private Ecosystem system;
    private JPanel userContainer;

    /**
     * Creates new form ManageEnterpriseAdminPanel
     *
     * @param userContainer
     * @param system
     */
    public ManageEnterpriseAdminPanel(JPanel userContainer, Ecosystem system) {
        initComponents();
        this.system = system;
        this.userContainer = userContainer;
        populateTabl();
        //enterprisejTable.getTableHeader().setDefaultRenderer(new tableHeaderColors())
        populateNetwrkComboBox();

    }

    private void populateTabl() {
        DefaultTableModel model = (DefaultTableModel) enterprisejTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountList().getUserAccountList()) {
                    Object[] row = new Object[5];
                    row[0] = userAccount.getEmployee().getEmpId();
                    row[1] = userAccount.getEmployee().getEmployeeName();
                    row[2] = enterprise.getName();
                    row[3] = network.getNetworkName();
                    row[4] = userAccount.getUsername();

                    model.addRow(row);
                }
            }
        }
    }

    private void populateNetwrkComboBox() {
        networkComboBox.removeAllItems();

        for (Network network : system.getNetworkList()) {
            networkComboBox.addItem(network);
        }
    }

    private void populateEnterpComboBox(Network network) {
        EnterpriseComboBox.removeAllItems();

        for (Enterprise enterpr : network.getEnterpriseDirectory().getEnterpriseList()) {
            EnterpriseComboBox.addItem(enterpr);
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

        btnBack = new javax.swing.JButton();
        TitlejTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        enterprisejTable = new javax.swing.JTable();
        netjLabel = new javax.swing.JLabel();
        entrjLabel = new javax.swing.JLabel();
        emailjLabel = new javax.swing.JLabel();
        passjLabel = new javax.swing.JLabel();
        namejLabel = new javax.swing.JLabel();
        emailjTextField = new javax.swing.JTextField();
        namejTextField = new javax.swing.JTextField();
        submitjButton = new javax.swing.JButton();
        EnterpriseComboBox = new javax.swing.JComboBox();
        networkComboBox = new javax.swing.JComboBox();
        passwordjTextField = new javax.swing.JPasswordField();

        setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        TitlejTextField.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        TitlejTextField.setText("MANAGE ENTERPRISE ADMIN");
        TitlejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitlejTextFieldActionPerformed(evt);
            }
        });

        enterprisejTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "EmployeeID", "EmployeeName", "EnterpriseName", "State", "EmailID"
            }
        ));
        jScrollPane1.setViewportView(enterprisejTable);

        netjLabel.setText("Network:");

        entrjLabel.setText("Enterprise:");

        emailjLabel.setText("Email ID:");

        passjLabel.setText("Password:");

        namejLabel.setText("Name:");

        submitjButton.setText("Submit");
        submitjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitjButtonActionPerformed(evt);
            }
        });

        EnterpriseComboBox.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N

        networkComboBox.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        networkComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)
                        .addGap(130, 130, 130)
                        .addComponent(TitlejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(netjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(entrjLabel)
                            .addComponent(emailjLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(namejLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(passjLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(emailjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                .addComponent(namejTextField)
                                .addComponent(EnterpriseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(networkComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(passwordjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(submitjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(416, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack)
                    .addComponent(TitlejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(netjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(networkComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(entrjLabel)
                    .addComponent(EnterpriseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailjLabel)
                    .addComponent(emailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passjLabel)
                    .addComponent(passwordjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namejLabel)
                    .addComponent(namejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(submitjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
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

    private void TitlejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitlejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TitlejTextFieldActionPerformed

    private void networkComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkComboBoxActionPerformed

        Network network = (Network) networkComboBox.getSelectedItem();
        if (network != null) {
            populateEnterpComboBox(network);
        }

    }//GEN-LAST:event_networkComboBoxActionPerformed

    private void submitjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitjButtonActionPerformed
        // TODO add your handling code here:
        Enterprise enterprise = (Enterprise) EnterpriseComboBox.getSelectedItem();

        if (emailjTextField.getText().isEmpty() || passwordjTextField.getText().isEmpty() || namejTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Field(s) cannot be Empty!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String username = emailjTextField.getText();
        String password = String.valueOf(passwordjTextField.getPassword());
        String name = namejTextField.getText();

        Employee employee = enterprise.getEmployeeList().createEmployee(name);

        UserAccount account = enterprise.getUserAccountList().createUserAccount(username, password, employee, new Admin());
        System.out.println("Account" + account);
        populateTabl();
        networkComboBox.setSelectedIndex(0);
        EnterpriseComboBox.setSelectedIndex(0);
        emailjTextField.setText("");
        passwordjTextField.setText("");
        namejTextField.setText("");

    }//GEN-LAST:event_submitjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox EnterpriseComboBox;
    private javax.swing.JTextField TitlejTextField;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel emailjLabel;
    private javax.swing.JTextField emailjTextField;
    private javax.swing.JTable enterprisejTable;
    private javax.swing.JLabel entrjLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel namejLabel;
    private javax.swing.JTextField namejTextField;
    private javax.swing.JLabel netjLabel;
    private javax.swing.JComboBox networkComboBox;
    private javax.swing.JLabel passjLabel;
    private javax.swing.JPasswordField passwordjTextField;
    private javax.swing.JButton submitjButton;
    // End of variables declaration//GEN-END:variables
}
