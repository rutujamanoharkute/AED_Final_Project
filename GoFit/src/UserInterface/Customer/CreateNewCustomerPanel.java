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
import static UserInterface.MainJFrame.ACCOUNT_SID;
import static UserInterface.MainJFrame.AUTH_TOKEN;
import com.twilio.Twilio;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
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
        this.system = system;
        this.organization = organization;
        clearLabels();
        populateCombxNetwork();

    }

    private void clearLabels() {
        try{
        // Labels initialzed to false
        lblAgeTick.setVisible(false);
        invalidAgeLbl.setVisible(false);
        lblConfirmPasswordTick.setVisible(false);
        lblConfirmPasswordValidation.setVisible(false);
        lblAddressValidation.setVisible(false);
        lblCityValidation.setVisible(false);
        lblCityTick.setVisible(false);
        zipLbl.setVisible(false);
        lblZipCodeTick.setVisible(false);
        lblNameValidation.setVisible(false);
        lblHeightTick.setVisible(false);
        lblWeightValidation.setVisible(false);
        lblNameTick.setVisible(false);
        lblEmailValidation.setVisible(false);
        lblEmailAlreadyValidation.setVisible(false);
        lblEmailTick.setVisible(false);
        lblPasswordTick.setVisible(false);
        lblAgeBandValidation.setVisible(false);
        lblAddressTick.setVisible(false);
        lblPasswordValidation.setVisible(false);
        lblHeightValidation.setVisible(false);
        lblWeightTick.setVisible(false);
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(this, "Please try again");
        }
    }

    private void populateCombxNetwork() {
        
        try{
        combxNetwork.removeAllItems();

        for (Network network : system.getNetworkList()) {
            combxNetwork.addItem(network);
        }

         }
        catch(Exception e){
             JOptionPane.showMessageDialog(this, "Please try again");
        }
    }

    private boolean checkNamePattern(String val1) {
        
        Pattern p = Pattern.compile("^[a-zA-Z]+$");
        Matcher m = p.matcher(val1);
        boolean b = m.matches();
        return b;
        
    }

    private boolean checkNumberPattern(String val5) {
        Pattern p = Pattern.compile("^[0-9]$");
        Matcher m = p.matcher(val5);
        boolean b = m.matches();
        return b;
    }

    private boolean checkAddressPattern(String val2) {
        Pattern p = Pattern.compile("^[a-z A-Z 0-9#/-]+$");
        Matcher m = p.matcher(val2);
        boolean b = m.matches();
        return b;
    }

    private boolean checkPasswordPattern(String val4) {
        Pattern p1;
        p1 = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m1 = p1.matcher(String.valueOf(val4));
        boolean b1 = m1.matches();
        return b1;
    }

    private boolean checkCityPattern(String val3) {
        Pattern p = Pattern.compile("^[a-zA-Z]+$");
        Matcher m = p.matcher(val3);
        boolean b = m.matches();
        return b;
    }

    private boolean checkUserNamePattern(String val) {
        Pattern p = Pattern.compile("^[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
        Matcher m = p.matcher(val);
        boolean b = m.matches();
        return b;
    }

    private void clearValues() {
        txtName.setText("");
        txtEmail.setText("");
        txtPassword.setText("");
        txtConfirmPassword.setText("");
        txtAge.setText("");
        txtAddress.setText("");
        txtCity.setText("");
        try {
            combxNetwork.setSelectedIndex(0);
        } catch (Exception e) {

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
        lblNameTick.setVisible(false);
        lblEmailTick.setVisible(false);
        lblPasswordTick.setVisible(false);
        lblConfirmPasswordTick.setVisible(false);
        lblAgeTick.setVisible(false);
        lblAddressTick.setVisible(false);
        lblCityTick.setVisible(false);
        lblZipCodeTick.setVisible(false);
        lblHeightTick.setVisible(false);
        lblWeightTick.setVisible(false);
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
        lblNameTick = new javax.swing.JLabel();
        lblEmailTick = new javax.swing.JLabel();
        lblPasswordTick = new javax.swing.JLabel();
        lblConfirmPasswordTick = new javax.swing.JLabel();
        lblHeightTick = new javax.swing.JLabel();
        lblWeightTick = new javax.swing.JLabel();
        lblAgeTick = new javax.swing.JLabel();
        lblAddressTick = new javax.swing.JLabel();
        lblCityTick = new javax.swing.JLabel();
        lblZipCodeTick = new javax.swing.JLabel();
        lblNameValidation = new javax.swing.JLabel();
        lblEmailValidation = new javax.swing.JLabel();
        lblEmailAlreadyValidation = new javax.swing.JLabel();
        lblPasswordValidation = new javax.swing.JLabel();
        lblConfirmPasswordValidation = new javax.swing.JLabel();
        lblHeightValidation = new javax.swing.JLabel();
        lblWeightValidation = new javax.swing.JLabel();
        lblAgeBandValidation = new javax.swing.JLabel();
        invalidAgeLbl = new javax.swing.JLabel();
        lblAddressValidation = new javax.swing.JLabel();
        lblCityValidation = new javax.swing.JLabel();
        zipLbl = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 602, 1066, -1));

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 204, 204));
        kGradientPanel1.setkGradientFocus(1000);
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 153, 0));
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

        lblNameTick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/tick.png"))); // NOI18N
        kGradientPanel1.add(lblNameTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 30, 30));

        lblEmailTick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/tick.png"))); // NOI18N
        kGradientPanel1.add(lblEmailTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 30, 30));

        lblPasswordTick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/tick.png"))); // NOI18N
        kGradientPanel1.add(lblPasswordTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 30, 30));

        lblConfirmPasswordTick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/tick.png"))); // NOI18N
        kGradientPanel1.add(lblConfirmPasswordTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 30, 30));

        lblHeightTick.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHeightTick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/tick.png"))); // NOI18N
        kGradientPanel1.add(lblHeightTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 30, 30));

        lblWeightTick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/tick.png"))); // NOI18N
        kGradientPanel1.add(lblWeightTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 40, 30));

        lblAgeTick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/tick.png"))); // NOI18N
        kGradientPanel1.add(lblAgeTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 30, 30));

        lblAddressTick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/tick.png"))); // NOI18N
        kGradientPanel1.add(lblAddressTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 30, 30));

        lblCityTick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/tick.png"))); // NOI18N
        kGradientPanel1.add(lblCityTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 30, 30));

        lblZipCodeTick.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/images/tick.png"))); // NOI18N
        kGradientPanel1.add(lblZipCodeTick, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 30, 30));

        lblNameValidation.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblNameValidation.setForeground(new java.awt.Color(255, 0, 0));
        lblNameValidation.setText(" Only Alphabets are allowed.");
        kGradientPanel1.add(lblNameValidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 190, 20));

        lblEmailValidation.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblEmailValidation.setForeground(new java.awt.Color(255, 0, 0));
        lblEmailValidation.setText("Valid Format - 'xx@xx.xx'");
        kGradientPanel1.add(lblEmailValidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 150, 20));

        lblEmailAlreadyValidation.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblEmailAlreadyValidation.setForeground(new java.awt.Color(255, 0, 0));
        lblEmailAlreadyValidation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmailAlreadyValidation.setText("EmailID already Exists");
        kGradientPanel1.add(lblEmailAlreadyValidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 160, 20));

        lblPasswordValidation.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblPasswordValidation.setForeground(new java.awt.Color(255, 0, 0));
        lblPasswordValidation.setText("Sample format: Asdf@1");
        kGradientPanel1.add(lblPasswordValidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 160, 20));

        lblConfirmPasswordValidation.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblConfirmPasswordValidation.setForeground(new java.awt.Color(255, 0, 0));
        lblConfirmPasswordValidation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConfirmPasswordValidation.setText("Password Not Matching");
        kGradientPanel1.add(lblConfirmPasswordValidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 160, 20));

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
        kGradientPanel1.add(lblAddressValidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 250, 20));

        lblCityValidation.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        lblCityValidation.setForeground(new java.awt.Color(255, 0, 0));
        lblCityValidation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCityValidation.setText("Only Alphabets are allowed");
        kGradientPanel1.add(lblCityValidation, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 160, 20));

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

        add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -4, 830, 610));
    }// </editor-fold>//GEN-END:initComponents

    private void kGradientPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MouseClicked
        // TODO add your handling code here:
        chkbxNone.setSelected(false);
    }//GEN-LAST:event_kGradientPanel1MouseClicked

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

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        // TODO add your handling code here:
        try
        {
        if (!checkPasswordPattern(txtPassword.getText()) && !(txtPassword.getText().isEmpty())) {
            lblPasswordTick.setVisible(false);
            lblPasswordValidation.setVisible(true);

        } else if (txtPassword.getText().isEmpty()) {
            lblPasswordValidation.setVisible(false);
            lblPasswordTick.setVisible(false);
        } else {
            lblPasswordValidation.setVisible(false);
            lblPasswordTick.setVisible(true);
        }
        }
          catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Please try again");
        }
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void txtAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyReleased
        // TODO add your handling code here:
        try{
        if (!checkAddressPattern(txtAddress.getText()) && !(txtAddress.getText().isEmpty())) {
            lblAddressTick.setVisible(false);
            lblAddressValidation.setVisible(true);
        } else if (txtAddress.getText().isEmpty()) {
            lblAddressValidation.setVisible(false);
            lblAddressTick.setVisible(false);
        } else {
            lblAddressValidation.setVisible(false);
            lblAddressTick.setVisible(true);
        }
         }
        catch(Exception e){
             JOptionPane.showMessageDialog(this, "Please try again");
        }
    }//GEN-LAST:event_txtAddressKeyReleased

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased
        // TODO add your handling code here:
        try{
        int age = 0;
        try {
            age = Integer.parseInt(txtAge.getText());
        } catch (NumberFormatException e) {
            if (!txtAge.getText().isEmpty()) {
                invalidAgeLbl.setVisible(true);
                ageValid = false;

                lblAgeBandValidation.setVisible(false);
                lblAgeTick.setVisible(false);
                return;
            } else {
                invalidAgeLbl.setVisible(false);
                ageValid = false;
                lblAgeBandValidation.setVisible(false);
                lblAgeTick.setVisible(false);
                return;
            }
        }
        if (age < 15 || age > 85) {
            lblAgeBandValidation.setVisible(true);
            ageValid = false;

            invalidAgeLbl.setVisible(false);
            lblAgeTick.setVisible(false);
        } else {
            invalidAgeLbl.setVisible(false);
            lblAgeBandValidation.setVisible(false);
            ageValid = true;
            lblAgeTick.setVisible(true);
        }
         }
        catch(Exception e){
             JOptionPane.showMessageDialog(this, "Please try again");
        }
    }//GEN-LAST:event_txtAgeKeyReleased

    private void txtCityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCityKeyReleased
        // TODO add your handling code here:
        try{
        if (!checkCityPattern(txtCity.getText()) && !(txtCity.getText().isEmpty())) {
            lblCityTick.setVisible(false);
            lblCityValidation.setVisible(true);

            cityValid = false;
        } else if (txtCity.getText().isEmpty()) {
            lblCityTick.setVisible(false);
            lblCityValidation.setVisible(false);
            cityValid = false;
        } else {
            cityValid = true;
            lblCityValidation.setVisible(false);
            lblCityTick.setVisible(true);
        }
         }
        catch(Exception e){
             JOptionPane.showMessageDialog(this, "Please try again");
        }
    }//GEN-LAST:event_txtCityKeyReleased

    private void txtZipKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZipKeyReleased
        // TODO add your handling code here:
        try{
        int zip = 0;
        try {
            zip = Integer.parseInt(txtZip.getText());
            if (zip == 0) {
                zipLbl.setVisible(false);
                lblZipCodeTick.setVisible(false);
                zipValid = false;
            }
            zipValid = true;
            lblZipCodeTick.setVisible(true);
            zipLbl.setVisible(false);
            return;
        } catch (NumberFormatException e) {
            if (!txtZip.getText().isEmpty()) {
                zipValid = false;
                lblZipCodeTick.setVisible(false);
                zipLbl.setVisible(true);
                return;
            } else {
                zipValid = false;
                zipLbl.setVisible(false);
                lblZipCodeTick.setVisible(false);
                return;
            }
        }
         }
        catch(Exception e){
             JOptionPane.showMessageDialog(this, "Please try again");
        }
    }//GEN-LAST:event_txtZipKeyReleased

    private void txtWeightKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWeightKeyReleased
        // TODO add your handling code here:
        try{
        int weight = 0;
        if (txtWeight.getText().isEmpty()) {
            //        weightSuccessLbl.setVisible(false);
            //             weightLbl.setVisible(false);
        }
        try {
            weight = Integer.parseInt(txtWeight.getText());
        } catch (NumberFormatException e) {
            if (!txtWeight.getText().isEmpty()) {
                weightValid = false;
                lblWeightTick.setVisible(false);
                lblWeightValidation.setVisible(true);
                return;
            } else {
                weightValid = false;
                lblWeightValidation.setVisible(false);
                lblWeightTick.setVisible(false);
                return;
            }
        }
        if (weight > 200) {
            weightValid = false;
            lblWeightValidation.setVisible(true);
            lblWeightTick.setVisible(false);
        } else {
            weightValid = true;
            lblWeightValidation.setVisible(false);
            lblWeightTick.setVisible(true);
        }
         }
        catch(Exception e){
             JOptionPane.showMessageDialog(this, "Please try again");
        }
    }//GEN-LAST:event_txtWeightKeyReleased

    private void txtConfirmPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmPasswordKeyReleased
        // TODO add your handling code here:
        try{

        if (txtConfirmPassword.getText().equals(txtPassword.getText()) && !txtConfirmPassword.getText().isEmpty()) {
            lblConfirmPasswordTick.setVisible(true);
            lblConfirmPasswordValidation.setVisible(false);
        } else if (txtConfirmPassword.getText().isEmpty()) {
            lblConfirmPasswordValidation.setVisible(false);
            lblConfirmPasswordTick.setVisible(false);
        } else {
            lblConfirmPasswordValidation.setVisible(true);
            lblConfirmPasswordTick.setVisible(false);
        }
         }
        catch(Exception e){
             JOptionPane.showMessageDialog(this, "Please try again");
        }
    }//GEN-LAST:event_txtConfirmPasswordKeyReleased

    private void txtHeightKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHeightKeyReleased
        // TODO add your handling code here:
        try{
        int height = 0;
        if (txtHeight.getText().isEmpty()) {
            lblHeightTick.setVisible(false);
            lblHeightValidation.setVisible(false);
        }
        try {
            height = Integer.parseInt(txtHeight.getText());
        } catch (NumberFormatException e) {
            if (!txtHeight.getText().isEmpty()) {
                heightValid = false;
                lblHeightTick.setVisible(false);
                lblHeightValidation.setVisible(true);
                return;
            } else {
                heightValid = false;
                lblHeightValidation.setVisible(false);
                lblHeightTick.setVisible(false);
                return;
            }
        }
        if (txtHeight.getText().length() > 3 || txtHeight.getText().length() < 3) {
            heightValid = false;
            lblHeightValidation.setVisible(true);
            lblHeightTick.setVisible(false);
        } else {
            heightValid = true;
            lblHeightValidation.setVisible(false);
            lblHeightTick.setVisible(true);
        }
         }
        catch(Exception e){
             JOptionPane.showMessageDialog(this, "Please try again");
        }
    }//GEN-LAST:event_txtHeightKeyReleased

    private void txtHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHeightActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        try{
        if (!checkNamePattern(txtName.getText()) && !(txtName.getText().isEmpty())) {
            lblNameValidation.setVisible(true);
            lblNameTick.setVisible(false);

        } else if (txtName.getText().isEmpty()) {
            lblNameValidation.setVisible(false);
            lblNameTick.setVisible(false);
        } else {
            lblNameValidation.setVisible(false);
            lblNameTick.setVisible(true);
        }
         }
        catch(Exception e){
             JOptionPane.showMessageDialog(this, "Please try again");
        }
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void chkbxThyroidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxThyroidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbxThyroidActionPerformed

    private void chkbxCholestrolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxCholestrolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbxCholestrolActionPerformed

    private void chkbxCholestrolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkbxCholestrolMouseClicked
        // TODO add your handling code here:
        chkbxNone.setSelected(false);
    }//GEN-LAST:event_chkbxCholestrolMouseClicked

    private void chkbxPCOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxPCOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbxPCOSActionPerformed

    private void chkbxPCOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkbxPCOSMouseClicked
        // TODO add your handling code here:
        chkbxNone.setSelected(false);
    }//GEN-LAST:event_chkbxPCOSMouseClicked

    private void chkbxDiabetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxDiabetesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbxDiabetesActionPerformed

    private void chkbxDiabetesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkbxDiabetesMouseClicked
        // TODO add your handling code here:
        chkbxNone.setSelected(false);
    }//GEN-LAST:event_chkbxDiabetesMouseClicked

    private void chkbxNoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxNoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbxNoneActionPerformed

    private void chkbxNoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkbxNoneMouseClicked
        // TODO add your handling code here:
        try{
        chkbxDiabetes.setSelected(false);
        chkbxCholestrol.setSelected(false);
        chkbxHypertension.setSelected(false);
        chkbxPCOS.setSelected(false);
        chkbxThyroid.setSelected(false);
         }
        catch(Exception e){
             JOptionPane.showMessageDialog(this, "Please try again");
        }
    }//GEN-LAST:event_chkbxNoneMouseClicked

    private void chkbxHypertensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbxHypertensionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkbxHypertensionActionPerformed

    private void chkbxHypertensionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkbxHypertensionMouseClicked
        // TODO add your handling code here:
        chkbxNone.setSelected(false);
    }//GEN-LAST:event_chkbxHypertensionMouseClicked

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        try{
        if (!checkUserNamePattern(txtEmail.getText()) && !(txtEmail.getText().isEmpty()) && system.getCustomerDirectory().checkUsernameIsUnique(txtEmail.getText())) {
            lblEmailValidation.setVisible(true);
            lblEmailAlreadyValidation.setVisible(false);
            lblEmailTick.setVisible(false);
            emailValid = false;
        } else if (txtEmail.getText().isEmpty()) {
            lblEmailValidation.setVisible(false);
            lblEmailAlreadyValidation.setVisible(false);
            emailValid = false;
            lblEmailTick.setVisible(false);
        } else if (!system.getCustomerDirectory().checkUsernameIsUnique(txtEmail.getText())) {
            lblEmailAlreadyValidation.setVisible(true);
            lblEmailTick.setVisible(false);
            emailValid = false;
        } else {
            lblEmailValidation.setVisible(false);
            lblEmailAlreadyValidation.setVisible(false);
            lblEmailTick.setVisible(true);
            emailValid = true;
        }
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        try{
        Network network = (Network) combxNetwork.getSelectedItem();
        if (!chkbxNone.isSelected() && !chkbxDiabetes.isSelected() && !chkbxCholestrol.isSelected() && !chkbxHypertension.isSelected() && !chkbxPCOS.isSelected() && !chkbxThyroid.isSelected()) {
            JOptionPane.showMessageDialog(null, "Please Fill the Health Issues! If you don't have any kindly Select None!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (txtName.getText().isEmpty() || txtAge.getText().isEmpty() || txtWeight.getText().isEmpty() || txtHeight.getText().isEmpty() || txtEmail.getText().isEmpty() || txtAddress.getText().isEmpty() || txtCity.getText().isEmpty() || txtZip.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Field(s) cannot be Empty!", "Error", JOptionPane.ERROR_MESSAGE);
            return;

        } else if (ageValid && zipValid && heightValid && weightValid && emailValid) {
            String name = txtName.getText();
            String password = txtPassword.getText();
            String email = txtEmail.getText();
            String add = txtAddress.getText();
            String city = txtCity.getText();
            String gender = " ";
            if (radioMale.isSelected()) {
                gender = "Male";
            } else {
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
            system.getCustomerDirectory().createCustomer(c);
            system.getUserAccountList().createCustomerAccount(email, password, c, new CustomerRole());
            JOptionPane.showMessageDialog(null, "Customer added successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            sendEmail();
            Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
            com.twilio.rest.api.v2010.account.Message message = com.twilio.rest.api.v2010.account.Message.creator(
                    new com.twilio.type.PhoneNumber("+19145317012"),
                    new com.twilio.type.PhoneNumber("+13867031167"),
                    "You have been registerd sucessfully on GoFit!!")
                    .create();

            System.out.println(message.getSid());
            clearValues();

        } else {
            JOptionPane.showMessageDialog(null, "Please enter all the required fields correctly!", "Error", JOptionPane.ERROR_MESSAGE);
        }
         }
        catch(Exception e){
             JOptionPane.showMessageDialog(this, "Please try again");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void sendEmail() {
        
        // TODO add your handling code here:
        String toEmail = txtEmail.getText();
        String fromEmail = "goFit776@gmail.com";
        String fromEmailPassword = "ptcacpbbyrcwwssv";
        String subject = "GoFit Account Registration";

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
            msg.setText("Welcome to GoFit! You are registered successfully. Your account will be activated in a hour. Hope you have a good journey with GoFit!");
            Transport.send(msg);
            System.out.println("Sent message");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }


    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        clearValues();
        clearLabels();
    }//GEN-LAST:event_btnResetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JCheckBox chkbxCholestrol;
    private javax.swing.JCheckBox chkbxDiabetes;
    private javax.swing.JCheckBox chkbxHypertension;
    private javax.swing.JCheckBox chkbxNone;
    private javax.swing.JCheckBox chkbxPCOS;
    private javax.swing.JCheckBox chkbxThyroid;
    private javax.swing.JComboBox combxNetwork;
    private javax.swing.JLabel invalidAgeLbl;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAddressTick;
    private javax.swing.JLabel lblAddressValidation;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblAgeBandValidation;
    private javax.swing.JLabel lblAgeTick;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCityTick;
    private javax.swing.JLabel lblCityValidation;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblConfirmPasswordTick;
    private javax.swing.JLabel lblConfirmPasswordValidation;
    private javax.swing.JLabel lblCustomerRegistration;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmailAlreadyValidation;
    private javax.swing.JLabel lblEmailTick;
    private javax.swing.JLabel lblEmailValidation;
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
    private javax.swing.JLabel lblWeightValidation;
    private javax.swing.JLabel lblZip;
    private javax.swing.JLabel lblZipCodeTick;
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
    private javax.swing.JLabel zipLbl;
    // End of variables declaration//GEN-END:variables
}
