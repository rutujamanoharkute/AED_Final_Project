/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author Harshada
 */
public class CustomerDirectory {
    
    private ArrayList<Customer> customerList;
    
    public CustomerDirectory() {
        customerList = new ArrayList();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
      public boolean checkUsernameIsUnique(String email){
        for (Customer e : customerList){
            if (e.getEmail().equals(email))
                return false;
        }
        return true;
    }
     public Customer createCustomer(Customer customer){
       
        customerList.add(customer);
        return customer;
    }
    
    public void removeCustomer(Customer c){
        customerList.remove(c);
    }
      public Customer updateCustomer(Customer cus, String name, Double height, Double weight, String gender, int age, String address, String city, String zipcode, Boolean none,Boolean diabetes,Boolean cholestrol,Boolean hyper, Boolean pcos, Boolean thyroid){
        cus.setName(name);
        cus.setHeight(height);
        cus.setWeight(weight);
        cus.setGender(gender);
        cus.setAge(age);
        cus.setLocation(address);
        cus.setCity(city);
        cus.setZipcode(zipcode);
        cus.setIs_None(none);
        cus.setIs_diabetes(diabetes);
        cus.setIs_thyroid(thyroid);
        cus.setIs_hypertension(hyper);
        cus.setIs_pcos(pcos);
        cus.setIs_cholestrol(cholestrol);
        
        return cus;
    } 
    
}
