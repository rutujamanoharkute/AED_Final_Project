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

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
       public Customer createCustomer(Customer customer){
        //Customer customer = new Customer();
        //customer.setName(name);
        customerList.add(customer);
        return customer;
    }
    
    public void removeCustomer(Customer c){
        customerList.remove(c);
    }
    public boolean checkUsernameIsUnique(String email){
        for (Customer e : customerList){
            if (e.getEmail().equals(email))
                return false;
        }
        return true;
    }
}
