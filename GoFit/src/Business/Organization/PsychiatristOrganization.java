/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.Psychiatrist;
import Business.Role.Role;
import Business.Role.Trainer;
import java.util.ArrayList;

/**
 *
 * @author Harshada
 */
public class PsychiatristOrganization extends Organization {

    PsychiatristOrganization() {
         super(Organization.Type.Psychiatrist.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Psychiatrist());
        return roles;
    }
    
}
