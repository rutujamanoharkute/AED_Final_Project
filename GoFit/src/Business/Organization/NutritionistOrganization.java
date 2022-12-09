/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.Nutritionist;
import Business.Role.Role;
import Business.Role.Trainer;
import java.util.ArrayList;

/**
 *
 * @author Harshada
 */
public class NutritionistOrganization extends Organization {

    NutritionistOrganization() {
          super(Organization.Type.Nutritionist.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Nutritionist());
        return roles;
    }
    
}
