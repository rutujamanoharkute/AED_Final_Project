/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Enterprise.EnterpriseDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Admin;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Harshada
 */
public class Ecosystem extends Organization {

    private static Ecosystem business;
    private ArrayList<Network> networkList;
    private EnterpriseDirectory enterpriseDirectory;

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public Ecosystem() {
        super(null);
         enterpriseDirectory=new EnterpriseDirectory();
        networkList = new ArrayList<Network>();
    }

    public static Ecosystem getBusiness() {
        return business;
    }

    public static void setBusiness(Ecosystem business) {
        Ecosystem.business = business;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public static Ecosystem getInstance() {
        if (business == null) {
            business = new Ecosystem();
        }
        return business;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    public void removeNetwork(Network network) {
        networkList.remove(network);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new Admin());
        return roleList;
    }
    
}
