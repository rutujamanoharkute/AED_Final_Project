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
import Business.Role.EnterpriseAdmin;
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
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 46, -1, -1));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 99, 487, 87));

        netjLabel.setText("Network:");
        add(netjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 243, 100, 16));

        entrjLabel.setText("Enterprise:");
        add(entrjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 281, -1, -1));

        emailjLabel.setText("Email ID:");
        add(emailjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 329, -1, -1));

        passjLabel.setText("Password:");
        add(passjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 408, -1, -1));

        namejLabel.setText("Name:");
        add(namejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 492, 80, -1));
        add(emailjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 329, 204, -1));
        add(namejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 492, 204, -1));

        submitjButton.setText("Submit");
        submitjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitjButtonActionPerformed(evt);
            }
        });
        add(submitjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 569, 115, 36));

        EnterpriseComboBox.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        add(EnterpriseComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 281, 190, 30));

        networkComboBox.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        networkComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkComboBoxActionPerformed(evt);
            }
        });
        add(networkComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 239, 190, 30));
        add(passwordjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 408, 190, 30));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setText("MANAGE ENTERPRISE ADMIN");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 15, 347, 48));
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

        UserAccount account = enterprise.getUserAccountList().createUserAccount(username, password, employee, new EnterpriseAdmin());
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
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel emailjLabel;
    private javax.swing.JTextField emailjTextField;
    private javax.swing.JTable enterprisejTable;
    private javax.swing.JLabel entrjLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel namejLabel;
    private javax.swing.JTextField namejTextField;
    private javax.swing.JLabel netjLabel;
    private javax.swing.JComboBox networkComboBox;
    private javax.swing.JLabel passjLabel;
    private javax.swing.JPasswordField passwordjTextField;
    private javax.swing.JButton submitjButton;
    // End of variables declaration//GEN-END:variables
}
