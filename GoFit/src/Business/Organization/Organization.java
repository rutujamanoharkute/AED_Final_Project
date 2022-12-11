/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Customer.CustomerDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Harshada
 */
public abstract class Organization {

    private String name;
    private int organizationId;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeList;
    private UserAccountDirectory userAccountList;
    private CustomerDirectory customerDirectory;

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public Organization(String name) {
        this.name = name;
        this.employeeList = new EmployeeDirectory();
        this.userAccountList = new UserAccountDirectory();
        this.workQueue = new WorkQueue();
        customerDirectory = new CustomerDirectory();
        Random r = new Random();
        organizationId = r.nextInt();
    }

    public enum Type {
        Admin("Admin Organization"),
        Nutritionist("Nutritionist Organization"),
        Cardiologist("Cardiologist Organization"),
        Psychiatrist("Psychiatrist Organization"),
        PersonalCoach("PersonalCoach Organization"),
        GymTrainer("Gym Trainer Organization"),
        Physiotherapist("Physiotherapist Organization "),
        StoreOutlet("StoreOutlet Organization "),
        Delivery("DeliveryMan Organization"),
        Doctor("Doctor Organization");

        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public int getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(int organizationId) {
        this.organizationId = organizationId;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public EmployeeDirectory getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(EmployeeDirectory employeeList) {
        this.employeeList = employeeList;
    }

    public UserAccountDirectory getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(UserAccountDirectory userAccountList) {
        this.userAccountList = userAccountList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public abstract ArrayList<Role> getSupportedRole();

}
