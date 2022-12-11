/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author Harshada
 */
public abstract class Enterprise extends Organization{
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationList;
      private ArrayList<Products> productsList;

    public OrganizationDirectory getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(OrganizationDirectory organizationList) {
        this.organizationList = organizationList;
    }

    public ArrayList<Products> getProductsList() {
        return productsList;
    }

    public void setProductsList(ArrayList<Products> productsList) {
        this.productsList = productsList;
    }
    
       public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
          this.productsList = new ArrayList<>();
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
        Trainer("GymTrainer"),
        DietRegime("DietRegime"),
        Doctor("Doctor"),
        StoreOutlet("StoreOutlet");
 
        
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
    public Products createMenuItem() {
        Products item = new Products();
        this.productsList.add(item);
        return item;
    }
    
    public void deleteItem(Products product){
        this.productsList.remove(product); 
    }
}
