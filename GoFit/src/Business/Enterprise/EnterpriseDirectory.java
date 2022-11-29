/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Harshada
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;
    
     public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
     }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Diet) {
            enterprise = new EnterpriseDiet(name);
            enterpriseList.add(enterprise);
        }
        if (type == Enterprise.EnterpriseType.Trainer) {
            enterprise = new EnterpriseGymTrainer(name);
            enterpriseList.add(enterprise);
        }
        if (type == Enterprise.EnterpriseType.Doctor) {
            enterprise = new EnterpriseDoctor(name);
            enterpriseList.add(enterprise);
        }
        if (type == Enterprise.EnterpriseType.PersonalCoach) {
            enterprise = new EnterprisePersonalCoach(name);
            enterpriseList.add(enterprise);
        }
        if (type == Enterprise.EnterpriseType.Pharmacist) {
            enterprise = new EnterprisePharmacist(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }

}
