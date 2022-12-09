/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Harshada
 */
public class DietRegimeEnterprise extends Enterprise {

    public DietRegimeEnterprise(String name) {

        super(name, Enterprise.EnterpriseType.DietRegime);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
