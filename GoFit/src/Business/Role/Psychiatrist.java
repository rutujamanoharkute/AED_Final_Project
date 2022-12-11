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
import javax.swing.JPanel;
import UserInterface.Psychiatrist.PsychiatristWorkAreaJPanel;

/**
 *
 * @author Harshada
 */
public class Psychiatrist extends Role {

    @Override
    public JPanel createWorkArea(JPanel userContainer, Enterprise enterprise, Organization organization, UserAccount account, Ecosystem business, Network network) {
       return new PsychiatristWorkAreaJPanel(userContainer, enterprise, organization, account, business, network);
    }
    
}
