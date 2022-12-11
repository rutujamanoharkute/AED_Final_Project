/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.Customer.CustomerWorkAreaPanel;
import javax.swing.JPanel;

/**
 *
 * @author Harshada
 */
public class CustomerRole extends Role {


     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Enterprise enterprise, Organization organization, UserAccount account, Ecosystem business, Network network) {
        return new CustomerWorkAreaPanel(userProcessContainer, enterprise, organization, account, business, network);
    
        
    }
    
}
