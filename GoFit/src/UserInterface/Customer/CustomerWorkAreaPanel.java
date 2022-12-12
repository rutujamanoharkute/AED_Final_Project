/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Customer;

import Business.Customer.Customer;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author rutujakute
 */
public class CustomerWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerWorkAreaPanel
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
    private boolean cityValid;
    public CustomerWorkAreaPanel(JPanel userProcessContainer, Enterprise enterprise, Organization organization, UserAccount account, Ecosystem business,  Network network) {
        
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
        txtAddress.setEditable(false);
        txtPassword.setEditable(false);
        txtCity.setEditable(false);
        combxNetwork.setEditable(false);
        txtZip.setEditable(false);
        txtHeight.setEditable(false);
        txtWeight.setEditable(false);
        chkbxNone.setEnabled(false);
        chkbxDiabetes.setEnabled(false);
        chkbxCholestrol.setEnabled(false);
        chkbxHypertension.setEnabled(false);
        chkbxPCOS.setEnabled(false);
        chkbxThyroid.setEnabled(false);
        btnSave.setEnabled(false);
        clearLabels();
        
                    txtName.setText(userAccount.getCustomer().getName());
                    txtAge.setText(String.valueOf(userAccount.getCustomer().getAge()));
                    lblCustomerRegistration.setText(userAccount.getCustomer().getName()+ " !!");
                    if(userAccount.getCustomer().getGender().toLowerCase().equals("Male")){
                        radioMale.setSelected(true);
                    }else{
                        radioFemale.setSelected(true);
                    }
                    txtPassword.setText(userAccount.getPassword());
                    txtAddress.setText(userAccount.getCustomer().getLocation());
                    txtCity.setText(userAccount.getCustomer().getCity());
                     DefaultComboBoxModel dm=new DefaultComboBoxModel();
                     dm.addElement(userAccount.getCustomer().getNetwork());
                    combxNetwork.setModel(dm);
                    txtZip.setText(String.valueOf(userAccount.getCustomer().getZipcode()));
                    txtHeight.setText(String.valueOf(userAccount.getCustomer().getHeight()));
                    txtWeight.setText(String.valueOf(userAccount.getCustomer().getWeight()));
                    chkbxNone.setSelected(userAccount.getCustomer().getIs_None());
                    chkbxDiabetes.setSelected(userAccount.getCustomer().getIs_diabetes());
                    chkbxCholestrol.setSelected(userAccount.getCustomer().getIs_cholestrol());
                    chkbxHypertension.setSelected(userAccount.getCustomer().getIs_hypertension());
                    chkbxPCOS.setSelected(userAccount.getCustomer().getIs_pcos());
                    chkbxThyroid.setSelected(userAccount.getCustomer().getIs_thyroid());     
                    customer = userAccount.getCustomer();
                    return;
    }
    
     private void clearLabels(){
     // Labels initialzed to false
        lblAgeTick.setVisible(false);
        invalidAgeLbl.setVisible(false);
      
        lblAddressValidation.setVisible(false);
        lblCityValidation.setVisible(false);
        lblCityTick.setVisible(false);
        lblZipCodeValidation.setVisible(false);
        lblZipCodeTick.setVisible(false);
        lblNameValidation.setVisible(false);
        lblHeightTick.setVisible(false);
        lblWeightValidation.setVisible(false);
        lblNameTick.setVisible(false);
        lblPasswordTick.setVisible(false);
        lblAgeBandValidation.setVisible(false);
        lblAddressTick.setVisible(false);
        lblPasswordValidation.setVisible(false);
        lblHeightValidation.setVisible(false);
        lblWeightTick.setVisible(false);
    
    }
    
    private boolean checkNamePattern(String val1){
        Pattern p=Pattern.compile("^[a-zA-Z]+$");
        Matcher m=p.matcher(val1);
        boolean b=m.matches();
        return b;
    }
    
    
    private boolean checkNumberPattern(String val5){
        Pattern p=Pattern.compile("^[0-9]$");
        Matcher m=p.matcher(val5);
        boolean b=m.matches();
        return b;
    }
    private boolean checkAddressPattern(String val2){
        Pattern p=Pattern.compile("^[a-z A-Z 0-9#/-]+$");
        Matcher m=p.matcher(val2);
        boolean b=m.matches();
        return b;
    }
    
      private boolean  checkPasswordPattern(String val4){
        Pattern p1;
        p1 = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m1=p1.matcher(String.valueOf(val4));
        boolean b1=m1.matches();
        return b1;
    }
    private boolean  checkCityPattern(String val3){
        Pattern p=Pattern.compile("^[a-zA-Z]+$");
        Matcher m=p.matcher(val3);
        boolean b=m.matches();
        return b;
    }
     private boolean  checkUserNamePattern(String val){
        Pattern p=Pattern.compile("^[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
        Matcher m=p.matcher(val);
        boolean b=m.matches();
        return b;
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
        lblCustomerRegistration = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblAgeTick = new javax.swing.JLabel();
        lblAddressTick = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblPassword = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        lblZip = new javax.swing.JLabel();
        txtZip = new javax.swing.JTextField();
        radioFemale = new javax.swing.JRadioButton();
        radioMale = new javax.swing.JRadioButton();
        lblGender = new javax.swing.JLabel();
        lblHeight = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        lblWeight = new javax.swing.JLabel();
        lblHealthIssues = new javax.swing.JLabel();
        chkbxNone = new javax.swing.JCheckBox();
        chkbxDiabetes = new javax.swing.JCheckBox();
        chkbxCholestrol = new javax.swing.JCheckBox();
        chkbxHypertension = new javax.swing.JCheckBox();
        chkbxPCOS = new javax.swing.JCheckBox();
        chkbxThyroid = new javax.swing.JCheckBox();
        lblWeightTick = new javax.swing.JLabel();
        lblCityTick = new javax.swing.JLabel();
        lblZipCodeTick = new javax.swing.JLabel();
        combxNetwork = new javax.swing.JComboBox();
        lblNameValidation = new javax.swing.JLabel();
        lblPasswordValidation = new javax.swing.JLabel();
        lblHeightValidation = new javax.swing.JLabel();
        lblWeightValidation = new javax.swing.JLabel();
        lblAgeBandValidation = new javax.swing.JLabel();
        invalidAgeLbl = new javax.swing.JLabel();
        lblAddressValidation = new javax.swing.JLabel();
        lblCityValidation = new javax.swing.JLabel();
        lblZipCodeValidation = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnOperations = new javax.swing.JButton();
        btnOrder = new javax.swing.JButton();
        lblNameTick = new javax.swing.JLabel();
        lblHeightTick = new javax.swing.JLabel();
        lblPasswordTick = new javax.swing.JLabel();
        lblAgeTick1 = new javax.swing.JLabel();
        lblAddressTick1 = new javax.swing.JLabel();
        lblCityTick1 = new javax.swing.JLabel();
        lblZipCodeTick1 = new javax.swing.JLabel();
        lblWeightTick1 = new javax.swing.JLabel();
        btnGraph = new javax.swing.JButton();

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 204, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 153, 0));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCustomerRegistration.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblCustomerRegistration.setForeground(new java.awt.Color(255, 255, 255));
        lblCustomerRegistration.setText("Customer Registration");
        kGradientPanel1.add(lblCustomerRegistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        kGradientPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 160, -1));

        lblName.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Name:");
        kGradientPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        lblAge.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblAge.setForeground(new java.awt.Color(255, 255, 255));
        lblAge.setText("Age:");
        kGradientPanel1.add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, -1, -1));

        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeKeyReleased(evt);
            }
        });
        kGradientPanel1.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 140, 20));

        lblAgeTick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/tick.png"))); // NOI18N
        kGradientPanel1.add(lblAgeTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 30, 30));

        lblAddressTick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/tick.png"))); // NOI18N
        kGradientPanel1.add(lblAddressTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 30, 30));

        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddressKeyReleased(evt);
            }
        });
        kGradientPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 140, 20));

        lblAddress.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress.setText("Address:");
        kGradientPanel1.add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, -1));

        lblState.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblState.setForeground(new java.awt.Color(255, 255, 255));
        lblState.setText("State:");
        kGradientPanel1.add(lblState, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        kGradientPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 160, -1));

        lblPassword.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password:");
        kGradientPanel1.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        txtCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCityKeyReleased(evt);
            }
        });
        kGradientPanel1.add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 130, 20));

        lblCity.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblCity.setForeground(new java.awt.Color(255, 255, 255));
        lblCity.setText("City:");
        kGradientPanel1.add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, -1, -1));

        lblZip.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblZip.setForeground(new java.awt.Color(255, 255, 255));
        lblZip.setText("Zip Code:");
        kGradientPanel1.add(lblZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        txtZip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtZipKeyReleased(evt);
            }
        });
        kGradientPanel1.add(txtZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 170, 20));

        radioFemale.setBackground(new java.awt.Color(255, 255, 255));
        radioFemale.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        radioFemale.setText("Female");
        radioFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFemaleActionPerformed(evt);
            }
        });
        kGradientPanel1.add(radioFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 72, -1));

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

        lblGender.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblGender.setForeground(new java.awt.Color(255, 255, 255));
        lblGender.setText("Gender:");
        kGradientPanel1.add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 74, 41));

        lblHeight.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblHeight.setForeground(new java.awt.Color(255, 255, 255));
        lblHeight.setText("Height(in cms):");
        kGradientPanel1.add(lblHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

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

        txtWeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtWeightKeyReleased(evt);
            }
        });
        kGradientPanel1.add(txtWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 150, 20));

        lblWeight.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblWeight.setForeground(new java.awt.Color(255, 255, 255));
        lblWeight.setText("Weight(in kgs):");
        kGradientPanel1.add(lblWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 121, 39));

        lblHealthIssues.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblHealthIssues.setForeground(new java.awt.Color(255, 255, 255));
        lblHealthIssues.setText("Health Issues");
        kGradientPanel1.add(lblHealthIssues, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, -1, -1));

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

        chkbxThyroid.setForeground(new java.awt.Color(255, 255, 255));
        chkbxThyroid.setText("Thyroid");
        chkbxThyroid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbxThyroidActionPerformed(evt);
            }
        });
        kGradientPanel1.add(chkbxThyroid, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, -1, -1));

        lblWeightTick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/tick.png"))); // NOI18N
        kGradientPanel1.add(lblWeightTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 40, 30));

        lblCityTick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/tick.png"))); // NOI18N
        kGradientPanel1.add(lblCityTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 30, 30));

        lblZipCodeTick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/tick.png"))); // NOI18N
        kGradientPanel1.add(lblZipCodeTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 30, 30));

        combxNetwork.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        combxNetwork.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        kGradientPanel1.add(combxNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 140, 20));

        lblNameValidation.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblNameValidation.setForeground(new java.awt.Color(255, 0, 0));
        lblNameValidation.setText(" Only Alphabets are allowed.");
        kGradientPanel1.add(lblNameValidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 190, 20));

        lblPasswordValidation.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblPasswordValidation.setForeground(new java.awt.Color(255, 0, 0));
        lblPasswordValidation.setText("Sample format: Asdf@1");
        kGradientPanel1.add(lblPasswordValidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 160, 20));

        lblHeightValidation.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblHeightValidation.setForeground(new java.awt.Color(255, 0, 0));
        lblHeightValidation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeightValidation.setText("Invalid Height");
        kGradientPanel1.add(lblHeightValidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 160, 20));

        lblWeightValidation.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblWeightValidation.setForeground(new java.awt.Color(255, 0, 0));
        lblWeightValidation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWeightValidation.setText("Invalid Weight");
        kGradientPanel1.add(lblWeightValidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 160, 20));

        lblAgeBandValidation.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblAgeBandValidation.setForeground(new java.awt.Color(255, 0, 0));
        lblAgeBandValidation.setText("Age Should be between 15-85");
        kGradientPanel1.add(lblAgeBandValidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, -1, 20));

        invalidAgeLbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        invalidAgeLbl.setForeground(new java.awt.Color(255, 0, 0));
        invalidAgeLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        invalidAgeLbl.setText("Invalid Age.");
        kGradientPanel1.add(invalidAgeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 150, 20));

        lblAddressValidation.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblAddressValidation.setForeground(new java.awt.Color(255, 0, 0));
        lblAddressValidation.setText("Only Alphabets, Numbers, '#/-' are allowed");
        kGradientPanel1.add(lblAddressValidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 250, 20));

        lblCityValidation.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblCityValidation.setForeground(new java.awt.Color(255, 0, 0));
        lblCityValidation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCityValidation.setText("Only Alphabets are allowed");
        kGradientPanel1.add(lblCityValidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 160, 20));

        lblZipCodeValidation.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblZipCodeValidation.setForeground(new java.awt.Color(255, 0, 0));
        lblZipCodeValidation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblZipCodeValidation.setText("Only Numbers Allowed");
        kGradientPanel1.add(lblZipCodeValidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 160, 20));

        btnSave.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 106, 51));

        btnUpdate.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 106, 51));

        btnOperations.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnOperations.setText("Operations");
        btnOperations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOperationsActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnOperations, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, -1, 51));

        btnOrder.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btnOrder.setText("Orders");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 480, 106, 51));

        lblNameTick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/tick.png"))); // NOI18N
        kGradientPanel1.add(lblNameTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 30, 30));

        lblHeightTick.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHeightTick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/tick.png"))); // NOI18N
        kGradientPanel1.add(lblHeightTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 30, 30));

        lblPasswordTick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/tick.png"))); // NOI18N
        kGradientPanel1.add(lblPasswordTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 30, 30));

        lblAgeTick1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/tick.png"))); // NOI18N
        kGradientPanel1.add(lblAgeTick1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 30, 30));

        lblAddressTick1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/tick.png"))); // NOI18N
        kGradientPanel1.add(lblAddressTick1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 30, 30));

        lblCityTick1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/tick.png"))); // NOI18N
        kGradientPanel1.add(lblCityTick1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 30, 30));

        lblZipCodeTick1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/tick.png"))); // NOI18N
        kGradientPanel1.add(lblZipCodeTick1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 30, 30));

        lblWeightTick1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/tick.png"))); // NOI18N
        kGradientPanel1.add(lblWeightTick1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 40, 30));

        btnGraph.setFont(new java.awt.Font("Helvetica Neue", 1, 11)); // NOI18N
        btnGraph.setText("Graph");
        btnGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraphActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnGraph, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 110, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        try
        {
        if (!checkNamePattern(txtName.getText()) && !(txtName.getText().isEmpty())){
            lblNameValidation.setVisible(true);
            lblNameTick.setVisible(false);

        }else if(txtName.getText().isEmpty()){
            lblNameValidation.setVisible(false);
            lblNameTick.setVisible(false);
        }else{
            lblNameValidation.setVisible(false);
            lblNameTick.setVisible(true);
        }
        }
         catch(Exception e)
        {
             JOptionPane.showMessageDialog(this, "Please try again");
        }
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased
        // TODO add your handling code here:
        try
        {
        int age=0;
        try{
            age = Integer.parseInt(txtAge.getText());
        }catch(NumberFormatException e){
            if(!txtAge.getText().isEmpty()){
                invalidAgeLbl.setVisible(true);
                ageValid = false;

                lblAgeBandValidation.setVisible(false);
                lblAgeTick.setVisible(false);
                return;
            }else {
                invalidAgeLbl.setVisible(false);
                ageValid = false;
                lblAgeBandValidation.setVisible(false);
                lblAgeTick.setVisible(false);
                return;
            }
        }
        if(age < 15 || age > 85){
            lblAgeBandValidation.setVisible(true);
            ageValid = false;

            invalidAgeLbl.setVisible(false);
            lblAgeTick.setVisible(false);
        }else{
            invalidAgeLbl.setVisible(false);
            lblAgeBandValidation.setVisible(false);
            ageValid = true;
            lblAgeTick.setVisible(true);
        }
        }
         catch(Exception e)
        {
             JOptionPane.showMessageDialog(this, "Please try again");
        }
    }//GEN-LAST:event_txtAgeKeyReleased

    private void txtAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyReleased
        // TODO add your handling code here:
        try
        {
        if(!checkAddressPattern(txtAddress.getText()) && !(txtAddress.getText().isEmpty())){
            lblAddressTick.setVisible(false);
            lblAddressValidation.setVisible(true);
        }else if(txtAddress.getText().isEmpty()){
            lblAddressValidation.setVisible(false);
            lblAddressTick.setVisible(false);
        }else{
            lblAddressValidation.setVisible(false);
            lblAddressTick.setVisible(true);
        }
        }
         catch(Exception e)
        {
             JOptionPane.showMessageDialog(this, "Please try again");
        }
    }//GEN-LAST:event_txtAddressKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        // TODO add your handling code here:
        try
        {
        if(! checkPasswordPattern(txtPassword.getText()) && !(txtPassword.getText().isEmpty())){
            lblPasswordTick.setVisible(false);
            lblPasswordValidation.setVisible(true);

        }else if(txtPassword.getText().isEmpty()){
            lblPasswordValidation.setVisible(false);
            lblPasswordTick.setVisible(false);
        }else{
            lblPasswordValidation.setVisible(false);
            lblPasswordTick.setVisible(true);
        }
        }
         catch(Exception e)
        {
             JOptionPane.showMessageDialog(this, "Please try again");
        }
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void txtCityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCityKeyReleased
        // TODO add your handling code here:
        try
        {
        if(! checkCityPattern(txtCity.getText()) && !(txtCity.getText().isEmpty())){
            lblCityTick.setVisible(false);
            lblCityValidation.setVisible(true);

            cityValid = false;
        }else if(txtCity.getText().isEmpty()){
            lblCityTick.setVisible(false);
            lblCityValidation.setVisible(false);
            cityValid = false;
        }else{
            cityValid = true;
            lblCityValidation.setVisible(false);
            lblCityTick.setVisible(true);
        }
        }
         catch(Exception e)
        {
             JOptionPane.showMessageDialog(this, "Please try again");
        }
    }//GEN-LAST:event_txtCityKeyReleased

    private void txtZipKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZipKeyReleased
        // TODO add your handling code here:
        try
        {
        int zip=0;
        try{
            zip = Integer.parseInt(txtZip.getText());
            if(zip == 0){
                lblZipCodeValidation.setVisible(false);
                lblZipCodeTick.setVisible(false);
                zipValid = false;
            }
            zipValid = true;
            lblZipCodeTick.setVisible(true);
            lblZipCodeValidation.setVisible(false);
            return;
        }catch(NumberFormatException e){
            if(!txtZip.getText().isEmpty()){
                zipValid = false;
                lblZipCodeTick.setVisible(false);
                lblZipCodeValidation.setVisible(true);
                return;
            }else {
                zipValid = false;
                lblZipCodeValidation.setVisible(false);
                lblZipCodeTick.setVisible(false);
                return;
            }
        }
        }
         catch(Exception e)
        {
             JOptionPane.showMessageDialog(this, "Please try again");
        }
    }//GEN-LAST:event_txtZipKeyReleased

    private void radioFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFemaleActionPerformed
        //  radioMale.setEnabled(false);
        radioMale.setSelected(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_radioFemaleActionPerformed

    private void radioMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMaleActionPerformed
        // radioFemale.setEnabled(false);
        radioFemale.setSelected(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMaleActionPerformed

    private void txtHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHeightActionPerformed

    private void txtHeightKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHeightKeyReleased
        // TODO add your handling code here:
        try
        {
        int height=0;
        if(txtHeight.getText().isEmpty()){
            lblHeightTick.setVisible(false);
            lblHeightValidation.setVisible(false);
        }
        try{
            height = Integer.parseInt(txtHeight.getText());
        }catch(NumberFormatException e){
            if(!txtHeight.getText().isEmpty()){
                heightValid = false;
                lblHeightTick.setVisible(false);
                lblHeightValidation.setVisible(true);
                return;
            }else {
                heightValid = false;
                lblHeightValidation.setVisible(false);
                lblHeightTick.setVisible(false);
                return;
            }
        }
        if(txtHeight.getText().length() > 3 || txtHeight.getText().length() < 3){
            heightValid = false;
            lblHeightValidation.setVisible(true);
            lblHeightTick.setVisible(false);
        }else{
            heightValid = true;
            lblHeightValidation.setVisible(false);
            lblHeightTick.setVisible(true);
        }
        }
         catch(Exception e)
        {
             JOptionPane.showMessageDialog(this, "Please try again");
        }
    }//GEN-LAST:event_txtHeightKeyReleased

    private void txtWeightKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWeightKeyReleased
        // TODO add your handling code here:
        try
        {
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
                lblWeightTick.setVisible(false);
                lblWeightValidation.setVisible(true);
                return;
            }else {
                weightValid = false;
                lblWeightValidation.setVisible(false);
                lblWeightTick.setVisible(false);
                return;
            }
        }
        if(weight > 200){
            weightValid = false;
            lblWeightValidation.setVisible(true);
            lblWeightTick.setVisible(false);
        }else{
            weightValid = true;
            lblWeightValidation.setVisible(false);
            lblWeightTick.setVisible(true);
        }
        }
         catch(Exception e)
        {
             JOptionPane.showMessageDialog(this, "Please try again");
        }
    }//GEN-LAST:event_txtWeightKeyReleased

    private void chkbxNoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkbxNoneMouseClicked
        // TODO add your handling code here:
        chkbxDiabetes.setSelected(false);
        chkbxCholestrol.setSelected(false);
        chkbxHypertension.setSelected(false);
        chkbxPCOS.setSelected(false);
        chkbxThyroid.setSelected(false);
    }//GEN-LAST:event_chkbxNoneMouseClicked

    private void chkbxNoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxNoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbxNoneActionPerformed

    private void chkbxDiabetesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkbxDiabetesMouseClicked
        // TODO add your handling code here:
        chkbxNone.setSelected(false);
    }//GEN-LAST:event_chkbxDiabetesMouseClicked

    private void chkbxDiabetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxDiabetesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbxDiabetesActionPerformed

    private void chkbxCholestrolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkbxCholestrolMouseClicked
        // TODO add your handling code here:
        chkbxNone.setSelected(false);
    }//GEN-LAST:event_chkbxCholestrolMouseClicked

    private void chkbxCholestrolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxCholestrolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbxCholestrolActionPerformed

    private void chkbxHypertensionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkbxHypertensionMouseClicked
        // TODO add your handling code here:
        chkbxNone.setSelected(false);
    }//GEN-LAST:event_chkbxHypertensionMouseClicked

    private void chkbxHypertensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxHypertensionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbxHypertensionActionPerformed

    private void chkbxPCOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkbxPCOSMouseClicked
        // TODO add your handling code here:
        chkbxNone.setSelected(false);
    }//GEN-LAST:event_chkbxPCOSMouseClicked

    private void chkbxPCOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxPCOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbxPCOSActionPerformed

    private void chkbxThyroidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxThyroidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbxThyroidActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        try
        {
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
            system.getUserAccountList().updateUserAccount(userAccount, password);
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
            clearLabels();
        }else {
            JOptionPane.showMessageDialog(null, "Please enter all the required fields correctly!","Error",JOptionPane.ERROR_MESSAGE);
        }
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(this, "Please try again");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try
        {
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
        }
         catch(Exception e)
        {
             JOptionPane.showMessageDialog(this, "Please try again");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnOperationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOperationsActionPerformed
        try
        {
        CustomerOperationsPanel customerOperationsPanel  = new CustomerOperationsPanel(userProcessContainer,customer,system,userAccount,enterprise, network);
        userProcessContainer.add("CustomerAnalysisJPanel",customerOperationsPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
         catch(Exception e)
        {
             JOptionPane.showMessageDialog(this, "Please try again");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOperationsActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
        try
        {
        CustomerOrderPanel placeOrder =new CustomerOrderPanel(userProcessContainer,customer,system,userAccount,enterprise, network);
        userProcessContainer.add("CustomerAnalysisJPanel",placeOrder);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
         catch(Exception e)
        {
             JOptionPane.showMessageDialog(this, "Please try again");
        }
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraphActionPerformed
        // TODO add your handling code here:
        try
        {
        CustomerGraph customergraph  = new CustomerGraph(userProcessContainer,customer,system,userAccount,enterprise, network);
        userProcessContainer.add("customergraph",customergraph);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
         catch(Exception e)
        {
             JOptionPane.showMessageDialog(this, "Please try again");
        }
    }//GEN-LAST:event_btnGraphActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGraph;
    private javax.swing.JButton btnOperations;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JCheckBox chkbxCholestrol;
    private javax.swing.JCheckBox chkbxDiabetes;
    private javax.swing.JCheckBox chkbxHypertension;
    private javax.swing.JCheckBox chkbxNone;
    private javax.swing.JCheckBox chkbxPCOS;
    private javax.swing.JCheckBox chkbxThyroid;
    private javax.swing.JComboBox combxNetwork;
    private javax.swing.JLabel invalidAgeLbl;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAddressTick;
    private javax.swing.JLabel lblAddressTick1;
    private javax.swing.JLabel lblAddressValidation;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblAgeBandValidation;
    private javax.swing.JLabel lblAgeTick;
    private javax.swing.JLabel lblAgeTick1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCityTick;
    private javax.swing.JLabel lblCityTick1;
    private javax.swing.JLabel lblCityValidation;
    private javax.swing.JLabel lblCustomerRegistration;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHealthIssues;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblHeightTick;
    private javax.swing.JLabel lblHeightValidation;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNameTick;
    private javax.swing.JLabel lblNameValidation;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPasswordTick;
    private javax.swing.JLabel lblPasswordValidation;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JLabel lblWeightTick;
    private javax.swing.JLabel lblWeightTick1;
    private javax.swing.JLabel lblWeightValidation;
    private javax.swing.JLabel lblZip;
    private javax.swing.JLabel lblZipCodeTick;
    private javax.swing.JLabel lblZipCodeTick1;
    private javax.swing.JLabel lblZipCodeValidation;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtWeight;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables
}
