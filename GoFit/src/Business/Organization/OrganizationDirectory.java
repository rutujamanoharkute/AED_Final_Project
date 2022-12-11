/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author Harshada
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;
    
       public OrganizationDirectory() {
        organizationList = new ArrayList();
    }
    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }
    
    public Organization addOrganization(Organization.Type type){
        Organization organization;
        organization = null;
         if (type.getValue().equals(Organization.Type.Cardiologist.getValue())){
            organization = new CardiologistOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Organization.Type.Nutritionist.getValue())){
            organization = new NutritionistOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Organization.Type.Physiotherapist.getValue())){
            organization = new PhysiotherapistOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Organization.Type.PersonalCoach.getValue())){
            organization = new PersonalCoachOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Organization.Type.Psychiatrist.getValue())){
            organization = new PsychiatristOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Organization.Type.StoreOutlet.getValue())){
            organization = new StoreOutletOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Organization.Type.GymTrainer.getValue())){
            organization = new GymTrainerOrganization();
            organizationList.add(organization);
        }
         /*TBD*/
         else if (type.getValue().equals(Organization.Type.Delivery.getValue())){
            organization = new DeliveryOrganization();
            organizationList.add(organization);
        }
        
        return organization;
    }
}
