/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Employee.Employee;
import Business.Role.Admin;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Harshada
 */
public class ConfigureSystem {

    public static Ecosystem configure() {

        Ecosystem system = Ecosystem.getInstance();
        Employee employee = system.getEmployeeList().createEmployee("admin");
        UserAccount ua = system.getUserAccountList().createUserAccount("admin", "admin", employee, new Admin());
        return system;
    }
}
