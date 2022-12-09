/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.DeliveryMan;
import Business.Role.Role;
import Business.Role.Trainer;
import java.util.ArrayList;

/**
 *
 * @author Harshada
 */
public class DeliveryOrganization extends Organization {

    DeliveryOrganization() {
         super(Organization.Type.Delivery.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DeliveryMan());
        System.out.println(roles);
        return roles;
    }
    
}
