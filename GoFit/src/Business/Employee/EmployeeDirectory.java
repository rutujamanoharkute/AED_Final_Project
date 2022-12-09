/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author Harshada
 */
public class EmployeeDirectory {
    

    private ArrayList<Employee> employeeList;
    
    public EmployeeDirectory()
    {
        this.employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public Employee createEmployee(String name) {
        Employee employee = new Employee();
        employee.setEmployeeName(name);
        employeeList.add(employee);
        return employee;
    }
     public boolean checkIfUsernameUnique(String name){
        for (Employee e : employeeList){
            if (e.getEmployeeName().equals(name))
                return false;
        }
        return true;
    }
    public void deleteEmployee (Employee e){
        employeeList.remove(e);
    }

}
