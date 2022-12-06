/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author Harshada
 */
public abstract class Enterprise extends Organization{
    private EnterpriseType enterpriseType;
    
       public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }
    private OrganizationDirectory organizationDirectory;
    
    public enum EnterpriseType{
        Trainer("Gym Trainer Enterprise"),
        DietRegime("DietRegime Enterprise"),
        Doctor("Doctor Enterprise"),
        StoreOutlet("Store Outlet Enterprise");
 
        
        private String value;
        
         private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
         
}
}
