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
import UserInterface.EnterpriseAdmin.EnterpriseAdminOperationsPanel;
import javax.swing.JPanel;

/**
 *
 * @author Harshada
 */
public class EnterpriseAdmin extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Enterprise enterprise, Organization organization, UserAccount account, Ecosystem system, Network network) {
        return new EnterpriseAdminOperationsPanel(userProcessContainer, enterprise, organization, account, system, network);

    }

}
