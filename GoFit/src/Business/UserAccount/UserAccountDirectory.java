/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import Business.Customer.Customer;
import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Harshada
 */
public class UserAccountDirectory {

    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        this.userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(ArrayList<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }

    public UserAccount createUserAccount(String username, String password, Employee employee, Role role) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }

    public UserAccount authenticateUser(String username, String password) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }

    public boolean checkIfUsernameUnique(String username) {
        for (UserAccount user : userAccountList) {
            if (user.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }

    public void deleteUserAccount(UserAccount ua) {
        userAccountList.remove(ua);
    }

    public UserAccount createCustomerAccount(String username, String password, Customer customer, Role role) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        //userAccount.setEmployee(employee);
        userAccount.setCustomer(customer);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }

    // Update User Account
    public UserAccount updateUserAccount(UserAccount userAccount, String password) {
        userAccount.setPassword(password);
        return userAccount;
    }

}
