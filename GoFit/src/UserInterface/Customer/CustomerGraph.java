/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Customer;

import Business.Customer.Customer;
import Business.CustomerRequestOrder;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author rutujakute
 */
public class CustomerGraph extends javax.swing.JPanel {

    /**
     * Creates new form CustomerGraph
     */
    
    private Customer customer;
    private JPanel userProcessContainer;
    private double bmi;
    private CustomerRequestOrder order;
    private UserAccount userAccount;
    private Ecosystem system;
    Enterprise e;
    private Network network;
    public CustomerGraph(JPanel userProcessContainer, Customer customer, Ecosystem system, UserAccount userAccount, Enterprise enterprise, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.customer = customer;
        this.userAccount = userAccount;
        this.system = system;
        this.network = network;
      
    }

     public int calculateBMI(){
       double heightMts = customer.getHeight()/100;
       double heightSquare = heightMts*heightMts;
       bmi = customer.getWeight()/heightSquare;
       System.out.println("BMI  " + bmi);
       String bmiStr = String.format("%.2f", bmi);
//       txtBMI.setText(String.valueOf(bmiStr));
      // txtHealthIssue.setText(customer.getHealthIssue());
      return (int) bmi;
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
        btnview = new javax.swing.JButton();
        GraphPanel = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 204, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 153, 0));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnview.setText("View");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnview, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, -1, -1));

        GraphPanel.setLayout(new java.awt.BorderLayout());
        kGradientPanel1.add(GraphPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 520, 310));

        backBtn.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        backBtn.setText(" Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        kGradientPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 810, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        // TODO add your handling code here:
        try
        {
        int bmi = calculateBMI();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(12,"", "LowestBMI");
        dataset.setValue(bmi,"", "YourBMI");
        dataset.setValue(26,"", "HighestBMI");
        
        JFreeChart chart = ChartFactory.createBarChart("BMI Comparision","" , "", dataset, PlotOrientation.VERTICAL, false, false,false);
        CategoryPlot catPlot = chart.getCategoryPlot();
        catPlot.setRangeGridlinePaint(Color.BLACK);
        
        ChartPanel chartPanel = new ChartPanel(chart);
        GraphPanel.removeAll();
        GraphPanel.add(chartPanel);
        GraphPanel.validate();
        }
         catch(Exception e)
        {
             JOptionPane.showMessageDialog(this, "Please try again");
        }
        
        
    }//GEN-LAST:event_btnviewActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        try {
            userProcessContainer.remove(this);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please try again");
        }
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GraphPanel;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnview;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
