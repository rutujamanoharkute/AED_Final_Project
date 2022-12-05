/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Userinterface.Customer;

import Business.Customer.Customer;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author rutujakute
 */
public class CustomerWAJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerWAJPanel
     */
    
     private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Organization organization;
    private Enterprise enterprise;
    private Ecosystem system;
    private Customer customer;
     Network network;
     private boolean ageValid = true;
     private boolean zipValid = true;
     private boolean heightValid = true;
     private boolean weightValid = true;
    public CustomerWAJPanel() {
        
        
        
        initComponents();
        
         this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.network = network;
        this.system = business;
        txtName.setEditable(false);
        txtAge.setEditable(false);
        radioMale.setEnabled(false);
        radioFemale.setEnabled(false);
        txtAdress.setEditable(false);
         txtPassword.setEditable(false);
        txtCity.setEditable(false);
        networkJComboBox.setEditable(false);
        txtZipcode.setEditable(false);
        txtHeight.setEditable(false);
        txtWeight.setEditable(false);
        noneChkBox.setEnabled(false);
        diabetesChkBox.setEnabled(false);
        cholestrolChkBox.setEnabled(false);
        hyperChkBox.setEnabled(false);
        pcosChkBox.setEnabled(false);
        thyroidChkBox.setEnabled(false);
        btnSave.setEnabled(false);
        clearLabels();
        /*for(Network net: system.getNetworkList()){
        for(Enterprise e : net.getEnterpriseDirectory().getEnterpriseList()){
            for(Organization o: e.getOrganizationDirectory().getOrganizationList()){
                for(WorkRequest request : o.getWorkQueue().getWorkRequestList()){
                       if(request.getReceiver() != null && request.getReceiver().getRole().toString().equals("Business.Role.DeliveryManRole")){
                           if(request.getStatus().toLowerCase().equals("delivered")){
                               int ord = request.getRequestID();
                               JOptionPane.showMessageDialog(null,"Your order with orderID" + ord + " has been delivered","Success",JOptionPane.INFORMATION_MESSAGE);
                           }
                       }
                }
            }
        }
    }*/
                    txtName.setText(userAccount.getCustomer().getName());
                    txtAge.setText(String.valueOf(userAccount.getCustomer().getAge()));
                    greetLbl.setText(userAccount.getCustomer().getName()+ " !!");
                    if(userAccount.getCustomer().getGender().toLowerCase().equals("male")){
                        radioMale.setSelected(true);
                    }else{
                        radioFemale.setSelected(true);
                    }
                    txtPassword.setText(userAccount.getPassword());
                    txtAdress.setText(userAccount.getCustomer().getAddress());
                    txtCity.setText(userAccount.getCustomer().getCity());
                     DefaultComboBoxModel dm=new DefaultComboBoxModel();
                     dm.addElement(userAccount.getCustomer().getNetwork());
                    networkJComboBox.setModel(dm);
                    txtZipcode.setText(String.valueOf(userAccount.getCustomer().getZipcode()));
                    txtHeight.setText(String.valueOf(userAccount.getCustomer().getHeight()));
                    txtWeight.setText(String.valueOf(userAccount.getCustomer().getWeight()));
                    noneChkBox.setSelected(userAccount.getCustomer().getNone());
                    diabetesChkBox.setSelected(userAccount.getCustomer().getDiabetes());
                    cholestrolChkBox.setSelected(userAccount.getCustomer().getCholestrol());
                    hyperChkBox.setSelected(userAccount.getCustomer().getHypertension());
                    pcosChkBox.setSelected(userAccount.getCustomer().getPcos());
                    thyroidChkBox.setSelected(userAccount.getCustomer().getThyroid());     
                    customer = userAccount.getCustomer();
                    return;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        lblCustomerRegistration = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblConfirmPassword = new javax.swing.JLabel();
        lblHeight = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblZip = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        lblWeight = new javax.swing.JLabel();
        lblHealthIssues = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        chkbxHypertension = new javax.swing.JCheckBox();
        chkbxNone = new javax.swing.JCheckBox();
        chkbxDiabetes = new javax.swing.JCheckBox();
        chkbxPCOS = new javax.swing.JCheckBox();
        chkbxCholestrol = new javax.swing.JCheckBox();
        chkbxThyroid = new javax.swing.JCheckBox();
        txtName = new javax.swing.JTextField();
        txtHeight = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        txtWeight = new javax.swing.JTextField();
        txtZip = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        combxNetwork = new javax.swing.JComboBox();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        btnPlaceOrder = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnAnalysis = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 204, 204));
        kGradientPanel1.setkGradientFocus(1000);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 102, 153));
        kGradientPanel1.setName(""); // NOI18N

        lblCustomerRegistration.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        lblCustomerRegistration.setForeground(new java.awt.Color(255, 255, 255));
        lblCustomerRegistration.setText("Customer Registration");

        lblEmail.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email ID:");

        lblName.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Name:");

        lblConfirmPassword.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblConfirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblConfirmPassword.setText("Confirm Password:");

        lblHeight.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblHeight.setForeground(new java.awt.Color(255, 255, 255));
        lblHeight.setText("Height(in cms):");

        lblAge.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblAge.setForeground(new java.awt.Color(255, 255, 255));
        lblAge.setText("Age:");

        lblPassword.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password:");

        lblAddress.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress.setText("Address:");

        lblCity.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblCity.setForeground(new java.awt.Color(255, 255, 255));
        lblCity.setText("City:");

        lblZip.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblZip.setForeground(new java.awt.Color(255, 255, 255));
        lblZip.setText("Zip Code:");

        lblState.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblState.setForeground(new java.awt.Color(255, 255, 255));
        lblState.setText("State:");

        lblWeight.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblWeight.setForeground(new java.awt.Color(255, 255, 255));
        lblWeight.setText("Weight(in kgs):");

        lblHealthIssues.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblHealthIssues.setForeground(new java.awt.Color(255, 255, 255));
        lblHealthIssues.setText("Health Issues");

        lblGender.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblGender.setForeground(new java.awt.Color(255, 255, 255));
        lblGender.setText("Gender:");

        chkbxHypertension.setForeground(new java.awt.Color(255, 255, 255));
        chkbxHypertension.setText("Hypertension");
        chkbxHypertension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxHypertensionActionPerformed(evt);
            }
        });

        chkbxNone.setForeground(new java.awt.Color(255, 255, 255));
        chkbxNone.setText("None");
        chkbxNone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxNoneActionPerformed(evt);
            }
        });

        chkbxDiabetes.setForeground(new java.awt.Color(255, 255, 255));
        chkbxDiabetes.setText("Diabetes");
        chkbxDiabetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxDiabetesActionPerformed(evt);
            }
        });

        chkbxPCOS.setForeground(new java.awt.Color(255, 255, 255));
        chkbxPCOS.setText("PCOS");
        chkbxPCOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxPCOSActionPerformed(evt);
            }
        });

        chkbxCholestrol.setForeground(new java.awt.Color(255, 255, 255));
        chkbxCholestrol.setText("Cholestrol");
        chkbxCholestrol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxCholestrolActionPerformed(evt);
            }
        });

        chkbxThyroid.setForeground(new java.awt.Color(255, 255, 255));
        chkbxThyroid.setText("Thyroid");
        chkbxThyroid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxThyroidActionPerformed(evt);
            }
        });

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        txtHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeightActionPerformed(evt);
            }
        });
        txtHeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHeightKeyReleased(evt);
            }
        });

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        txtConfirmPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConfirmPasswordKeyReleased(evt);
            }
        });

        txtWeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtWeightKeyReleased(evt);
            }
        });

        txtZip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtZipKeyReleased(evt);
            }
        });

        txtCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCityKeyReleased(evt);
            }
        });

        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeKeyReleased(evt);
            }
        });

        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddressKeyReleased(evt);
            }
        });

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });

        combxNetwork.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        combxNetwork.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        radioMale.setBackground(new java.awt.Color(255, 255, 255));
        radioMale.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        radioMale.setSelected(true);
        radioMale.setText("Male");
        radioMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMaleActionPerformed(evt);
            }
        });

        radioFemale.setBackground(new java.awt.Color(255, 255, 255));
        radioFemale.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        radioFemale.setText("Female");
        radioFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFemaleActionPerformed(evt);
            }
        });

        btnPlaceOrder.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnAnalysis.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnAnalysis.setText("View Analysis");
        btnAnalysis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalysisActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEmail)
                    .addComponent(lblPassword)
                    .addComponent(lblName)
                    .addComponent(lblConfirmPassword)
                    .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(radioMale, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(radioFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(lblCustomerRegistration)
                        .addGap(539, 539, 539))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kGradientPanel1Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblState)
                                    .addComponent(lblAddress)
                                    .addComponent(lblAge)
                                    .addComponent(lblCity)
                                    .addComponent(lblZip)
                                    .addComponent(chkbxNone))
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addGap(137, 137, 137)
                                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkbxDiabetes)
                                            .addComponent(chkbxPCOS))
                                        .addGap(52, 52, 52)
                                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkbxThyroid)
                                            .addComponent(chkbxCholestrol)))
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addGap(105, 105, 105)
                                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                            .addComponent(txtAge)
                                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(combxNetwork, javax.swing.GroupLayout.Alignment.TRAILING, 0, 248, Short.MAX_VALUE)
                                                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtCity, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                                                        .addComponent(txtZip))))))))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(chkbxHypertension)))
                        .addGap(212, 212, 212))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHeight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblWeight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWeight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(363, 363, 363)
                .addComponent(lblHealthIssues)
                .addGap(441, 441, 441))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(435, 435, 435)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(btnAnalysis, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(lblCustomerRegistration)
                        .addGap(51, 51, 51)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAddress))
                        .addGap(5, 5, 5))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAge))
                        .addGap(18, 18, 18)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(33, 33, 33))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(combxNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblConfirmPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCity)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblZip)
                            .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioMale)
                            .addComponent(radioFemale)))
                    .addComponent(lblState))
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lblHealthIssues)
                        .addGap(36, 36, 36)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkbxNone)
                            .addComponent(chkbxDiabetes)
                            .addComponent(chkbxCholestrol))
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkbxHypertension)
                            .addComponent(chkbxPCOS)
                            .addComponent(chkbxThyroid))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(147, 147, 147)))
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnalysis, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlaceOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
        );

        jPanel1.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -100, 1460, 900));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1442, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1442, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 801, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chkbxHypertensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxHypertensionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbxHypertensionActionPerformed

    private void chkbxNoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxNoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbxNoneActionPerformed

    private void chkbxDiabetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxDiabetesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbxDiabetesActionPerformed

    private void chkbxPCOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxPCOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbxPCOSActionPerformed

    private void chkbxCholestrolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxCholestrolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbxCholestrolActionPerformed

    private void chkbxThyroidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxThyroidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbxThyroidActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        if (!namePatternCorrect(txtName.getText()) && !(txtName.getText().isEmpty())){
            //              nameLbl.setVisible(true);
            //              nameSuccessLbl.setVisible(false);
            JOptionPane.showMessageDialog(null, "Please enter Name Field!","Error",JOptionPane.ERROR_MESSAGE);

        }else if(txtName.getText().isEmpty()){
            //            nameLbl.setVisible(false);
            //             nameSuccessLbl.setVisible(false);
        }else{
            //         nameLbl.setVisible(false);
            //         nameSuccessLbl.setVisible(true);
        }
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHeightActionPerformed

    private void txtHeightKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHeightKeyReleased
        // TODO add your handling code here:
        int height=0;
        if(txtHeight.getText().isEmpty()){
            //        heightSuccessLbl.setVisible(false);
            //             heightLbl.setVisible(false);
        }
        try{
            height = Integer.parseInt(txtHeight.getText());
        }catch(NumberFormatException e){
            if(!txtHeight.getText().isEmpty()){
                heightValid = false;
                //             heightSuccessLbl.setVisible(false);
                //             heightLbl.setVisible(true);
                return;
            }else {
                heightValid = false;
                //             heightLbl.setVisible(false);
                //             heightSuccessLbl.setVisible(false);
                return;
            }
        }
        if(txtHeight.getText().length() > 3 || txtHeight.getText().length() < 3){
            heightValid = false;
            //             heightLbl.setVisible(true);
            //             heightSuccessLbl.setVisible(false);
        }else{
            heightValid = true;
            //             heightLbl.setVisible(false);
            //             heightSuccessLbl.setVisible(true);
        }
    }//GEN-LAST:event_txtHeightKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        if (!usernamePatternCorrect(txtEmail.getText()) && !(txtEmail.getText().isEmpty()) && system.getCustomerList().checkUsernameIsUnique(txtEmail.getText())){
            //              emailLbl.setVisible(true);
            //              emailIDAlreadyLbl.setVisible(false);
            //              emailSuccessLbl.setVisible(false);

            emailValid =false;
        }else if(txtEmail.getText().isEmpty()){
            //            emailLbl.setVisible(false);
            //            emailIDAlreadyLbl.setVisible(false);
            emailValid =false;
            //             emailSuccessLbl.setVisible(false);
        }else if(!system.getCustomerList().checkUsernameIsUnique(txtEmail.getText())){
            //            emailIDAlreadyLbl.setVisible(true);
            //            emailSuccessLbl.setVisible(false);
            emailValid =false;
        }else{
            //         emailLbl.setVisible(false);
            //         emailIDAlreadyLbl.setVisible(false);
            //         emailSuccessLbl.setVisible(true);
            emailValid =true;
        }
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtConfirmPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmPasswordKeyReleased
        // TODO add your handling code here:

        if(txtConfirmPassword.getText().equals(txtPassword.getText()) && txtConfirmPassword.getText().isEmpty()){
            //            confirmPasswordSuccessLbl.setVisible(true);
            //            confirmPasswordLbl.setVisible(false);

        }else if(txtConfirmPassword.getText().isEmpty()){
            //            confirmPasswordLbl.setVisible(false);
            //             confirmPasswordSuccessLbl.setVisible(false);
        }else{
            //            confirmPasswordLbl.setVisible(true);
            //            confirmPasswordSuccessLbl.setVisible(false);
        }
    }//GEN-LAST:event_txtConfirmPasswordKeyReleased

    private void txtWeightKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWeightKeyReleased
        // TODO add your handling code here:
        int weight=0;
        if(txtWeight.getText().isEmpty()){
            //        weightSuccessLbl.setVisible(false);
            //             weightLbl.setVisible(false);
        }
        try{
            weight = Integer.parseInt(txtWeight.getText());
        }catch(NumberFormatException e){
            if(!txtWeight.getText().isEmpty()){
                weightValid = false;
                //             weightSuccessLbl.setVisible(false);
                //             weightLbl.setVisible(true);
                return;
            }else {
                weightValid = false;
                //             weightLbl.setVisible(false);
                //             weightSuccessLbl.setVisible(false);
                return;
            }
        }
        if(weight > 200){
            weightValid = false;
            //            weightLbl.setVisible(true);
            //            weightSuccessLbl.setVisible(false);
        }else{
            weightValid = true;
            //             weightLbl.setVisible(false);
            //             weightSuccessLbl.setVisible(true);
        }
    }//GEN-LAST:event_txtWeightKeyReleased

    private void txtZipKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZipKeyReleased
        // TODO add your handling code here:
        int zip=0;
        try{
            zip = Integer.parseInt(txtZip.getText());
            if(zip == 0){
                //                zipLbl.setVisible(false);
                //                zipSuccessLbl.setVisible(false);
                zipValid = false;
            }
            zipValid = true;
            //             zipSuccessLbl.setVisible(true);
            //             zipLbl.setVisible(false);
            return;
        }catch(NumberFormatException e){
            if(!txtZip.getText().isEmpty()){
                zipValid = false;
                //             zipSuccessLbl.setVisible(false);
                //             zipLbl.setVisible(true);
                return;
            }else {
                zipValid = false;
                //             zipLbl.setVisible(false);
                //             zipSuccessLbl.setVisible(false);
                return;
            }
        }

    }//GEN-LAST:event_txtZipKeyReleased

    private void txtCityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCityKeyReleased
        // TODO add your handling code here:
        if(!cityPatternCorrect(txtCity.getText()) && !(txtCity.getText().isEmpty())){
            //            citySuccessLbl.setVisible(false);
            //            cityLbl.setVisible(true);

            cityValid = false;
        }else if(txtCity.getText().isEmpty()){
            //            citySuccessLbl.setVisible(false);
            //            cityLbl.setVisible(false);
            cityValid = false;
        }else{
            cityValid = true;
            //            cityLbl.setVisible(false);
            //            citySuccessLbl.setVisible(true);
        }

    }//GEN-LAST:event_txtCityKeyReleased

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased
        // TODO add your handling code here:

        int age=0;
        try{
            age = Integer.parseInt(txtAge.getText());
        }catch(NumberFormatException e){
            if(!txtAge.getText().isEmpty()){
                //             invalidAgeLbl.setVisible(true);
                ageValid = false;

                //             ageBandLbl.setVisible(false);
                //             AgeSuccessLbl.setVisible(false);
                return;
            }else {
                //                invalidAgeLbl.setVisible(false);
                ageValid = false;
                //             ageBandLbl.setVisible(false);
                //             AgeSuccessLbl.setVisible(false);
                return;
            }
        }
        if(age < 15 || age > 85){
            //            ageBandLbl.setVisible(true);
            ageValid = false;

            //             invalidAgeLbl.setVisible(false);
            //            AgeSuccessLbl.setVisible(false);
        }else{
            //            invalidAgeLbl.setVisible(false);
            //            ageBandLbl.setVisible(false);
            ageValid = true;
            //            AgeSuccessLbl.setVisible(true);
        }
    }//GEN-LAST:event_txtAgeKeyReleased

    private void txtAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyReleased
        // TODO add your handling code here:
        if(!addressPatternCorrect(txtAddress.getText()) && !(txtAddress.getText().isEmpty())){
            //            addressSuccessLbl.setVisible(false);
            //            addressLbl.setVisible(true);
        }else if(txtAddress.getText().isEmpty()){
            //            addressLbl.setVisible(false);
            //             addressSuccessLbl.setVisible(false);
        }else{
            //            addressLbl.setVisible(false);
            //            addressSuccessLbl.setVisible(true);
        }
    }//GEN-LAST:event_txtAddressKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        // TODO add your handling code here:
        if(!passwordPatternCorrect(txtPassword.getText()) && !(txtPassword.getText().isEmpty())){
            //            passwordSuccessLbl.setVisible(false);
            //            passwordLbl.setVisible(true);

        }else if(txtPassword.getText().isEmpty()){
            //            passwordLbl.setVisible(false);
            //             passwordSuccessLbl.setVisible(false);
        }else{
            //            passwordLbl.setVisible(false);
            //            passwordSuccessLbl.setVisible(true);
        }
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void radioMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMaleActionPerformed
        // radioFemale.setEnabled(false);
        radioFemale.setSelected(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMaleActionPerformed

    private void radioFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFemaleActionPerformed
        //  radioMale.setEnabled(false);
        radioMale.setSelected(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_radioFemaleActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        Network network = (Network) combxNetwork.getSelectedItem();
        if(txtName.getText().isEmpty() || txtAge.getText().isEmpty() || txtWeight.getText().isEmpty() || txtHeight.getText().isEmpty() || txtAddress.getText().isEmpty() || txtCity.getText().isEmpty() || txtZip.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Field(s) cannot be Empty!","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }else if(!chkbxNone.isSelected() && !chkbxDiabetes.isSelected() && !chkbxCholestrol.isSelected() && !chkbxHypertension.isSelected() && !chkbxPCOS.isSelected() && !chkbxThyroid.isSelected()){
            JOptionPane.showMessageDialog(null,"Please Fill the Health Issues! If you don't have any kindly Select None!","Error",JOptionPane.ERROR_MESSAGE);
            return;

        }else if(ageValid && zipValid && heightValid && weightValid){
            String name = txtName.getText();
            String password = txtPassword.getText();
            String add = txtAddress.getText();
            String city = txtCity.getText();
            String gender="";
            if(radioMale.isSelected()){
                gender = "Male";
            }else{
                gender = "Female";
            }
            double height = Double.parseDouble(txtHeight.getText());
            double weight = Double.parseDouble(txtWeight.getText());
            int age = Integer.parseInt(txtAge.getText());
            String address = txtAddress.getText();
            String zipcode = txtZip.getText();
            Boolean none = chkbxNone.isSelected();
            Boolean diabetes = chkbxDiabetes.isSelected();
            Boolean cholestrol = chkbxCholestrol.isSelected();
            Boolean hyper= chkbxHypertension.isSelected();
            Boolean pcos = chkbxPCOS.isSelected();
            Boolean thyroid = chkbxThyroid.isSelected();

            system.getCustomerDirectory().updateCustomer(customer, name, height, weight, gender, age, address, city, zipcode, none,diabetes,cholestrol,hyper, pcos, thyroid);
            system.getUserAccountDirectory().updateUserAccount(userAccount, password);
            JOptionPane.showMessageDialog(null, "Customer has been updated successfully","Success",JOptionPane.INFORMATION_MESSAGE);

            txtName.setEditable(false);
            txtName.setEnabled(false);
            txtAge.setEditable(false);
            txtAge.setEnabled(false);
            radioMale.setEnabled(false);
            radioFemale.setEnabled(false);
            txtAddress.setEditable(false);
            txtAddress.setEnabled(false);
            txtPassword.setEditable(false);
            txtPassword.setEnabled(false);
            txtCity.setEditable(false);
            txtCity.setEnabled(false);
            combxNetwork.setEditable(false);
            combxNetwork.setEnabled(false);
            txtZip.setEditable(false);
            txtZip.setEnabled(false);
            txtHeight.setEditable(false);
            txtHeight.setEnabled(false);
            txtWeight.setEditable(false);
            txtWeight.setEnabled(false);
            chkbxNone.setEnabled(false);
            chkbxDiabetes.setEnabled(false);
            chkbxCholestrol.setEnabled(false);
            chkbxHypertension.setEnabled(false);
            chkbxPCOS.setEnabled(false);
            chkbxThyroid.setEnabled(false);
            btnSave.setEnabled(false);
            btnUpdate.setEnabled(true);
//            clearLabels();
        }else {
            JOptionPane.showMessageDialog(null, "Please enter all the required fields correctly!","Error",JOptionPane.ERROR_MESSAGE);
        }

        /*String name = txtName.getText();
        String add = txtAdress.getText();
        String city = txtCity.getText();
        String gender="";
        if(maleRadioBtn.isSelected()){
            gender = "Male";
        }else{
            gender = "Female";
        }
        customer = new Customer();
        customer.setName(name);
        customer.setHeight(Integer.parseInt(txtHeight.getText()));
        customer.setWeight(Integer.parseInt(txtWeight.getText()));
        customer.setGender(gender);
        customer.setAge(Integer.parseInt(txtAge.getText()));
        customer.setAddress(add);
        customer.setCity(city);
        customer.setZipcode(Integer.parseInt(txtZipcode.getText()));
        customer.setNone(noneChkBox.isSelected());
        customer.setDiabetes(diabetesChkBox.isSelected());
        customer.setCholestrol(cholestrolChkBox.isSelected());
        customer.setHypertension(hyperChkBox.isSelected());
        customer.setPcos(pcosChkBox.isSelected());
        customer.setThyroid(thyroidChkBox.isSelected());

        // User Name Already Exists Validation
        if(system.getCustomerDirectory().checkIfUsernameIsUnique(customer.getEmail())){
            system.getCustomerDirectory().createCustomer(customer);
            //system.getUserAccountDirectory().createUserAccount(customer, new CustomerRole());
            JOptionPane.showMessageDialog(null, "Customer added successfully");
            //clearValues();
        }
        else{
            JOptionPane.showMessageDialog(null, "Customer already exists");
        }*/
        // Disable Back
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtName.setEditable(true);
        txtName.setEnabled(true);
        txtAge.setEditable(true);
        txtAge.setEnabled(true);
        radioMale.setEnabled(true);
        radioFemale.setEnabled(true);
        txtAddress.setEditable(true);
        txtAddress.setEnabled(true);
        txtPassword.setEditable(true);
        txtPassword.setEnabled(true);
        txtCity.setEditable(true);
        txtCity.setEnabled(true);
        combxNetwork.setEditable(true);
        txtZip.setEditable(true);
        txtZip.setEnabled(true);
        txtHeight.setEditable(true);
        txtHeight.setEnabled(true);
        txtWeight.setEditable(true);
        txtWeight.setEnabled(true);
        chkbxNone.setEnabled(true);
        chkbxDiabetes.setEnabled(true);
        chkbxCholestrol.setEnabled(true);
        chkbxHypertension.setEnabled(true);
        chkbxPCOS.setEnabled(true);
        chkbxThyroid.setEnabled(true);
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAnalysisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalysisActionPerformed

        CustomerAnalysisJPanel customerAnalysisJPanel=new CustomerAnalysisJPanel(userProcessContainer,customer,system,userAccount,enterprise, network);
        userProcessContainer.add("CustomerAnalysisJPanel",customerAnalysisJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnalysisActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        // TODO add your handling code here:
        PlaceOrderJPanel placeOrder =new PlaceOrderJPanel(userProcessContainer,customer,system,userAccount,enterprise, network);
        userProcessContainer.add("CustomerAnalysisJPanel",placeOrder);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalysis;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox chkbxCholestrol;
    private javax.swing.JCheckBox chkbxDiabetes;
    private javax.swing.JCheckBox chkbxHypertension;
    private javax.swing.JCheckBox chkbxNone;
    private javax.swing.JCheckBox chkbxPCOS;
    private javax.swing.JCheckBox chkbxThyroid;
    private javax.swing.JComboBox combxNetwork;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblCustomerRegistration;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHealthIssues;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JLabel lblZip;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtWeight;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables
}
