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

/**
 *
 * @author Harshada
 */
public abstract class Role {
      
        public enum RoleType{
        Admin("Admin"),
        Customer("Customer"),
        Doctor("Doctor"),
        Trainer("Trainer"),
        PersonalCoach("PersonalCoach"),
        Nutritionist("Nutritionist"),
        Physiotherapist("Physiotherapist"),
        DeliveryMan("DeliveryMan"),
        Pharmacist("Store Manager");
               
      private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
        
        public abstract JPanel createWorkArea(JPanel userProcessContainer,  
            Enterprise enterprise, 
            Organization organization,
            UserAccount account, 
            Ecosystem business,
            Network network);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
