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
//import Business.utilities.tableHeaderColors;
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
    private boolean emailValid;
    private boolean nameValid;


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
           clearLabels();
    }
     private void clearLabels() {
        emailLb.setVisible(false);
        passLb.setVisible(false);  
         namelb.setVisible(false);
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
   
    private void populateNetwrkComboBox(){
        networkComboBox.removeAllItems();
        
        for (Network network : system.getNetworkList()){
            networkComboBox.addItem(network);
        }
    }
    
    private void populateEnterpComboBox(Network network){
        EnterpriseComboBox.removeAllItems();
        
        for (Enterprise enterpr : network.getEnterpriseDirectory().getEnterpriseList()){
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
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        enterprisejTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        emailjTextField = new javax.swing.JTextField();
        namejTextField = new javax.swing.JTextField();
        submitjButton = new javax.swing.JButton();
        EnterpriseComboBox = new javax.swing.JComboBox();
        networkComboBox = new javax.swing.JComboBox();
        passwordjTextField = new javax.swing.JPasswordField();
        emailLb = new javax.swing.JLabel();
        passLb = new javax.swing.JLabel();
        namelb = new javax.swing.JLabel();

        setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jTextField1.setText("MANAGE ENTERPRISE ADMIN");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
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

        jLabel1.setText("Network:");

        jLabel2.setText("Enterprise:");

        jLabel3.setText("Email ID:");

        jLabel4.setText("Password:");

        jLabel5.setText("Name:");

        emailjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailjTextFieldActionPerformed(evt);
            }
        });

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

        passwordjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordjTextFieldActionPerformed(evt);
            }
        });
        passwordjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordjTextFieldKeyReleased(evt);
            }
        });

        emailLb.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        emailLb.setForeground(new java.awt.Color(181, 7, 7));
        emailLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emailLb.setText("Valid Format - 'xx@xx.xx'");

        passLb.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        passLb.setForeground(new java.awt.Color(181, 7, 7));
        passLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passLb.setText("Sample format: Asdf@1");

        namelb.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        namelb.setForeground(new java.awt.Color(181, 7, 7));
        namelb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namelb.setText("Only Alphabets are allowed");

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
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namelb, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(emailjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                .addComponent(namejTextField)
                                .addComponent(EnterpriseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(networkComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailLb, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(passLb, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(networkComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(EnterpriseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(emailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailLb, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(passwordjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passLb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(namejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(namelb, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void networkComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkComboBoxActionPerformed

        Network network = (Network) networkComboBox.getSelectedItem();
        if (network != null){
            populateEnterpComboBox(network);
        }

    }//GEN-LAST:event_networkComboBoxActionPerformed

    private void submitjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitjButtonActionPerformed
        // TODO add your handling code here:
        Enterprise enterprise = (Enterprise) EnterpriseComboBox.getSelectedItem();

        if(emailjTextField.getText().isEmpty() || passwordjTextField.getText().isEmpty() || namejTextField.getText().isEmpty()){
             JOptionPane.showMessageDialog(null,"Field(s) cannot be Empty!","Error",JOptionPane.ERROR_MESSAGE);
             return;
        }


            String username = emailjTextField.getText();
            String password = String.valueOf(passwordjTextField.getPassword());
            String name = namejTextField.getText();

            Employee employee = enterprise.getEmployeeList().createEmployee(name);

            UserAccount account = enterprise.getUserAccountList().createUserAccount(username, password,employee, new Admin());
            System.out.println("Account" + account);
            populateTabl();
           networkComboBox.setSelectedIndex(0);
            EnterpriseComboBox.setSelectedIndex(0);
            emailjTextField.setText("");
            passwordjTextField.setText("");
            namejTextField.setText("");
           
        
        
    
        
        
                                                  

    }//GEN-LAST:event_submitjButtonActionPerformed

    private void passwordjTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordjTextFieldKeyReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_passwordjTextFieldKeyReleased

    private void emailjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailjTextFieldActionPerformed
        // TODO add your handling code here:

            
    }//GEN-LAST:event_emailjTextFieldActionPerformed

    private void passwordjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordjTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox EnterpriseComboBox;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel emailLb;
    private javax.swing.JTextField emailjTextField;
    private javax.swing.JTable enterprisejTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField namejTextField;
    private javax.swing.JLabel namelb;
    private javax.swing.JComboBox networkComboBox;
    private javax.swing.JLabel passLb;
    private javax.swing.JPasswordField passwordjTextField;
    private javax.swing.JButton submitjButton;
    // End of variables declaration//GEN-END:variables
}
