/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Customer;

import Business.Customer.Customer;
import Business.Ecosystem;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.CustomerRole;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author rutujakute
 */
public class CreateNewCustomerPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerCreateNewJPanel
     */
    
    
     JPanel userProcessContainer;
     Ecosystem system; 
     Organization organization;
     private Customer c;
     private boolean ageValid;
     private boolean emailValid;
     private boolean zipValid;
     private boolean heightValid;
     private boolean weightValid;
     private boolean cityValid;
    public CreateNewCustomerPanel(JPanel userProcessContainer, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system= system;
        this.organization = organization;
        clearLabels();
        populateNetworkComboBox();
       
    }
    
    private void clearLabels(){
     // Labels initialzed to false
        nameLbl.setVisible(false);
        nameSuccessLbl.setVisible(false);
        emailLbl.setVisible(false);
        emailIDAlreadyLbl.setVisible(false);
        emailSuccessLbl.setVisible(false);
        passwordSuccessLbl.setVisible(false);
        passwordLbl.setVisible(false);
        confirmPasswordSuccessLbl.setVisible(false);
        confirmPasswordLbl.setVisible(false);
        AgeSuccessLbl.setVisible(false);
        invalidAgeLbl.setVisible(false);
        ageBandLbl.setVisible(false);
        addressSuccessLbl.setVisible(false);
        addressLbl.setVisible(false);
        cityLbl.setVisible(false);
        citySuccessLbl.setVisible(false);
        zipLbl.setVisible(false);
        zipSuccessLbl.setVisible(false);
        heightLbl.setVisible(false);
        heightSuccessLbl.setVisible(false);
        weightLbl.setVisible(false);
        weightSuccessLbl.setVisible(false);
    
    }

    
    
    private void populateNetworkComboBox() {
        combxNetwork.removeAllItems();

        for (Network network : system.getNetworkList()) {
            combxNetwork.addItem(network);
        }

    }
    
    private boolean usernamePatternCorrect(String val){
        Pattern p=Pattern.compile("^[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
        Matcher m=p.matcher(val);
        boolean b=m.matches();
        return b;
    }
    private boolean namePatternCorrect(String val1){
        Pattern p=Pattern.compile("^[a-zA-Z]+$");
        Matcher m=p.matcher(val1);
        boolean b=m.matches();
        return b;
    }
    private boolean addressPatternCorrect(String val2){
        Pattern p=Pattern.compile("^[a-z A-Z 0-9#/-]+$");
        Matcher m=p.matcher(val2);
        boolean b=m.matches();
        return b;
    }
    private boolean cityPatternCorrect(String val3){
        Pattern p=Pattern.compile("^[a-zA-Z]+$");
        Matcher m=p.matcher(val3);
        boolean b=m.matches();
        return b;
    }
    
    private boolean passwordPatternCorrect(String val4){
        Pattern p1;
        p1 = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m1=p1.matcher(String.valueOf(val4));
        boolean b1=m1.matches();
        return b1;
    }
    private boolean numberPatternCorrect(String val5){
        Pattern p=Pattern.compile("^[0-9]$");
        Matcher m=p.matcher(val5);
        boolean b=m.matches();
        return b;
    }
    
    private void clearValues(){
                txtName.setText("");
                txtEmail.setText("");
                txtPassword.setText("");
                txtConfirmPassword.setText("");
                txtAge.setText("");
                txtAddress.setText("");
                txtCity.setText("");
                try{
                combxNetwork.setSelectedIndex(0);
                }catch (Exception e){
                    
                }
                txtZip.setText("");
                txtHeight.setText("");
                txtWeight.setText("");
                chkbxDiabetes.setSelected(false);
                chkbxCholestrol.setSelected(false);
                chkbxHypertension.setSelected(false);
                chkbxPCOS.setSelected(false);
                chkbxThyroid.setSelected(false);
                chkbxNone.setSelected(false);
                nameSuccessLbl.setVisible(false);
                emailSuccessLbl.setVisible(false);
                passwordSuccessLbl.setVisible(false);
                confirmPasswordSuccessLbl.setVisible(false);
                AgeSuccessLbl.setVisible(false);
                addressSuccessLbl.setVisible(false);
                citySuccessLbl.setVisible(false);
                zipSuccessLbl.setVisible(false);
                heightSuccessLbl.setVisible(false);
                weightSuccessLbl.setVisible(false);
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
        txtConfirmPassword = new javax.swing.JPasswordField();
        txtWeight = new javax.swing.JTextField();
        txtZip = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnReset = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        combxNetwork = new javax.swing.JComboBox();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        nameSuccessLbl = new javax.swing.JLabel();
        emailSuccessLbl = new javax.swing.JLabel();
        passwordSuccessLbl = new javax.swing.JLabel();
        confirmPasswordSuccessLbl = new javax.swing.JLabel();
        heightSuccessLbl = new javax.swing.JLabel();
        weightSuccessLbl = new javax.swing.JLabel();
        AgeSuccessLbl = new javax.swing.JLabel();
        addressSuccessLbl = new javax.swing.JLabel();
        citySuccessLbl = new javax.swing.JLabel();
        zipSuccessLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        emailIDAlreadyLbl = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();
        confirmPasswordLbl = new javax.swing.JLabel();
        heightLbl = new javax.swing.JLabel();
        weightLbl = new javax.swing.JLabel();
        ageBandLbl = new javax.swing.JLabel();
        invalidAgeLbl = new javax.swing.JLabel();
        addressLbl = new javax.swing.JLabel();
        cityLbl = new javax.swing.JLabel();
        zipLbl = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 204, 204));
        kGradientPanel1.setkGradientFocus(1000);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 102, 153));
        kGradientPanel1.setName(""); // NOI18N
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(600, 651));
        kGradientPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kGradientPanel1MouseClicked(evt);
            }
        });
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCustomerRegistration.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblCustomerRegistration.setForeground(new java.awt.Color(255, 255, 255));
        lblCustomerRegistration.setText("Customer Registration");
        kGradientPanel1.add(lblCustomerRegistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        lblEmail.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email ID:");
        kGradientPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, 34));

        lblName.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Name:");
        kGradientPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        lblConfirmPassword.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblConfirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblConfirmPassword.setText("Confirm Password:");
        kGradientPanel1.add(lblConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        lblHeight.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblHeight.setForeground(new java.awt.Color(255, 255, 255));
        lblHeight.setText("Height(in cms):");
        kGradientPanel1.add(lblHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        lblAge.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblAge.setForeground(new java.awt.Color(255, 255, 255));
        lblAge.setText("Age:");
        kGradientPanel1.add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, -1, -1));

        lblPassword.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password:");
        kGradientPanel1.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        lblAddress.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress.setText("Address:");
        kGradientPanel1.add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, -1));

        lblCity.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblCity.setForeground(new java.awt.Color(255, 255, 255));
        lblCity.setText("City:");
        kGradientPanel1.add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, -1, -1));

        lblZip.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblZip.setForeground(new java.awt.Color(255, 255, 255));
        lblZip.setText("Zip Code:");
        kGradientPanel1.add(lblZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        lblState.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblState.setForeground(new java.awt.Color(255, 255, 255));
        lblState.setText("State:");
        kGradientPanel1.add(lblState, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        lblWeight.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblWeight.setForeground(new java.awt.Color(255, 255, 255));
        lblWeight.setText("Weight(in kgs):");
        kGradientPanel1.add(lblWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 121, 39));

        lblHealthIssues.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblHealthIssues.setForeground(new java.awt.Color(255, 255, 255));
        lblHealthIssues.setText("Health Issues");
        kGradientPanel1.add(lblHealthIssues, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, -1, -1));

        lblGender.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblGender.setForeground(new java.awt.Color(255, 255, 255));
        lblGender.setText("Gender:");
        kGradientPanel1.add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 74, 41));

        chkbxHypertension.setForeground(new java.awt.Color(255, 255, 255));
        chkbxHypertension.setText("Hypertension");
        chkbxHypertension.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkbxHypertensionMouseClicked(evt);
            }
        });
        chkbxHypertension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxHypertensionActionPerformed(evt);
            }
        });
        kGradientPanel1.add(chkbxHypertension, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, -1, -1));

        chkbxNone.setForeground(new java.awt.Color(255, 255, 255));
        chkbxNone.setText("None");
        chkbxNone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkbxNoneMouseClicked(evt);
            }
        });
        chkbxNone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxNoneActionPerformed(evt);
            }
        });
        kGradientPanel1.add(chkbxNone, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, -1, -1));

        chkbxDiabetes.setForeground(new java.awt.Color(255, 255, 255));
        chkbxDiabetes.setText("Diabetes");
        chkbxDiabetes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkbxDiabetesMouseClicked(evt);
            }
        });
        chkbxDiabetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxDiabetesActionPerformed(evt);
            }
        });
        kGradientPanel1.add(chkbxDiabetes, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, -1, -1));

        chkbxPCOS.setForeground(new java.awt.Color(255, 255, 255));
        chkbxPCOS.setText("PCOS");
        chkbxPCOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkbxPCOSMouseClicked(evt);
            }
        });
        chkbxPCOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxPCOSActionPerformed(evt);
            }
        });
        kGradientPanel1.add(chkbxPCOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, -1, -1));

        chkbxCholestrol.setForeground(new java.awt.Color(255, 255, 255));
        chkbxCholestrol.setText("Cholestrol");
        chkbxCholestrol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkbxCholestrolMouseClicked(evt);
            }
        });
        chkbxCholestrol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxCholestrolActionPerformed(evt);
            }
        });
        kGradientPanel1.add(chkbxCholestrol, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, -1, -1));

        chkbxThyroid.setForeground(new java.awt.Color(255, 255, 255));
        chkbxThyroid.setText("Thyroid");
        chkbxThyroid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxThyroidActionPerformed(evt);
            }
        });
        kGradientPanel1.add(chkbxThyroid, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, -1, -1));

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
        kGradientPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 160, -1));

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
        kGradientPanel1.add(txtHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 150, 20));

        txtConfirmPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConfirmPasswordKeyReleased(evt);
            }
        });
        kGradientPanel1.add(txtConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 160, 20));

        txtWeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtWeightKeyReleased(evt);
            }
        });
        kGradientPanel1.add(txtWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 150, 20));

        txtZip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtZipKeyReleased(evt);
            }
        });
        kGradientPanel1.add(txtZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 170, 20));

        txtCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCityKeyReleased(evt);
            }
        });
        kGradientPanel1.add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 130, 20));

        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeKeyReleased(evt);
            }
        });
        kGradientPanel1.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 140, 20));

        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddressKeyReleased(evt);
            }
        });
        kGradientPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 140, 20));

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        kGradientPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 160, -1));

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 128, 41));

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, 131, 37));

        combxNetwork.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        combxNetwork.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        kGradientPanel1.add(combxNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 140, 20));

        radioMale.setBackground(new java.awt.Color(255, 255, 255));
        radioMale.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        radioMale.setSelected(true);
        radioMale.setText("Male");
        radioMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMaleActionPerformed(evt);
            }
        });
        kGradientPanel1.add(radioMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 68, -1));

        radioFemale.setBackground(new java.awt.Color(255, 255, 255));
        radioFemale.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        radioFemale.setText("Female");
        radioFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFemaleActionPerformed(evt);
            }
        });
        kGradientPanel1.add(radioFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 72, -1));

        nameSuccessLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/tick.png"))); // NOI18N
        kGradientPanel1.add(nameSuccessLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 30, 30));

        emailSuccessLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/tick.png"))); // NOI18N
        kGradientPanel1.add(emailSuccessLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 30, 30));

        passwordSuccessLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/tick.png"))); // NOI18N
        kGradientPanel1.add(passwordSuccessLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 30, 30));

        confirmPasswordSuccessLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/tick.png"))); // NOI18N
        kGradientPanel1.add(confirmPasswordSuccessLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 30, 30));

        heightSuccessLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        heightSuccessLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/tick.png"))); // NOI18N
        kGradientPanel1.add(heightSuccessLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 30, 30));

        weightSuccessLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/tick.png"))); // NOI18N
        kGradientPanel1.add(weightSuccessLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 40, 30));

        AgeSuccessLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/tick.png"))); // NOI18N
        kGradientPanel1.add(AgeSuccessLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 30, 30));

        addressSuccessLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/tick.png"))); // NOI18N
        kGradientPanel1.add(addressSuccessLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 30, 30));

        citySuccessLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/tick.png"))); // NOI18N
        kGradientPanel1.add(citySuccessLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 30, 30));

        zipSuccessLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/tick.png"))); // NOI18N
        kGradientPanel1.add(zipSuccessLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 30, 30));

        nameLbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        nameLbl.setForeground(new java.awt.Color(255, 0, 0));
        nameLbl.setText(" Only Alphabets are allowed.");
        kGradientPanel1.add(nameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 190, 20));

        emailLbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        emailLbl.setForeground(new java.awt.Color(255, 0, 0));
        emailLbl.setText("Valid Format - 'xx@xx.xx'");
        kGradientPanel1.add(emailLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 150, 20));

        emailIDAlreadyLbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        emailIDAlreadyLbl.setForeground(new java.awt.Color(255, 0, 0));
        emailIDAlreadyLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emailIDAlreadyLbl.setText("EmailID already Exists");
        kGradientPanel1.add(emailIDAlreadyLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 160, 20));

        passwordLbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        passwordLbl.setForeground(new java.awt.Color(255, 0, 0));
        passwordLbl.setText("Sample format: Asdf@1");
        kGradientPanel1.add(passwordLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 160, 20));

        confirmPasswordLbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        confirmPasswordLbl.setForeground(new java.awt.Color(255, 0, 0));
        confirmPasswordLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirmPasswordLbl.setText("Password Not Matching");
        kGradientPanel1.add(confirmPasswordLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 160, 20));

        heightLbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        heightLbl.setForeground(new java.awt.Color(255, 0, 0));
        heightLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heightLbl.setText("Invalid Height");
        kGradientPanel1.add(heightLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 160, 20));

        weightLbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        weightLbl.setForeground(new java.awt.Color(255, 0, 0));
        weightLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        weightLbl.setText("Invalid Weight");
        kGradientPanel1.add(weightLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 160, 20));

        ageBandLbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        ageBandLbl.setForeground(new java.awt.Color(255, 0, 0));
        ageBandLbl.setText("Age Should be between 15-85");
        kGradientPanel1.add(ageBandLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, -1, 20));

        invalidAgeLbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        invalidAgeLbl.setForeground(new java.awt.Color(255, 0, 0));
        invalidAgeLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        invalidAgeLbl.setText("Invalid Age.");
        kGradientPanel1.add(invalidAgeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 150, 20));

        addressLbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        addressLbl.setForeground(new java.awt.Color(255, 0, 0));
        addressLbl.setText("Only Alphabets, Numbers, '#/-' are allowed");
        kGradientPanel1.add(addressLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 250, 20));

        cityLbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        cityLbl.setForeground(new java.awt.Color(255, 0, 0));
        cityLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cityLbl.setText("Only Alphabets are allowed");
        kGradientPanel1.add(cityLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 160, 20));

        zipLbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        zipLbl.setForeground(new java.awt.Color(255, 0, 0));
        zipLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        zipLbl.setText("Only Numbers Allowed");
        kGradientPanel1.add(zipLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 160, 20));

        txtEmail.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        kGradientPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 150, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(255, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1066, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(510, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
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
                          nameLbl.setVisible(true);
                          nameSuccessLbl.setVisible(false);
           
        }else if(txtName.getText().isEmpty()){
                        nameLbl.setVisible(false);
                         nameSuccessLbl.setVisible(false);
        }else{
                     nameLbl.setVisible(false);
                     nameSuccessLbl.setVisible(true);
        }
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHeightActionPerformed

    private void txtHeightKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHeightKeyReleased
        // TODO add your handling code here:
        int height=0;
        if(txtHeight.getText().isEmpty()){
                    heightSuccessLbl.setVisible(false);
                         heightLbl.setVisible(false);
        }
        try{
            height = Integer.parseInt(txtHeight.getText());
        }catch(NumberFormatException e){
            if(!txtHeight.getText().isEmpty()){
                heightValid = false;
                             heightSuccessLbl.setVisible(false);
                             heightLbl.setVisible(true);
                return;
            }else {
                heightValid = false;
                             heightLbl.setVisible(false);
                             heightSuccessLbl.setVisible(false);
                return;
            }
        }
        if(txtHeight.getText().length() > 3 || txtHeight.getText().length() < 3){
            heightValid = false;
                         heightLbl.setVisible(true);
                         heightSuccessLbl.setVisible(false);
        }else{
            heightValid = true;
                         heightLbl.setVisible(false);
                         heightSuccessLbl.setVisible(true);
        }
    }//GEN-LAST:event_txtHeightKeyReleased

    private void txtConfirmPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmPasswordKeyReleased
        // TODO add your handling code here:

        if(txtConfirmPassword.getText().equals(txtPassword.getText()) && !txtConfirmPassword.getText().isEmpty()){
            confirmPasswordSuccessLbl.setVisible(true);
            confirmPasswordLbl.setVisible(false);
        }else if(txtConfirmPassword.getText().isEmpty()){
            confirmPasswordLbl.setVisible(false);
             confirmPasswordSuccessLbl.setVisible(false);
        }else{
            confirmPasswordLbl.setVisible(true);
            confirmPasswordSuccessLbl.setVisible(false);
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
                             weightSuccessLbl.setVisible(false);
                             weightLbl.setVisible(true);
                return;
            }else {
                weightValid = false;
                             weightLbl.setVisible(false);
                             weightSuccessLbl.setVisible(false);
                return;
            }
        }
        if(weight > 200){
            weightValid = false;
                        weightLbl.setVisible(true);
                        weightSuccessLbl.setVisible(false);
        }else{
            weightValid = true;
                         weightLbl.setVisible(false);
                         weightSuccessLbl.setVisible(true);
        }
    }//GEN-LAST:event_txtWeightKeyReleased

    private void txtZipKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZipKeyReleased
        // TODO add your handling code here:
        int zip=0;
        try{
            zip = Integer.parseInt(txtZip.getText());
            if(zip == 0){
                                zipLbl.setVisible(false);
                                zipSuccessLbl.setVisible(false);
                zipValid = false;
            }
            zipValid = true;
                         zipSuccessLbl.setVisible(true);
                         zipLbl.setVisible(false);
            return;
        }catch(NumberFormatException e){
            if(!txtZip.getText().isEmpty()){
                zipValid = false;
                             zipSuccessLbl.setVisible(false);
                             zipLbl.setVisible(true);
                return;
            }else {
                zipValid = false;
                             zipLbl.setVisible(false);
                             zipSuccessLbl.setVisible(false);
                return;
            }
        }

    }//GEN-LAST:event_txtZipKeyReleased

    private void txtCityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCityKeyReleased
        // TODO add your handling code here:
        if(!cityPatternCorrect(txtCity.getText()) && !(txtCity.getText().isEmpty())){
                        citySuccessLbl.setVisible(false);
                        cityLbl.setVisible(true);

                        cityValid = false;
        }else if(txtCity.getText().isEmpty()){
                        citySuccessLbl.setVisible(false);
                        cityLbl.setVisible(false);
                        cityValid = false;
        }else{
                        cityValid = true;
                        cityLbl.setVisible(false);
                        citySuccessLbl.setVisible(true);
        }

    }//GEN-LAST:event_txtCityKeyReleased

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased
        // TODO add your handling code here:

        int age=0;
        try{
            age = Integer.parseInt(txtAge.getText());
        }catch(NumberFormatException e){
            if(!txtAge.getText().isEmpty()){
                             invalidAgeLbl.setVisible(true);
                              ageValid = false;

                             ageBandLbl.setVisible(false);
                             AgeSuccessLbl.setVisible(false);
                return;
            }else {
                             invalidAgeLbl.setVisible(false);
                             ageValid = false;
                             ageBandLbl.setVisible(false);
                             AgeSuccessLbl.setVisible(false);
                return;
            }
        }
        if(age < 15 || age > 85){
                        ageBandLbl.setVisible(true);
            ageValid = false;

                        invalidAgeLbl.setVisible(false);
                        AgeSuccessLbl.setVisible(false);
        }else{
                        invalidAgeLbl.setVisible(false);
                        ageBandLbl.setVisible(false);
            ageValid = true;
                        AgeSuccessLbl.setVisible(true);
        }
    }//GEN-LAST:event_txtAgeKeyReleased

    private void txtAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyReleased
        // TODO add your handling code here:
        if(!addressPatternCorrect(txtAddress.getText()) && !(txtAddress.getText().isEmpty())){
                        addressSuccessLbl.setVisible(false);
                        addressLbl.setVisible(true);
        }else if(txtAddress.getText().isEmpty()){
                        addressLbl.setVisible(false);
                        addressSuccessLbl.setVisible(false);
        }else{
                        addressLbl.setVisible(false);
                        addressSuccessLbl.setVisible(true);
        }
    }//GEN-LAST:event_txtAddressKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        // TODO add your handling code here:
        if(!passwordPatternCorrect(txtPassword.getText()) && !(txtPassword.getText().isEmpty())){
                        passwordSuccessLbl.setVisible(false);
                        passwordLbl.setVisible(true);

        }else if(txtPassword.getText().isEmpty()){
                        passwordLbl.setVisible(false);
                        passwordSuccessLbl.setVisible(false);
        }else{
                        passwordLbl.setVisible(false);
                        passwordSuccessLbl.setVisible(true);
        }
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        clearValues();
        clearLabels();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        Network network = (Network) combxNetwork.getSelectedItem();
        if(!chkbxNone.isSelected() && !chkbxDiabetes.isSelected() && !chkbxCholestrol.isSelected() && !chkbxHypertension.isSelected() && !chkbxPCOS.isSelected() && !chkbxThyroid.isSelected()){
            JOptionPane.showMessageDialog(null,"Please Fill the Health Issues! If you don't have any kindly Select None!","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }else if(txtName.getText().isEmpty() || txtAge.getText().isEmpty() || txtWeight.getText().isEmpty() || txtHeight.getText().isEmpty() || txtEmail.getText().isEmpty() || txtAddress.getText().isEmpty() || txtCity.getText().isEmpty() ||  txtZip.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Field(s) cannot be Empty!","Error",JOptionPane.ERROR_MESSAGE);
            return;

        }else if(ageValid && zipValid && heightValid && weightValid && emailValid){
            String name = txtName.getText();
            String password = txtPassword.getText();
            String email = txtEmail.getText();
            String add = txtAddress.getText();
            String city = txtCity.getText();
            String gender = " ";
            if(radioMale.isSelected()){
                gender = "Male";
            }else{
                gender = "Female";
            }

            c = new Customer();
            c.setName(name);
            c.setEmail(email);
            c.setHeight(Integer.parseInt(txtHeight.getText()));
            c.setWeight(Integer.parseInt(txtWeight.getText()));
            c.setGender(gender);
            c.setAge(Integer.parseInt(txtAge.getText()));
            c.setLocation(add);
            c.setCity(city);
            c.setZipcode(txtZip.getText());
            c.setIs_None(chkbxNone.isSelected());
            c.setIs_diabetes(chkbxDiabetes.isSelected());
            c.setIs_cholestrol(chkbxCholestrol.isSelected());
            c.setIs_hypertension(chkbxHypertension.isSelected());
            c.setIs_pcos(chkbxPCOS.isSelected());
            c.setIs_thyroid(chkbxThyroid.isSelected());
            c.setNetwork(network);
//
//            // User Name Already Exists Validation
//
            system.getCustomerDirectory().createCustomer(c);
            system.getUserAccountList().createCustomerAccount(email, password,c, new CustomerRole());
            JOptionPane.showMessageDialog(null, "Customer added successfully","Success",JOptionPane.INFORMATION_MESSAGE);
                            clearValues();

        }
        else {
            JOptionPane.showMessageDialog(null, "Please enter all the required fields correctly!","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        
        
           

    }//GEN-LAST:event_btnSubmitActionPerformed

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

    private void chkbxNoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkbxNoneMouseClicked
        // TODO add your handling code here:
        chkbxDiabetes.setSelected(false);
        chkbxCholestrol.setSelected(false);
        chkbxHypertension.setSelected(false);
        chkbxPCOS.setSelected(false);
        chkbxThyroid.setSelected(false);
    }//GEN-LAST:event_chkbxNoneMouseClicked

    private void chkbxDiabetesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkbxDiabetesMouseClicked
        // TODO add your handling code here:
        chkbxNone.setSelected(false);
    }//GEN-LAST:event_chkbxDiabetesMouseClicked

    private void chkbxCholestrolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkbxCholestrolMouseClicked
        // TODO add your handling code here:
         chkbxNone.setSelected(false);
    }//GEN-LAST:event_chkbxCholestrolMouseClicked

    private void chkbxHypertensionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkbxHypertensionMouseClicked
        // TODO add your handling code here:
         chkbxNone.setSelected(false);
    }//GEN-LAST:event_chkbxHypertensionMouseClicked

    private void chkbxPCOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkbxPCOSMouseClicked
        // TODO add your handling code here:
         chkbxNone.setSelected(false);
    }//GEN-LAST:event_chkbxPCOSMouseClicked

    private void kGradientPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MouseClicked
        // TODO add your handling code here:
         chkbxNone.setSelected(false);
    }//GEN-LAST:event_kGradientPanel1MouseClicked

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        if (!usernamePatternCorrect(txtEmail.getText()) && !(txtEmail.getText().isEmpty()) && system.getCustomerDirectory().checkUsernameIsUnique(txtEmail.getText())){
            emailLbl.setVisible(true);
            emailIDAlreadyLbl.setVisible(false);
            emailSuccessLbl.setVisible(false);
            emailValid =false;
        }else if(txtEmail.getText().isEmpty()){
            emailLbl.setVisible(false);
            emailIDAlreadyLbl.setVisible(false);
            emailValid =false;
            emailSuccessLbl.setVisible(false);
        }else if(!system.getCustomerDirectory().checkUsernameIsUnique(txtEmail.getText())){
            emailIDAlreadyLbl.setVisible(true);
            emailSuccessLbl.setVisible(false);
            emailValid =false;
        }else{
            emailLbl.setVisible(false);
            emailIDAlreadyLbl.setVisible(false);
            emailSuccessLbl.setVisible(true);
            emailValid =true;
        }
    }//GEN-LAST:event_txtEmailKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeSuccessLbl;
    private javax.swing.JLabel addressLbl;
    private javax.swing.JLabel addressSuccessLbl;
    private javax.swing.JLabel ageBandLbl;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JCheckBox chkbxCholestrol;
    private javax.swing.JCheckBox chkbxDiabetes;
    private javax.swing.JCheckBox chkbxHypertension;
    private javax.swing.JCheckBox chkbxNone;
    private javax.swing.JCheckBox chkbxPCOS;
    private javax.swing.JCheckBox chkbxThyroid;
    private javax.swing.JLabel cityLbl;
    private javax.swing.JLabel citySuccessLbl;
    private javax.swing.JComboBox combxNetwork;
    private javax.swing.JLabel confirmPasswordLbl;
    private javax.swing.JLabel confirmPasswordSuccessLbl;
    private javax.swing.JLabel emailIDAlreadyLbl;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JLabel emailSuccessLbl;
    private javax.swing.JLabel heightLbl;
    private javax.swing.JLabel heightSuccessLbl;
    private javax.swing.JLabel invalidAgeLbl;
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
    private javax.swing.JLabel nameLbl;
    private javax.swing.JLabel nameSuccessLbl;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JLabel passwordSuccessLbl;
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
    private javax.swing.JLabel weightLbl;
    private javax.swing.JLabel weightSuccessLbl;
    private javax.swing.JLabel zipLbl;
    private javax.swing.JLabel zipSuccessLbl;
    // End of variables declaration//GEN-END:variables
}
