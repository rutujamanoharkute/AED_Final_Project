/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.Pharmacist;
import Business.Role.Trainer;
import java.util.ArrayList;

/**
 *
 * @author Harshada
 */
public class StoreOutletOrganization extends Organization {

    StoreOutletOrganization() {
         super(Organization.Type.StoreOutlet.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Pharmacist());
        System.out.println(roles);
        return roles;
    }
    
}
