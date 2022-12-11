/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.StoreManager;

import Business.CustomerRequestOrder;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.StoreOutletWorkRequest;
import java.awt.CardLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Harshada
 */
public class DeliveryManAssignmentPanel extends javax.swing.JPanel {

    /**
     * Creates new form DeliveryManAssignmentPanel
     */
    
    
    private JPanel userContainer;
    private CustomerRequestOrder order;
    private Ecosystem system;
    private Enterprise enterprise;
    private StoreOutletWorkRequest request;
    
    public DeliveryManAssignmentPanel(JPanel userContainer, Ecosystem system, Enterprise enterprise, StoreOutletWorkRequest request) {
        initComponents();
         this.userContainer = userContainer;
        this.system=system;
        this.request = request;
        this.enterprise = enterprise;
        populateComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        deliveryManCmbBox = new javax.swing.JComboBox<>();
        appointDelManBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        backBtn.setText("< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Deliveryman:");

        appointDelManBtn.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        appointDelManBtn.setText("Appoint");
        appointDelManBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointDelManBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(deliveryManCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(468, 468, 468)
                        .addComponent(appointDelManBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(518, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(deliveryManCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(appointDelManBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(417, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userContainer.remove(this);
        CardLayout layout = (CardLayout)userContainer.getLayout();
        layout.previous(userContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void appointDelManBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointDelManBtnActionPerformed
        // TODO add your handling code here:
        for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList()){
            for(UserAccount user: org.getUserAccountList().getUserAccountList()){
                if(deliveryManCmbBox.getSelectedItem().equals(user.getEmployee().getEmployeeName())){
                    request.setReceiver(user);
                    request.setWorkStatus("Deliverman Assigned");
                    user.getWorkQueue().getWorkRequestList().add(request);
                    JOptionPane.showMessageDialog(this, "Deliveryman assigned successfully!","Success",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_appointDelManBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton appointDelManBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox<String> deliveryManCmbBox;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    private void populateComboBox() {
        DefaultComboBoxModel dm=new DefaultComboBoxModel();
           for(Organization o:enterprise.getOrganizationDirectory().getOrganizationList()){
                for(UserAccount e : o.getUserAccountList().getUserAccountList()){
                    if(e.getRole().toString().equals("Business.Role.DeliveryMan")){
                        dm.addElement(e.getEmployee().getEmployeeName());
                        deliveryManCmbBox.setModel(dm);
                       
                    }
                }
             }
    }
}
