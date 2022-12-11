/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Nutritionist;

import Business.Customer.Customer;
import Business.Ecosystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.NutritionistOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.NutritionistWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rutujakute
 */
public class NutritionistWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form NutritionistWorkAreaPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    NutritionistOrganization nutritionOrganisation;
    Enterprise enterprise;
    Ecosystem ecosystem;
    Network network;

    public NutritionistWorkAreaPanel(JPanel userProcessContainer, Enterprise enterprise, Organization organization, UserAccount account, Ecosystem business, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = enterprise;
        this.ecosystem = business;
//         greetLbl.setText(account.getEmployee().getName() + "!!");
//         tblCustomerList.getTableHeader().setDefaultRenderer(new tableHeaderColors());
        this.network = network;
        populateCustomer();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomerList = new javax.swing.JTable();
        btnViewDetails = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        lblHeight = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        lblWeight = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtmessage = new javax.swing.JTextArea();
        btnProcess = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        chkbxNone = new javax.swing.JCheckBox();
        chkbxDiabetes = new javax.swing.JCheckBox();
        chkbxCholestrol = new javax.swing.JCheckBox();
        ChkbxThyroid = new javax.swing.JCheckBox();
        chkbxPCOS = new javax.swing.JCheckBox();
        chkbxHypertension = new javax.swing.JCheckBox();

        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCustomerList.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        tblCustomerList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Customer ID", "Customer Name", "Goal", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCustomerList);

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 675, 91));

        btnViewDetails.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnViewDetails.setText("View Details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnViewDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 138, 45));

        lblName.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Name:");
        kGradientPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 107, 30));

        txtName.setEditable(false);
        txtName.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        kGradientPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 150, 30));

        lblAge.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAge.setText("Age:");
        kGradientPanel1.add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 90, 30));

        txtAge.setEditable(false);
        kGradientPanel1.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 150, 30));

        lblGender.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblGender.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGender.setText("Gender:");
        kGradientPanel1.add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 107, 30));

        radioMale.setBackground(new java.awt.Color(204, 204, 204));
        radioMale.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        radioMale.setText("Male");
        radioMale.setEnabled(false);
        radioMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMaleActionPerformed(evt);
            }
        });
        kGradientPanel1.add(radioMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 68, -1));

        radioFemale.setBackground(new java.awt.Color(204, 204, 204));
        radioFemale.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        radioFemale.setText("Female");
        radioFemale.setEnabled(false);
        radioFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFemaleActionPerformed(evt);
            }
        });
        kGradientPanel1.add(radioFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 72, -1));

        lblHeight.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblHeight.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHeight.setText("Height(in cms):");
        kGradientPanel1.add(lblHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 86, 30));

        txtHeight.setEditable(false);
        kGradientPanel1.add(txtHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 150, 30));

        lblWeight.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblWeight.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblWeight.setText("Weight (in Kgs):");
        kGradientPanel1.add(lblWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, 30));

        txtWeight.setEditable(false);
        kGradientPanel1.add(txtWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 150, 30));

        jLabel3.setText("Message:");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 90, 40));

        txtmessage.setColumns(20);
        txtmessage.setRows(5);
        jScrollPane2.setViewportView(txtmessage);

        kGradientPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, -1, -1));

        btnProcess.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnProcess.setText("Accept & Process Request");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 210, 45));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Health Issues");
        kGradientPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 160, 30));

        chkbxNone.setBackground(new java.awt.Color(255, 255, 255));
        chkbxNone.setText("None");
        chkbxNone.setEnabled(false);
        kGradientPanel1.add(chkbxNone, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 80, 30));

        chkbxDiabetes.setBackground(new java.awt.Color(255, 255, 255));
        chkbxDiabetes.setText("Diabetes");
        chkbxDiabetes.setEnabled(false);
        kGradientPanel1.add(chkbxDiabetes, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 90, 30));

        chkbxCholestrol.setBackground(new java.awt.Color(255, 255, 255));
        chkbxCholestrol.setText("Cholestrol");
        chkbxCholestrol.setEnabled(false);
        kGradientPanel1.add(chkbxCholestrol, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 90, 30));

        ChkbxThyroid.setBackground(new java.awt.Color(255, 255, 255));
        ChkbxThyroid.setText("Thyroid");
        ChkbxThyroid.setEnabled(false);
        kGradientPanel1.add(ChkbxThyroid, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 90, 30));

        chkbxPCOS.setBackground(new java.awt.Color(255, 255, 255));
        chkbxPCOS.setText("PCOS");
        chkbxPCOS.setEnabled(false);
        kGradientPanel1.add(chkbxPCOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 90, 30));

        chkbxHypertension.setBackground(new java.awt.Color(255, 255, 255));
        chkbxHypertension.setText("Hypertension");
        chkbxHypertension.setEnabled(false);
        kGradientPanel1.add(chkbxHypertension, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateCustomer() {
        try {
            DefaultTableModel dtm = (DefaultTableModel) tblCustomerList.getModel();
            dtm.setRowCount(0);

            for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                for (Employee emp : org.getEmployeeList().getEmployeeList()) {
                    if (emp.toString().equals(account.getEmployee().toString())) {
                        for (WorkRequest request : account.getWorkQueue().getWorkRequestList()) {
                            Customer cust = request.getSender().getCustomer();

                            Object[] row = new Object[4];
                            row[0] = cust.getId();
                            row[1] = cust;
                            row[2] = request;
                            row[3] = request.getWorkStatus();
                            dtm.addRow(row);
                        }
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please try again");
        }

    }
    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRow = tblCustomerList.getSelectedRow();
            if (selectedRow >= 0) {
                Customer customer = (Customer) tblCustomerList.getValueAt(selectedRow, 1);
                txtName.setText(customer.getName());
                txtAge.setText(String.valueOf(customer.getAge()));
                if (customer.getGender().toLowerCase().equals("male")) {
                    radioMale.setSelected(true);
                } else {
                    radioFemale.setSelected(false);
                }
                txtHeight.setText(String.valueOf(customer.getHeight()));
                txtWeight.setText(String.valueOf(customer.getWeight()));
                chkbxNone.setSelected(customer.getIs_None());
                chkbxDiabetes.setSelected(customer.getIs_diabetes());
                chkbxCholestrol.setSelected(customer.getIs_cholestrol());
                chkbxHypertension.setSelected(customer.getIs_hypertension());
                chkbxPCOS.setSelected(customer.getIs_pcos());
                ChkbxThyroid.setSelected(customer.getIs_thyroid());
            } else {
                JOptionPane.showMessageDialog(null, "Please Select a row", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please try again");
        }

    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void radioMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMaleActionPerformed
        // radioFemale.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMaleActionPerformed

    private void radioFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFemaleActionPerformed
        // radioMale.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_radioFemaleActionPerformed

    private void sendEmail(String email) {
        try {
            // TODO add your handling code here:
            String toEmail = email;
            String fromEmail = "goFit776@gmail.com";
            String fromEmailPassword = "ptcacpbbyrcwwssv";
            String subject = "GoFit Nutrtionist Posted";

            Properties p = new Properties();

            p.put("mail.smtp.host", "smtp.gmail.com");
            p.put("mail.smtp.socketFactory.port", "465");
            p.put("mail.smtp.socketFactory.class",
                    "javax.net.ssl.SSLSocketFactory");
            p.put("mail.smtp.auth", "true");
            p.put("mail.smtp.port", "465");
            p.put("mail.smtp.ssl.protocols", "TLSv1.2");

            Session session = Session.getInstance(p, new javax.mail.Authenticator() {
                @Override
                protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                    return new javax.mail.PasswordAuthentication(fromEmail, fromEmailPassword);
                }
            });
            //Start our mail message
            MimeMessage msg = new MimeMessage(session);
            try {
                msg.setFrom(new InternetAddress(fromEmail));
                msg.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
                msg.setSubject(subject);
                msg.setText("Please login to your application as the status is changed. Nutritionist has posted comments");
                Transport.send(msg);
                System.out.println("Sent message");
            } catch (MessagingException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please try again");
        }
    }

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRow = tblCustomerList.getSelectedRow();
            if (selectedRow >= 0) {
                Customer cus = (Customer) tblCustomerList.getValueAt(selectedRow, 1);
                if (cus.getIs_None()) {
                    NutritionistWorkRequest request = (NutritionistWorkRequest) tblCustomerList.getValueAt(selectedRow, 2);
                    if (!"Result Posted".equals(request.getWorkStatus())) {
                        String email = request.getSender().getUsername();
                        request.setDietResult(txtmessage.getText());
                        request.setWorkStatus("Result Posted");
                        populateCustomer();
                        sendEmail(email);
                        JOptionPane.showMessageDialog(null, "Email has been sent to Customer!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        txtmessage.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "Result has been already Processed", "Information", JOptionPane.INFORMATION_MESSAGE);
                    }

                } else {

                }
            } else {
                JOptionPane.showMessageDialog(null, "Please Select a row", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please try again");
        }

    }//GEN-LAST:event_btnProcessActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ChkbxThyroid;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JCheckBox chkbxCholestrol;
    private javax.swing.JCheckBox chkbxDiabetes;
    private javax.swing.JCheckBox chkbxHypertension;
    private javax.swing.JCheckBox chkbxNone;
    private javax.swing.JCheckBox chkbxPCOS;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JTable tblCustomerList;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtWeight;
    private javax.swing.JTextArea txtmessage;
    // End of variables declaration//GEN-END:variables
}
