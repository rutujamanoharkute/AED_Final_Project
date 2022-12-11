/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.Enterprise.Products;
import java.util.ArrayList;

/**
 *
 * @author rutujakute
 */
public class StoreOutletWorkRequest extends WorkRequest {
    private ArrayList<Products> customerList;
    private String customerMessage;
    private int totalBill=0;

    public StoreOutletWorkRequest() {
        
    
    } 

    public ArrayList<Products> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Products> customerList) {
        this.customerList = customerList;
    }

    public String getCustomerMessage() {
        return customerMessage;
    }

    public void setCustomerMessage(String customerMessage) {
        this.customerMessage = customerMessage;
    }
  
    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }
}
