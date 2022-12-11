/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Customer;

import Business.Network.Network;

/**
 *
 * @author Harshada
 */
public class Customer {

    private int id;
    private String name;
    private String email;
    private String location;
    private int age;
    private String gender;
    private String zipcode;
    private long phoneNo;
    private String goal;
    private double weight;
    private double height;
    private Boolean is_diabetes;
    private Boolean is_physicalInjury;
    private Boolean is_pcos;
    private Boolean is_thyroid;
    private Boolean is_cholestrol;
    private boolean is_hypertension;
    private double calBMI;
    private Network network;

    public Boolean getIs_None() {
        return is_None;
    }

    public void setIs_None(Boolean is_None) {
        this.is_None = is_None;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    private Boolean is_None;
    private String city;

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Boolean getIs_diabetes() {
        return is_diabetes;
    }

    public void setIs_diabetes(Boolean is_diabetes) {
        this.is_diabetes = is_diabetes;
    }

    public Boolean getIs_physicalInjury() {
        return is_physicalInjury;
    }

    public void setIs_physicalInjury(Boolean is_physicalInjury) {
        this.is_physicalInjury = is_physicalInjury;
    }

    public Boolean getIs_pcos() {
        return is_pcos;
    }

    public void setIs_pcos(Boolean is_pcos) {
        this.is_pcos = is_pcos;
    }

    public Boolean getIs_thyroid() {
        return is_thyroid;
    }

    public void setIs_thyroid(Boolean is_thyroid) {
        this.is_thyroid = is_thyroid;
    }

    public Boolean getIs_cholestrol() {
        return is_cholestrol;
    }

    public void setIs_cholestrol(Boolean is_cholestrol) {
        this.is_cholestrol = is_cholestrol;
    }

    public boolean getIs_hypertension() {
        return is_hypertension;
    }

    public void setIs_hypertension(boolean is_hypertension) {
        this.is_hypertension = is_hypertension;
    }

    public double getCalBMI() {
        return calBMI;
    }

    public void setCalBMI(double calBMI) {
        this.calBMI = calBMI;
    }


}
