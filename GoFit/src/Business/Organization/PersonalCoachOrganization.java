/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.PersonalCoach;
import Business.Role.Role;
import Business.Role.Trainer;
import java.util.ArrayList;

/**
 *
 * @author Harshada
 */
public class PersonalCoachOrganization extends Organization {

    PersonalCoachOrganization() {
        super(Organization.Type.PersonalCoach.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PersonalCoach());
        return roles;
    }

}
