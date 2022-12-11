/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author rutujakute
 */
public class CustomerRequestDirectory {
    private ArrayList<CustomerRequestOrder> cusReqOrderList;

    public CustomerRequestDirectory() {
        cusReqOrderList = new ArrayList();
    }

    public ArrayList<CustomerRequestOrder> getCusReqOrderList() {
        return cusReqOrderList;
    }

    public void setCusReqOrderList(ArrayList<CustomerRequestOrder> cusReqOrderList) {
        this.cusReqOrderList = cusReqOrderList;
    } 

     public CustomerRequestOrder createOrder(){
        CustomerRequestOrder order = new CustomerRequestOrder(); 
        cusReqOrderList.add(order);
        return order;
    }
     
      public void deleteOrder(CustomerRequestOrder order){
        cusReqOrderList.remove(order); 
    }
}
