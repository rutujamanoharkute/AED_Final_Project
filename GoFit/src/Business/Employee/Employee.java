/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Employee;

import java.util.Random;

/**
 *
 * @author Harshada
 */
public class Employee {
    
    private String employeeName;
    private int empId;
    
    public Employee() {
        Random random = new Random();
        empId = random.nextInt();
    }
    

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
        @Override
    public String toString() {
        return employeeName;
    }
    
}
